package basics.classes

open class Animal(open val name:String=""){
    val feetCount:Int=4
    val origin:String="Sivas"
    val tailShape:String="Oval"

    fun makeASound():String{
        return ""
    }

    fun attackToTheWolf(){

    }

    fun eat(){

    }

    fun walk(){

    }

    fun dance(){

    }
}

class Dog(override val name: String) :Animal("LillyDogVersion"){
}

class Cat(override val name: String):Animal("Lilly"){
}

//statik polymorphism
// Aynı fonksiyon farklı parametrelerle farklı geri dönüş vs  birden fazla yazma fonksiypn ovverlide
//Aynı fonksiyonların farklı sonuç içermesi statik polymorphism
// üst classtan ovveride etmesine dinamik polymorfizm deniyor
fun call(gokhan:Gokhan){

}

fun call(gamze: Gamze){

}

class Gokhan

class Gamze

fun main(){
    val animal=Animal()
//    val dog=Dog()
//    val cat=Cat()

//    dog.attackToTheWolf()
//    cat.attackToTheWolf()

}