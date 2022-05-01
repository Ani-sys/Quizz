package com.example.quizze

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizze.databinding.FragmentUserInfoBinding

class UserPage: AppCompatActivity() {
    private lateinit var binding: FragmentUserInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vKotlin.setOnClickListener {
            val intent = Intent(this,QuestionFragment::class.java)
            startActivity(intent)
        }

    }

}