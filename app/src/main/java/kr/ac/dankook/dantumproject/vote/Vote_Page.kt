package kr.ac.dankook.dantumproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kr.ac.dankook.dantumproject.R
import kr.ac.dankook.dantumproject.Result_Page

class Vote_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_page)

        val intent = Intent(this, Result_Page::class.java)

        val resultBtn = findViewById<Button>(R.id.showresultBtn)
        resultBtn.setOnClickListener {
            Log.d("Dantum","VOTE result button pressed")
            startActivity(intent)
        }
    }
}
