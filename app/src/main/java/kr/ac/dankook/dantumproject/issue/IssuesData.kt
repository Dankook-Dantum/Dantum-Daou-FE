package kr.ac.dankook.dantumproject.issue

import com.google.gson.annotations.SerializedName

data class IssuesData(

    @SerializedName("issueIdx")
    var issueIdx: Long = 0,
    @SerializedName("name")
    var name : String?=null,
    @SerializedName("title")
    var title : String?=null,
    @SerializedName("labelName")
    var labelName : String?=null,
    @SerializedName("content")
    var content : String?=null,
    @SerializedName("createdAt")
    var createdAt : String?=null,


    )
