package kr.ac.dankook.dantumproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_issuemain.*
import kotlinx.android.synthetic.main.activity_profile1.*
import kotlinx.android.synthetic.main.activity_vote_main.*
import kr.ac.dankook.dantumproject.issue.Issues
import kr.ac.dankook.dantumproject.issue.IssuesAdapter
import kr.ac.dankook.dantumproject.vote.Votes
import kr.ac.dankook.dantumproject.vote.VotesAdapter


class Vote_Main : AppCompatActivity() {
    val voteitem = arrayListOf<Votes>(
        Votes("서버 증설 여부"),
        Votes("개발자 추가 채용 여부"),
        Votes("3층 정수기 추가 여부"),
        Votes("11/29 워크샵")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_main)

        //voteListView에 접근가능한 adapter
        val Adapter = VotesAdapter(this, voteitem)
        voteListView.adapter = Adapter



        val intent = Intent(this, Vote_Add_Page::class.java)

        val intent2 = Intent(this, Vote_Page::class.java)

        //voteListView의 원하는 항목 선택 후 선택된 주제의 투표를 할 수 있는 창으로 전환
        voteListView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position: Int, id->
            val selectItem = parent?.getItemAtPosition(position) as Votes
            intent2.putExtra("title",voteitem.get(position).votetitle.toString())
            startActivity(intent2)
        }


        val AddBtn = findViewById<Button>(R.id.AddBtn)
        AddBtn.setOnClickListener {
            Log.d("Dantum","VOTE add button pressed")
            startActivity(intent)
        }

        //삭제버튼 click
        deleteListButton.setOnClickListener {
            Toast.makeText(applicationContext,"삭제할 항목을 선택하세요",Toast.LENGTH_SHORT).show()

            //리스트뷰의 원하는 항목 선택(Click)
            voteListView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position: Int, id->
                val selectItem = parent?.getItemAtPosition(position) as Votes

            val checked = voteListView.checkedItemPosition
            Log.d("Delete vote selected", checked.toString())

            //누른 항목 삭제
            if(checked >=0 && checked < Adapter.count){
                voteitem.removeAt(checked)
                Adapter.notifyDataSetChanged()
                Toast.makeText(applicationContext,"삭제되었습니다",Toast.LENGTH_SHORT).show()
            }

            // 선택 초기화
            voteListView.clearChoices()
        }


        }



    }
}


