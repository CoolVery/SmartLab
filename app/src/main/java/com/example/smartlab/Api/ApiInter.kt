package com.example.smartlab.Api

import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInter {
    //Take the method type and link from the API documentation
    @POST("api/SendCode")
    //suspend - async
    //User-email it is Name param. email - value param
    suspend fun sendCodeEmail(@Header("User-email") email: String):String
    // base_url it os link Api
    companion object {
        val BASE_URL_SMARTLAB = "https://iis.ngknn.ru/NGKNN/МамшеваЮС/MedicMadlab/"
    }
}