package kr.ac.dankook.dantumproject.profile

import com.google.gson.annotations.SerializedName

//상세 프로필페이지와 연동하기 위한 data class
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
