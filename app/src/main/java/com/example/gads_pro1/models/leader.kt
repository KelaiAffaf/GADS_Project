package com.example.gads_pro1.models
import com.google.gson.annotations.SerializedName
class leader (
    @SerializedName("name") val name:String,
    @SerializedName("hours") val hours:String,
    @SerializedName("country")val country:String,
    @SerializedName("badgeUrl")val badgeUrl:String
)