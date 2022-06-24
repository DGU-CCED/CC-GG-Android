package com.example.kotlinpractice

open class Human(val name: String = "Anonymous") {
    constructor(name: String, age: Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born!!")
    }

    //val name = name

    //val name = "seunghyunlee"

    fun eatingCake() {
        println("This is so Yummy~!")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human() {
    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is ${name}")   //Anonymous를 받아옴
    }
}

fun main() {
//    val human = Human("minsu")
//
//    val stranger = Human()
//    human.eatingCake()

//    val mom = Human("Mom", 52)

//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}
