      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                           Loops                            //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

//------------- For Loops --------------------
// for loops iterate until the condition is true.

// for (i in 1..100) 100 is included
// for (i in 1 until 100) 100 is not included
// for (x in 2..10 step 2) 2-step increment till 10
// for (x in 10 downTo 1) Decrement

// To get the index, use indices property.
// The index and the value can be obtained at the same time using withIndex().

// We can also use Collections in loop as condition


//------------- While Loops --------------------
// Kotlin supports while and do..while loops and they wok as usual in other languages.


// Break operators cause the loop flow to exit the current loop body and continue operators
// make it jump to the end of the loop body surrounded by curly braces({}).

fun main()
{
    print("With .. operator = ")
    for(i in 1..10)
    {
        print("$i ,")
    }
    println()

    print("With until operator = ")
    for(i in 1 until 10)
    {
        print("$i ,")
    }
    println()

    print("With 2-Step Increment = ")
    for(i in 1 .. 10 step 2)
    {
        print("$i ,")
    }
    println()

    print("With downTo (Decrement) = ")
    for(i in 10 downTo  1)
    {
        print("$i ,")
    }
    println()

    val list = listOf('a','b','c','d')
    print("With characters list = ")
    for (char in list){
        print("$char ,")
    }
    println()

    print("With characters list using indices = ")
    for (i in list.indices){
        print("$i:${list[i]} ,") //here we access value by its index
    }
    println()

    print("With characters list using withIndex = ")
    for ((index,value) in list.withIndex()){
        print("$index:$value ,") //here we are getting both index and value by loop
    }
    println()

    //while loop
    print("Using While Loop = ")
    var iterator = 0
    while (iterator<10)
    {
        print("$iterator ,")
        iterator++ //incrementing iterator
    }
    println()


    //using Break
    print("Using While Loop with break = ")
    var iterator1 = 0
    while (iterator1<10)
    {
        print("$iterator1 ,")
        iterator1++ //incrementing iterator
        if (iterator1 ==5){   //this condition will force the loop to finish when it reaches 5
            break
        }
    }
    println()
}