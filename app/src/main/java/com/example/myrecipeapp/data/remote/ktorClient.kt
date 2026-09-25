package com.example.myrecipeapp.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType.Application.Json
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


object ktorClient  {

    val client = HttpClient(Android){
        install(ContentNegotiation){
            json(
                Json{
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    const val BASE_URL = "https://dummyjson.com/"
}