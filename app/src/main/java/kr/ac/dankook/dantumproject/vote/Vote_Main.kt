package kr.ac.dankook.dantumproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kr.ac.dankook.dantumproject.Vote_Page
import kr.ac.dankook.dantumproject.R
import kr.ac.dankook.dantumproject.Vote_Add_Page

class Vote_Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_main)

        val intent = Intent(this, Vote_Add_Page::class.java)

        val AddBtn = findViewById<Button>(R.id.AddBtn)
        AddBtn.setOnClickListener {
            Log.d("Dantum","VOTE add button pressed")
            startActivity(intent)
        }

        val intent2 = Intent(this, Vote_Page::class.java)

        val InterBtn = findViewById<Button>(R.id.VoteBtn1)
        InterBtn.setOnClickListener {
            Log.d("Dantum","VOTE1 button pressed")
            startActivity(intent2)
        }
    }
}