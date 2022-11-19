package kr.ac.dankook.dantumproject

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kr.ac.dankook.dantumproject.R

class Vote_Add_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_add_page)

        val SaveBtn = findViewById<Button>(R.id.SaveBtn)
        SaveBtn.setOnClickListener {
            Log.d("Dantum", "Save button pressed")
            finish()
        }
    }
}