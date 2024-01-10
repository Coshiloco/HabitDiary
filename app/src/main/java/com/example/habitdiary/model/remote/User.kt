package com.example.habitdiary.model.remote

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val email: String
)
