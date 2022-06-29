package com.example.kotlinpractice

data class Ticket(val companyName: String, val name: String, var date: String, val seatNumber: Int)

// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName: String, val name: String, var date: String, val seatNumber: Int)

fun main(){
    val ticketA = Ticket("koreanAir", "seunghyunLee", "2020-02-16", 14)
    val ticketB = TicketNormal("koreanAir", "seunghyunLee", "2020-02-16", 14)

    println(ticketA)
    println(ticketB)    // 메모리 주솟값 출력
}
