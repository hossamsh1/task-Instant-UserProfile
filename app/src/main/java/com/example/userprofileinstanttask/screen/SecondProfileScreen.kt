package com.example.userprofileinstanttask.screen

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.userprofileinstanttask.R

@Composable
fun SecondProfileScreen(name: String?,image:Int?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp, top = 30.dp, bottom = 10.dp)
            .border(2.dp, color = Color.DarkGray)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Row {
                Image(
                    painter = image?.let { painterResource(it) } ?: painterResource(R.drawable.ma), // to use default if null
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(80.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.padding(15.dp))
                NumWithText(
                    number = "10", text = "Posts", modifier = Modifier
                        .align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.padding(15.dp))
                NumWithText(number = "100", text = "Followers", modifier = Modifier)
                Spacer(modifier = Modifier.padding(15.dp))
                NumWithText(number = "100", text = "Following", modifier = Modifier)
            }

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Column {
                Text(
                    text = name?:"",
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.padding(top = 8.dp))
                Text(
                    text = " Football Player \n to RealMadrid  \n in Madrid , Spain ",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.End)
                )
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.Gray),
                shape = RoundedCornerShape(3.dp)) {
                Text(
                    text = "Edit Profile",
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
Spacer(modifier = Modifier.padding(top = 10.dp))
Column (modifier = Modifier
    .fillMaxWidth()
    .padding(start = 10.dp, end = 10.dp)
){
    Row (modifier = Modifier
        .align(Alignment.CenterHorizontally)){
        Imagefun(image = R.drawable.ramos)
        Imagefun(image = R.drawable.modrech)
        Imagefun(image = R.drawable.mc)
    }
    Row (modifier = Modifier
        .align(Alignment.CenterHorizontally)){
        Imagefun(image = R.drawable.ma)
        Imagefun(image = R.drawable.mb)
        Imagefun(image = R.drawable.mv)
    }
}
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_8")
@Composable
fun SecondProfileScreenPreview() {
    SecondProfileScreen(name = "Modrech", image = R.drawable.modrech)
}

@Composable
fun NumWithText(number: String, text: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
        Text(
            text = "$number",
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 15.dp)
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            text = text,
            color = Color.DarkGray,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun Imagefun(image: Int){
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(120.dp)
            .padding(5.dp)
    )
}