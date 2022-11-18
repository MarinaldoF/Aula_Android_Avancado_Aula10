package com.example.aula10

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    convertViewModel: ConvertViewModel = viewModel()
) {
    val list = convertViewModel.getConversions()
    Column(modifier = modifier.padding(30.dp)) {
        TopScreen(list)
        Spacer(modifier = modifier.height(20.dp))
        HistoryScreen()
    }
}