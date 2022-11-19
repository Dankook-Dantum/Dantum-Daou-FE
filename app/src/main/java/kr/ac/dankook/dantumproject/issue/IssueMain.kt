package kr.ac.dankook.dantumproject.issue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_issuemain.*
import kr.ac.dankook.dantumproject.R
import kr.ac.dankook.dantumproject.RestApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class IssueMain : AppCompatActivity() {
    var Userlist = arrayListOf<Issues>(
        Issues("Issue", "[투표 결과 조회]", "투표 결과 확인이 안 됨", "노근우"),
        Issues("In Progress", "[상세 프로필 조회]", "상세 프로필 잘림", "김수연"),
        Issues("Done", "이슈제목", "이슈내용", "작성자"),
        Issues("0", "이슈제목", "이슈내용", "작성자")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_issuemain)

        val Adapter = IssuesAdapter(this, Userlist)
        listView.adapter = Adapter

        var menuBtn = findViewById<Button>(R.id.menuBtn)
        menuBtn.setOnClickListener {
            var popupMenu = PopupMenu(applicationContext,it)

            //작성해 놓은 menu_resource파일과 popupmenu 객체의 menu를 넣어줌으로써 메뉴가 준비됨
            menuInflater?.inflate(R.menu.menu_resource,popupMenu.menu)
            popupMenu.show()
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.registration ->{
                        //Toast.makeText(applicationContext,"등록클릭",Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }
                    R.id.correction -> {
                        //Toast.makeText(applicationContext, "수정클릭", Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }
                    R.id.delete ->{
                        //Toast.makeText(applicationContext,"삭제클릭",Toast.LENGTH_SHORT).show()
                        return@setOnMenuItemClickListener true
                    }else->{
                        return@setOnMenuItemClickListener false
                    }
                }
            }
        }



    }
}