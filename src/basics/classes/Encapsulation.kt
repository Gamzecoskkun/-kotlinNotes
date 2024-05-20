package basics.classes

class Encapsulation {
    // Elinde bir değişken varsa bu değişkenlere mutlaka private'da tut.
   var name: String = "Gamze"
     val surName: String = "Coşkun"

    fun getFullName(): String {
        return "$name $surName"
    }

//    fun getName():String{
//        return name
//    }
//
//    fun setName(value:String){
//        name=value
//    }


}

fun main(){
  val encapsulation=Encapsulation()
    encapsulation.name="skksksjk"


}