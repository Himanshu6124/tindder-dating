package com.himanshu.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
    @Composable
    fun BottomBar() {
        BottomAppBar(
            contentColor = Color.White,
            containerColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp),
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = "Home"
                )
                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp),
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "Search"
                )
                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp),
                    painter = painterResource(id = R.drawable.book),
                    contentDescription = "Library"
                )
            }
        }
    }

