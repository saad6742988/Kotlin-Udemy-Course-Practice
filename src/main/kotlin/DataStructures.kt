      ////////////////////////////////////////////////////////////////////
     //                                                                //
    //                                                                //
   //                      Array, List, Map                          //
  //                                                                //
 //                                                                //
////////////////////////////////////////////////////////////////////

//---------------Array---------------------------

// Arrays are represented by Array Class, having get and set functions and size property
//
// We use arrayOf() to create an Array
// Data can be of any type. Even you can add mix data types
//
// You can specify the data type of array by 'arrayOf<DataType>()'
// Kotlin also provide specific data type functions like:
// intArrayOf(), doubleArrayOf(), etc.
//
// Another way to initialize arrays is Array class constructor
// Array(size:Int , init:{}), where init is a function to assign values

//---------------Collections Types---------------------------
// List, Set and Map are some collection types in kotlin
//
// Kotlin has Mutable and Immutable Collections
// Mutable Collections add,set,size and get functions and can be changed
// while Immutable doesn't provide 'Add' and 'Set' functions and cannot be changed once initialized
//
// listOf(), mapOf(), setOf() are default and Immutable
// to use mutable we have to use mutableListOf(), mutableMapOf(), mutableSetOf()

fun main(){
    println("=============Array examples=============")
    var arr = arrayOf(1,"hello",true)
    println("Size = ${arr.size}")
    println("Data = ${arr[0]},${arr[1]},${arr[2]},")
    arr[2] = 5.5 //replacing Double in place of Boolean
    println("Size = ${arr.size}")
    println("Data = ${arr[0]},${arr[1]},${arr[2]},")

    var intArray = arrayOf<Int>(1,2,3,4) //This will take only Integers
    var intArray1 = intArrayOf(1,2,3,4)
    var BooleanArray = booleanArrayOf(true,false,true)

    var arr1 = Array<Int>(3,{0}) //0 is assigned as initail value


    println("=============List examples=============")
    var listImmutable = listOf<Int>(1,2)  //Immutable list
    print("Immutable List = ")
    listImmutable.forEach { print("$it,") }
    println()
    //list1.add(5) //it gives error
    var listMutable = mutableListOf<Int>(1,2)  //Mutable list
    listMutable.add(5)
    print("Mutable List = ")
    listMutable.forEach { print("$it,") }



}