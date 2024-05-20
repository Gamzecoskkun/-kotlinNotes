package basics.classes

import java.sql.SQLOutput

class Turtle constructor(
    var mName: String = "Tosbik",
    mFeetCount: Int = 4
) { //1-classın içerisine kaplumbağnın özelliklerini yaz
    // javada (bunun yerine 4 tane constructor yazıyoruz kotlinde ise bir tane yazmamız yeterli)
    var feetCount: Int = 4
   private val feetColor: String = "Brown"
    val headCount: Int = 1
    val headColor: String = "Brown"
    val shelterColor: String = "Green"
    val tailCount: Int = 1
    val tailColor: String = "Brown"
    val age: Int = 1
    var name: String = "Tosbik"
    val sex: String = "Female"
    val isMarried: Boolean = true

    // bu init bloğu primary constructor çağrıldığı zaman çalışan kısım
    init {
        name = mName
        feetCount = mFeetCount
        println("Primary constructor created")
    }

    //fonksiyonlarla ne iş yaptığını anlatıyoruz
    fun makeASound(): String {
        return "hjdsjdj"
    }

    fun eatMeal() {
 mName
//        mfeetCount
    }

    fun walk() {

    }

    fun swim() {

    }

    //second constructor
    constructor(mName: String="Tosbik",mFeetCount: Int=4,isMarried:Boolean=true):this(mName,mFeetCount){
        println("Second constrcutor created")

    }
}

fun main() {
    //Turtle nesnesini oluşturacağız
    val turtleOne: Turtle = Turtle() //() constructor parametre parantezi
    val turtleTwo: Turtle = Turtle("Murtle")
    val turtleThree = Turtle(mFeetCount = 4)
    val turtleFour = Turtle("Murtle", 4)
    val turtleFive=Turtle("Murtle",4,true)
    /**
     * Constructor ne demek ?
     *
     */

    turtleOne.walk() //dediğimizde walkın{} içerisindekini yapıyor
    turtleOne.name = "Murtle"
}