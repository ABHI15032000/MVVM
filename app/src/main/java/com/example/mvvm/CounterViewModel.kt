package com.example.mvvm

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private var _count = mutableIntStateOf(0)
    val count : State<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement(){
        _count.value--
    }

}