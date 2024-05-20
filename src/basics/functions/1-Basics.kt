package basics.functions

import java.util.Locale

/**
 * fun keyword'u ile fonksiyonlar baslar
 * fonksiyon ismi verilir.
 * parametre parantezleri acilir ve parantezler girilir
 * : operatoru ve geri donus degeri yazilir
 * fonksiyon body'si acilir ve kapatilir
 * Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */

//val name: String = "Gamze"

//fun name:String="Gamze"

//fun name() :String="Gamze"
//val name: String = "Gamze"

//fun name(surname: String="Gamze"):String="Gamze"

fun main(): Unit {  //eger yazılmıyorsa geri donus degeri unit(geriye bisey dondurmuyor)

    //Fonksiyon cagirilirken ismi ve parametreleri kullanilir
    //Eger bir geri donusu varsa bir degiskene atabilir.
    takeSquare(2)
    val takeSquare = takeSquare(2)
    takeSquare(number2 = 6)
    takeSquare(2, 5)
    repeat(5, 3)


    /*-------------------------------------------------------------------------------------------------------*/

//Bir class'ın  fonksiyonunu cagirirken ise nokta isaretini kullaniriz
    Math.pow(2.0, 3.0)

    /*-------------------------------------------------------------------------------------------------------*/

    /**
     * Defult degeri olan parametrelere sahip bir fonkisyon cagirilirken, default degeri olan parametrelere deger atamak
     * sart degildir. Defayult degeri olan bu parametremeler opsiyonel paramtrelerdir.
     * Default degeri olan parametrelere deger atanmadan fonksiyon cagirilacaksa bu durumda parametre sirasi degisir.
     *Ide'ye hangi parametreye deger atadiginizi soylemek icin Named Arguments'leri kullanmamiz gerekir.
     */
    reFormatMessage("Message", true, 7, "tr")
    reFormatMessage(message = "Message", size = 7, lang = "tr")
    reFormatMessage("Message", true, 7)
    reFormatMessage("Message", size = 7)

    /*-------------------------------------------------------------------------------------------------------*/

    // vararg kullanimina ornek. key =3'den onceki parametreler vararg parametresine denk geşir.
    getUserInfo1("Gamze","COŞKUN","Istanbul","Turkiye","","","",key=3)

    //vararg parametresi olarak arrayOf kullanilmak istenirse * operatoru eklenmelidir(spread operatoru)
    //bu operator diger dillerdeki pointer kullanimi anlamina gelmez. Kotlinde pointerlar yoktur.
    getUserInfo1(*arrayOf("Gamze","COŞKUN","Istanbul","Türkiye"),key=4)

    getUserInfo3(3,"Gamze","COŞKUN","Istanbul","Turkıye","","","")

    getUserInfo4(3,"Gamze","COŞKUN","Istanbul","Turkiye",true,3.14,"")

    //-------------------------------------------------------------------------------------------------------
    print()

}

/*-------------------------------------------------------------------------------------------------------*/
/**
 *  = ile fonksiyonlara default deger verilebilir(Default Argument)
 *  Default deger atamasi yapmak function overload islemi yapmanizi saglar.
 *  Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmaniz
 */

fun reFormatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {

    val locale = if (lang == "tr") {
        Locale("TR", "tr")
    } else {
        Locale.ROOT
    }

    val localMessage = if (isUpperCase) {
        message.toUpperCase(locale)
    } else {
        message.toLowerCase(locale)
    }
    println("Message : $localMessage")

//    if (isUpperCase) {
//        if (lang == "tr") {
//            println("Message : " + message.toUpperCase(Locale("TR", "TR")))
//        } else {
//            println("Message : " + message.toUpperCase(Locale.ROOT))
//        }
//    } else {
//        if (lang == "tr") {
//            println("Message: " + message.toLowerCase(Locale("TR", "tr")))
//        } else {
//            println("Message: " + message.toLowerCase(Locale.ROOT))
//        }
//    }


}
//deger veriliyorsa  isUpperCasede ve lang deger verilmiş  yani opsiyonel diyor

/**
 * Default degeri olan parametrelere sahip bir fonksyion java siniflarinin cagrilacaksa eger,
 * Bu fonksiyonlara @JVMOverloads annotation'i verilmelidir.Boylece yazilan kod JVM'e hazir hale getirilirken,
 * ilgili fonksiyonun tum varyasyonlari yazilir(overload edilir)
 */

@JvmOverloads
fun print(message: String="Message"){
    println(message)
}

/**
 * Expend edinebilir bir sinif,yavru(child) sinif tarafindan miras(inherit) alinirsa
 * ve bu sinifin override edilebilir open bir methodu varsa, bu method default argument'e sahip olursa,
 * bu sinifi miras alan sinifta method override edilirse, override edilen methodun paramteresine defult argument
 * Ust sinifin method'undaki default argument gecerli olur.
 */

open class A{
    open fun foo(i:Int=10){/*...*/}
}

class B:A(){
    override fun foo(i: Int) { /*....*/
    } //no default value allowed
}

//----------------------------------------------------------------------------------------------------------------


/**
 * @param number degisken tanimlanir gibi tanimlanir
 * Fonksiyon parametresi tanimlanirken, val var gibi betimleyiciler kullanilmaz
 */

// Overload Fonksiyon

//fun takeSquare(number: Int = 5, number2: Int = 3): Int {
//    return 2 * number
//}

fun repeat(times: Int, startedValue: Int = 0) {
    for (index in startedValue until times) {

    }
}

fun takeSquare(number: Int = 5): Int {
    return 2 * number
}

fun takeSquare(number: Int = 5,number2:Int=24): Int {
    return 2 * number
}

fun test(a:String){

}

fun test(a:Int){

}
//
//fun takeSquare():Int{
//
//}

//fun takeSquare():Int{
//    val number=4
//
//    return takeSquare(number)
//}

/*-------------------------------------------------------------------------------------------------------*/

/**
 *  Cok uzun sayida parametreniz olacaksa "variable number of arguments" - vararg tanimalanabilir
 *  Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurken cok miktarda degisken atanabilir
 *  Bu degiskenlere array'e erisir gibi erisebilirsiniz. [index] ya da .get(index) seklinde
 *
 *  vararg tek ya da son parametre olarak yazilirsa, Jvm'e hazirlanirken, Java'daki "String ..." gibi ayni kod derlenir
 *  Ancak vararg param birden fazla tanimlanirken ortada ya da basta yer alirsa, Jvm'e hazirlanirken, Array'e donusturulur
 *  Bu da performans, farkli olusturur demektir.
 */

fun getUserInfo1(vararg userInfo:String,key:Int){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg userInfo:String){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo3(key:Int,vararg userInfo: String){
    userInfo[3]
    userInfo.get(3)
    println(key)
}

fun getUserInfo4(vararg userInfo:Any){
    userInfo[3]
    userInfo.get(3)
}

/**
 * Ayni fonksiyon icersinde birden fazla vararg tanimi yapilmasina izin verilmez
 * Calismaz. Comment'i kaldir kontrol et istersen
 */

//fun getUserInfo(vararg userInfo:String,vararg userInfo2:String){
//    userInfo[3]
//}


/*-----------------------------------------------------------------------------------------------------------------------*/

/**
 * Bir fonksiyona = koyularak da return edecegi deger yazilabilir.(Single-Expression kullanimi)
 */

val userList= arrayOfNulls<String>(5)

fun getListCount():Int= userList.size

fun getListCount2()= userList.size

fun getListCount3():Int{
    return userList.size
}

//fun getListCount4():Unit{
//    return userList.size
//} olmaz

//fun getLictCOunt5():Nothing{
//    return
//}
