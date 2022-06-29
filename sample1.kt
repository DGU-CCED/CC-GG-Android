package com.example.kotlinpractice

fun main() {
    //3. String Template

//    val name = "seunghyun"
//    val lastName = "Lee"
//    println("my name is ${name + lastName}I'm 24")
//
//    println("this is 2\$")
//
//    checkNum(1)

//    forAndWhile()

//    nullcheck()

    ignoreNulls("asdf")
}

//1. 함수

fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//2. val vs var
//val = 상수, var = 변수

fun hi() {
    val a: Int = 10
    var b: Int = 9

    var e: String

    b = 100

    val c = 100
    var d = 100

    var name = "seunghyunlee"
}

//4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b: Int = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b: ${b}")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement
//Expression: 값을 만들어 내는 것
//Statement: 값을 만들어 내지 않는 것
//kotlin의 모든 함수는 Expression

// 5. Array and List
// Array(크기가 할당되어 나옴)

// List 1. List(수정 불가능, 읽기 전용) 2. MutableList(수정 가능, 읽기, 쓰기 가능)

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

// 6. For / While

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생 : ${name}")
    }

    var sum: Int = 0
    for (i in 1 until 100) {  //1..100은 1부터 100까지 100번 for문이 돈다.
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck() {
    // NPE: NULL pointer Exception

    var name: String = "seunghyunlee"

    var nullName: String? = null    //type 생략 불가능

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()   //null이면 전체가 null을 반환

    // 엘비스 연산자
    // ?:

    val lastName: String? = "Lee"
    val fullName = name + " " + (lastName ?: "No lastName")

    println(fullName)

    //!!

}

fun ignoreNulls(str: String?){
    val NotNull : String = str!!    // 확실히 null이 아닌 이상 쓰는 것 지양
    val upper = NotNull.uppercase()

    val email:String? = null
    //null 이 아니면 let 안으로 이동
    email?.let{
        println("my email is ${email}")
    }
}
