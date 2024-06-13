package com.example.dokterian.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dokterian.R
import com.example.dokterian.ui.theme.BlackColor
import com.example.dokterian.ui.theme.Poppins
import com.example.dokterian.ui.theme.Secondary

//@Composable
//fun CardTop(
//    modifier: Modifier = Modifier,
//    backgroundColor: Color,
//    iconResourceId: Int,
//    name: String,
//    specialist: String,
//    day: String,
//    time: String
//) {
//    Card(
//        modifier = Modifier.fillMaxWidth(),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = iconResourceId),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(48.dp)
//                        .padding(end = 12.dp)
//                        .align(Alignment.CenterVertically)
//                )
//                Column {
//                    Text(
//                        text = name,
//                        fontWeight = FontWeight.Bold,
//                        fontFamily = Poppins,
//                        color = Color.White,
//                        fontSize = 16.sp,
//                        modifier = Modifier.padding(bottom = 8.dp)
//                    )
//
//                    Text(
//                        text = specialist,
//                        fontWeight = FontWeight.Normal,
//                        fontFamily = Poppins,
//                        fontSize = 14.sp,
//                        color = Color(0xFFCBE1FF),
//                    )
//                }
//                Spacer(modifier = Modifier.weight(1f))
//                Image(
//                    painter = painterResource(id = R.drawable.ic_arrow_right),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(24.dp)
//                        .align(Alignment.CenterVertically)
//                )
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Divider(
//                thickness = 1.dp,
//                color = Color.White,
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_calendar_white),
//                    contentDescription = null,
//                    modifier = Modifier.size(16.dp)
//                )
//                Text(
//                    text = day,
//                    modifier = Modifier.padding(start = 8.dp, end = 50.dp),
//                    color = Color.White,
//                    fontFamily = Poppins,
//                    fontWeight = FontWeight.Normal,
//                    fontSize = 12.sp
//                )
//                Image(
//                    painter = painterResource(id = R.drawable.ic_clock),
//                    contentDescription = null,
//                    modifier = Modifier.size(16.dp)
//                )
//                Text(
//                    text = time,
//                    modifier = Modifier.padding(start = 8.dp),
//                    color = Color.White,
//                    fontFamily = Poppins,
//                    fontWeight = FontWeight.Normal,
//                    fontSize = 12.sp
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun CardNear(
//    modifier: Modifier = Modifier,
//    backgroundColor: Color,
//    iconResourceId: Int,
//    name: String,
//    specialist: String,
//    distance: String,
//    review: String,
//    time: String
//) {
//    Card(
//        modifier = Modifier.fillMaxWidth(),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = iconResourceId),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(48.dp)
//                        .padding(end = 12.dp)
//                        .align(Alignment.CenterVertically)
//                )
//                Column {
//                    Text(
//                        text = name,
//                        fontWeight = FontWeight.Bold,
//                        fontFamily = Poppins,
//                        color = BlackColor,
//                        fontSize = 16.sp,
//                        modifier = Modifier.padding(bottom = 8.dp)
//                    )
//
//                    Text(
//                        text = specialist,
//                        fontWeight = FontWeight.Normal,
//                        fontFamily = Poppins,
//                        fontSize = 14.sp,
//                        color = Secondary,
//                    )
//                }
//                Spacer(modifier = Modifier.weight(1f))
//                Image(
//                    painter = painterResource(id = R.drawable.ic_location),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(16.dp)
//                        .align(Alignment.CenterVertically)
//                )
//                Text(text = distance, fontWeight = FontWeight.Normal,
//                    fontFamily = Poppins,
//                    fontSize = 14.sp,
//                    color = Secondary)
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Divider(
//                thickness = 1.dp,
//                color = Color.White,
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_clock_orange),
//                    contentDescription = null,
//                    modifier = Modifier.size(16.dp)
//                )
//                Text(
//                    text = review,
//                    modifier = Modifier.padding(start = 8.dp, end = 50.dp),
//                    color = Color(0xFFFEB052),
//                    fontFamily = Poppins,
//                    fontWeight = FontWeight.Normal,
//                    fontSize = 12.sp
//                )
//                Image(
//                    painter = painterResource(id = R.drawable.ic_clock_blue),
//                    contentDescription = null,
//                    modifier = Modifier.size(16.dp)
//                )
//                Text(
//                    text = time,
//                    modifier = Modifier.padding(start = 8.dp),
//                    color = Color(0xFF4894FE),
//                    fontFamily = Poppins,
//                    fontWeight = FontWeight.Normal,
//                    fontSize = 12.sp
//                )
//            }
//        }
//    }
//}
@Composable
fun DoctorCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    iconResourceId: Int,
    name: String,
    specialist: String,
    dayOrDistance: String,
    timeOrReview: String,
    time: String,
    isNear: Boolean, // This flag will determine the type of card
    isSchedule: Boolean // This flag will determine if it's a schedule card
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = if (isSchedule) Color.White else backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = iconResourceId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(48.dp)
                        .padding(end = 12.dp)
                        .align(Alignment.CenterVertically)
                )
                Column {
                    Text(
                        text = name,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Poppins,
                        color = if (isNear || isSchedule) BlackColor else Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Text(
                        text = specialist,
                        fontWeight = FontWeight.Normal,
                        fontFamily = Poppins,
                        fontSize = 14.sp,
                        color = if (isNear || isSchedule) Secondary else Color(0xFFCBE1FF),
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if (isNear) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_location),
                        contentDescription = null,
                        modifier = Modifier
                            .size(16.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = dayOrDistance,
                        fontWeight = FontWeight.Normal,
                        fontFamily = Poppins,
                        fontSize = 14.sp,
                        color = Secondary
                    )
                } else if (!isSchedule) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Divider(
                thickness = 1.dp,
                color = if (isNear || isSchedule) Color(0xFFF5F5F5) else Color.White,
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (isNear) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_clock_orange),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = timeOrReview,
                        modifier = Modifier.padding(start = 8.dp, end = 50.dp),
                        color = Color(0xFFFEB052),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_clock_blue),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = time,
                        modifier = Modifier.padding(start = 8.dp),
                        color = Color(0xFF4894FE),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                } else {
                    Image(
                        painter = painterResource(id = if (isSchedule) R.drawable.ic_calendar_gray else R.drawable.ic_calendar_white),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = dayOrDistance,
                        modifier = Modifier.padding(start = 8.dp, end = 50.dp),
                        color = if (isSchedule) BlackColor else Color.White,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                    Image(
                        painter = painterResource(id = if (isSchedule) R.drawable.ic_clock_gray else R.drawable.ic_clock),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = time,
                        modifier = Modifier.padding(start = 8.dp),
                        color = if (isSchedule) BlackColor else Color.White,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                }
            }

            if (isSchedule) {
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { /* TODO: Add button action here */ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5FAFF))
                ) {
                    Text(
                        text = "Detail",
                        color = Color(0xFF4894FE),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}

