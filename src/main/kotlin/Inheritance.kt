       ////////////////////////////////////////////////////////////////
      //                                                            //
     //                                                            //
    //                       Inheritance                          //
   //                                                            //
  //                                                            //
 ////////////////////////////////////////////////////////////////

// Superclasses have to be declared with open keyword.
// To declare a superclass explicitly, we place it the right hand side of colon(:).
// Kotlin doesn't use 'extends' keyword like java

//================ Function Overriding ===============
// Overriding means rewriting superclass functions or properties in a subclass.
// To override a function from a superclass, the function should be declared with open keyword.
// To show explicitly that a function overrides a superclass function, we need to place the
// override keyword before the function in a subclass.

// Using 'super' keyword a subclass can call superclass functions and properties


open class Shape(){
	open var x = 0
	open var y = 0

	open fun print(){
		println("X = $x , Y = $y")
	}
}
class Rect(var len:Int, var width:Int,
           override var x: Int, override var y: Int //getting these for super class x,y write to its values
):Shape(){
	override fun print()
	{
		super.print() //calling super class print function
		println("len = $len , Width = $width")
	}

}

fun main()
{
	var obj = Rect(10,15,4,5)
	obj.print()
}