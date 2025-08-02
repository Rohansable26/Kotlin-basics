fun main(){
    println("enter the number : ")
    val number = readln()  // here readln only takes input as a string
    println(number)

    println()
   /*
    println("enter the number:")
    var input = readln()
    var inputasInt = input.toInt()

    val isEven = inputasInt % 2 == 0
    println("hence it is a even value :$isEven")
*/

    /* it is a null operator using */
   /* println()
    println("enter the number:")
    var input = readln()
    var inputasInt:Int? = input.toIntOrNull() ?: 0

    val isEven = inputasInt!! % 2 == 0

    println("hence it is a even value :$isEven")*/
/*

    println()
    println("enter the number:")
    var input = readln()
    var inputasInt:Int? = input.toIntOrNull() ?.inc()
    println("hence it incremented value is :$inputasInt")

    var isEven = inputasInt?.rem(2) == 0  or // inputasInt?:rem(2)?:equals(0)
    println("hence the remainder of the given input is : $isEven")

*/


    println()
    println("enter the number:")
    var input = readln()
    // var inputasInt: Boolean? = input.toIntOrNull()?.rem(2) == 0
    var inputasInt: Boolean? = input.toIntOrNull()?.rem(2)?.equals(0)  // inputasInt?:rem(2)?:equals(0)
    println("hence it is even value is :$inputasInt")
 // the printed value willbe null anything apart from number is given as input

}