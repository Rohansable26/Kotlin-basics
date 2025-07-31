import javax.sound.midi.MetaMessage
import javax.xml.namespace.QName


fun getMax(a: Int, b: Int): Int {
        val max = if (a > b) a else b   // single line if else statement
        return max   // here we can only return one variable
    }

    fun getMax1(a: Int, b: Int) = if (a > b) a else b // single line if else expression


    fun getMax1(a: Double, b: Double) = if (a > b) a else b // single line if else expression for float

    fun getMax1(a: Int, b: Int, c: Int): Int {
        if (a >= b && a >= c) {
            println("a is greater")
            return a
        } else if (b >= a && b >= c) {
            println(" b is greater")
            return b
        } else {
            println("c is great")
            return c
        }
    }

    fun getMax2(a: Int, b: Int, c: Int) = if (a >= b && a >= c) a else if (b >= a && b >= c) b else c   // single 3 variable if else expression


    fun main() {
        val max = getMax(5, 9)
        println("this is the value of first fun : $max")
        println(getMax1(11.9, 9.54))
        getMax1(12, 23, 11)
        println("this is the value of  3 para func : ${getMax2(14, 12, 42)}")

        // as you can see above this  is the example of function overloading

        sendMessage("Rohan", "this is my message before double quotes.")
        sendMessage("Rohan Sable")       //  here we can only input one value because of default parameter
        sendMessage(message = "this is the output when we select one more parameters" , name = "rohan")
        // default parameter handeling
    }


    // default parameter handeling

    fun sendMessage(name: String, message: String = sendText1()){  // here "" works as a default value
        println("Name :$name and message = $message")
    }

fun  sendText() : String{
    return "sometext"
} //or

fun  sendText1() =   "no message is there "
