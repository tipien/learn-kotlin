package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_result)

		val tvName: TextView = findViewById(R.id.tv_name)
		val tvScore: TextView = findViewById(R.id.tv_score)
		val btnFinish: Button = findViewById(R.id.btn_finish)

		val mUserName: String? = intent.getStringExtra(Constants.USER_NAME)
		val mCorrectAnswers: Int = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
		val mTotalQuestions: Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

		tvName.text = mUserName
		tvScore.text = "Your Score is $mCorrectAnswers out of $mTotalQuestions"

		btnFinish.setOnClickListener {
			startActivity(Intent(this, MainActivity::class.java))
		}
	}
}