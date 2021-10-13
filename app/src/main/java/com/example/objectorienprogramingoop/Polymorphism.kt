package com.example.objectorienprogramingoop

open class Aniimal{
    open fun sound(){
        println("Berbagai macam suara binatang")
    }
}

class Duck : Aniimal(){
    override fun sound() {
        println("Suara bebek : wkwkwkwk")

    }
}

class Kucing : Aniimal(){
    override fun sound() {
        println("Suara kucing : miao")
    }
}

fun main() {
    val bebek = Duck()
    val kucing = Kucing()
    val hewan = Aniimal()

    hewan.sound()
    bebek.sound()
    kucing.sound()
}
