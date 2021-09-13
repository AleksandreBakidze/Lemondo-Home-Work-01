package com.example.lemondohomework01

data class data(
    val developerMessage: Any,
    val errors: List<Any>,
    val httpStatusCode: Int,
    val shops: List<Shop>,
    val success: Boolean,
    val userMessage: Any
)