package com.example.kotlinpractice

// 1. lamda
// 람다식은 우리가 마치 value처럼 다를 수 있는 익명함수이다
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a: Int)
// 2) return 값으로 사용할 수가 있다.

// 1. 람다의 기본정의
// val lamdaName : Type = {argument -> codeBody)

val square: (Int) -> (Int) = {number -> number*number}

val nameAge = {name: String, age: Int ->
    "my name is ${name}. I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("seunghyun", 24))
    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana,", 27))

    println(calculateGrage(97))

    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    // 아래 2가지 표현은 같은 표현
    println(invokeLamda({it > 3.22}))
    println(invokeLamda { it > 3.22 })


}

// 확장함수
val pizzaIsGreat: String.() -> String = {
    this + " Pizza is the best!"
}

fun extendString(name: String, age: Int):String{
    val introduceMyself: String.(Int)->String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 return

val calculateGrage:(Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error" // 람다는 return을 할 때 마지막 표현식이 return의 value를 지정
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean{
    return lamda(5.2343)
}

// pojo
