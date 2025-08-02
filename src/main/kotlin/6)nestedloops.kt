fun main(args : Array<String>) {

    var number = 0
// this is the nested while loop system where we are running while loop one after another
/*
    while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            i++
            println("***$i")
        }
    }*/
    println()
// lets modify the above code more
   /*
    while (number < 5) {
        number++
        println(number)

        var j = 0

        while (j < 5) {
            if (j == 0) break
            j++
            println("***$j")
        }
    }*/

    while (number < 5) {
        number++
        println(number)

        var j = 0

        outer@ while (j < 5) {
            if (j == 0) break@outer
            j++
            println("***$j")
        }
    }
}