package com.example.dokterian.ui.screens.schedule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dokterian.R
import com.example.dokterian.ui.components.ButtonSchedule
import com.example.dokterian.ui.components.DoctorCard

@Composable
fun ScheduleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 24.dp)
        ) {
            LazyRow(

            ) {
                item {
                    ButtonSchedule(text = "Canceled Schedule", onClick = {})
                    Spacer(modifier = Modifier.width(8.dp))
                }

                item {
                    ButtonSchedule(text = "Upcoming schedule", onClick = {})
                    Spacer(modifier = Modifier.width(8.dp))
                }
                item {
                    ButtonSchedule(text = "Completed schedule", onClick = {})
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(Color(0xFFFBFCFD))
        ) {
            LazyColumn(){
                item {
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_account_1,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_person_two,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_person_three,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_account_1,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_person_three,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_person_two,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DoctorCard(
                        backgroundColor = Color(0xFFFFFFFF),
                        iconResourceId = R.drawable.ic_account_1,
                        name = "Dr. Joseph Brostito",
                        specialist = "Dental Specialist",
                        dayOrDistance = "Sunday, 12 June",
                        timeOrReview = "",
                        time = "11:00 - 12:00 AM",
                        isNear = false,
                        isSchedule = true
                    )
                }
            }

        }


    }
}

@Preview
@Composable
fun SchedulePreview() {
    ScheduleScreen()
}


//Button(
//                    onClick = { /* TODO: Add button action here */ },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 20.dp, bottom = 24.dp),
//                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5FAFF))
//                ) {
//                    Text(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 10.dp, vertical = 10.dp),
//                        text = "Upcoming schedule",
//                        color = Color(0xFF4894FE),
//                        fontSize = 16.sp,
//                        fontFamily = Poppins,
//                        fontWeight = FontWeight.Medium
//                    )
//                }