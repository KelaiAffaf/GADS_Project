package com.example.gads_pro1

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_pro1.adapters.learnerAdapter
import com.example.gads_pro1.adapters.skillAdapter
import com.example.gads_pro1.models.Skill
import com.example.gads_pro1.models.leader
import kotlinx.android.synthetic.main.fragment_learning_leaders.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SkiLeadersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SkiLeadersFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var skill = ArrayList<Skill>()
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            skill = it.getSerializable("Skill") as ArrayList<Skill>
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_ski_leaders, container, false)

        recyclerView = v.findViewById<RecyclerView>(R.id.SkileaderRV)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = skillAdapter(skill,this@SkiLeadersFragment)
        }

        return v
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tv_fragment_name.text = "Fragment Skill IQ Leaders "
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SkiLeadersFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SkiLeadersFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
