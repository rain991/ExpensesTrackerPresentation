package com.example.visualisationexpensestracker.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MainScreenComposable() {
    Column(modifier = Modifier.fillMaxWidth()) {// Column of Main Screen
    BottomBar()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header() {
TopAppBar(title = { Text(text = "Category" )},
    navigationIcon = {
        IconButton(onClick = { /* Handle navigation icon click */ }) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = null)
        }
    })
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar() {
            BottomAppBar(
            modifier = Modifier.fillMaxWidth()
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = null, modifier = Modifier.scale(1.8F)) // or person here. VECTOR AND DESCR TO BE CHANGED
                    }
                    IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null,
                            modifier = Modifier.scale(1.8F)
                        )
                    }
                    IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = null,modifier = Modifier.scale(1.8F))  //VECTOR AND DESCR TO BE CHANGED
                    }
                }
            }
        }


