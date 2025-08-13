package com.example.mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {  //Inherits ViewModal class
    private var _count = mutableIntStateOf(0)
    val count : MutableState<Int> = _count // Exposing the immutable state

    fun increment() {
        _count.value++
    }

    fun decrement(){
        _count.value--
    }

}

//STATE
//1. **Definition** – State is any value that can change over time, and when it changes, the UI that reads it automatically re-composes.
//
//2. **Use in Compose** – State keeps your UI and data in sync without manually updating views. Example: `var count by remember { mutableStateOf(0) }`.
//
//3. **Recomposition trigger** – Whenever a State variable changes, Compose re-runs the relevant `@Composable` functions to update the UI.
//
//4. **Lifecycle awareness** – State should be stored in a way that survives configuration changes (e.g., `ViewModel`’s `MutableState` or `rememberSaveable`).
//
//5. **Best practice** – Make state **private & mutable** inside ViewModel and expose it as **read-only** to the UI for unidirectional data flow.


