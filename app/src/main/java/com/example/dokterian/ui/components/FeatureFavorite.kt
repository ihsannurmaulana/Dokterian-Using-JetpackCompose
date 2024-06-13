package com.example.dokterian.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dokterian.ui.theme.BackgroundSecondary
import com.example.dokterian.ui.theme.Poppins
import com.example.dokterian.ui.theme.Secondary

@Composable
fun FeatureFavorite(
    modifier: Modifier = Modifier,
    iconResourceId: Int,
    title: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .size(72.dp)
                .background(BackgroundSecondary, shape = CircleShape)
                .aspectRatio(1f)
        ) {
            Image(
                painter = painterResource(id = iconResourceId),
                contentDescription = "Sun",
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center)
            )
        }
        Text(
            text = title,
            fontSize = 15.sp,
            fontFamily = Poppins,
            color = Secondary,
            modifier = Modifier.padding(top = 8.dp).align(Alignment.CenterHorizontally)
        )
    }
}