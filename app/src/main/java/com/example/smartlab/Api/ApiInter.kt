package com.example.smartlab.Api

import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInter {
    @POST("api/SendCode")
    suspend fun sendCodeEmail(@Header("User-email") email: String):String
    companion object {
        val BASE_URL_SMARTLAB = "https://iis.ngknn.ru/NGKNN/МамшеваЮС/MedicMadlab/"
    }
}