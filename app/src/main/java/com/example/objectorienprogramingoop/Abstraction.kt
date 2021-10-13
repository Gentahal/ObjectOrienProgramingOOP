package com.example.objectorienprogramingoop

abstract class Computer {
    abstract fun operatingSystem() : String

}

class Windows() : Computer(){
    override fun operatingSystem(): String {
        return  "Windows"
    }
}

class Mac() :Computer(){
    override fun operatingSystem(): String {
        return "Mac"
    }
}

fun getOperatingSystem(computer: Computer) = computer.operatingSystem()

fun main() {
    val tipeLaptop =Windows()
    val mac =Mac()
    println(getOperatingSystem(tipeLaptop))
    println(getOperatingSystem(mac))


}