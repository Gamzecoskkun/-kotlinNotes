package basics.controlflow

import java.io.IOException
import java.sql.SQLOutput

fun main() {

    /**
     *
     * İf else case'lerinden sonra suslu parantez acilir ve kapanir
     * Ancak bu suslu parantezler arasina tek satir kod yazacaksak, suslu parantez kullanmak zorunda degiliz.
     * If-else case'lerinin state ve experssion olmak uzere 2 kullanimi vardir. Basitce;
     * State kullanimi sadece if else kullanarak sartli durumlarimizi kodlamaktir.
     * Experssion kullanimi ise bir value'ya deger olarak esitligin karsi tarafina if else kodlarini yazmaktir.
     * Experssion olarak yapilan kullanimda, if else case'leri icin yazilmis parantezlerin son satiri value olarak alinir.
     *
     ***/

    print("Öğrenci misin?")
    val answer = readLine()!!

//    if (true){
//
//    }else(false){
//
//    }
//
//    if (1.durum){
//
//    }else if (2.durum){
//
//    }else if (3.durum){
//
//    }else if (4.durum){
//
//    }else

//    if (1.durum){
//
//    }else{
//        if (2.durum){
//
//        }else{
//            if (3.durum)
//        }
//    }

    //state kullanimi
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci değilsin")
    }

    if (answer.contains("Evet", ignoreCase = true))
        println("Öğrenci")
    else
        println("Öğrenci değilsin")


    // expession kullanimi. {} icersindeki son satir, deger olarak degiskene atanir
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci değil"
    }

    println(result)


    /**
     * Kotlin'de if else'lerin Experssion kullanimindan oturu ternary operatoru yoktur.
     * Ternary yerine asagidaki gibi kullanim yapabilirsiniz
     */

    val isStudent = false
    val isStudent2 = if (isStudent) {
        "true"
    } else {
        "false"
    }

    //String name2 = isStudent ? "true" : "false" ternary operator

    print("Notunuzu Giriniz: ")
    val grade = readln().toDouble()

    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade <= 99 && grade >= 80) {
        println("BB")
    } else if (grade <= 70 && grade >= 50) {
        println("CC")
    } else if (grade <= 49 && grade >= 20) {
        println("DD")
    } else {
        println("İstersen sen bir okulu bırak")
    }

//    true && true=true
//    true && false=false
//    false && true=false
//    false && false =false

//    true || true=true
//    true || false=false
//    false || true=false
//    false ||false =false

    /*-----------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     *  2 farkli tipteki number degiskenler karsilastirilirken equals fonksiyonu once tiplerini karsilastirdigi icin
     *  eger tipler uyusmuyorsai ide hata verecektir.
     */

//    if (10==10L){ //Calismaz
//
//    }

    if (10 == 10L.toInt()) {
        println("true")
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * mulakatta sorulur.
     * Birden fazla sartli durumunuz varsa bunlarin her birini, asagidaki gibi, ayri ayri if seklinde yazmak
     * if else seklinde yazmaktan daha kotu performans almaniza yol acar. Zira if else durumlarinda dogru case
     * bulunursa, diger case'ler kontrol edilmez. Ancak asagidaki durumda dogru case bulunsa bile tum case'ler
     * kontrol edilir.
     */

    if (grade <= 100) {

    }

    if (grade >= 85) {

    }

    if (grade <= 84) {

    }


    /*-----------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Bazi durumlarda if else yazmaktansa, if case'ini yazip return ya da throw gibi kodun devam etmesini bozacak
     * ifadelerle kodu sonlandirabilirsiniz. Kod calisirken bu if case'ine girmezse devam eden kod blogu calisir ki
     * bu da pratikte else case'i demek olur. Bu seklide yazim kodu biraz daha temiz gosterecektir.
     */

    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }

    if (isStudent) {
        println("Student")
        throw IOException()
        //  return
    }
    otherMethod()

    if (isStudent==true) //nullable değer değilse bunu yapmaya gerek yok if(student) demek daha doğru olur

private fun otherMethod() {

}





