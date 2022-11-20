package kr.ac.dankook.dantumproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kr.ac.dankook.dantumproject.issue.IssueMain
import kr.ac.dankook.dantumproject.profile.Profile1

class Today : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_today)

        val profileBtn = findViewById<Button>(R.id.profileBtn)
        val voteBtn = findViewById<Button>(R.id.voteBtn)
        val issueBtn = findViewById<Button>(R.id.issueBtn)

        val intentProfile = Intent(this, Profile1::class.java)
        val intentVote = Intent(this,Vote_Main::class.java)
        val intentIssue = Intent(this, IssueMain::class.java)

        //내정보 화면으로 이동
        profileBtn.setOnClickListener {
            startActivity(intentProfile)

        }

        //투표페이지로 이동
        voteBtn.setOnClickListener {
            startActivity(intentVote)
        }

        //이슈페이지로 이동
        issueBtn.setOnClickListener {
            startActivity(intentIssue)

        }
    }
}