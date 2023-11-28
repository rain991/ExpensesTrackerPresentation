package com.example.visualisationexpensestracker.ui.theme

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visualisationexpensestracker.R


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





@Composable
fun ExpensesCard(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp), shape = RoundedCornerShape(8.dp)) {
        Text(text = stringResource(R.string.LoremIpsum))
    }
}

@Composable
fun FloatingExample(onClick: () -> Unit) {
        ExtendedFloatingActionButton(modifier = Modifier
            .padding(16.dp)
            .size(32.dp),
            onClick = { onClick() },
            icon = { Icon(Icons.Filled.Add, "Floating action button")},
            text = {Text(text = "Expense") }
        )


}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerTest(){
    val pagerState = rememberPagerState(initialPage = 1)

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        HorizontalPager(pageCount = 3,
            state = pagerState,
            modifier = Modifier.weight(1f)) { page ->
            Log.d("Mylog", "Lambda in pager")
            when (page) {
                0 -> FirstScreen()
                1 -> SecondScreen()
                2 -> ThirdScreen()
            }
        }
    }
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
FloatingExample {
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









