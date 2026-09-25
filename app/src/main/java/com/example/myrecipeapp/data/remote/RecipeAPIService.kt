package com.example.myrecipeapp.data.remote

import com.example.myrecipeapp.data.remote.dto.RecipeResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class RecipeAPIService(private val client: HttpClient) {

    suspend fun getALlRecipes() : RecipeResponse {
        return client.get(urlString = "${ktorClient.BASE_URL}recipes").body()
    }
}