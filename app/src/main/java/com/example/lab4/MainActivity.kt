package com.example.functions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    LazyColumn(modifier = Modifier.padding(16.dp)) {

        item { Title("Button") }
        item { ExampleButton() }

        item { Title("TextField") }
        item { ExampleTextField() }

        item { Title("Checkbox") }
        item { ExampleCheckbox() }

        item { Title("Switch") }
        item { ExampleSwitch() }

        item { Title("Image") }
        item { ExampleImage() }

        item { Title("Card") }
        item { ExampleCard() }

        item { Title("Progress") }
        item { ExampleProgress() }

        item { Title("Row") }
        item { ExampleRow() }

        item { Title("Column") }
        item { ExampleColumn() }
    }
}

@Composable
fun Title(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
    )
}