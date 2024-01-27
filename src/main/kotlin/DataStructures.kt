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
//  has Mutable and Immutable Collections
// Mutable Collections add,set,size and get functions and can be changed
// while Immutable doesn't provide 'Add' and 'Set' functions and cannot be changed once initialized
//
// listOf(), mapOf(), setOf() are default and Immutable
// to use mutable we have to use mutableListOf(), mutableMapOf(), mutableSetOf()


//---------------------Lists---------------------------
// A list is a collection of ordered elements.
// The elements of a list can be accessed by their index.
// Lists in Kotlin can be immutable (List) or mutable (MutableList).

//---------------------Sets---------------------------
// A set is a collection of unique, unordered elements.
// Unique means if we add same elements in Set, They will be added only once
// Sets in Kotlin can be immutable (Set) or mutable (MutableSet).

//---------------------Maps---------------------------
// A map is a collection of key-value entries, where each key is unique.
// Maps in Kotlin can be immutable (Map) or mutable (MutableMap).
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
    println()
    println()


    println("=============List examples=============")
    var listImmutable = listOf<Int>(1,2)  //Immutable list
    print("Immutable List = ")
    listImmutable.forEach { print("$it,") }
    println()
    //listImmutable.add(5) //it gives error
    var listMutable = mutableListOf<Int>(1,2)  //Mutable list
    listMutable.add(5)
    print("Mutable List = ")
    listMutable.forEach { print("$it,") }
    println()
    println()


    println("=============Set examples=============")
    var setImmutable = setOf<Int>(1,2)  //Immutable set
    print("Immutable Set = ")
    setImmutable.forEach { print("$it,") }
    println()
    //setImmutable.add(5) //it gives error
    var setMutable = mutableSetOf<Int>(1,2)  //Mutable set
    setMutable.add(5)
    print("Mutable Set = ")
    setMutable.forEach { print("$it,") }
    setMutable.add(2) //Add 2 again that is already present
    println()
    print("Mutable Set After Adding 2 Again = ")
    setMutable.forEach { print("$it,") } // you can see 2 is not added as it is already present
    println()
    println()


    println("=============Map examples=============")
    var mapImmutable = mapOf(
        "France" to "Paris",
        "Spain" to "Madrid",
        "Italy" to "Rome"
    )  //Immutable map
    print("Immutable Map = ")
    mapImmutable.forEach { print("$it,") }
    println()
    //mapImmutable.add("Italy" to "Rome") //it gives error
    var mapMutable = mutableMapOf(
        "France" to "Paris",
        "Spain" to "Madrid",
        "Italy" to "Rome"
    )  //Mutable map
    mapMutable["Germany"] = "Ber"  //here Germany is key and Berlin is value, if germany is already present it will update
    print("Mutable Map = ")
    mapMutable.forEach { print("$it,") }
    mapMutable["Germany"] = "Berlin"
    println()
    print("Mutable Map after update = ")
    mapMutable.forEach { print("$it,") }




}