
//------------------------defining variables-------------------------//
// val name:type = value
// var name:type = value

// val is immutable means its value can't be changed once assigned
// val can be used as constant variables

// while var is mutable and can be changed

// type can be inferred automatically when we assign value no need to mention always

//------------------------Top-Level Variables-------------------------//
//this is top-level/global declaration and here variable must be initialized
//you can't leave top-level/global variable without initialization,
//otherwise it will give the error and same goes for class members
var c:Int = 0
class MyClass{
    var myVariable:Int = 10 //here it must be initialized otherwise gives error
}

//------------------------Nullable Property-------------------------//

//Null means variable has not been initialized
//         Two types of variables:
//         1. nullable(that can be null)
//         2. non-nullable(that can't be null)
//
//Kotlin Provides Null safety to deal with null variables
//To declare a null variable, it should be marked with '?' symbol
//Null Variables are mentioned in main()

fun main() {

    var a = 5; //it will automatically infer it as Int
    println("Original a = $a")
    a=10
    println("updated a = $a")

    val b = 5
    //b=2  //it gives error that val can't be reassigned


    var noIntialization:Int //function local variables can be used without initialization

    //Null Variables
    //var nullVariable:Int = null //it is error can't assign null to non-null variable
    var nullVariable:Int? = null //null must be marked with '?'

}