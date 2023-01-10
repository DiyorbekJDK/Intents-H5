package com.diyorbek.intents2.model

import java.io.Serializable

data class User(
    val email: String,
    val password: String
): Serializable
