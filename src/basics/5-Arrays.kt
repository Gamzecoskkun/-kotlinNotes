package basics

fun main() {

    /**
     * Aynı türden ya da belirtilen türün alt türlerinden, savit sayıda veri tutan bir veri yapısıdır.
     * En sık kullanılan versiyonu Object-Type Array'lerdir. Array sınıfı ile temsil edilirler.
     *
     * Eğer primitive tipleri Object-Type Array olarak kullanırsanız Boxed kullanım yapmış olursunuz.
     * Bu da performansa etki eder. Eğer sadece primitive'lerden oluşan arrayler oluşturacaksanız.
     * bu durumda Primitive -Type Array'ler kullanın.
     * ByteArray(byte[]),ShortArray(short[]),IntArray(int[]),LongArray(long[])
     * DoubleArray(double[]),FloatArray(float[])
     * BooleanArray(boolean[]),CharArray(char[])
     *
     * arrayOf(ayni tip degerler) seklinde tanimlanabilir.
     * arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir.
     * arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimalanabilir.
     * emptyArray() boş array tanımlar
     * **/

//                      index=  0  1  2  3  4  5
    val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
    val studentNames = arrayOf("Ahmet", "Gamze", "Eda", "Ali")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)

    val arrayOfNulls = arrayOfNulls<String>(4)
    println(arrayOfNulls.joinToString()) //null, null, null, null

    val emptyArray = emptyArray<String>() // "", "","" bunu yapmıyor,size'ı 0 olan bir array oluşturuyor.
    var emptyArray2: Array<String> = emptyArray()

    emptyArray2 += ""
    emptyArray2 = arrayOf("Gamze", "Coşkun")

    // emptyArray[5] ="Yeni eleman"

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Array'ler sabit büyüklüktedirler. Array'lere ekleme ve çıkarma yapmak aynı String'lerde olduğu gibi
     * memory'de yeni bir array oluşturulmasına neden olur.
     */

    var citiesArray = arrayOf("İstanbul", "Hatay", "Kars")

    citiesArray += "Sivas"
    //Birden fazla eleman eklemek için
    citiesArray += arrayOf("İzmir", "Konya")
    println(citiesArray.joinToString())

    citiesArray.forEach {
        println("$it, ")
    }

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Array<Type>(size){higher order function} seklinde de tanimlanabilir.
     * Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     * Higher order function, icerisi dizinin boyutu kadar index'i(it) bir arttirarak calisir.
     * **/

    // 5 elemanli,her bir elemani index degeri ile 3.14'ü çarpan bir dizi olusturur.
    val carNamesMini = Array<Double>(5) {
//      pseudo Codes
//      pseudo Codes
//      pseudo Codes
        3.14 * it
    }

    //10 elemanli, 0-9 arasindaki index degerlerinin karesini alan bir dizi olusturur
    //{0,1,2,4,9,16,25,36,49,81}
    val carNames = Array<Unit>(10) {
        println((it * it).toString())
    }

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * ByteArray ,ShortArray,IntArray,LongArray,DoubleArray,FloatArray gibi ya da bunların Unsigned halleri
     * primitive array tanimlamalari da yapilabilir.
     *
     * .toCharArray() fonksiyonlar ile Object-Type bir array Primitive-Typed array'e dönüştürülür.
     * .toTypedArray() fonksiyonu ile Primitive-Typed bir array!i Object-Typed bir array'e dönüştürebilirsiniz.
     *
     * Bu tarz tanimlamalarda ilgili index degerine atama icin set(index,value) ya da [index]= value kullanilabilir.
     * Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde ulasilabilir
     */

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'İ')
    firstCharOfCountries.set(3, 'A')

    firstCharOfCountries[2] = 'B'
    println(firstCharOfCountries) //TİBA

    val charSample: CharArray = arrayOf('T', 'İ', 'B', 'İ').toCharArray()
    //val charSample2:CharArray= arrayOf('T','İ','B','İ')

    println("firstCharOfCountrys index 2: ${firstCharOfCountries.get(2)}") //B
    println("firstCharOfCountrys index 2: ${firstCharOfCountries[2]}") //B

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * val ile tanimlanmis bir array'in herhangi bir index'indeki deger degistirilebilir
     * val indexdeki degerlerin degismesine karismaz
     * Ancak ilgili diziyi baska bir dizi ile esitlemenize izin verilmez.
     * Bunun icin tanimlamayi var ile degistirmeniz gerekir
     */

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Gökhan"
    // awesomeArray=arrayOf("foo","boo","goo","doo","loo")  //calismaz..

    /**
     * Array'in size'i disina cikiyorsaniz(boyutu disina) cikiyorsaniz,IndexOutOfBound hatasini alirsiniz.
     */

    awesomeArray[4] = "Mehtap"
//  awesomeArray[5]="Mehtap" //calismaz

    /*--------------------------------------------------------------------------------------------------------------------*/

    //2 boyutlu diziler
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    // [[0,0],[0,0]]

    //3 boyutlu diziler
    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDArray.contentDeepToString())
//    [[[0, 0, 0], [0, 0, 0], [0, 0, 0]], ->[0,0,0],[0,0,1],[0,0,2]
//    [[0, 0, 0], [0, 0, 0], [0, 0, 0]],  ->[0,1,0],[0,1,1],[0,1,2]
//    [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]  ->[0,2,0],[0,2,1],[0,2,2]

    // Array'ler her zaman değişebilirdir(mutable)

    val simpleArray = arrayOf(1, 2, 3)
    // Accesses the element and modifies it
    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0].toString()) //10
    println(twoDArray[0][0].toString()) //2

    //Aynı zamanda array'ler üst class'ları yerine atamazlar(invariant)
    val arrayOfString: Array<String> = arrayOf("V1", "V2")
    //var arrayOfAny: Array<Any> = arrayOfString
    //  var arrayOfAny: Array2<Any> = arrayOf("V1", "V2")

    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * vararg kelimesi ile istediğimiz sayida parametreyi kabul edebiliriz.
     * Eğer vararg'a denk gelecek şekilde bir array kullanmak istiyorsak "spread" "*" operatörü kullanırız.
     * Spread operatoru verdiginiz arrayin elemanlarının her birini bir variable olacak şekilde parametre olarak passlar.
     *
     */

    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", "c", "d")
    printAllStrings("a", "b", *lettersArray, "f")


    /*--------------------------------------------------------------------------------------------------------------------*/

    /**
     *
     * Array'leri karsilastirirken == operatoru kullanamazsınız. == operatoru o array'lerin referans object'lerini karsilastirirken
     * contentEquals yada contentDeepEquals kullanmanız lazım.
     *
     */

    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(1, 2, 3)

    if (array1==array2){
        println(true)
    }else{
        println(false) //false
    }

    val array5=array1
    val array6=array1

    if (array5==array6){
        println(true) //true
    }else{
        println(false)
    }

    println(array1.contentEquals(array2)) //true tek boyutlu bir array varsa kullanılmalı

    val array3= arrayOf(intArrayOf(1,2), intArrayOf(3,4))
    val array4= arrayOf(intArrayOf(1,2), intArrayOf(3,4))

    println(array3.contentDeepEquals(array4)) //true çok boyutlu bir array varsa kullanılmalı

    //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/ fonksiyon listesi

    /**
     *  .sum()-> toplama islemi ; sadece number typed arrayler ile calisir.
     *  .shuffle()-> random karistirma; elemanlari random bir sekilde yer degistirir.
     */

    val sumArray= arrayOf(1,2,3)
    println(sumArray.sum()) //6

    val shuffledArray= arrayOf(1,2,3)

    shuffledArray.shuffle()
    println(shuffledArray.joinToString())

    shuffledArray.shuffle()
    println(shuffledArray.joinToString())

    /**
     *
     * Array'leri List'e ve Set'e donusturebilirsiniz
     *
     */

    val sampleArray= arrayOf("a","b","c","c")
    println(sampleArray.toSet()) //[a, b, c]

    println(sampleArray.toList()) //[a, b, c, c]

    /**
     * Map'lere de donusturebilirsiniz. Ancak bunun icin array'in ozel olarak Pair<K,V> formunda olması lazım
     */

    val cities= arrayOf("Istanbul" to 34, "Kars" to 36, "Hatay" to 31)
    println(cities.toMap()) //{Istanbul=34, Kars=36, Hatay=31}

}
fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}




