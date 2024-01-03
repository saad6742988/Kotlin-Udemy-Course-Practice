      ////////////////////////////////////////////////////////////////////
     //                                                                //
    //                                                                //
   //           Data Type, Type Checking, Type Casting               //
  //                                                                //
 //                                                                //
////////////////////////////////////////////////////////////////////


//Everything in Kotlin is an object
// i.e. Int and Double are classes and there variables/properties are objects
// so these variables/properties also have some other functionalities

val intData:Int = 5
val result = intData.plus(5) //this will add 5 in intData variable


//There are many other data-types like:
//  - Int
//  - Double
//  - Float
//  - Long
//  - Short
//  - Byte
//  - Char
//  - String
//  - Boolean
//  - Any
//  - Unit


//-----------------------Strings-------------------------
//There are Two types of strings in kotlin
// 1. double-quoted Strings ("hello")
// 2. triple-quoted Strings  ("""hello""")
//
// Triple-Quoted strings takes multiple lines and spaces or tabs or enters as it is.
// String can take variables in it with '$' symbol

fun main() {


    println("--------Int is a Class--------")
    val intData:Int = 5
    val result = intData.plus(5) //this will add 5 in intData variable
    println("result = $result")
    println()
    println()




    println("--------String Types--------")
    val doubleQuotedString = "hello" +
            "world$intData"
    println("Double-Quoted = $doubleQuotedString")
    println()
    val tripleQuotedString = """Hello
        World
        $intData
    """
    println("Triple-Quoted = $tripleQuotedString")

}