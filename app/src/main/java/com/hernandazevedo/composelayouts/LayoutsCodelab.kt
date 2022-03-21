package com.hernandazevedo.composelayouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hernandazevedo.composelayouts.ui.theme.ComposeLayoutsTheme

@Composable
fun LayoutsCodelab() {
    Scaffold(topBar = {
        TopBarCodelab()
    }, bottomBar = { BottomBarCodelab() },
    ) { innerPadding ->
        BodyContent(
            Modifier
                .padding(innerPadding)
                .padding(8.dp))
    }
}

@Composable
fun BottomBarCodelab() {
    BottomAppBar() {
        Icon(Icons.Filled.Favorite, contentDescription = null)
    }
}

@Composable
private fun TopBarCodelab() {
    TopAppBar(title = { Text(text = "LayoutsCodelab") }, actions = {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Favorite, contentDescription = null)
        }
    }, navigationIcon = { Icon(Icons.Default.ArrowBack, contentDescription = null)})
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}
