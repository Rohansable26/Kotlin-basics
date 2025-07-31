fun main(args: Array<String>)  // this is the parent class
{
    sayHello("rohan",15, true)
    val hasinternet  = false
    if (hasinternet){
        getData(" this is the data given")  // if the condition id true then it show this function
    }else{
        showMessage()  // if the condition is false then it is shows this functions
    }

}


fun sayHello(name : String, age : Int , istrue : Boolean){

    var number = age
    println("helloo,$name")
    println("my age is $age")
    println("this is the best entrepreneur of the world $istrue")
}

fun getData(data : String){
    println("your data is :$data")
}


fun showMessage(){
    println("there is no internet connecion")
}





