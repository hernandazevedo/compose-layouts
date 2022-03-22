package com.hernandazevedo.composelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hernandazevedo.composelayouts.ui.theme.ComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLayoutsTheme {
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp() {
    LayoutsCodelab()
}

@Preview
@Composable
fun ChipPreview() {
    ComposeLayoutsTheme {
        Chip(text = "Hi there")
    }
}

@Preview
@Composable
fun LayoutsCodelabPreviewStaggeredGrid() {
    ComposeLayoutsTheme {
        BodyContentStaggeredGrid()
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun LayoutsCodelabPreview() {
    ComposeLayoutsTheme {
        LayoutsCodelab()
    }
}

@Preview
@Composable
fun TextWithPaddingToBaselinePreview() {
    ComposeLayoutsTheme {
        Text("Hi there!", Modifier.firstBaselineToTop(32.dp))
    }
}

@Preview
@Composable
fun TextWithNormalPaddingPreview() {
    ComposeLayoutsTheme {
        Text("Hi there!", Modifier.padding(top = 32.dp))
    }
}

@Preview
@Composable
fun ConstraintLayoutContentPreview() {
    ComposeLayoutsTheme {
        ConstraintLayoutContent()
    }
}

@Preview
@Composable
fun LargeConstraintLayoutPreview() {
    ComposeLayoutsTheme {
        LargeConstraintLayout()
    }
}

@Preview
@Composable
fun DecoupledConstraintLayoutPreview() {
    ComposeLayoutsTheme {
        DecoupledConstraintLayout()
    }
}