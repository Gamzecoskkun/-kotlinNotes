package basics

fun main() {

    /**
     * 8 bit alan kaplar.
     *
     * true ya da false deger atamasi icin kullanilir.Nullable versionlari null deger de alır.
     * 0 ya da 1 Boolean olarak kullanilamaz.
     * **/

    val isStudent: Boolean = true
    val isTeacher: Boolean = false
    val isFirstStudentMale: Boolean? = null

// val isStudent2:Boolean=1
//  val isTeacher2:Boolean=0

    /*--------------------------------------------------------------------------------------------------------------------*/
    /**
     *  ||(or) &&(and) !(not) gibi operatorler ile beraber kullanilir
     * **/

    if (isStudent && isTeacher) {

    }

    if (isStudent and isTeacher) {

    }

    if (isStudent || isTeacher) {

    }

    if (isStudent.or(isTeacher)) {

    }

    if (isStudent.not()){

    }

    if (!isTeacher) {

    }

/*--------------------------------------------------------------------------------------------------------------------*/

    /**
     * Boolean degerin true olmasini kontrol ettirmek icin == true seklinde kontrole gerek yoktur.
     * Zaten true ise suslu parantezler tersine girecektir. Nullable ise bunu yapmak zorunlu.
     */

    if (isStudent==true){

    }

    if (isStudent){

    }

//    if (isFirstStudentMale){
//
//    }

    if (isFirstStudentMale==true){

    }

    /**
     *  || ve && operatörleri lazily çalışma mekanizmasına sahiptir.
     *  Eğer || operatörünün solu true ise sağdaki değere bakmaya gerek duymaz ve true kabul eder.
     *  Eğer && operatörünün solu false ise sağdaki değere bakmaya gerek duymaz ve false kabul eder.
     */

    /**
     *
     * true && false = true -> iki değer de kontrol edilir.
     * true && false = false -> iki değer de kontrol edilir.
     * false && true = false -> sol değerin kontrol edilmesi yeterlidir.
     * false && false = false -> sol değerin kontrol edilmesi yeterlidir.
     *
     * true || true = true -> sol değerin kontrol edilmesi yeterlidir.
     * true || false = true -> sol değerin kontrol edilmesi yeterlidir.
     * false || true = true -> iki değer de kontrol edilir.
     * false || false = false -> iki değer de kontrol edilir.
     *
     */
}
