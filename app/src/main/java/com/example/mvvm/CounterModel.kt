package com.example.mvvm

data class CounterModel(var count : Int)

class CounterRespository{
    private var _counter  = CounterModel(0)

    fun getcount() = _counter

    fun incrementCounter(){
        _counter.count++
    }
    fun decrementCounter(){
        _counter.count--
    }
}