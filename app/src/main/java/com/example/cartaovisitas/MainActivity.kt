package com.example.cartaovisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaovisitas.ui.theme.CartaoVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartaoVisitasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        name = "Arthur Barbosa",
                        profession = "Engenheiro de Softwere",
                        email = "arthur.com50@gmail.com",
                        contact = "(81) 99741-0734",
                        website = "www.seusite.com",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    profession: String,
    email: String,
    contact: String,
    website: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = name, fontSize = 24.sp)
        Text(text = profession, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))

        // Row for Email
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.mail),
                contentDescription = "Email Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = email, fontSize = 14.sp)
        }

        // Row for Phone
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = "Phone Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = contact, fontSize = 14.sp)
        }

        // Row for Website
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.net),
                contentDescription = "Website Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = website, fontSize = 14.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    CartaoVisitasTheme {
        BusinessCard(
            name = "Seu Nome",
            profession = "Sua Profissão",
            email = "seuemail@example.com",
            contact = "(XX) XXXXX-XXXX",
            website = "www.seusite.com"
        )
    }
}
