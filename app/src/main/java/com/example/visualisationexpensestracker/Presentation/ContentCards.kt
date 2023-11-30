package com.example.visualisationexpensestracker.Presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.visualisationexpensestracker.R

@Composable
fun ExtendedButtonExample(onClick: () -> Unit, isExpanded: Boolean) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp, end = 16.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ){
        ExtendedFloatingActionButton(expanded = isExpanded,
            onClick = { onClick() },
            icon = { Icon(Icons.Filled.Edit, "Extended floating action button.") },
            text = { Text(text = "Extended FAB") })
    }
}}


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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomBottomSheet(
    onButtonClick: (String) -> Unit,
    onDotClick: () -> Unit,
    onOkayClick: () -> Unit,
) {
    val buttonValues = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    val sheetState = rememberModalBottomSheetState()
    var isSheetOpen by rememberSaveable {
        mutableStateOf(false)
    }
    ModalBottomSheet(onDismissRequest = { Log.d("MyLog", "ModalBottomSheet dissmiss") }, sheetState = sheetState) {
        Text(
            text = "sdadasdasdasd",
            color = androidx.compose.ui.graphics.Color.Yellow,
        fontWeight = FontWeight.Bold
        )
    }
}
