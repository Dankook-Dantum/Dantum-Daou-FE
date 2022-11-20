package kr.ac.dankook.dantumproject.profile

import com.google.gson.annotations.SerializedName

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
