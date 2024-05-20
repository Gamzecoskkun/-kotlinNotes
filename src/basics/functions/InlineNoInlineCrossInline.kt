package basics.functions

fun main() {
//  1.Yöntem
//  runAndPrint {
//      println(it)
//  }

// 2.Yöntem

//    repeat(10) {
//        runAndPrint { message ->
//            println(message)
//        }
//    }

    // birden fazla higher order function varsa () kullanılmalı
    runAndPrint2( {
        println(it)
    },
        {
            println(it)
        })

    //outher fonksiyonunu çağıracağım non -local retrun konu

    outerFunction()
    println("Print")

}

// Higer order function değilse inline yapamayız bir esprisi olmuyor

inline fun runAndPrint(run: (String) -> Unit) {
//    run.invoke("message")
    run("message")
}

//noinline
/**
 * inline keywordü olmadan noinline kullanmazsın
 * noinline ne iş yapıyor: Birder fazla parametre fonksiyon varsa noinline kullanmak isteyebilirsiniz.
 * logger fonksiyonun başka bir fonksiyona parametre olarak veremezsiniz inline fonksiyonda bunu noinline yap diyor.
 * logger inline olmayan bir fonksiyona dönüşür run nesnesi oluşturalamaz ama loggerın nesnesi oluşturulur arka planda
 * noinline yaptığımız inline yapma özelliğini kaybeder.
 * parametresine inline eklersek problem olmaz
 * loggerın nesnesi oluşmadığı için parametre yazdığımzda çağrıldığında kızıyor noinle yaptığımızda kızmaz fakat fonksiyon inline yaptığımzdada problem olmaz
 * tek bir parametre varsa noinline kullanmamalıyız o zaman düz fonksiyon yap der ide
 * inline fun runAndPrint2( run:(String)->Unit,noinline logger:(String)->Uni t dediğimizde runda performans artışı istiyorum, loggerda performans artışı istemiyorum demek oluyorsunuz
 *
*/
 inline fun runAndPrint2( run:(String)->Unit,noinline logger:(String)->Unit){
    log(logger)
    run("message")
    logger("End")
}

fun log(logger:(String)->Unit){
     logger("Start")
}

// Non -local return
fun outerFunction(){
    println("Start")
    val list= listOf(1,2,3,4,5,6,7)
    list.forEach{
        if (it==5){
            return
        }
        println(it)
    }
}