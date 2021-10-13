package com.example.objectorienprogramingoop

class enkapsulasi {
    private var nama = String()
    fun setNama(nama: String){
        this.nama = nama
    }
    fun getNama(): String = nama
}

fun main() {
     var mhs1 = enkapsulasi()
    mhs1.setNama("Genta")
    //mhs1.nama("Genta)

    println("Hai.. saya${mhs1.getNama()}")
    println("Salam kenal...")
}