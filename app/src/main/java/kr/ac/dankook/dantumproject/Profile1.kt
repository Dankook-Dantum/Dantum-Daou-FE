package kr.ac.dankook.dantumproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Profile1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile1)

        val detailBtn = findViewById<Button>(R.id.Btn)
        val nameText = findViewById<TextView>(R.id.nameText)
        val teamText = findViewById<TextView>(R.id.teamText)
        val mailText = findViewById<TextView>(R.id.mailText)
        val phoneText = findViewById<TextView>(R.id.phoneText)
        val officeText = findViewById<TextView>(R.id.officeText)

        val intent = Intent(this,Profile2::class.java)

        detailBtn.setOnClickListener {
            Log.d("Profile","OPEN DETAIL PAGE")
            startActivity(intent)

        }

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.37.33.177:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val jsonPlaceHolderApi: RestApi = retrofit.create(RestApi::class.java)
        val call: Call<User> = jsonPlaceHolderApi.getPosts()
        call.enqueue(object : Callback<User?> {
            override fun onResponse(call: Call<User?>, response: Response<User?>) {


                    var aa = response.body()!!

                    nameText.setText(aa.fullName.toString())
                    mailText.setText(aa.email.toString())
                    phoneText.setText(aa.phone.toString())
                    officeText.setText(aa.officeNumber.toString())


            }
        

            override fun onFailure(call: Call<User?>, t: Throwable) {
                detailBtn.setText(t.message)
            }
        })



    }
}