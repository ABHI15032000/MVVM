package com.example.mvvm

interface Archery {

    fun archery(){
        println("Archery function of Secondary(Father)")
    }
}

/*
"If a class agrees to this contract, it must provide these functions."
It only defines what methods or properties should exist — not how they work.
Classes implement the interface and give their own logic.
One class can implement multiple interfaces

Interfaces in OOPS serves variuos essential purposes
    1.Abstraction - interfaces allow you to define a contract that classes can implement , it consist of methods , signatures that derived classes must provide implementation for


 */
