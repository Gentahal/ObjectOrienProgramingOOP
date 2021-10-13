package com.example.objectorienprogramingoop

open class Person(val name : String, val email : String){
    fun info(){
        println("Name $name \nemail $email" )
    }
}
open class Teacher(name : String, email: String, val subject:String) : Person(name,email){
    fun specialSubject(){
        info()
        println("Is a teacher who teaches subject $subject.")
    }
}

class PrivateTeacher(name: String,email: String,subject: String,val students: Int)
    :Teacher(name,email,subject){
        fun capacity(){
            specialSubject()
            println("As a private teacher able to teach $students Students.")
        }
    }

class PublicTeacher(name: String,email: String,subject: String,val school: String)
    :Teacher(name,email,school){
        fun school(){
            specialSubject()
            println("Teaching at @school as a public Teacher")
        }
    }

fun main() {
    val myTeacher =PrivateTeacher("Salim maula","salim@gmail.com","Kotlin",1)
    myTeacher.capacity()
    println()

    val myHomeRoom =PublicTeacher("Salim maula", "salim@gmail.com","Kotlin","Smk Idn boarding school")
    myHomeRoom.school()

    println()
}


