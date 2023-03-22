//package com.example.car.views
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import com.example.car.fragment.HomeState
//
//
//@Composable
//fun HomeView(
//    state:HomeState,
//    onNextClick:()-> Unit
//) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Hello is home fragment")
//        Button(onClick = onNextClick) {
//            Text(text = "Next")
//        }
//    }
//}