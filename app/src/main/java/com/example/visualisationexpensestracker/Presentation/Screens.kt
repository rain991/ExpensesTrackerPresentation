package com.example.visualisationexpensestracker.Presentation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.visualisationexpensestracker.ui.theme.Header

@Composable
fun FirstScreen() {
    Column(modifier = Modifier.fillMaxSize()) { // Settings screen
        Header()
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, true)
    }
}

@Composable
fun SecondScreen() {  // Main and Primary screen
    Column(modifier = Modifier.fillMaxSize()) {// Column of Main Screen //
        Header()
        ExpensesCardTypeSimple()
        ExpensesCardTypeSimple()
        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, true)
    }
}

@Composable
fun ThirdScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

        ExpensesCardTypeSimple()
        ExtendedButtonExample ({Log.d("MyLog", "ExtendedButtonExample called")}, false)
    }
}