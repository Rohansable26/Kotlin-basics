
fun main(args :Array<String>){
   for (i in 1..15){
      println("i: ${i}")
   }
println()
   for (i in 1 until 10 step 2){
      println("i = $i")
   }
println()
   for(i in 6 downTo 1){
      println(i)
   }
   println()
   for (whatever in 70 downTo -70){
      println(whatever)
   }
println()
   // while loops

   var number =0
   while (number <10){
      println(number++)
   }
println()
   var number2 = 0
   while (number2 <10){
      println(number2)
      number2++
   }
   println()
   var number3 = 150
   while( number3 < 200 ) println(number3++)  // single line while loop system
println()
   do {
      println(number++)
   }while (number <15)

   println()

   while (number < 30 ){
      if (number == 25){
         continue
      }
      println(number)
      number++

   }
   println()

   var number4 = 20
   while(number4 > 45){
      number4++

      if(number4 > 22 && number4 <38) {
         continue
      }
      println(number4)

   }
}

fun main2(){
   var number2 = 20
   while(number2 > 45){
      number2++

      if(number2 > 22 && number2 <38) {
         continue
      }
      println(number2)

   }
}