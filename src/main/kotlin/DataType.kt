import kotlin.reflect.typeOf

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

//-----------------------Any Type-------------------------
// Any is a top-level class and every other data type is inherited from Any type
//
// val myInteger:Any = 10
// val myStr:Any = "Hello"

//-----------------------Unit Type-------------------------
// Unit type is used when there is no return statement/value
// close to 'Void' in java/c++. (but not same)
// Void is Keyword but Unit is Data-type
// fun myFun(){}  (This function returns Unit by default)
// fun myFun(): Unit {}  (This Function is same as above function)


//-----------------------Nothing Type-------------------------
// Nothing is used when you want to show there is no return value
// fun nothingTest():Nothing{
//     throw Exception()
// }


//-----------------------Type Check-------------------------
// Kotlin uses is Operator for Type checking.
// 'is' operator check type and also casts value automatically is needed - Smart Cast

//-----------------------Type Casting-------------------------
// Kotlin doesn't cast automatically for number
// var a1:Int = 10
// var a2:Double = a1 (it is error)
// Operator 'as' is used to cast from lower class to upper class i.e. to super types
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
    println()
    println()


    println("--------Any Type--------")
    val myInteger:Any = 10
    println("Type of myInteger is = ${myInteger::class.simpleName}")
    println("Value of myInteger is = $myInteger")
    println()

    val myDouble:Any = 5.5
    println("Type of myDouble is = ${myDouble::class.simpleName}")
    println("Value of myDouble is = $myDouble")
    println()

    val myStr:Any = "Hello"
    println("Type of myStr is = ${myStr::class.simpleName}")
    println("Value of myStr is = $myStr")
    println()
    println()

    println("--------Unit Type--------")
    val unitFunRes = unitTest()
    println("Return value without mentioning the return type as Unit = $unitFunRes")

    val unitFunRes1 = unitTest1()
    println("Return value with return type as Unit = $unitFunRes1")
    println()
    println()

    println("--------Type Check--------")
    if (myInteger is Int){
        println("myInteger is Integer Type")
    }
    else
    {
        println("myInteger is not Integer Type")
    }
    if (myDouble is Int){
        println("myDouble is Integer Type")
    }
    else
    {
        println("myDouble is not Integer Type")
    }

    //Using with functions
    println()
    val strLength = getStringLength("hello")
    println("Length when String is passed = $strLength")
    val strLengthq = getStringLength(100)
    println("Length when Integer is passed = $strLengthq")



    println()
    println()

    println("--------Type Casting--------")
     var a1:Int = 10
//     var a2:Double = a1  error
    var a2:Double = a1.toDouble()
    var a3:Long =a2.toLong()
    println("Value = $a1 -- Type = ${a1::class.simpleName}")
    println("Value = $a2 -- Type = ${a2::class.simpleName}")
    println("Value = $a3 -- Type = ${a3::class.simpleName}")

    //using As Operator
    var a4 = a1 as Any
    println("Value = $a4 -- Type = ${a4::class.simpleName}")

}

//Functions to test Unit Type
fun unitTest(){

}
fun unitTest1():Unit{

}

//function to implement Type Check
// Returns length if string is passed else it will return null
fun getStringLength(value:Any):Int? {
    if (value is String)
    {
        return value.length
    }
    return null
}

