package kr.ac.dankook.dantumproject

import com.google.gson.annotations.SerializedName

data class voteList(

    @SerializedName("voteIdx")
    var voteIdx: Long = 0,
    @SerializedName("title")
    var title : String?=null,
    @SerializedName("name")
    var name : String?=null,
    @SerializedName("createdAt")
    var createdAt : String?=null

)
