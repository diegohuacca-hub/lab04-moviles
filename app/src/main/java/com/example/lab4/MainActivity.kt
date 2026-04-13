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

// 🔘 Button
@Composable
fun ExampleButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text("Button mejorado")
    }
}

// 📝 TextField
@Composable
fun ExampleTextField() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Nombre") }
    )
}

// ☑ Checkbox
@Composable
fun ExampleCheckbox() {
    var checked by remember { mutableStateOf(false) }

    Checkbox(
        checked = checked,
        onCheckedChange = { checked = it }
    )
}

// 🔄 Switch
@Composable
fun ExampleSwitch() {
    var state by remember { mutableStateOf(false) }

    Switch(
        checked = state,
        onCheckedChange = { state = it }
    )
}

import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

// 🖼 Image
@Composable
fun ExampleImage() {
    Image(
        painter = painterResource(id = R.drawable.max),
        contentDescription = "Imagen",
        modifier = Modifier.size(80.dp)
    )
}

// 🪪 Card
@Composable
fun ExampleCard() {
    Card(modifier = Modifier.padding(8.dp)) {
        Text("Esto es una Card", modifier = Modifier.padding(16.dp))
    }
}

// ⏳ Progress
@Composable
fun ExampleProgress() {
    CircularProgressIndicator()
}

// ↔ Row
@Composable
fun ExampleRow() {
    Row {
        Text("Item 1")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Item 2")
    }
}

// ⬇ Column
@Composable
fun ExampleColumn() {
    Column {
        Text("Elemento A")
        Text("Elemento B")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMain() {
    MainScreen()
}