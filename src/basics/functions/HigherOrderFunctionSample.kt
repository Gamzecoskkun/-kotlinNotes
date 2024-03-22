package basics.functions

fun main() {
     calculatePrint1(40,20,'+')
     calculatePrint1(60,20,'-')
     calculatePrint1(1,12,'*')
     calculatePrint1(13445,12,'/')

    println("Birinci sayıyı giriniz: ")
    val numberOne= readLine()!!.toInt()

    println("İkinci sayıyı giriniz: ")
    val numberTwo= readLine()!!.toInt()

    println("İşlem türü giriniz :")
    val operation:String= readLine()!!.toString()

    calculateAndPrint(
        40,
        20,
        {
            numberOne, numberTwo ->
             numberOne+numberTwo
        })

    calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne-numberTwo })
    calculateAndPrint(1, 12, { numberOne, numberTwo -> numberOne*numberTwo })
    calculateAndPrint(13445, 12, { numberOne, numberTwo -> numberOne/numberTwo })



}


fun calculatePrint1(numberOne: Int, numberTwo: Int, operation: Char) {
    when (operation) {
        '+' -> numberOne + numberTwo
        '-' -> numberOne - numberTwo
        '*' -> numberOne * numberTwo
        '/' -> numberOne / numberTwo
        else-> numberOne+numberTwo
    }
}

fun calculateAndPrint(numberOne: Int, numberTwo: Int, operation: (numberOne: Int, numberTwo: Int) -> Int) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}