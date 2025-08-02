
    fun main(args: Array<String>) {

        var number = 20
        while (number < 45) {
            number++

            if (number > 22 && number < 38) {
                continue
            }
            println(number)

        }

        println()
        var number4 = 20
        while (number4 < 45) {
            number4++

            if (number4 in 30..42 ) {
                continue
            }
            println(number4)

        }
        println()

        var num = 12
        while (num < 25) {
            num++
            if (num == 17) {
                break
            }
            println(num)
        }

        println()

        for (i in 1..10){
            if (i in 3..8){  // here we are checking the range using .. sign0
                continue
            }
            println(i)  // print the value apart from the given if value range
        }

println()

        for (i in 1..10){
            if (i == 7){
                break
            }
            println(i)
        }

    }



