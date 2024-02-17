	  ////////////////////////////////////////////////////////////////
	 //                                                            //
    //                                                            //
   //                    Visibility Modifiers                    //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// There are four visibility modifiers in Kotlin: public, internal, protected and private.
// Visibility modifiers are placed at the declaration of classes, interfaces, constructors,
// properties and functions.
// If we don't define a modifier it is by default public.

// These are visibility scopes of modifiers on top-level properties, functions and classes.
//      • public : (Default) visible everywhere.
//      • private : it will only be visible inside of the file containing the declaration.
//      • internal : it will be visible everywhere in the same module.
//      • protected : it is not available for top-level declarations.


// These are visibility scopes of modifiers on members declared inside of a class
//      • public : (Default)
//      • private : : it will only be visible inside of the class.
//      • protected : private + visible in subclass.
//      • internal : it will be visible to any classes in the same module.


// To make a property as read-only or limited access, add visibility modifiers to the accessors.
//      • get() always has the same visibility as the property.
//      • set() can has different visibility than the property's visibility but it shouldn't be wider.


class VisibilityModifiersTestClass{
	var publicData:Int = 10 //by default public
	private var privateData:Int = 20

	// data with custom access
	public var customAccessData:Int = 30
		private set(value) {field = value}

	public fun publicFun()  //public keyword can be omitted by default it will be public
	{
		println("Hello! I am public function.")
		// Inside class we can access both public and private data
		println("Public Data in public function = $publicData")
		println("Private Data in public function = $privateData")
		customAccessData = 40 // here we can also set value of data with private Setter
	}

	private fun privateFun()
	{
		println("Hello! I am private function.")
	}
}

fun main()
{
	val obj = VisibilityModifiersTestClass()
	obj.publicData
	println("Public Data = ${obj.publicData}")

	//obj.privateData // We get an Error can't access private data

	//Data With Custom accessors
	println("Public Custom Accessors Data = ${obj.customAccessData}")  // We can get its values
	//obj.customAccessData = 40 // We can't set its value as its setter is private

	obj.publicFun()
	//obj.privateFun() // We get an Error can't access private function

}
