package basics.loop

fun main(){

    /**
     * Degisen hic bir sey yok. Diger dillerde nasil kullaniyorsaniz Kotlin'de ayni sekilde kullaniyorsunuz.
     * Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa
     * bu durumda for + if else kullanmak yerine while kullanabilirsiniz.
     */

    var number=0

//    while (number<5){
//        print("${number++}, ")
//    }

    while (number<5){
        print("$number, ")
       number++
    }

    println("---------------------------")

    for (value in 0..110){
        if (value<5){
            print("$value, ")
        }else{
            break
        }
    }

    println("---- Örnek ----")

    for (value in 1..50){
        if (value %2==0){
            break
        }
        println("\n$value")
    }

    println("---------------------------")

    var number1=1
    while (number1%2==1){
        println("${number1++}")
    }
}