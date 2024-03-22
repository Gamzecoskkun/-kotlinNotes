package basics.functions

import kotlin.math.log
import kotlin.math.log2

fun main() {

    /**
     * Bu dunyayi cekilebilir kilan seylerin basında gelir Extension Functions  :)
     *
     * Uzerinde degisiklik yapamadigimiz(readOnly) siniflara, ya da yapmak istemedigimiz siniflara, bu siniflarin
     * icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar. Boylece o sinifa uye bir fonksiyon kazandirabiliriz
     * Bunu yaparken unutmamiz gereken; yazdiginiz extension fonksiyon aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     * Sad but true story. Olsundu. Extension fonksiyonlar kalbinize girecekler. Bir sinifa ait olmalari gerekmez :)
     *
     * Reciver diye adlandiracagimiz bir sinifa ihtiyac duyar. Extension yazacagimiz sinifi ifade eder Receiver tanimi.
     *
     * Yapisal olarak;
     *
     * fun String.extPrint(handSomeValue:HandSomeOne):Unit{
     *
     * }
     * **/

    //normalde degiskenlere deger atayip, print islemini asagidakiler gibi  yapariz
    val pi: Double = 3 + 0.14
    println("Double Number : $pi")

    val schoolNumber: Int = 1341
    println("Int Number :$schoolNumber")

    val tcIdentityNumber: Long = 18608268888
    println("Long Number : $tcIdentityNumber")

    //yukaridaki kullanimlarin yerine normal bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir
    log2(pi, "Double Number:")
    log2(schoolNumber, "Int Number:")
    log2(tcIdentityNumber, "Long Number")

    pi.log("Double Number:")
    schoolNumber.log("Int Number")
    tcIdentityNumber.log("Long Number")


    /*-------------------------------------------------------------------------------------------------------------------------------*/

    //extension fonksiyonlar ister direkt value'lar uzerinden cagrilabilir.
    (3 + 0.14).log("")
    1341.log("")
    1341.toFloat()
    18608268888.log("")

    (3 + 0.14) log ""

    //isterseniz de degiskenler uzerinden
    pi.log("")
    schoolNumber.log("")
    tcIdentityNumber.log("")
}

/*-------------------------------------------------------------------------------------------------------------------------------*/


//normal fonksiyon
fun log2(number: Number) {
    when (number) {
        is Long -> println("Long Number : $number")
        is Double -> println("Double Number : $number")
        is Int -> println("Int Number : $number")
    }
}

fun log2(number: Number, message: String) {
    println("$message $number")

}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Number(reciever) sinifina extension olarak yazilmis log fonksiyonu. Ayni zamanda infix yapilmiştir.
 * this ifadesi, extension yapilan degeri verir. 3 log "4" yaparsaniz,
 * asagidaki kod size emtyParam="4", this =3 olarak verilir.
 */

infix fun Number.log(emptyParam: String) {
    println(emptyParam + this)
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Infix extension fonksiyon experssion formunda kullanilabilir.
 */

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

/*-------------------------------------------------------------------------------------------------------------------------------*/

open class Shape {

    var intNumber = 0

    fun setNumber(intNumber: Int) {
        this.intNumber = intNumber
    }

    fun main() {
        intNumber.extToString()
        intNumber.log("")
    }

    /*-------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Bir sinifin icinde, farkli bir sinifi ait extension fonksiyon yazilirsa, bu sinifin icinde ayni isimde normal
     * bir fonksiyon olsa bile, extension fonksiyonu icersinde, ayni isme sahip fonksiyon cagirilirsa, bu extension
     * fonksiyon isaret eder demektir. Sinifin ayni isimdeki uye fonksiyonunu extension fonksiyon icersinde cagirmak icin
     * this @sinifismi.uyefonksiyon() seklinde cagirim yapilmalidir.
     */

    open fun Int.extToString() {
        println("")

        //Int.extToString() methodu isaret eder
        extToString()

        //Shape'e ait asagidaki uye methodu isaret eder
        this@Shape.extToString()

        println("Awesome class printi")
    }

    fun extToString() {
        println("Keko class printi")
    }
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Bir sinifin, yazilmis extension fonksiyonun aynisini(isim ayni, paramtere sayisi ve tipleri ayni,ayrica geri donus tipi de ayni olmali),
 * kendi icinde barindiriyorsa , bu durumda yazilan extension fonksiyon gecersizdir. Sinifin uye fonksiyonu cagirilir.
 */

fun Shape.setNumber(intNumber: Int) {
    val result = intNumber * intNumber
    println(result)
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Bir sinifa extension fonksiyon yazilabildigi gibi extension property de yazilabilir.
 * Bunun sebebi aslinda property'lerin get ve set() methodlarindan olusmasindan dolayidir.
 * Bu extension property'lerin icerisinde field tanimlanmaz.
 * Dolayisiyla aslinda gercek anlamda bir degisken extension yapilamaz.
 * Bu konu property vs field konusu ile beraber sinif'lar islenirken detayli anlatilacaktir.
 */

var Shape.type
    get() = "Rectangle"
    set(value) {
        type = value
    }

//var Shape.type2:String="ejdısjs"

fun Shape.getType(): String {
    return type
}

fun Shape.setType(value: String) {
    type = value
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Open(Extend edilebilir) bir sinifa, sinifin icinde bir open (override edilebilir) extension fonksion yazilirsa
 * bu sinifi miras(inherit) alan siniflar, ilgili extensio fonksiyonu override edebilirler.
 */

class Rectangle:Shape(){
    override fun Int.extToString(){

    }
}

/*-------------------------------------------------------------------------------------------------------------------------------*/

/**
 * NOTES:
 * Nullable extension function da yazilabilir.
 * Companion object'lere de extension yazilabilir.Siniflar'da ornegini yapacagiz.
 */
