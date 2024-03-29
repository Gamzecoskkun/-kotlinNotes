package basics.functions


//infix fun calculateArea(){
//    hata verir
//}
fun main() {

    /**
     * Daha okunakli kodlar yazmak icin kullanilir.
     * .(nokta) kullanimi kaldirir.
     * Bir fonkiyonu infix hale getirebilmek icin 5 sart vardir;
     * 1.infix keywordu ile baslar.
     * 2.fonksiyon bir uye fonksiyon olmalidir.(bir sinifa ait olmalidir.)
     * 3.ya da bir extension fonksiyon olmalidir.
     * 4. sadece bir parametre olmalidir. Bu parametre vararg olamaz.
     * 5.infix method'un parametresi default deger alamaz
     *
     * Yapisal olarak;
     *
     * İnfix fun infixMethod(justOneParam: AwesomeParam):Whatever{
     * }
     *
     * **/

    val isStudent = false
    val isMale = true

    /**
     * and , or,xor gibi onlarca infix method vardir.
     */

    if (!isStudent and isMale) {
        print("Öğrenci olmayan erkek")
    }

    if (!isStudent and (isMale)) {
        print("Öğrenci olmayan erkek")
    }

    //infix kullanimi
    isStudent and isMale
    isStudent.and(isMale)
//
    val awesomeInstance = AwesomeClass()
    //infix kullanimi

    awesomeInstance downloadImage "www.google.com.tr"
    awesomeInstance.downloadImage("www.google.com.tr")

    /*----------------------------------------------------------------------------------------------------*/

    val number = 5
    // matematiksel operatorlerin, tip donusumlerin(type conversion),range kullanimin, infix methodlara karsi islem onceligi vardir.
    if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {

    }
//çoktan seçmelide sorulabilir
    /*----------------------------------------------------------------------------------------------------*/

//infix methodlarin da mantik operatorlerine gore onceligi vardir.
    if (number == 3 && number < 5 || awesomeInstance specialPlus 4 == 5) {

    }
    // 5==3 && 5<5 || 4==5
    //false && false || false =false
}

/*----------------------------------------------------------------------------------------------------*/

class AwesomeClass {

    //Calismaz.Commet'i kaldir kontrol et istersen
//    infix fun downloadImage(imageUrl: String="Gamze"){
//
//    }

    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }

/*----------------------------------------------------------------------------------------------------*/

    //Calismaz.Comment'i kaldir kontrol et istersen
//    infix fun <T> downloadImage2(vararg  mageUrl:T){
//
//    }

    //bir sinifin icindeyken this kullanimi size bulundugu sinifi isaret eder.
    //asagidaki kullanimda AweSomeClass().downloadImage(imageUrl) kullanimi olusur aslinda(implicit)
    fun logWhenImageDownloaded(imageUrl: String){
        downloadImage(imageUrl)
//        downloadImage  imageUrl
        this downloadImage imageUrl
    }
}

/*----------------------------------------------------------------------------------------------------*/

// bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz.
 fun logWhenImageDownloaded(imageUrl: String){
  //this   downloadImage imageUrl
}




