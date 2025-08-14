package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvm.ui.theme.MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Run general implementation
        enableEdgeToEdge()
//        val counterViewModel = CounterViewModel()  --> CounterViewModel() manually created in onCreate(), so it gets recreated every time the Activity restarts
        setContent { // Here write your code it will run your implementation
            val counterViewModel: CounterViewModel by viewModels() // Android retain your ViewModel across configuration changes.

            MVVMTheme {
                CounterApp(counterViewModel)
            }
        }
    }
}
@Composable // directs to interpret a fn declaratively which defined that this function defined a segment of UI, facilitating both composition and recomposition (display and redisply
 fun CounterApp(counterViewModel: CounterViewModel){
     Column(
         modifier = Modifier.fillMaxSize().padding(16.dp),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
     ) {
         Text(text = "Count = ${counterViewModel.count.value}", fontSize = 24.sp)
         Spacer(modifier = Modifier.height(16.dp))

         Row {
             Button(onClick = { counterViewModel.decrement() }) {
                 Text("Decrease")
             }
             Spacer(modifier = Modifier.width(16.dp))
             Button(onClick = { counterViewModel.increment() }) {
                 Text("Increase")
             }
         }
     }

 }
//Padding - if want a fine grained space around a particular element
// Spacing - Consistent space between multiple element


