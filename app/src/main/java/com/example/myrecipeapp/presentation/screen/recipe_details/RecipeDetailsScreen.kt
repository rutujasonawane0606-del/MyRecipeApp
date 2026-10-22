package com.example.myrecipeapp.presentation.screen.recipe_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myrecipeapp.presentation.componants.ErrorMessage
import com.example.myrecipeapp.presentation.componants.LoadingIndicator
import com.example.myrecipeapp.presentation.componants.MyTopBar
import com.example.myrecipeapp.presentation.viewmodels.RecipeDetailsViewModel
import com.example.myrecipeapp.ui.theme.MyOrange

@Composable
fun RecipeDetailsScreen(
    recipeID: Int,
    onBack: () -> Unit,
    viewModel: RecipeDetailsViewModel = viewModel()
) {
    LaunchedEffect(recipeID) {
        viewModel.fetchRecipeDetail(recipeID)
    }

    Scaffold(
        topBar = {
            MyTopBar(
                title = "Recipe Details",
                onBackClick = onBack,
                icon = Icons.AutoMirrored.Filled.ArrowBack
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = MyOrange.copy(alpha = 0.02f))
        ) {
            when {
                viewModel.isLoading -> LoadingIndicator(strokeWidth = 1.dp)

                viewModel.errorMessage != null -> ErrorMessage(
                    errorMessage = viewModel.errorMessage,
                    onRetry = { viewModel.fetchRecipeDetail(recipeID) }
                )

                viewModel.recipe != null -> {
                    // recipe Details
                    RecipeDetailsContent  (details = viewModel.recipe!! )

                }

            }
        }
    }
}