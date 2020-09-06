package com.example.gads_pro1.models

import com.google.gson.annotations.SerializedName

class Skill (
    @SerializedName("name") val name:String,
    @SerializedName("score") val score:String,
    @SerializedName("country")val country:String,
    @SerializedName("badgeUrl")val badgeUrl:String,
)