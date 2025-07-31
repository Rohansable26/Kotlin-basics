import kotlin.math.PI

fun main() {
    var x = 5
    val y = 16f

    var result = x + y
    println("result = ${x + y}")
    println("result = ${x - y}")
    println("result = ${x * y}")
    println("result = ${x % y}")
    println("result = ${x / y}")

    println("3+4*4 =  ${(3 + 3) * 4}")  // bodmas or pemdas

    var resultq = x + y

    resultq += 2
    println("Result = $resultq")

    resultq -= 2
    println("Result = $resultq")

    resultq *= 2
    println("Result = $resultq")

    resultq /= 2
    println("Result = $resultq")

    resultq %= 2
    println("Result = $resultq")

    x = 0

    println("x++ = ${x++}")
    println("++x = ${++x}")

    println("x-- = ${x--}")
    println("--x = ${--x}")


    //control flow statements

    val isActive = true
    var number = 15.4f
    if (number > 15.3) {
        println("the number is greater than 15")
    } else {
        println("the number is smaller than 15")
    }


    val isActive1 = true
    val score = 60
    val internetspeed = 1000
    if (isActive1 && score >= 80 && internetspeed == 1000) {
        println("you are at next level")
    } else {
        println("you are at the same level")
    }
println()

    val num1 = 5
    val num2 = -3
    var text : String= if(num1> 0 || num2 > 0) "this the text one"  else "this is the text two " ;
println("$text")
println()

    if(num1 >0 || num2>0)
        println("this condition is true ") // here it is called as if true
    else
        println("this condition is true and condition as well" ) // here it is called when if is false



    // Null pointer
println()
    var text1 : String? = "Name"
    text1 = null
    if(text1!= null) {
        println(text1.length)
    }
    else {
        println("the null is variable")
    }
    text = "this variable is not null "
    val text2 : String = text ?: "this variable is null"
    println(text2)
}

