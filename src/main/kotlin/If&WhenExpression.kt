      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                  If & When Expressions                     //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

//--------------------- If Expression -------------------
// In Kotlin, if operator can be an expression.

// If you use 'if' as an expression, an else branch is required.

// If 'if' branch is blocks surrounded by curly braces({}), the value of a block should be the
// last expression.

// If 'if' is used as an expression, you can also use else if branches as much as you want, but still
// an else branch is required.


//---------- Difference b/w Expression and Statement-----------
// Expressions consist of variables, constants, operators or functions that evaluate to a single value.
// Statements consist of characters and symbols that make up a complete unit of execution.

//--------------------- When Expression -------------------
// 'When' operators replace the switch operators of C or Java.
// An argument of when operators can be many different types more than just an Int type.
// The branch condition can be just data type itself.
// The branch condition can be compound of type and data.
// To handle many cases in the same way, the branch conditions can combined with comma(,).
// The branch condition can be a range.
// 'When' can be an expression as if operator.
// Like if operator, when expressions require an else branch.
// If 'when' branch is blocks surrounded by curly braces({}), the value of a block should be the last expression.
fun main()
{
    println("=========== if Expression =========")
    //Normal use of 'if'
    val a=10
    if (a<=9)
    {
        println("hello")
    }
    else{
        println("bye")
    }

    //use 'if' as an expression
    val result = if (a<=10){
        "hello"
    }else{
        "bye"
    }
    //writing as one-liner
    val result1 = if (a<=10) "hello" else "bye"
    println("Result of if Expression = $result")

    println()
    println()
    println("=========== when Expression =========")

    //Normal use of 'when'
    when(a)
    {
        1,2,3,4,5 -> println("Hello")
        6,7,8,9,10 -> println("bye")
        is Int -> "it is Int"
        //else -> println("blah blah")  not necessary
    }

    //use 'when' as an expression
    val whenResult =  when(a)
    {
        //is Int -> "it is Int"   //if you include this it will print this
        1,2,3,4,5,10 -> "Hello"
        6,7,8,9 -> "bye"
        11-> "it is eleven"

        else -> "blah blah"   //necessary
    }
    println("Result of when Expression = $whenResult")
}
