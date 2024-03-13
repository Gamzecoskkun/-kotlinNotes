package basics

fun main() {

    /**
     * 16 bit yer kaplar.
     *
     * Tek tirnaklarin arasina, harf ,sayi, escape char ya da unicode yazarak kullanilir.
     * Cift tirnak icerisine yazilirsa String olur, Char olmaz.
     * **/

    val firstCharOfName: Char = 'G'
    //val firstCharName2:Char="G"
    //val firstCharName3: Char = 'Ga'
    val charNumber: Char = '4'
    //val charNumber2:Char='46'

/*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *    Number deger alan bir "Char" degisken Int'e cevirilirken, gercek sayisal degerini almaz.
     *    Alacagi deger ASCII tablosundaki o sayisal degerin karsiligi olacaktir.
     *  **/
    val contertedCharNumber = charNumber.toInt()
    val contertedCharNumber2 = charNumber.code
    val digitToInt = charNumber.digitToInt()
    println("charNumber= " + charNumber) //4
    println("contertedCharNumber= " + contertedCharNumber) //52
    println("contertedCharNumber2=" + contertedCharNumber2) //52
    println("digitToInt=" + digitToInt) //4

/*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *   Kacis(Escape) karakterlerini de tanimlamak icin kullanilabilir
     * **/

    val exampleString = "Kotlin'de escape karakterleri örnekleri:\n" +
            "\t \\t ile bir tab boslugu ekleyebilirsiniz.\n" +
            "\t \\n ile yeni bir satira gecebilirsiniz.\n" +
            "\t \\b ile bir backspace(geri al) islemi yapabilirsiniz.\n" +
            "\t \\r ile satır başına dönebilirsiniz.\n" +
            "\t \\' ile tek tırnak (') karakterini kullanabilirsiniz.\n" +
            "\t \\\" ile çift tırnak (\") karakterini kullanabilirsiniz.\n" +
            "\t \\\\ ile ters slash (\\) karakterini kullanabilirsiniz.\n" +
            "\t \\\$ ile dolar işareti ($) karakterini kullanabilirsiniz."

    println(exampleString)

/*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Unicode karakterlerini de tanimalamak icin kullanilabilir.
     * **/
    val blackHeart='\u2665' //♥
    val heavyBlackHeart='\u2764' //❤

    println("First commit with $blackHeart")
    println("First commit with $heavyBlackHeart")

    val ANSI_RED="\u001B[31m"
    //ANSI Renk Sıfırlama Kodu(Metni varsayılan rengine döndürür)
    val ANSI_RESET="\u001B[0m"

    println("First commit with $ANSI_RED $blackHeart $ANSI_RESET") // ♥

    val char = "♥ "
    val char2="❤"
    println(char)
    println(char2)


}