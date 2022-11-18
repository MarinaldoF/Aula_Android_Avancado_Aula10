package com.example.aula10

import androidx.compose.runtime.Composable
@Composable
fun TopScreen(list: List<Conversion>) {
    ConversionMenu(list = list)
}