package com.example.objectorienprogramingoop

//class: Merupakan sebuah blueprint yang terdapat properti dan di dalamnya

//constructor merupkan semua variable yang ada di dalam class
//properti merupakan variable di dalam constructor
class Animal(val name: String,
             val weight : Double,
             val age : Int,
             val isMammal : Boolean) {

    var warna = "merah"

    fun eat (){
        println("$name makan !")
    }

    fun sleep (){
        println("$name tidur")
    }

//functions : Kemampuan atau aksi dari sebuah kelas.

}

fun main() {
    val macan = Animal(name = "macan",weight = 10.5,5,isMammal = false)
    println("Nama : ${macan.name},"+
    "berat : ${macan.weight},"+
    "umur : ${macan.age},"+
    "apakah macan mamalia? : macan ${macan.isMammal}")

    macan.warna = "ungu"
    println("macan warna ${macan.warna}")
    macan.eat()
    macan.sleep()
}