fun main (args : Array<String>){
    val names = arrayOf("john","virat","pubg")
    val number = arrayOf("rohan",29, 54, "sable",12,25,65)

    names[0] = "alex"
    println("first element : ${names[0]}")
    println ("the size of the array : ${names.size}")

    println()

    for (name  in names ){
        println(name)
    }

    println()
    for(i in number){
        println(i)
    }

    println()

    for(i in number){
        if(i is Int){
            println("here only the numbers will print : $i")
        }
      /*  else if(i is Char){
            println("here only char will be printed :$i ")
        }
        else if(i is String){
            println("here only String will be printed :$i ")
        }
        else println("none ")
*/
    }



}