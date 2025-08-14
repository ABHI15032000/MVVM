package com.example.mvvm

fun main(){
    val obj1 = BaseClass()
    obj1.coreValues()

    val obj2 = Secondary()
    obj2.coreValues()
    obj2.role()

    val obj3 = Tertiary()
    obj3.role()


    val kid = Offspring()
    kid.coreValues()
    kid.archery()
    kid.archery()
    kid.role()
}