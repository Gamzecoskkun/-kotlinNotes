package basics

fun main(){
    /** Bir degiskene null deger atamasi yapabilmek icin degisken tipinin sonuna ? isareti konulur.
     * Eger bir degiskene tip verilmez ve direkt null deger atamasi yapilirsa, IDE tip cikarimi yaparken
     * bu degiskenin degerini Nothing? olarak isaretler. Cunku hangi tipe karsilik geldigini bilemez
     * **/

    val name :String?=null
    val age:Int?=null

    val number=null

    val number3=null //Nothing?

    var number1:Int?=null
    var number2:Int?=null

    var result:Int?=0
    result!!.plus(324)
    result?.plus(324)

//---------------------------------------------------------------------------------------------------------------------

/**
 * Elimizde nullable bir degisken varsa, bu degiskenin methodlarindan birine ihtiyac duyacaksak ya da
 * direkt olarak kullanacaksak bu durumda ideye ya bu degiskenin null olmayacaginin garantisini !! operatoru
 * vermek gerekiyor ya da null degilse calissin demek icin ?.operatoru kullanmak gerekiyor
 * Best Practice olarak debug modda calisirken kodlarimiza !! seklinde yazmamiz Kotlin Null Pointer Exception
 * almamizi saglar. Bu sayede gozden kacan nullable degerleri bulabilmemizi saglar. Ancak cikan
 * projemizin crash olmamasi icin ?. kullanmamiz daha dogru olucaktir.
 **/

    number1= readLine()!!.toInt()
    number2= readLine()!!.toInt()

    //yukarida readLine()'nin null olamayacagini !! isaretiyle soyledigimiz icin alt satırda tekrar nullable
    //yapmamiza gerek kalmiyor(smart cast ozelligi)
    result=number1+number2
    println(result)


}