package kr.ac.dankook.dantumproject.profile

import com.google.gson.annotations.SerializedName

data class Users2(

    @SerializedName("office")
    var office : String?=null,
    @SerializedName("introduce")
    var introduce : String?=null,
    @SerializedName("mbti")
    var mbti : String?=null,
    @SerializedName("stacks")
    var stacks : String ?= null

)
