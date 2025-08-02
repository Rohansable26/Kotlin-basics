fun main(args:Array<String>){

    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0


    while (number<=lastNumber){
        number++


        if (!isEvenNumber(number)){
            continue
        }
        evenNumberCounter++
        println(number)
    }
    println("total numbe of even number found are : $evenNumberCounter")
}
/*
fun isEvenNumber(number :Int) : Boolean {
    if ((number % 2 )== 0 ){
        return true
    }
    else {
return false }*/
// or also we can write this way
fun isEvenNumber(number :Int ): Boolean = (number % 2 ) == 0

