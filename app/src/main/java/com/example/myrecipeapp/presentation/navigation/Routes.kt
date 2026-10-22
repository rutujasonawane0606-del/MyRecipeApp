package com.example.myrecipeapp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeRoute{

}

@Serializable
data class RecipeDetailsRoute(val recipeId : Int){

}