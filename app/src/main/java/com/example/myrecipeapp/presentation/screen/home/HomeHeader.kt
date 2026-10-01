package com.example.myrecipeapp.presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecipeapp.ui.theme.MyOrange

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeHeader() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(color = MyOrange)
    ) {
        Box {
            Icon(
                imageVector = Icons.Default.RestaurantMenu,
                contentDescription = "Restaurant Menu",
                tint = Color.White
            )
        }
    }
}
//
//
//package com.example.myrecipeapp.presentation.screen.home
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.RestaurantMenu
//import androidx.compose.material3.Icon
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HomeHeader() {
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(100.dp)
//            .clip(RoundedCornerShape(20.dp))
//            .background(Color(0xFFFF5722))
//            .padding(20.dp)
//    ) {
//        Box {
//            Icon(
//                imageVector = Icons.Default.RestaurantMenu,
//                contentDescription = "Restaurant Menu",
//                tint = Color.White
//            )
//        }
//    }
//}