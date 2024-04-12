package com.example.smartlab.api

import kotlinx.coroutines.flow.Flow

interface Repository {
    //Fun from ApiInter.This fun try-catch override in RepositoryApi interface
    suspend fun sendCodeEmail(email: String):Flow<Result<String>>
}