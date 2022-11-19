package kr.ac.dankook.dantumproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kr.ac.dankook.dantumproject.issue.IssueMain


class MainActivity : AppCompatActivity() {
    var userEmail:String = ""
    var userPw: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailText = findViewById<EditText>(R.id.emailText)
        val pwText = findViewById<EditText>(R.id.pwText)
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        val intentToday = Intent(this, Today::class.java)

        loginBtn.setOnClickListener {
            userEmail = emailText.text.toString()
            userPw = pwText.text.toString()

            Log.d("Office","Log in button pressed")
            startActivity(intentToday)

        }





    }
}