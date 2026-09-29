package com.example.myrecipeapp.data.remote

import androidx.compose.ui.autofill.ContentType
import com.example.myrecipeapp.data.remote.dto.AddRecipeRequest
import com.example.myrecipeapp.data.remote.dto.RecipeDTO
import com.example.myrecipeapp.data.remote.dto.RecipeResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.contentType

class RecipeAPIService(private val client: HttpClient) {

    suspend fun getALlRecipes() : RecipeResponse {
        return client.get(urlString = "${ktorClient.BASE_URL}recipes").body()
    }

    suspend fun getALlRecipesByIS(id: Int) : RecipeDTO {
        return client.get(urlString = "${ktorClient.BASE_URL}recipes/$id").body()
    }

    suspend fun addRecipe(request : AddRecipeRequest)  {
         client.post(urlString = "${ktorClient.BASE_URL}recipes/add"){
             contentType(io.ktor.http.ContentType.Application.Json)
             setBody(request)
         }
    }


}