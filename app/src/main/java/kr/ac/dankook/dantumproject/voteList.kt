package kr.ac.dankook.dantumproject

import com.google.gson.annotations.SerializedName

//투표페이지 연동을 하기위한 data class -> 연동실패
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
