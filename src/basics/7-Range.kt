package basics

fun main() {

    /**
     * Sonlu sayili liste olusturmaya yarar.
     */

    /**
     * Kucukten buyuye liste olusturmak icin;
     * ".." operatorunu, ya da "rangeTo()"
     * "..<" operatorunu ya da "rangeUntil"
     * fonksiyonunu kullanabilirsiniz.
     */

    val numbers = 1..100 //[1,100]
    val number2 = 1.rangeTo(100)
//    val numbers3=1 rangeTo 100

    val numbersUntil = 1..<100 //[1,100)==[1,99]
    val numbersUntil2 = 1.rangeUntil(100)
    //   val numbersUntil3=1 rangeUntil 100

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Char'lardan oluşan bir liste de tanimlanabilir. Türkçe karakterleri içermez.
     */
    val alphabet = 'A'..'Z'

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Buyukten kucuge .. operatorunu kullanarak liste olustamayiz. Ide hata verecektir.
     * Buyukten kucuge liste olusturmak icin downTo() fonksiyonunu kullanabilirsiniz. Infix kullanimi da vardir.
     */

    // val reversedNumbers=100..1 //calismaz
    //println(reversedNumbers) 100..1

    val reversedNumbers = 100.downTo(1)
    val reversedNUmbers2 = 100 downTo 1
//    val reversedNumbers3=100.downUtil(1)
    println("reversedNumbers")
    reversedNumbers.forEach { println("" + it) }
    println()

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *  until fonksiyonunu kullanarak da range tanimlanabilir. Ancak bu durumda bitis degeri listeye dahil edilmez.
     *
     */

    val gradeNumbers = 10.until(100) //[10,100)
    gradeNumbers.forEach { println("" + it) }
    println() //10..99

    println("----------------------")
    val gradeNumber2 = 10.rangeTo(99)
    gradeNumber2.forEach { println("" + it) }
    println() // 10..99

    val gradeNumber3 = 10..99
    gradeNumber3.forEach { println("" + it) }
    println()

    val gradeNumber4 = 10 until 100
    println("grandeNumber4")
    gradeNumber4.forEach { print("" + it) }
    println() //10..99

//    val gradeNumber4=100 until 10
//    println("grandeNumber4")
//    gradeNumber4.forEach { print(""+it) }
//    println() //calismaz

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *  step fonksiyonu kullanarak liste olusturulurken belli sayida atlamalar yapabilirsiniz
     */

    val stepedNumbers = 1..101 step (2)
    //stepedNumbers.step=5
    println(stepedNumbers)
    stepedNumbers.forEach { print(" " + it) }
    println() // 1 3 5 7 9....101

    val stepedNumbers2 = 1..100 step 3
    println(stepedNumbers2)
    stepedNumbers2.forEach { print(" " + it) }
    println() // 1 4  7 10 13 .. 100

    val reversedStepedNumbers = 100 downTo 1 step (3)
    println(reversedStepedNumbers)
    reversedStepedNumbers.forEach { print(" " + it) }
    println() //100 97 94 91 88....1

    val reversedStepeNumbers2 = 100.downTo(1) step 2
    println(reversedStepeNumbers2)
    reversedStepeNumbers2.forEach { print(" " + it) }
    println() // 100 98 96 94 ....2

    /*--------------------------------------------------------------------------------------------------------------------*/

    /***
     * CharRange,IntRange ve LongRange isimlerinde özel range'ler vardır. Progression olarak adlandırılır.
     * Diğer tipler bulunmaz.
     * Bu durumda, first,last,step,count gibi ek bilgiler alinabilir.
     * Iterable<N> interface'ini implement etmişlerdir. O sebeple map filter gibi fonksiyonlar kullanabilirler.
     */

    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last // last bilgisi step'e göre dönüş sağlanabilir
    numberList.step

    when (10) {
        in numberList -> {
            println("10 sayisi numberList içerisinde yer alir")
        }
    }

    numberList.count()

    val countBiggerThan50 = numberList.count { it > 50 }

    println(countBiggerThan50) //39

    println("numberList.averaga ${numberList.average()}") //49.5
    println("numberList.reversed ${numberList.reversed()}") //89 downTo 10 step 1

    println((1..10).filter { it % 2 == 0 }) // [2, 4, 6, 8, 10]

}