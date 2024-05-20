package basics.classes

// Abstract Class
/**
 * Abstract classlar miras alınamayan bir classlar olarak bulunamaz bu yüzden final abstracta kızar.
 * Abstratta consturctorlar ne işe yarıyor ?
 * abstract fonksiyonlar olmaz body verilince kızıyor
 * ------
 * 1- Abstrat classlar final olmuyor open yazmamızında bir esprisi yok. Abstract classlar mutlaka miras alanması gereken classlar final olamadıklari için
 * 2- Abstract cllaslar open olup kullanılmasının bir anlamı yok diyor zaten abstrat class miras almayı sağlatıyor
 * 3-Abstract classların primary ve second classları olabiliyor ama nesne oluşturamıyor o halde secondry ve primary olmasının sebebi ne ?(İnternetten bak)
 *  -Eğer ki içerde kullanacağımız başka bir classın instance olacaksa bunu inject etmek için kullanılabilir ya da tüm child classlarda override etmeden constructorlarında yine belli belli
 *  bilgileri belli propertyleri almak istiyorsanız bunları constructora yazabilirsiniz bu anlam için nesne oluşturmadan bu görevler içinde constructor kullanmanız bir anlamı var
 *  Sonra içerisinde bir değişken tanımlayabiliyormuyuz normal bir değişken tanımlayabiliyoruz yani abstart classlar state tutabiliyor. Eğer ben bir classın üye propertysine sahip
 *  olabiliyorsam ve buna inital değer verebiliyorsam val eyeColor:String= "brown" ; bu state tutabiliyorum anlamına geliyor.
 *  Bu property open eyeColor:String= "brown" openda yapabiliyorum dolasıyla abstract classlar open memler sahip olabilir dolasıyla ovveride edebilmesi zorunlu ya da zorunlu olmayan optional olan yani  field property tanımlayabiliyoruz
 * Abstart class olabildiği gibi abstart property olabiliyor mu diye baktığımızda "abstract val surName:String "  tanımlayabiliyoruz ama abstract propertye inital değer veremiyoruz.Bu ovveride edilmeside zorunlu olacak
 * open fun yazabiliyorum,
 * Abstract olan değişkenleri propertyler ister constructorda ister classın içersinde üye bir değişken gibi ovveride edilmek zorunlu aynı şekilde fonk. içersinde ovveride edilmek zorunlu.
 * Abstract fonksiyonlar ovveride edilemk zorunda open fonksiyonlar ise ovveride etmek isteğe bağlı
 * ilk değer atabildiğiniz her durumda backing field var demektir.
 * Abstract classlar başka bir abstract classları miras alabilir. Böyle bir durumda ovveride edilme zorunluğu oratadan kalkar.
 * open class abstract classı miras ettiğimizde yine ovveride etme özelliği zorunluğu devam ediyor.
 * herhangi bir classım üstündeki abstract classa sahipse başka bir abstract classa extend ediyorsa en alttaki chield classın tüm o abstract classların fonlarınların ve propertylerin ovveride etmek zorunda
 * bir abstract class başka bir abstract classı miras alıyorsa ve bir abstart class miras aldığı bir abstract classın üye bir abstract değişkenine property ya da fonksiyonunu ovveride ediyorsa kendi içerisinde child classlarında override edilen değişkenini ya da fonksiyonun child classlarda override edilme öözelliği ortadan kalkıyor
 * override etme özelliğini istemiyorsak property özel yapmmaız için final demeliyiz
 * abstract olan yapıyı final yapamıyoruz unutma
 * abstract classın içinde sadece abstract property ve funk kullanılabilir open ve childe olmaz.
 */
open abstract class Human(val name: String, val eventManager: EventManager) {
    abstract val surName: String //= //"Default value" // abstract property tanımladık abstarct değişkenler direkt değer alamaz
    open val age: Int = 23 // open keywordü direkt olrak değer alabilir
    abstract val middleName: String

    fun sendEvent() {
        eventManager.sendEvent(name)
    }

    open fun getEventType() {
        eventManager.getEvent(name)
    }

    abstract fun display()

}

class EventManager {
    fun sendEvent(name: String) {}
    fun getEvent(name: String): Event {
        return Event()
    }
}

//class Turk(eventManager: EventManager, override val middleName: String = "asdf") : Human("Turk", eventManager) {
//    override val surName: String = "nsnsn"
//    override fun display() {
//        TODO("Not yet implemented")
//
//
//    }

abstract class Turk(eventManager: EventManager, override val middleName: String) : Human("Turk", eventManager) {
    abstract val skinColor: String
    override val surName: String="jssdkj"

}

abstract class Turki(eventManager: EventManager) : Human("Turki", eventManager) {

}

 open class Kurt(eventManager: EventManager,  override val middleName: String) :
    Human("Kurt", eventManager) {
    /*final */override val surName: String= "gsah"

    override fun display() {
        TODO("Not yet implemented")
    }
}

//override val age: Int
//        get() = super.age
//
//    override fun getEventType() {
//        super.getEventType()
//    }

class ChildTurk(override val surName: String) : Turk(eventManager = EventManager(), middleName = "sjsjs") {
    override val skinColor: String = "agsgsgaj"
    override fun display() {
        TODO("Not yet implemented")
    }

 class ChildKurt():Kurt(eventManager = EventManager(),"child"){
     override val surName: String
         get() = super.surName
}



}


class Event

fun main(args: Array<String>) {
//    val human=Human("Arkhu",18)
}