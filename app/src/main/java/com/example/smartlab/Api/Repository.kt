package com.example.smartlab.Api

import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun sendCodeEmail(email: String):Flow<Result<String>>
}