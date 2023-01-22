package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageQuadrant(
                        titulFirstQuadrant = stringResource(R.string.titulFirstQuadrant),
                        textFirstQuadrant = stringResource(R.string.textFirstQuadrant),
                        titulSecondQuadrant = stringResource(R.string.titulSecondQuadrant),
                        textSecondQuadrant = stringResource(R.string.textSecondQuadrant),
                        titulThirdQuadrant = stringResource(R.string.titulThirdQuadrant),
                        textThirdQuadrant = stringResource(R.string.textThirdQuadrant),
                        titulFourthQuadrant = stringResource(R.string.titulFourthQuadrant),
                        textFourthQuadrant = stringResource(R.string.textFourthQuadrant)
                    )
                }
            }
        }
    }
}

@Composable
fun ImageQuadrant(
    titulFirstQuadrant: String, textFirstQuadrant: String,
    titulSecondQuadrant: String, textSecondQuadrant: String,
    titulThirdQuadrant: String, textThirdQuadrant: String,
    titulFourthQuadrant: String, textFourthQuadrant: String
) {
    Column(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier
                .fillMaxHeight(0.5f)


        ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(1f)
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            )
            {
                Column {
                    Text(
                        text = titulFirstQuadrant, fontWeight = FontWeight.Bold, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = textFirstQuadrant, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }

            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxHeight(1f)
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Column {
                    Text(
                        text = titulSecondQuadrant,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = textSecondQuadrant, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }


        }
        Row(
            modifier = Modifier
                .fillMaxHeight(1f)

        ) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxHeight(1f)
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Column {
                    Text(
                        text = titulThirdQuadrant,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = textThirdQuadrant, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxHeight(1f)
                    .weight(1f)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
            ) {
                Column {
                    Text(
                        text = titulFourthQuadrant,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = textFirstQuadrant, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ImageQuadrant(
            titulFirstQuadrant = stringResource(R.string.titulFirstQuadrant),
            textFirstQuadrant = stringResource(R.string.textFirstQuadrant),
            titulSecondQuadrant = stringResource(R.string.titulSecondQuadrant),
            textSecondQuadrant = stringResource(R.string.textSecondQuadrant),
            titulThirdQuadrant = stringResource(R.string.titulThirdQuadrant),
            textThirdQuadrant = stringResource(R.string.textThirdQuadrant),
            titulFourthQuadrant = stringResource(R.string.titulFourthQuadrant),
            textFourthQuadrant = stringResource(R.string.textFourthQuadrant)
        )
    }
}