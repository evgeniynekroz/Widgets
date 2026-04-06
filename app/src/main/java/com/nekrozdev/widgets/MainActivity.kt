package com.nekrozdev.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.nekrozdev.widgets.ui.theme.WidgetCatalogTheme
import com.nekrozdev.widgets.ui.Screens

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetCatalogTheme {
                var tab by remember { mutableIntStateOf(0) }
                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(selected = tab == 0, onClick = { tab = 0 }, icon = { Text("📱") }, label = { Text("Каталог") })
                            NavigationBarItem(selected = tab == 1, onClick = { tab = 1 }, icon = { Text("⚙️") }, label = { Text("Свой") })
                        }
                    }
                ) { p -> if(tab==0) Screens.Catalog(Modifier.padding(p)) else Screens.Builder(Modifier.padding(p)) }
            }
        }
    }
}
