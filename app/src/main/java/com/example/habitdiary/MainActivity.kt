package com.example.habitdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.habitdiary.ui.navigation.HabitDiaryNavigation
import com.example.habitdiary.ui.theme.HabitDiaryTheme
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest


val supabase = createSupabaseClient(
    supabaseUrl = "https://qgvuthfibrsswopbggnj.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InFndnV0aGZpYnJzc3dvcGJnZ25qIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDI1MTAwNDgsImV4cCI6MjAxODA4NjA0OH0.SjhsqWKY7O3jOsXlEcXfOMKsnneuZLGGZg6n4u0tWIQ"
) {
    install(Auth)
    install(Postgrest)
    //install other modules
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HabitDiaryTheme(dynamicColor = false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    HabitDiaryNavigation()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
