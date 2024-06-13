package com.example.dokterian.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dokterian.R
//import com.example.dokterian.ui.components.CardNear
//import com.example.dokterian.ui.components.CardTop
import com.example.dokterian.ui.components.DoctorCard
import com.example.dokterian.ui.components.FeatureFavorite
import com.example.dokterian.ui.theme.BlackColor
import com.example.dokterian.ui.theme.Poppins
import com.example.dokterian.ui.theme.Secondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        // Top Bar
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 26.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Hello,",
                        modifier = Modifier.padding(bottom = 6.dp),
                        color = Secondary,
                        fontSize = 16.sp,
                        fontFamily = Poppins
                    )
                    Text(
                        color = BlackColor,
                        fontSize = 20.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        text = "Hi Ihsan"
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_account),
                    contentDescription = null,
                    modifier = Modifier
                        .size(58.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }

        // Middle
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(Color(0xFFFFFFFF))
        ) {
            DoctorCard(
                backgroundColor = Color(0xFF4894FE),
                iconResourceId = R.drawable.ic_user,
                name = "Dr. Imran Syahir",
                specialist = "General Doctor",
                dayOrDistance = "Sunday, 12 June",
                timeOrReview = "",
                time = "11:00 - 12:00 AM",
                isNear = false,
                isSchedule = false
            )
//            CardTop(
//                backgroundColor = Color(0xFF4894FE),
//                iconResourceId = R.drawable.ic_user,
//                name = "Dr. Imran Syahir",
//                specialist = "General Doctor",
//                day = "Sunday, 12 June",
//                time = "11:00 - 12:00 AM"
//            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                OutlinedTextField(
                    value = query,
                    onValueChange = { query = it },
                    placeholder = {
                        Text(
                            text = "Search doctor or health issue",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            color = Secondary
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = "Search",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFFAFAFA), shape = RoundedCornerShape(12.dp)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                FeatureFavorite(iconResourceId = R.drawable.ic_sun, title = "Covid 19")
                FeatureFavorite(iconResourceId = R.drawable.ic_profile_add, title = "Doctor")
                FeatureFavorite(iconResourceId = R.drawable.ic_link, title = "Medicine")
                FeatureFavorite(iconResourceId = R.drawable.ic_hospital, title = "Hospital")
            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Near Doctor",
                fontSize = 16.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                LazyColumn() {
                    item {

                        DoctorCard(
                            backgroundColor = Color(0xFFFFFFFF),
                            iconResourceId = R.drawable.ic_account_1,
                            name = "Dr. Joseph Brostito",
                            specialist = "Dental Specialist",
                            dayOrDistance = "1.2 KM",
                            timeOrReview = "4,8 (120 Reviews)",
                            time = "Open at 17.00",
                            isNear = true,
                            isSchedule = false
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        DoctorCard(
                            backgroundColor = Color(0xFFFFFFFF),
                            iconResourceId = R.drawable.ic_account_1,
                            name = "Dr. Joseph Brostito",
                            specialist = "Dental Specialist",
                            dayOrDistance = "1.2 KM",
                            timeOrReview = "4,8 (120 Reviews)",
                            time = "Open at 17.00",
                            isNear = true,
                            isSchedule = false
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        DoctorCard(
                            backgroundColor = Color(0xFFFFFFFF),
                            iconResourceId = R.drawable.ic_account_1,
                            name = "Dr. Joseph Brostito",
                            specialist = "Dental Specialist",
                            dayOrDistance = "1.2 KM",
                            timeOrReview = "4,8 (120 Reviews)",
                            time = "Open at 17.00",
                            isNear = true,
                            isSchedule = false
                        )

//                        CardNear(
//                            backgroundColor = Color(0xFFFFFFFF),
//                            iconResourceId = R.drawable.ic_account_1,
//                            name = "Dr. Joseph Brostito",
//                            specialist = "Dental Specialist",
//                            distance = "1.2 KM",
//                            review = "4,8 (120 Reviews)",
//                            time = "Open at 17.00"
//                        )
//                        Spacer(modifier = Modifier.height(16.dp))
//                        CardNear(
//                            backgroundColor = Color(0xFFFFFFFF),
//                            iconResourceId = R.drawable.ic_account,
//                            name = "Dr. Joseph Brostito",
//                            specialist = "Dental Specialist",
//                            distance = "1.2 KM",
//                            review = "4,8 (120 Reviews)",
//                            time = "Open at 17.00"
//                        )
//                        Spacer(modifier = Modifier.height(16.dp))
//                        CardNear(
//                            backgroundColor = Color(0xFFFFFFFF),
//                            iconResourceId = R.drawable.ic_account_1,
//                            name = "Dr. Joseph Brostito",
//                            specialist = "Dental Specialist",
//                            distance = "1.2 KM",
//                            review = "4,8 (120 Reviews)",
//                            time = "Open at 17.00"
//                        )
//                        Spacer(modifier = Modifier.height(16.dp))
//                        CardNear(
//                            backgroundColor = Color(0xFFFFFFFF),
//                            iconResourceId = R.drawable.ic_account,
//                            name = "Dr. Joseph Brostito",
//                            specialist = "Dental Specialist",
//                            distance = "1.2 KM",
//                            review = "4,8 (120 Reviews)",
//                            time = "Open at 17.00"
//                        )
                    }
                }

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen()
}