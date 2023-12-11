package com.example.visualisationexpensestracker.Presentation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.visualisationexpensestracker.ui.theme.Header

@Composable
fun FirstScreen() { // Settings
    Column(modifier = Modifier.fillMaxSize()) { // Settings screen
        Header(categoryName = "Settings", isMenuButton =  false, isSearchButton = false)
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, false)
    }
}

@Composable
fun SecondScreen() {  // Main and Primary screen
    Column(modifier = Modifier.fillMaxSize()) {// Column of Main Screen //
        Header(categoryName = "Expenses", isMenuButton =  true, isSearchButton = true)
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, true)
    }
}

@Composable
fun ThirdScreen() {  // Statistics Screen
    Column(modifier = Modifier.fillMaxSize()) {
        Header("Statistics", true, false)


        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, false)
    }
}