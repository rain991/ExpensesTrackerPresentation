package com.example.visualisationexpensestracker.Presentation

import android.annotation.SuppressLint
import android.graphics.drawable.VectorDrawable
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualisationexpensestracker.R
import java.lang.Math.abs
import kotlin.math.round


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtendedButtonExample(isExpanded:Boolean,onClick: () -> Unit) {  // ALL fillmaxsize should be checked in final version

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
            ExtendedFloatingActionButton(
                expanded = isExpanded,
                onClick = onClick, //TBC
        icon = { Icon(Icons.Filled.Edit, "Extended floating action button.") },
        text = { Text(text = "Extended FAB") })
    }
}
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(isVisible: Boolean, onDismiss: () -> Unit) {
    val customShape = RoundedCornerShape(
        topStart = 16.dp,
        topEnd = 16.dp,
        bottomStart = 0.dp,
        bottomEnd = 0.dp
    )
    val buttonValues = listOf("0","1", "2", "3", "4", "5", "6", "7", "8", "9")
    val sheetState =
        rememberModalBottomSheetState(skipPartiallyExpanded = false, confirmValueChange = {
            when (it) {
                SheetValue.Expanded -> {
                    false
                }
                else -> {
                    true
                }
            }
        })
    var currentExpenseAdded by remember { mutableStateOf(0.0F) } // Expense adding value
    if (isVisible) {
            ModalBottomSheet(
                onDismissRequest =onDismiss,
                sheetState = sheetState
            ) {
                Row(modifier = Modifier.fillMaxSize()) {
                    Box(modifier = Modifier
                        .weight(4F)) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 8.dp, end = 8.dp)
                        ) {
                            Row() {
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                Text(
                                    text = currentExpenseAdded.toString(),
                                    textAlign = TextAlign.Center,
                                    fontSize = 26.sp
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()

                                    .padding(start = 6.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                IconButton(onClick = { /*TODO*/ },modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.Magenta)) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null, modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.Blue))
                                }
                            }
                            Row(
                                modifier = Modifier

                                    .padding(top = 16.dp, start = 6.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
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
                            Row(
                                modifier = Modifier

                                    .padding(top = 16.dp, start = 6.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                IconButton(onClick = { /*TODO*/ }) {  // Change Buttons Order Button
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                }
                                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.Red).clip(
                                    RoundedCornerShape(8.dp)
                                )) {  // Change Buttons Order Button
                                //    Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                                    Text(text = "2", modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.DarkGray))
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 16.dp, start = 6.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                    IconButton(onClick = { /*TODO*/ },modifier = Modifier.padding(start = 8.dp, end = 8.dp).background(color = androidx.compose.ui.graphics.Color.Green).weight(2f)) {  // Change Buttons Order Button
                                        Text(text = "0", fontSize = 24.sp)
                                    }
                                IconButton(onClick = { /*TODO*/ },modifier = Modifier.padding(start = 8.dp, end = 8.dp).background(color = androidx.compose.ui.graphics.Color.Blue).weight(1f)) {  // Change Buttons Order Button
                                    Text(text = ".", fontSize = 32.sp)
                                }
                            }
                        }
                    }
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .height(64.dp)
                        .weight(1F)
                    ) {
                        Column(modifier= Modifier
                            .fillMaxWidth()
                            .align(Alignment.TopCenter)
                        ) {
                            Text(
                                text = "Okay",
                                fontSize = 22.sp
                            )
                        }
                    }
                }
            }


    }
}



@Preview
@Composable
fun Preview() {
    var isVisible by rememberSaveable { mutableStateOf(true) }
    BottomSheet(isVisible = isVisible, onDismiss = { isVisible = false })
}

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

