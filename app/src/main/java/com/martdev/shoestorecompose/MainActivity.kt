package com.martdev.shoestorecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.martdev.shoestorecompose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoeStoreComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Body() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = GREY_LIKE)
        .verticalScroll(rememberScrollState())
    ) {

        Image(painter = painterResource(id = R.drawable.shoe),
            contentDescription = "Shoe",
            modifier = Modifier.aspectRatio(0.5f)
        )

        Column(

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 32.dp, start = 15.dp, end = 15.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(imageVector = Icons.Filled.ArrowBackIos,
                    contentDescription = "arrow back")

                Image(imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite"
                )
            }

            Text("MEN'S ORIGINALS",
                Modifier.padding(vertical = 4.dp),
                color = DARK_GREY,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.catamaran_regular))
            )

            Text("NMD_R1 SHOES",
                Modifier.padding(top = 8.dp),
                color = DARK_BLUE,
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.catamaran_extrabold))
            )

            Text("$130",
                Modifier.padding(vertical = 26.dp),
                color = DARK_BLUE2,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.catamaran_extrabold))
            )

            Text(text = "30% OFF FRIENDS & FAMILY SALE",
                modifier = Modifier.padding(top = 350.dp),
                color = DARK_BLUE,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.catamaran_bold))
            )

            Text(text = "Enter code FRIENDS at checkout",
                color = DARK_BLUE,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.catamaran_regular))
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 52.dp)
                    .padding(top = 77.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               SizeItem(num = "8", color = Color.White,
                   backgroundColor = Color.Black, paddingEnd = 18.dp)

                SizeItem(num = "8.5", color = DARK_GREY,
                    backgroundColor = Color.White, paddingEnd = 18.dp)

                SizeItem(num = "9", color = DARK_GREY,
                    backgroundColor = Color.White, paddingEnd = 18.dp)

                SizeItem(num = "9.5", color = DARK_GREY,
                    backgroundColor = Color.White, paddingEnd = 18.dp)

                SizeItem(num = "10", color = DARK_GREY,
                    backgroundColor = Color.White)
            }

            Button(onClick = {},
                modifier = Modifier
                    .size(350.dp, 100.dp)
                    .padding(top = 31.dp, bottom = 16.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black,
                    contentColor = Color.White), content = {
                        Text("Add to cart")
                })
        }
    }
}

@Composable
fun SizeItem(num: String, color: Color, backgroundColor: Color, paddingEnd: Dp = 0.dp) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(40.dp)
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(num,
            color = color,
            fontFamily = FontFamily(Font(R.font.catamaran_bold))
        )
    }
}

@Preview(showBackground = true, device = Devices.PIXEL)
@Composable
fun DefaultPreview() {
    ShoeStoreComposeTheme {
        Body()
    }
}