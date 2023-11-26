package com.example.visualisationexpensestracker.ui.theme

import android.net.http.HeaderBlock
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visualisationexpensestracker.R

@Preview
@Composable
fun MainScreenComposable() {
    Column(modifier = Modifier.fillMaxWidth()) {// Column of Main Screen

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
fun AppContent() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Jetpack Compose Scaffold Example") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                    }
                },
                actions = {
                    // Add your actions (e.g., buttons) here
                    IconButton(onClick = { /* Handle action 1 click */ }) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
                    }
                    IconButton(onClick = { /* Handle action 2 click */ }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
            ) {
                // Add your bottom bar content here
                IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                }
                IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                    Icon(imageVector = Icons.Default.Build, contentDescription = null)
                }
                IconButton(onClick = { /* Handle bottom bar icon click */ }) {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                }
            }
        }
    )
    { innerPadding ->
        // Main content of the screen goes here
        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier.fillMaxSize()
        ) {
            items(50) {
                // Display your list items here
                Text(text = "Item $it", modifier = Modifier.padding(16.dp))
            }
        }
    }
}
