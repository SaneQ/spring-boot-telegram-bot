package com.kortov.bootigram.bots.handlers

import com.kortov.bootigram.quiz.Exam
import com.kortov.bootigram.quiz.JsonParser
import org.springframework.core.io.DefaultResourceLoader
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class FileHandler(val parser: JsonParser) {
    fun getQuiz(fileName: String): List<Exam> {
        val string = readFileFromResourcesAsString(fileName)
        return parser.parse(string!!)
    }

    private val resourceLoader: DefaultResourceLoader by lazy {
        return@lazy DefaultResourceLoader()
    }

    fun readFileFromResourcesAsString(fileName: String): String? {
        val resource: Resource? = resourceLoader.getResource(fileName)
        return resource?.file?.readText(Charsets.UTF_8)
    }
}