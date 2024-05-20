package basics.functions

import java.util.*
import kotlin.concurrent.schedule

fun main(){

    /**
     * Fonksiyton'lar Kotlin'de "First Class Citizen" dır.Yani degiskenlere deger olarak atanabilir,baska fonksiyon
     * parametre olarak verilebilir ya da bir fonksiyonun geri donus degeri olabilir demektir.
     *
     * Higher Order Function'lar basitce bir fonksiyona parametre olarak verilen fonksiyonlardır. Parametre olarak
     * verilmekten kasit, fonksiyonun cagirinin parametre kisminda yapilmasi degil, fonksiyonun govdesinin(body)
     *  yani suslu parantezler arasinda kalan gorev alaninin baska bir fonksiyona parametre olarak verilmesidir.
     *
     *
     *  Yapisal olarak;
     *
     *  fun foo(normalFunction:(message:String)->Unit){
     *  higherOrderFunction("Codemy")
     *
     *   }
     *
     *   fun foo(boo:String){
     *   }
     *
     *   Cagirilirken ;
     *
     *   fun main(){
     *
     *   foo({message->
     *   println("Message: $message")
     *   })
     *   }
     */

/*----------------------------------------------------------------------------------------------------------------------------------------*/

    /**
     * Higher Order Function'lari tanimlamanin 3 yolu vardir.
     */

    /**
     * Bir degiskene atayarak  Function tanimlayabilirsiniz.
     * Bu durumda suslu parantezler yanina higher order function'in aldigi parametreler lambda okundan once aralarina ->
     * koyularak yazilir. Higher Order Function tek parametre aliyorsa, bu parametreleri yazmak zorunda degilsinizdirç
     * Bu durumda higher order function size "it" kelimesi ile higher order function'in parametresi tipinde bir
     */
    val higherOrderFunction={surName:String->
        "surName: $surName"
    }
// Ismi olmayan "anonymus function" tanimlamalari da Higher Order Function olarak, normal bir fonksiyon parametresi olarak verilir

    val anonymousFunction = fun(surname: String): String {
        return "surname : $surname"
    }

//Anonymous Function'in expression kullanimi da yine Higher Order Function olarak normal bir fonksiyona parametre olarak verilebilir
    val anonymousFunction2 = fun(surName: String): String = "surName : $surName"

    /**
     * Higher Order Function'la ayni parametre sayisina sahip ve bu parametrelerin hepsinin tipleri Higher Order Function'in
     * parametre tipleri ile ayni ise, bu normal fonksiyon da Higher Order Function olarak normal bir fonksiyona parametre
     * olarak verilebilir. Bunu yapmak için sada basina :: işareti koymak yeterlidir.
     */

    val news = News()
    news.read(::println)
    news.read({ title ->
        kotlin.io.print("asdısj")
    })

    news.read { title ->
        println(title)
    }

    news.read {
        kotlin.io.print(it)
    }

    val titleFun = fun(title: String): Unit {
        println(title)
    }

    news.read(titleFun)

    printUserInfo(getName(), higherOrderFunction, getAge())
    printUserInfo(getName(), higherOrderFunction, getAge())
    printUserInfo(getName(), fun(surName: String): String {
        return "surName: $surName"
    }, getAge())

    // Suslu parantezler (body) direkt olarak Higher Order Function'in parametre olarak beklendigi alana da yazilabilir
    printUserInfo(getName(), {
        "surname: $it"
    }, getAge())

    getItemClickListener({ buttonName ->
        println("$buttonName tıklandı..")
    })

//--------------------------------------------------------------------------------------------------------------------------

    /**
     * Eger bir fonksiyon parametreleri icersinde bir  Function son parametre olarak tanimlandiysa, bu durum
     * -isteniyorsa, bu Higher Order Function, fonksiyon parametrelerinin disina da yazilabilir. Daha temiz bir kullanim
     * yapmis oluruz
     */

    val newsType = NewsType()
    news.getNewsFromServer("FoxTv", newsType, {
        println(this.toString())
    })// Higher Order Function, fonksiyon parametrelerinin icersinde tanimlanmistir.

    news.getNewsFromServer("FoxTv", newsType) {
        println(this.toString())
    } // Higher Order Function, fonksiyon parametrelerinin disinda tanimlanmistir.


//--------------------------------------------------------------------------------------------------------------------------

    /**
     * Higher Order Function birde fazla parametre iceriyorsa, aralarina virgul koyarak lambda isareti ile tanimalamak zor
     * Tek parametreye sahipse bu durumda parametre ismi ve lambda işareti koyulmayabilir. Bu durumla ilgili parametre
     * kelimesi ile cagrilabilmektedir.
     * Eger bir fonksiyoni parametre oalrak sadece Higher Order Funciton aliyorsa bu durumda fonksiyon parametrelerini hic
     */

    news.filterNew{ filterType, getFilterName ->
        kotlin.io.print("ahjhj")

    }
}

//--------------------------------------------------------------------------------------------------------------------------

//Normal Fonksiyon
fun getName(): String {
    return "Gamze"
}

//Normal Fonksiyon, experssion kullanima ornek
fun getAge(): Int = 29

//--------------------------------------------------------------------------------------------------------------------------

/**
 * 2.parametre Higher Order Fonksiyon olarak tanimlanmistir.
 * Higher Order Fonksiyonlar default deger alabilirler. Bunun icin basitce suslu parantezler acmak yeterlidir.
 * Dikkat edilmesi gereken konu bu suslu parantezler icine , Higher Order Function parametre bekliyorsa, bunlar verilmelidir.
 */

fun printUserInfo(name: String, getUserName: (surName: String) -> String = { surName -> "" }, age: Int): Unit {
    println("name : $name , age : $age")

    println(getUserName("coşkun"))
}

//--------------------------------------------------------------------------------------------------------------------------

/**
 * Higher Order Function'a parametre tanimlanirken sadece degisken tipini tanimlayarak da (degisken adi olmadan ) kullanilabilir.
 */

fun getItemClickListener(onClick: (String) -> Unit) {

    println("Tiklama islemi baslatiliyor")

    Timer().schedule(3000) {

        /**
         * Bir higher order function, parametre olarak yazıldıktan sonra, bu parametrenin normal fonksiyon içerisinde
         * çağırılması gerekmektedir. Aksi halde bu higher order fonksiyonu tanimlamak mantiksiz olur. Normal fonksiyonunun
         * çağrıldığı alandaki higher order function'in body kismi hicbir zaman cagrilmaz demek olur
         */
        onClick("Login")

        println("Tiklama islemi bitti")

    }
}


class News() {
    fun getNewsType(newsType: NewsType): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"
        }
    }
}

class NewsType {
    companion object {
        val breakingNews = "BreakingNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
        val normal = "Normal"
    }
}

/**
 * Bir Higher Order Function'ina parametre verirken Class ismi.() seklinde tanimlama yapilabilir.
 * Bu sayede ilgili class da parametre parantezi icerisine yazilabilir.
 */

fun News.getNewsFromServer(channelType: String, newsType: NewsType, getNews: NewsType.(Int) -> Unit) {
    when (channelType) {
        "KanalD" -> {
            getNews(newsType, 1)
        }

        "ShowTv" -> {
            getNews(newsType, 2)
        }

        "TV8" -> {
            getNews(newsType, 3)
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------

/**
 *  Bir Higher Order Function'sın parametresi de yine Higher Order Function olabilir
 */

infix fun News.filterNew(getFilter:(filterType:String,getFilterName:()->String)->Unit){

    getFilter("filterName"){
        "String return label"
    }
}

fun News.read(readTitle:(title:String)->Unit){
    readTitle("Codemy is Awesome")
}



