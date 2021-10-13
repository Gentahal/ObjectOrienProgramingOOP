package com.example.objectorienprogramingoop

open class Siswa ( val nama : String,protected val berat : Float){
    fun info(){
        println("Nama : $nama" +
                "Berat : $berat")
    }
}

class SiswaIdn (nama: String,
                berat: Float,
                val jenis :String,
                val asal : String) : Siswa(nama,berat)

fun main() {
    val pelajar = SiswaIdn("paik",15.0f,"Nu","israel")
    println("Nama siswa : ${pelajar.nama}")
    //println("berat siswa : ${pelajar.")
}

