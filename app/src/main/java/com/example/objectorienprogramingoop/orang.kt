package com.example.objectorienprogramingoop

class orang() {
    var mata = false
    var mulut = false
    var telinga = "tuli"
    var tangan : String?=  "buntung"
    var kaki : Int? = 1

    fun melihat(){
        if (mata == false){
            println("silahkan liat vidio ini")
        }else{
            println("rrq jadi badut")
        }
    }
    fun bersuara(){
        if (mulut == false) {
            println("bawel")
        }else{
            println("jadi kea jakwan")
        }
    }
    fun mendengar(){
        if (telinga == "tuli") {
            println("tuli")
        }else{
            println("ga bisa denger")
        }




    }
    fun ngambilbarang() {
        if (tangan == "buntung") {
            println("buntung")
        } else {
            println("ada tangan")
        }

    }
    fun maenbola(){
        if (kaki == 1) {
            println("cuma 1")
        }else{
            println("semangat jalan")
        }
    }



}

fun main() {
    var abdi = orang()
}