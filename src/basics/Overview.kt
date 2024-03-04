fun main() {
    /**
     * Kotlin'de her şey bir nesnedir.Öyle ki herhangi bir değişkende üye fonksiyonları ve özellikleri çağırabilirsiniz.
     *
     * Diğer programalama dillerinden aşına olduğunuz ilkel veri tipleri(primitive types) Kotlin'de birer sınıf(class)
     * gibi görünürler. Buna rağmen çalışma zamanında sınıf(class) olmayan ilkel (primitive) hallerine optimize edilirler.
     * Bu primitive tiplerden değişkenler oluşturulduktan sonra "Show Kotlin Bytecode" özelliği ile Java'daki halleriyle Karşılaştıtılıt.
     *
     * Bu değişken tipleri aşağıdakiler gibidir;
     *
     * Numbers ve onların Unsigned muadilleri.
     * Booleans
     * Characters
     * Strings Arrays
     *
     * -----------------------------------------------------------------------------------------------------------------
     *
     * Bir değişken oluşturmak için "val" ya da "var" kelimelerinde istifa edilir.
     * val = "Değeri sonradan değiştirilemez,değişken" "Value" sabit kelimesinin kısaltmasıdır.
     * var ="Değeri sonradan değiştirilebilir, değişken" "Variable" değişken kelimesinin kısaltmasıdır.
     *
     * val değişkenlere genelde immutable dendiğii duyarsınız.Fakat bu yanlış bir ifadedir.
     * Çünkü;
     * readonly demek ilk değer atamasından sonra tekrar değer atanamaz demek.
     * İmmutable ise bir değişkenin /nesnenin durumu asla ilk degerden farklı olamaz demek
     * Aşağıdaki calculateAvaliableSpace() fonksiyonunu inceleyebilirisiniz bunun için.
     * Val olarak tanımlanan avaliableSpace değişkenin değeri her seferinde farklı sonuçlar üretmektedir.
     * Respect: https://xabaras.medium.com/kotlin-val-is-read-only-not-immutable-585ce2e5359b
     *
     * -----------------------------------------------------------------------------------------------------------------
     *
     * val değişken ile var değişken arasında bir performans farkı bulunmuyor denebilir.
     * Yine de akademik seviyede konuşuyorsak , var değişkenler bir "readonly" gibi şarta sahip olmadıkları için
     * gözardı edilebilecek kadar ufak bir farkla val değişkenlere göre performanslıdır.
     *
     * Bunun yanında eğer yazdığınız proje multi-thread işlemler gerçekleştiriyorsa, bu işlemlerde kullanılan değişkenlerin
     * birbirlerinin son durumlarını kontrol etme ihtiyacının yarattığı maliyet çok daha ciddi performans sorunlarına yol açmaktadır.
     * Bu sebeple bir değişken tanımladığınızda önce val olarak tanımlamanız, sonrasında başka bir yerde bu değişkenin
     * değerini değiştirecekseniz eğer var yapmanız pek çok açıdan daha kullanışlıdır.
     *
     * ----------------------------------------------------------------------------------------------------------------
     *
     * Bir class'ın üye değişkenini var olarak tanımlayıp, bu değişkenin önündeki var kelimesini değiştirmeden
     * nasıl val yapabileceiğimiz bizlere sorulur.
     *
     * Bunun yolu var değişkenin get fonksiyonunu private yapmamızdır.. Bu durumda, değişken var olsada readonly hale dönüşür.
     * Aşağıdaki testUser() fonksiyonunda bunu test edebilirsiniz.
     */
}

fun createName():String{
    val name:String="Gamze"
    return name
}

fun createAge():Int{
    val age:Int=23
    return age
}

fun createIsMale():Boolean{
    val isMale:Boolean=false
    return isMale
}

fun createKnowLanguageList():Array<String>{
    val knowLanguageList:Array<String> =arrayOf("AZ","DE","EN","TR")
    return knowLanguageList
}

fun createSurnameWihoutFirstInit():String{
    val surName:String
    surName="Coşkun"
    return surName
}


class User {
    val name :String= "Gamze"
    var age :Int= 23
        private set

    fun test(){
        //name="Eda" //çalışmaz
        age=24
    }

}

fun Test(){

}

fun UserTest(){
    val user=User()
    //Aşağıdaki Kodlar çalışmaz
    //user.name="Eda"
    //user.age =24



}
