package basics.controlflow

fun main(args: Array<String>) {

    var numberOne = 10
    var numberTwo = 5

    println("NumberOne: ${numberOne}") //10
    println("NumberOne: ${numberOne++}") //10 numberOne=numberOne+1
    println("NumberOne: ${numberOne}") //11
    println("NumberOne: ${++numberOne}") //12

    print("${numberOne + numberTwo}") //17
    print(" ")
    println(numberOne.plus(numberTwo)) //17

    print("${numberOne - numberTwo}") //7
    print(" ")
    println(numberOne.minus(numberTwo)) //7

    print("${numberOne * numberTwo}") //60
    print(" ")
    println(numberOne.times(numberTwo))//60

    print("${numberOne / numberTwo}")
    print(" ")
    println(numberOne.div(numberTwo)) //2

    print("${numberOne % numberTwo}  ")
    println(numberOne.rem(numberTwo)) //2

    println("------------------------------------------")

    print("Final notunuzu giriniz: ")
    val grade: Int? = readLine()?.toInt()

    if (grade == null) { //smart case
        return
    }

    var charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade!! <= 99 && grade >= 80) {
        "$grade= BB"
    } else if (grade <= 70 && grade >= 50) {
        "$grade=CC"
    } else if (grade <= 49 && grade >= 20) {
        "$grade=DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade=FF"
    } else {
        "$grade=Bulunamadı!!"
    }

    println("------------------------------------------")

    println(grade?.compareTo(100) == -1)
    println(grade.compareTo(100) == 1)
    println(grade.compareTo(100) == 0)
    println(grade.equals(100))
    println(grade.equals(100))
    println(grade.equals(100))

    println(charNote)
    /*
    a>b a.compareTo(b)>0 | 65.compareTo(100)==-1
    a<b a.compareTo(b)<0  | 100.compareTo(65)==1
    a>=b a.compareTo(b)>=0 |100.compareTo(100)==0
    a<=b a?.equals(b)?:(b==null)
    a==b a?.equals(b)?:(b==null)
    a !=b !(a?.equals(b))?: (b==null)
     */

    println("------------------------------------------")
    var a = 20
    var b = 5

    /*
    a += b //a =a+b
    println("a+=b: $a") //25

    a -= b // a= a-b
    println("a-=b : $a") //20

    a *= b // a = a*b
    println("a*=b : $a") //100

    a /= b // a= a/b
    println("a/=b : $a") //20

    a %= b  //a=a%b
    println("a%=B : $a") //0

     */

    a += b //a =a+b
    println("a+=b: ${a.plus(b)}") //30

    a -= b // a= a-b
    println("a-=b : ${a.minus(b)}") //15

    a *= b // a = a*b
    println("a*=b : ${a.times(b)}") //500

    a /= b // a= a/b
    println("a/=b : ${a.div(b)}") //4

    a %= b  //a=a%b
    println("a%=B : ${a.rem(b)}") //0

    /*
    a+=b a.plusAssign(b)
    a-=b a.plusAssign(b)
    a*=b a.timesAssign(b)
    a/=b  a.divAssign(b)
    a%=b  a.remAssign(b)
    */

    println("-------------------------------------------------------------------------")

    var numbeOne = 10
    var numbeTwo = 5
    var flag = true
   println("+a:" + +numbeOne) //a+ : +10
    println("q-b :" + -numbeTwo) // q-b : -5
    println("++a :" + ++numbeOne) // ++a: 11
    println("a++:" + numbeOne++) // a++ : 11
    println("a:" + numbeOne) // a: 12
    println("--b :" + --numbeTwo) // --b :4
    println("!flag :" + !flag)// !flag :false
    println("!flag :" + flag.not())//!flag : false

    println(numbeTwo + numbeOne.unaryMinus())// 4 + (-12)=-8

    /*
     +a  a.unaryPlus()
     -a  a.unaryMinus()
    ++a  a.inc()
    --a  a.dec()
    !a    a.not()
     */

    println("-------------------------------------------------")

    /**
     *
     *  === ifadesi isaret edilen referans tipleri karsilastirir
     *  == ifadesi degeri karsilastirir
     */

}