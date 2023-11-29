package com.example.visualisationexpensestracker.Presentation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.visualisationexpensestracker.ui.theme.ExpensesCard
import com.example.visualisationexpensestracker.ui.theme.ExtendedExample
import com.example.visualisationexpensestracker.ui.theme.FloatingExample
import com.example.visualisationexpensestracker.ui.theme.Header

@Composable
fun Screens() {

}
@Composable
fun FirstScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Header()
        ExpensesCard()
        ExpensesCard()
        ExpensesCard()

        FloatingExample {
            Log.d("MyLog", "FAB")
        }
    }
}

@Composable
fun SecondScreen() {  // Main and Primary screen

    Column(modifier = Modifier.fillMaxSize()) {// Column of Main Screen //
        Header()
        ExpensesCard()
        ExpensesCard()
        ExtendedExample {
            Log.d("MyLog", "FAB")
        }
    }
}

@Composable
fun ThirdScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Header()
        ExpensesCard()

        FloatingExample {
            Log.d("MyLog", "FAB")
        }
    }
}