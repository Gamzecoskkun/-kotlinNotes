package basics.functions

/**
 * Bir fonksiyon herhangi bir sinifin icersinde degil de bir dosyasinin icersinde boslukta tanimlaniyorsa
 * top level function adini alir.
 *
 * Bir fonksiyon olusturulurken top level tanimlama yapilamiyor, sadece bir sinifa ait fonksiyonlar yazilabiliyorsa,
 * bunlara fonksiyon degil, method denir.Bir fonksiyona fonksiyon diyebilmeniz icin top level tanimlanabiliyor olmasi lazimdir.
 */

fun main() {

    calculateAtomPhysics()

}

/*----------------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Fonksiyon icersinde fonksiyon tanimi kotlin'de yapilabilir. Bu fonksiyonlara Local Functions denir.
 * Sebebi ise, yazdiginiz fonksiyonun kendi sinifinizdan dahi cagirilmasini istemeyebilirsiniz.
 * Bu fonksiyonunun herhangi bir baska fonksiyon ya da sinif icin degistirilmesini istemeyebilirsiniz.
 * Reflection ile fonksiyonlariniz erisilirken gizli kalsin isteyebilirsiniz
 * Bu gibi durumlarda bu cok onemli fonksiyonunuzu baska bir fonksiyon icersine yazabilirsiniz.
 */

fun calculateAtomPhysics() {

    val userName = "Codemy"
    println("Initialize Process..")

    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val result = numberOne + numberTwo
    println("$result")
}

/*----------------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Bir sinifin icersindeki fonksiyonlara,uye fonksiyonlar denir.
 */

class Car {
    fun setColor(colorCedId: Int) {

    }
}

/*----------------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Bir fonksiyon Generic tip aliniyorsa, Generic Function olarak adlandirilir.
 */

fun <T> setColor(colorCodeId: T) {

}
