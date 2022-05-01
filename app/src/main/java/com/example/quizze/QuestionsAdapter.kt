package com.example.quizze

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestionsAdapter(val answerList:List<Answers>):RecyclerView.Adapter<AnswersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_questions_item,parent,false)
        return AnswersViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnswersViewHolder, position: Int) {
       val answer = answerList[position]
        val textView = holder.itemView.findViewById<TextView>(R.id.tvAnswer)
        textView.text = answer.answerOfQuestion
    }

    override fun getItemCount(): Int {
       return answerList.size
    }

}

data class Answers(
    val answerOfQuestion:String
)

class AnswersViewHolder(val view: View):RecyclerView.ViewHolder(view)