      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                         Functions                          //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// Declaring a function
// fun function_name(param:Type): Return_Type {
//      Body
// }
//
// If there is no return value, a return type will Unit.
// If no return type in mentions, it will automatically considered as Unit.

// Simple Sum Function
fun sum(a:Int,b:Int):Int{
    return a+b
}

//-------------- Single Expression Functions------------
// If function has only one expression, then curly braces can be inferred
// And using the equal function makes function simpler.
// Also, there is no need to mention a return type; it will also be inferred by Expression
//
// Single Expression Sum Function
fun single_expression_sum(a: Int,b: Int) = a+b

//-------------- Default and Named Argument ------------
// Default argument have some default value used when no value is passed.
// Named argument has to be passed by name when a function is called.
// While passing value by named arguments, the order can be changed

//Example
fun greetings(name:String = "Random Person",age:Int){
    println("Hello $name, Your Age is $age")
}
fun main()
{
    println("Sum using Simple Sum =  ${sum(4,5)}")
    println("Sum using Single Expression Sum Function = ${single_expression_sum(4,5)}")

    // firstly, pass both Params
    greetings("Saad",23)
    //Now we don't want to pass name, here we use named arguments
    //greetings(23)  //it will give error as it needs first argument as String

    greetings(age = 23) // here we passed age as named argument
}