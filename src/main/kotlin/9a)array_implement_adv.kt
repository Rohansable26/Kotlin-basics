// to create a function which is gonna take as an argument an array of integer .
//determine the biggest number in that array and return it
// find minimum number stored in that array and return it
// and combine both the function and run that if biggest or smallest value according to you


fun main (args: Array<String>){
    val number1 = arrayOf(12,20,54,5,2,5804,6,21,2)
   /* val max = findmax(number1)
    val min = findmin(number1)
    println("max value : $max")
    println("min value : $min ")*/


    val max1 = maxandmin(number1,true)
    val min1 = maxandmin(number1,false)
    println("max value : $max1")
    println("min value : $min1")


}
/*

fun findmax(number : Array<Int>):Int{
    var max = number[0]
    for (number in number)
    {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun findmin(number : Array<Int>):Int{
    var min = number[0]
    for (number in number)
    {
        if (number < min) {
            min = number
        }
    }
    return min
}
*/

fun maxandmin (numbers : Array<Int>, searchMax : Boolean): Int{
 var max = numbers[0]
    var min = max
    if(searchMax){
        for (num in numbers){
            if (num > max){
                max = num
            }
        }
        return max
    }
    else
    {
        for (num in numbers) {
            if (num <min  ){
                min = num
            }
        }
        return min
    }

}
