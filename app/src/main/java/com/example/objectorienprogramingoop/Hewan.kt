package com.example.objectorienprogramingoop

open class Hewan( nama : String,   berat : Float , berbulu : Boolean) {

    val nama : String
    val berat : Float
    val berbulu : Boolean

    private val test = "faik anak buruk"


    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu

    }

    constructor(nama : String, berat: Float,berbulu: Boolean,umur : Int) : this (nama,berat,berbulu)

    fun makan(){ println("$nama sedang makan untuk menambah berat badannya $berat")}

    fun tidur(){ println("$nama sedang tidur untuk merawat bulunya")}


    }





fun main() {
    val anjing = Hewan ("Aslam",0.5f,true,)
    anjing.makan()

    val monyet = Hewan ("Paik",0.6f,false,15)
    monyet.tidur()
}

