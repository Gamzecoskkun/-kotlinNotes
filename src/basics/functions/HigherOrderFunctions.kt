package basics.functions

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




}