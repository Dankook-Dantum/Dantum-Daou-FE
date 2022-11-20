package kr.ac.dankook.dantumproject.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile1.*
import kr.ac.dankook.dantumproject.R
import kr.ac.dankook.dantumproject.RestApi
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

        val intent = Intent(this, Profile2::class.java)

        detailBtn.setOnClickListener {
            Log.d("Profile","OPEN DETAIL PAGE")
            startActivity(intent)

        }

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.37.33.177:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val jsonPlaceHolderApi: RestApi = retrofit.create(RestApi::class.java)
        val call: Call<User> = jsonPlaceHolderApi.getUsers()
        call.enqueue(object : Callback<User?> {
            override fun onResponse(call: Call<User?>, response: Response<User?>) {


                    var aa = response.body()!!

                    nameText.setText(aa.fullName.toString())
                    mailText.setText(aa.email.toString())
                    phoneText.setText(aa.phone.toString())
                    officeText.setText(aa.officeNumber.toString())
                    teamText.setText(aa.userIdx.toString()+"팀")

                Glide.with(this@Profile1)
                    .load(aa.profileUrl) // 불러올 이미지 url
                    .placeholder(R.drawable.ic_account_circle_48px_512) // 이미지 로딩 시작하기 전 표시할 이미지
                    .error(R.drawable.ic_account_circle_48px_512) // 로딩 에러 발생 시 표시할 이미지
                    .fallback(R.drawable.ic_account_circle_48px_512) // 로드할 url 이 비어있을(null 등) 경우 표시할 이미지
                    .circleCrop() // 동그랗게 자르기
                    .into(profileImage) // 이미지를 넣을 뷰


            }
        

            override fun onFailure(call: Call<User?>, t: Throwable) {
                detailBtn.setText(t.message)
            }
        })



    }
}