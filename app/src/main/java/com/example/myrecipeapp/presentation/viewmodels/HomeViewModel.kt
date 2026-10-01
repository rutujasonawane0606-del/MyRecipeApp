package com.example.myrecipeapp.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myrecipeapp.data.remote.RecipeAPIService
import com.example.myrecipeapp.data.remote.dto.RecipeDTO
import com.example.myrecipeapp.data.remote.ktorClient
import com.example.myrecipeapp.data.repository.RecipeRepositoryImpl
import com.example.myrecipeapp.domain.repository.RecipeRepository
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository: RecipeRepository = RecipeRepositoryImpl(
        apiService = RecipeAPIService(
            ktorClient.client
        ))

    // state mangment

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    var recipes by mutableStateOf<List<RecipeDTO>>(emptyList())
        private set


    var selectedCategory by mutableStateOf("All")
        private set

    private var allRecipes: List<RecipeDTO> = emptyList()

    fun fetchRecipes(){

        isLoading = true
        errorMessage = null

        viewModelScope.launch {  }

    }
}