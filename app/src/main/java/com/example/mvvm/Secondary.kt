package com.example.mvvm

//Derived Class of Base Class
class Secondary : BaseClass() {
// By default all the functions of Base class aa gya

    override fun role(){
//        super.role() //super = excecute whatever base class said for role -->base class ke fn role() me jo hai usko execute kro pehle
        println("Child of the Base Class")
    }

}