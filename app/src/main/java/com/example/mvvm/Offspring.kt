package com.example.mvvm

class Offspring : Secondary(), Archery, Singer { // not with = () are interfaces

    override fun archery() {
        super.archery()
    }

    override fun sing() {
        super.sing()
    }
}

// Created Intefaces - Archery & Snger
// Used in Offspring
