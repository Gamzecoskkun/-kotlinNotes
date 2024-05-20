package basics.classes

import basics.classes.TextWatcher.Companion.name

/**
 * Interfaces
 *
 * Interfaces arayüz
 * constructor bulunmuyor interfacelerde
 * nesne oluşturulamıyor
 * private untironal yazılır
 * interfaceleri open yapmanın bir anlamı yok zaten yazılıyor
 * final yapmmız bir anlamı yok zaten ovveride ediyoruz "final fun onTextChanged()"
 *body vermem fun onTextChanged() {} ovveride yapma özelliğini ortadan kaldırır
 *başka bir interface bir interface'i impelenct edebiliyor.Ovveride edilmesi isteğe bağlı oluyor. Ovveride etme özelliği ortadan kallkıyor.
 * Eğer bir
 * İnterface dediğimiz şey bir ismi olan ve içerinde fonksiyon bulunduran bir yapıdır.İçerisinde mutlaka en az 1 tane fonksiyon bulundurmalı;
 * interface A{
 *   fun foo(){
 *
 *   }
 * }
 * object kullanımı ne?
 * val textWatcher=object:TextWatcher{
 *         override fun onTextChanged() {
 *         }
 *
 *         override fun beforeTextChanged() {
 *         }
 *
 *         override fun afterTextChanged() {
 *         }
 *
 */

interface TextWatcher {

    val text:String // property tanımlayabiliriz
    fun onTextChanged()
    fun beforeTextChanged()
    fun afterTextChanged()

    fun funWithBody() {
        //İnterfaceler bodysi olan fonksiyon gördüğümüzde arka planını incelediğimde
        // Bir interface'in içersinde bodysi olan fonksiyon tanımlayarak ; statik bir class statik içersinde bir fonk tanımlamış oluyoruz.
        //opsiyonel zorunlu değil

    }

    companion object{
        val name:String="Gamze"
    }

}

//eğer bir interface te interface impelnt ediyorsam ve ovveride ediyorsam
// başka bir child classta çağırırsam ovveride etme zorunluluğu giidyor

//Bir child interface open class,abstract classı miras alamaz . Bir class birden fazla interface'i impelemt edebilir bir claası extend edemez
//
//open class Base
//abstract class Base
// b
interface Base
interface C
interface D
interface ChildInterface:TextWatcher,Base,C,D {
    override fun onTextChanged() {
        TODO("Not yet implemented")
    }
}

class  InterfacesSample2(override val text: String) :ChildInterface{
    override fun beforeTextChanged() {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged() {
        TODO("Not yet implemented")
        name
    }


}


fun main() {
    val textWatcher = object : TextWatcher {
        override val text: String
            get() = TODO("Not yet implemented")

        override fun onTextChanged() {
            TODO("Not yet implemented")
        }

        override fun beforeTextChanged() {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged() {
            TODO("Not yet implemented")
        }




    }
}