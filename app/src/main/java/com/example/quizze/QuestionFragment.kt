package com.example.quizze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizze.databinding.FragmentQuizzQuestionsBinding

class QuestionFragment:Fragment() {
    private var _binding:FragmentQuizzQuestionsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizzQuestionsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}