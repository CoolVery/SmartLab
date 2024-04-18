package com.example.smartlab.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitInstance {
    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        // Подключаем перехватчик к веб-клиенту. Добавляйте его после других перехватчиков,
        // чтобы ловить все сообщения. Существует несколько уровней перехвата данных: NONE, BASIC, HEADERS, BODY.
        // Последний вариант самый информативный, пользуйтесь им осторожно.
        // При больших потоках данных информация забьёт весь экран. Используйте промежуточные варианты.
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val gson = GsonBuilder().setLenient().create()
    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()
    val apiSmartLab: ApiInter = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl(ApiInter.BASE_URL_SMARTLAB)
        .client(client)
        .build()
        .create(ApiInter::class.java)
}