package kr.ac.dankook.dantumproject.profile

import com.google.gson.annotations.SerializedName

//기본 유저 프로필 페이지와 연동하기 위한 data class
data class User(

    @SerializedName("userIdx")
    var userIdx: Long = 0,
    @SerializedName("fullName")
    var fullName : String?=null,
    @SerializedName("profileUrl")
    var profileUrl : String?=null,
    @SerializedName("email")
    var email : String?=null,
    @SerializedName("phone")
    var phone : String?=null,
    @SerializedName("office")
    var office : String?=null,
    @SerializedName("officeNumber")
    var officeNumber : String?=null


)
