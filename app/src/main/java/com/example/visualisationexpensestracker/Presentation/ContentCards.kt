package com.example.visualisationexpensestracker.Presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualisationexpensestracker.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtendedButtonExample(isExpanded: Boolean) {
    var isSheetOpen by rememberSaveable {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp, end = 16.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            ExtendedFloatingActionButton(expanded = isExpanded,
                onClick = { isSheetOpen = true },
                icon = { Icon(Icons.Filled.Edit, "Extended floating action button.") },
                text = { Text(text = "Extended FAB") })
        }
    }
    val buttonValues = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    val sheetState = rememberModalBottomSheetState()
    var currentExpenseAdded by remember{ mutableStateOf(0) } // Expense adding value
    if (isSheetOpen) {
        ModalBottomSheet(onDismissRequest = { isSheetOpen = false }, sheetState = sheetState) {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)) {
                Row(){
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    Text(text = currentExpenseAdded.toString(), textAlign = TextAlign.Center, fontSize = 26.sp)
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 6.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 6.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    VerticalAlignmentLine()
                }
                Row() {
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                }
                Row() {
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                }
            }
        }
    }
}

@Composable
fun VerticalAlignmentLine() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.width(80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Okay",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}


//Text(
//text = "sdadasdasdasd",
//color = androidx.compose.ui.graphics.Color.Yellow,
//fontWeight = FontWeight.Bold
//)

@Composable
fun ExpensesCardTypeSimple() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = stringResource(R.string.LoremIpsum))
    }
}
