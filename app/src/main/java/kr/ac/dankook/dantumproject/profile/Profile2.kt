package kr.ac.dankook.dantumproject.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import kr.ac.dankook.dantumproject.R
import kr.ac.dankook.dantumproject.RestApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Profile2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        val officeLocation = findViewById<TextView>(R.id.officeLocation)
        val introduceText = findViewById<TextView>(R.id.introduceText)
        val mbtiText = findViewById<TextView>(R.id.mbtiText)
        val stackText = findViewById<TextView>(R.id.stackText)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.37.33.177:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val jsonPlaceHolderApi: RestApi = retrofit.create(RestApi::class.java)
        val call: Call<Users2> = jsonPlaceHolderApi.getUsers2()
        call.enqueue(object : Callback<Users2?> {
            override fun onResponse(call: Call<Users2?>, response: Response<Users2?>) {

                var detailProfile = response.body()!!

                officeLocation.setText(detailProfile.office.toString())
                introduceText.setText(detailProfile.introduce.toString())
                mbtiText.setText(detailProfile.mbti.toString())
                stackText.setText(detailProfile.stacks.toString())

            }


            override fun onFailure(call: Call<Users2?>, t: Throwable) {

            }
        })





        val closeBtn = findViewById<ImageButton>(R.id.closeBtn)
        closeBtn.setOnClickListener {
            Log.d("Profile","BACK button presssed")
            finish()
        }
    }
}