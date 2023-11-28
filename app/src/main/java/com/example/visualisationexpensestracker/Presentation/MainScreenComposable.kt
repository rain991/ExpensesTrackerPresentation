package com.example.visualisationexpensestracker.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visualisationexpensestracker.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Screen(){
    HorizontalPager(pageCount = 3) {
        MainScreenComposable()
    }
}

@Composable
fun MainScreenComposable() {
    Column(modifier = Modifier.fillMaxSize()) {// Column of Main Screen //
         ExpensesCard()
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

@Composable
fun ExpensesCard(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp), shape = RoundedCornerShape(8.dp)) {
        Text(text = stringResource(R.string.LoremIpsum))
    }
}


@Composable
fun PagerTest(){
    // Set up the pager
    val pagerState = rememberPagerState(pageCount = 3)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {
        // TabRow with icons
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier.pagerTabIndicatorOffset(
                        pagerState = pagerState,
                        tabPositions = tabPositions
                    ),
                    color = MaterialTheme.colorScheme.primary
                )
            },
            backgroundColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.primary
        ) {
            repeat(3) { index ->
                Tab(
                    selected = pagerState.currentPage == index,
                    onClick = {
                        pagerState.animateScrollToPage(index)
                    },
                    modifier = Modifier
                        .heightIn(min = 48.dp)
                        .fillMaxWidth(),
                    content = {
                        Icon(
                            imageVector = when (index) {
                                0 -> Icons.Default.Search
                                1 -> Icons.Default.Work
                                2 -> Icons.Default.Tv
                                else -> throw IllegalStateException("Unexpected index: $index")
                            },
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                )
            }
        }

        // Pager
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f),
        ) { page ->
            when (page) {
                0 -> FirstScreen()
                1 -> SecondScreen()
                2 -> ThirdScreen()
            }
        }
    }
}
}







