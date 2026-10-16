package com.example.myrecipeapp.presentation.componants

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.myrecipeapp.ui.theme.MyOrange

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoadingIndicator(strokeWidth: Dp) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = MyOrange
        )
    }
}