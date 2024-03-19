package basics.controlflow

import java.sql.SQLOutput

fun main() {

    /**
     * switch case'lerin yerine gelmiştir.
     * when(karsilastirilacak ifade)
     * value ->{}
     * value ->{}
     * else ->{}
     * formatiyla kullanilir.
     * Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabilirsiniz.
     * "tr","az" gibi ayni kodu calistiracak case'ler varsa araya virgul koyarak kullanabilirsiniz
     * Bu "veya" kullanimi yapmayi saglar. "tr veya az" gibi
     */

    var countryCode = readLine()!!
    when (countryCode.toLowerCase()) {
        "tr", "az" -> println("Türk Vatandası")
        "ar" -> println("Arab Vatandası")
        "fr" -> println("France Vatandası")
        "ru" -> println("Russian Vatandası")
        "uk" -> println("United Kingdom Vatandası")
    }

//    when(countryCode){
//        "tr","az"-> println("TC Vatandası")
//        "tr".and("az") -> println("TC Vatandası")
//}


    /* -----------------------------------------------------------------------------------*/

    /**
     * when'in yanina karsilastirma  ifadesini eklemeden,bunu case'lerin yanina da ekleyebilirsiniz.
     * Bunun artisi && || and or xor gibi ifadeleri de kullanabilmenizi saglar
     */
    //state kullanımı cunku bir degere karsilik verilmiyor
    when {
        (countryCode.toLowerCase() == "tr").and(countryCode.toLowerCase() == "az") -> println("TC Vatandası")
        countryCode.toLowerCase() == "ar" -> println("Arab Vatandası")
        //age>-> {sgdhjd}
        countryCode.toLowerCase() == "fr" -> println("France Vatandasi")
        countryCode.toLowerCase() == "ru" -> println("Russian Vatandasi")
        countryCode.toLowerCase() == "uk" -> println("United Kingdom Vatndasi")
    }

    if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az")
        println("Turk Vatandası")
    else if (countryCode.toLowerCase() == "ar")
        println("Arab Vatandası")
    else if (countryCode.toLowerCase() == "fr")
        println("France Vatandası")
    else if (countryCode.toLowerCase() == "ru")
        println("Russian Vatandas")
    else if (countryCode.toLowerCase() == "uk")
        println("United Kindom Vatandası")


    /**
     * Expression lullanimi if else'lerde oldugu gibi when'lerde de yapabilirsiniz.
     */

    var countryCode2: String = if (countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az") {
        println("Turk Vatandası")
        "90"
    } else if (countryCode.toLowerCase() == "ar") {
        println("Arab Vatandası")
        "80"
    } else if (countryCode.toLowerCase() == "fr") {
        println("France Vatandası")
        "60"
    } else if (countryCode.toLowerCase() == "ru") {
        println("Russian Vatandas")
        "50"
    } else if (countryCode.toLowerCase() == "uk") {
        println("United Kindom Vatandası")
        "40"
    } else {
        "30"
    }

    countryCode2 = when (countryCode2.toLowerCase()) {
        "tr", "az" -> {
            println("TC Vatandası")
            "90"
        }

        "ar" -> {
            println("Arab Vatandası")
            "80"
        }

        "fr" -> {
            println("France Vatandası")
            "60"
        }

        "ru" -> {
            println("Russian Vatandası")
            "50"
        }

        "uk" -> {
            println("United Kindom Vatandası")
            "40"
        }

        else -> {
            "30"
        }
    }

    countryCode2 = when {
        countryCode2.toLowerCase() == "tr" || countryCode2.toLowerCase() == "az" -> {
            println("TC Vatandası")
            "90"
        }

        countryCode2.toLowerCase() == "ar" -> {
            println("Arab Vatandası")
            "80"
        }

        countryCode2.toLowerCase() == "fr" -> {
            println("France Vatandası")
            "70"
        }

        countryCode2.toLowerCase() == "ru" -> {
            println("Russian Vtandası")
            "60"
        }

        countryCode2.toLowerCase() == "uk" -> {
            println("United Kingdom Vatandası")
            "50"
        }

        else -> {
            "40"
        }
    }

    /*---------------------------------------------------------------------------------------------------------*/

//karsilastiracak sey "deger" yerine "degisken" de olabilir.
    val trCode = "tr"
    val arCode="ar"
    val frCode="fr"
    val ruCode="ru"
    val ukCode="uk"
    when(countryCode.toLowerCase()){
        trCode,"az"-> println("TC Vatandası")
        arCode-> println("Arab Vatandasi")
        frCode-> println("France Vatandasi")
        ruCode-> println("Russian Vatandasi")
        ukCode-> println("United Kingdom Vatandası")
    }

    /*---------------------------------------------------------------------------------------------------------*/

    // is !is ile bir class'in referansi olunup olunmadıgı kontrolu yapilabilir.
    val phoneNumber=5376282826823
    when(phoneNumber){
        is Long->{
            println("Long Value")
        }
        !is Long->{
            println("Long Value")
        }
    }

    //Miras alma durumlarında kullanılır

    /*---------------------------------------------------------------------------------------------------------*/

    //range'leri in !in seklinde kontrolu yapilabilir.
    //* mulakat sorusu is ve in
    val number=3
    when(number){
        in 0 ..10->{
            println("Long Value")
        }
        in 11..20->{
            println("Long Value")
        }
        !in 11..20->{
            println("Long Value")
        }
    }
}




