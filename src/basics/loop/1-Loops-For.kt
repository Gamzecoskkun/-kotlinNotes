package basics.loop

fun main() {

    /**
     *  3 farkli sekilde for tanimlayabilirsiniz.
     *  value in list                       seklinde value degerlerini alabilirsiniz
     *  index in list.indices               seklindek index degerlerini alabilirsiniz.
     *  (index,value) in list.withIndex()   seklinde index, value degerlerini alabilirsiniz.
     */

    for (value: Int in 1..10) {
        print("$value  ") //1  2  3  4  5  6  7  8  9  10
    }
    //  0 , 1   , 2,   3 size->4
    val countryCodeArray = arrayOf("tr", "az", "en", "fr")
    val alphList='A'..'Z'

    for (value in countryCodeArray) {
        print("$value ") //tr az en fr
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . değeri : ${countryCodeArray[index]}")
    }
    /*
    Çıktısı:
    0 . değeri : tr
    1 . değeri : az
    2 . değeri : en
    3 . değeri : fr
     */

    for ((index,value) in countryCodeArray.withIndex()){
        print("\n$index. değeri : $value ")  // index ve value birlikte alabiliriz withIndex()
    }
    for ((index,value) in countryCodeArray.withIndex()){
        print("\n$index. değeri : $value ")  // index ve value birlikte alabiliriz withIndex()
    }

/*-----------------------------------------------------------------------------------------------------------*/

    /**
     * repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     *  **/

    repeat(10){
        println("gamze") // 10 kere gamze yazdırır
    }

/*-----------------------------------------------------------------------------------------------------------*/

    /**
     *  return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     *  continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz.
     * **/

    for (value in 1..50){
        if (value%2==1){
            continue
        }
        println("\n$value") // 2 ye bölünümden 1 kalan sayıları atlar diğerlerini yazdırır
    }

    for (value in 1..50){
        if (value %2==0){
            break
        }
        print("\n$value") // sadece 1 i ekrana yazdırır 2 ye bölümğnden 0 ı gördüğü an break komutuyla döngüyü kırar döngüden çıkar
    }

    /**
     *  Ic içe for donguleri kullaniyorsak bir ustteki for'a degil de iki ustteki uc ustteki for'a donmek istiyorsak
     *  label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for'un onune yazip,return ya da continue yapacagimiz
     *  yere ise @labelname seklinde yazmamiz yeterlidir.
     */

    for (value in 1..50){
        for (value2 in 0..10){
            if (value2==5){
                continue
            }

            println("contiune1: $value2 | ")
        }
    }
    println("")


    returnLabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2==5){
                continue@returnLabel
            }
            print("continue2 : $value2 |")
        }
    }

    println("")

    returnLabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2==5){
                break@returnLabel
            }

            print("break2 : $value2 |")
        }
    }

}