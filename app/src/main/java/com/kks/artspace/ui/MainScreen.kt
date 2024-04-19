package com.kks.artspace.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kks.artspace.R

@Preview
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MainImage()
        Spacer(modifier = Modifier.size(40.dp))
        MainText()
        Spacer(modifier = Modifier.size(40.dp))
        MainButtons()
    }
}

@Composable
fun MainImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .shadow(5.dp)
            .padding(30.dp)
    )
}

@Composable
fun MainText() {
    Box(
        modifier = Modifier
            .width(300.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0, 150, 136, 52))
            ,
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                text = "Artwork Title",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Artwork Artist (year)",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun MainButtons() {
    Row {
        GrayButton(text = "Previous")
        Spacer(modifier = Modifier.size(50.dp))
        GrayButton(text = "Next")
    }
}

@Composable
fun GrayButton(text:String){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .border(width = 1.dp, color = Color.Black)
            .height(50.dp),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
        )
    ) {
        Text(text = text,
            color = Color.Black,
            fontSize = 18.sp)
    }
}
