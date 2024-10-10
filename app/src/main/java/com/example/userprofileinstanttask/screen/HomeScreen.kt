package com.example.userprofileinstanttask.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.userprofileinstanttask.R
import com.example.userprofileinstanttask.data.Data
import com.example.userprofileinstanttask.data.DataSource
import com.example.userprofileinstanttask.navigation.Route

@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()){

        DataList(data = DataSource().getDataItems(),navController)
    }
}

@Preview(showBackground = true, device = "id:pixel_6a")
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

@Composable
fun DataList(data:List<Data>, navController: NavController){
    LazyColumn(modifier = Modifier
        .padding(start = 15.dp, end = 15.dp, top = 25.dp, bottom = 25.dp)){
        items(data){item->
            ProfileRow(data = item, navController = navController)
        }
    }
}



@Composable
fun ProfileRow(data: Data, navController: NavController ) {

    Row(
        modifier = Modifier
            .clickable { navController.navigate("second_profile/${data.name}/${data.image}") }
            .fillMaxWidth()
    ) {
        // Profile Image
        Image(
            painter = painterResource(data.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.White)
        )

        Spacer(modifier = Modifier.padding(start = 16.dp))  // Adjusted space

        // Name Text
        Text(
            text = formatTextForNewLineAfterTwoWords(data.name),
            color = Color.DarkGray,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            fontSize = 16.sp,
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.CenterVertically)
        )

        Spacer(modifier = Modifier.weight(1f))  // This pushes the button to the end

        // Follow Button
        Button(
            onClick = { /*TODO*/ },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {
            Text(text = "Follow")
        }
    }

    // Separator
    Spacer(modifier = Modifier.padding(top = 4.dp))
    Box(
        modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(start = 30.dp, end = 30.dp)
    )
    Spacer(modifier = Modifier.padding(4.dp))
}


fun formatTextForNewLineAfterTwoWords(input: String): String {
    val words = input.split(" ")
    val stringBuilder = StringBuilder()

    for (i in words.indices) {
        stringBuilder.append(words[i])
        if ((i + 1) % 2 == 0) {
            stringBuilder.append("\n") // Insert a new line after two words
        } else {
            stringBuilder.append(" ")  // Add space between words
        }
    }

    return stringBuilder.toString().trim()
}