package kr.ac.dankook.dantumproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Profile2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        val officeLocation = findViewById<TextView>(R.id.officeLocation)
        val introduceText = findViewById<TextView>(R.id.introduceText)
        val mbtiText = findViewById<TextView>(R.id.mbtiText)
        val stackText = findViewById<TextView>(R.id.stackText)

        officeLocation.setText("3F 318")
        introduceText.setText("안녕하세요! 노근우입니다. 반갑습니다^^")
        mbtiText.setText("ISTP")
        stackText.setText("AWS/SpringBoot/Express")



        val backBtn = findViewById<Button>(R.id.backBtn)
        backBtn.setOnClickListener {
            Log.d("Profile","BACK button presssed")
            finish()
        }
    }
}