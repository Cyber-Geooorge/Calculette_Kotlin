package com.example.calculette_kotlin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.calculette_kotlin.ui.theme.Calculette_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        val calculetteViewModel = ViewModelProvider(this)[CalculetteViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            Calculette_KotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculette(modifier = Modifier.padding(innerPadding), calculetteViewModel )
                }
            }
        }
    }
}
