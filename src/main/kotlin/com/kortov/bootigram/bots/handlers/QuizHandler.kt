package com.kortov.bootigram.bots.handlers

import com.kortov.bootigram.quiz.Exam
import com.kortov.bootigram.quiz.JsonParser
import org.springframework.stereotype.Component

@Component
class QuizHandler(val parser: JsonParser, val fileHandler: FileHandler){

    val quizMap: HashMap<String, List<Exam>> by lazy {
        return@lazy HashMap<String, List<Exam>>()
    }


    private fun handleQuizFile() {

    }
}