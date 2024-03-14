package basics

import java.util.*

fun main() {

    /**
     * Yaklaşık olarak her karakter başına 2 byte yer kaplar. UTF-26 encoding kullanır.
     *
     * Cift tirnak icerisine yazilan karakterler butunudur.
     * Bir string ifadenin tum karakterlerini tek tek alip Char bir listeye atabilirsiniz.
     * Ya da ekrana yazdirabilirsiniz.
     * **/

    val name = "KeKod"
    val char1 = 'K'
    val char2 = 'e'
    val char3 = 'K'
    val char4 = 'o'
    val char5 = 'd'
    val nameArray = charArrayOf(char1, char2, char3, char4, char5)

    for (char in name) {
        println(char)
    }

    val awesomeKeKod = "KeKod is Awesome" //16 chars
    val firstCharOfAwesomeKekod = awesomeKeKod[awesomeKeKod.indices.first()] //'K'
    val firstCharOfAwesomeKekod2 = awesomeKeKod[1] //'e'
    val lastCharOfAwesomeKekod = awesomeKeKod[awesomeKeKod.indices.last] //'e'
    val lastCharOfAwesomeKekod2 = awesomeKeKod[15] //'e' //not 16 index out of range exception

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *
     * Stringler immutable'dır. Bir String ilk değer ataması yapıldıktan sonra değerini değiştirmez ya da
     * yeni bir değer set edilmez. String üzerinde yapacağanız tüm işlemler sizlere yeni bir String object'i dönecektir.
     * String'in ilk hali değişmeyecektir.
     *
     */

    val surName = "Coşkun"
    println(surName.uppercase()) //COŞKUN
    println(surName) //Coşkun

    var surName2: String = "Derin"
    surName2 = "Coşkun"  //Derin değeri arkada kalır. yeni string için memoryde yer açılır. Stringin ilk hali değişmez.
    println(surName2)

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *
     * Farkli tipteki bir degişkenin onune String bir degisken ya da ifade koyarak toplarsaniz, sonuc String olacaktir.
     * Ancak String bir degisken ya da ifadenin sonuna + operatoru ile, farkli bir tipte bir degisken eklerseniz, kod calismaz.
     *
     * **/

    val numbersValue: String = "value" + (4 + 2 + 6)
    println("numbersValue: $numbersValue") // value12

    //  val numbersValue2:String=(4+2+6) + "value" ///Calismaz

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Herhangi bir değişken + operatörüne ihtiyaç duyulmadan direkt olarak "" arasina yazilarak kullanilabilir.
     * Bunun için sadece $ isaretine ihtiyaciniz vardir. Bu yapiya String template denir
     * Eger degiskenin bir ozelligine ihtiyac duyacaksaniz ${} seklinde kullanilir.
     */

    println("numbersValue $numbersValue") //numbersValue value12
    println("numbersValue ${numbersValue.length}")//numbersValue 7

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *  3 tane cift tirnak kullanarak Raw String (Multiline String) olusturulabilir.
     *  Raw String'ler ide'ye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
     *  trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     *  Bu silme islemini yaparken tum satirlardaki en soldaki karakteri baz alarak silme islemini saglar.
     *  Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler
     *  Raw Stringlerin icinde escape karakterler calismaz.
     * **/

    val rawPineTree = """
         *
    $   ***
        *****
    """.trimIndent()
    println(rawPineTree)

    val rawPineTree2 = """
         *
    $   ***
        *****
    """
    println(rawPineTree2)


    /**
     * trimMargin(marginPrefix) ise verilen karakter ne ise, string satirlardaki o karaktere kadar olan kismi siler.
     * Yukaridan farkli olarak bu karakter tek bir satirda ise, sadece o satirin , o karaktere kadar olan kismi silinir.
     * trimMargin() ise karaktere bakmadan tum satirlarin en solundaki degeri baz alip,
     * tum satirlardan o degerin solundaki bosluk kadar bosluk siler
     */

    val rawPineTree3 ="""
         *
       ***
        *****
    """.trimMargin("$")
    println(rawPineTree3)

    /**
     *
     * Raw Stringler(Multiline Strings) icinde escape charackterler kullanmak icin ${'$'} yapisini kullanabilirsiniz.
     * Raw Stringler \ characterini alamazlar.
     */

    val price = """
        Price ${'$'}_9.99
        """
    println(price) // Price $_9.99

//    val price2 = """
//        Price /$_9.99
//        """
//    println(price3)

    val price3="Price \$_9.99"
    println(price3) //Price $_9.99

    /**
     *
     * Kotlin'de String.format() metodu, Java'nın String.format() metoduna çok benzer şekilde calisir.
     * Bu metod, belirli bir string icinde yer tutucuları belirtilen degerlerle degistirecek yeni bir string
     * olusturmanıza olanak tanır. Yer tutucular , formatlama belirtimleriyle tanımlanır ve bu belirtimler,
     * degistirelecek degerlerin nasil bicimlendirilecegini kontrol eder.
     *
     * %s :String icin
     * %d: Tam sayı(Integer) için
     * %f :Kayan noktalı (Float/Double) icin
     * %n: Yeni bir satıra gecmek icin(platform bagımsız)
     *
     */

    val yas=23
    val mesaj=String.format("Yaşım : %d",yas)
    println(mesaj) //Yaşım :30

    val boy=1.65
    val boyMesaj=String.format("Boyum: %.2f metre",boy)
    println(boyMesaj)//Boyum: 1,65 metre yazdırdır , .2 ondalık basamakla

    val ad="Gamze"
    val adMesaj=String.format("Adım : %s, Yaşım : %d,Boyum:%2f",ad,yas,boy)
    println(adMesaj) //dım : Ahmet, Yaşım : 30,Boyum:1,650000

    val sayi=1234567.89
    val sayiMesaj=String.format(Locale.US,"US formatında : %,.2f",sayi)
    println(sayiMesaj) //US formatında : 1,234,567.89

    //Türkçe için Locale nesnesi,"tr" ISO 639 dil kodu ve "TR" ISO 3166 ülke kodu ile oluşturulabilir.
    val localeTR=Locale("tr","TR") //Türkçe için locale nesnesi oluşturuluyor.
    val usFormatTr=String.format(localeTR,"TR formatında: %,.2f",sayi)
    println(usFormatTr) //TR formatında: 1.234.567,89





}