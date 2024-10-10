package com.example.userprofileinstanttask.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.userprofileinstanttask.R

@Composable
fun UserProfileScreen(name: String?, image: Int?) {

    val context=LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(10.dp))
            Image(
                painter = painterResource(id = R.drawable.instantimage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(150.dp)
                    .border(
                        BorderStroke(5.dp, color = colorResource(id = R.color.teal_200)),
                        CircleShape
                    )
                    .padding(5.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
                    )
                    .padding(24.dp)
                    .height(580.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Instant Software Solution\n" +
                            "your road to be a software engineer",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Instant is offering Round 32 of its unique programming diplomas, designed to get you job-ready with the latest in-demand skills. The new feature this round is the Advanced AI Diploma, where you'll learn and apply the most up-to-date concepts in AI.\n" +
                            "\n" +
                            "In total, Instant is providing 11 different programming diplomas in this round:\n" +
                            "\n" +
                            "AI , Advanced AI (NEW!)\n" +
                            "Data Science & Data Analysis\n" +
                            "Full-stack Web , Front-End\n" +
                            "Back-End , Cyber Security\n" +
                            "Network , Flutter\n" +
                            "UI/UX , Software Testing\n" +
                            "These diplomas are available in both online and offline formats to suit your schedule and lifestyle.\n" +
                            "\n" +
                            "To book your spot, you can message the page, contact them via WhatsApp, or fill out a form provided in the link. They will reach out with more details if needed. Alternatively, you can leave a comment to receive private information about the diplomas.\n" +
                            "\n" +
                            "Instant is ready to help you gain the skills you need to succeed in the job market!\n",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(14.dp))
                Button(
                    onClick = {
                        val facebookUrl = "https://www.facebook.com/instantSH"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
                        context.startActivity(intent)
                              },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.primary)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .height(50.dp)
                        .width(300.dp)
                ) {
                    Text(text = "Facebook account"
                        , color = Color.White
                    , fontWeight = FontWeight.Medium
                    , fontSize = 16.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_8")
@Composable
fun DefaultPreview() {
   UserProfileScreen( name = "Modou Diarraba" , image = R.drawable.ic_launcher_foreground)
}