package kr.ac.dankook.dantumproject

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import android.widget.*

class Vote_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_page)

        var likeBtn = findViewById<ImageButton>(R.id.likeBtn)
        var dislikeBtn = findViewById<ImageButton>(R.id.dislikeBtn)

        var likeText = findViewById<TextView>(R.id.like)
        var dislikeText = findViewById<TextView>(R.id.dislike)

        var likeNum :Int = 0
        var dislikeNum : Int =0

        likeBtn.setOnClickListener{
            likeNum++
            likeText.setText(likeNum.toString())
            Toast.makeText(applicationContext,"좋아요", Toast.LENGTH_SHORT).show()


        }

        dislikeBtn.setOnClickListener{
            dislikeNum++
            dislikeText.setText(dislikeNum.toString())
            Toast.makeText(applicationContext,"싫어요", Toast.LENGTH_SHORT).show()

        }

        var realVoteTitle = findViewById<TextView>(R.id.realVoteTitle)
        val intentSub = intent
        val reVote = intentSub.getStringExtra("title")

        realVoteTitle.setText(reVote.toString())



    }
}
