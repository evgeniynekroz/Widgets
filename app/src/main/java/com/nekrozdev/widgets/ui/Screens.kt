package com.nekrozdev.widgets.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object Screens {
    @Composable
    fun Catalog(modifier: Modifier) {
        Column(modifier.padding(16.dp)) {
            Text("Виджеты", style = MaterialTheme.typography.headlineMedium)
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(10) { Card(Modifier.padding(8.dp).height(100.dp)) { Text("Widget $it") } }
            }
        }
    }
    @Composable
    fun Builder(modifier: Modifier) {
        Column(modifier.padding(16.dp)) {
            Text("Конструктор", style = MaterialTheme.typography.headlineMedium)
            Slider(value = 0.5f, onValueChange = {})
            Button(onClick = {}, Modifier.fillMaxWidth()) { Text("Применить стекло") }
        }
    }
}
