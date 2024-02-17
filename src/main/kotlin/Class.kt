      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                          Class                             //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// Classes in Kotlin are declared using the keyword class
// Classes can include properties, functions, constructors and classes.
// To use classes, create objects.
// In Kotlin, We don't use new keyword to create objects

// Public, Internal,Private and protected are access/visibility modifiers in Kotlin.
// Classes, properties, functions etc can be public, private and protected,
// you can check Object Oriented Programming Concepts if you don't know these access modifier.

//================= Constructors ================
// Constructors are a special member function that is called when an object is created.
// In Kotlin, classes can have a primary constructor and one or more secondary constructors.

//================= Primary Constructor ================
// Part of the class header.
// Classes can have only one primary constructor.
// If there are any secondary constructors, a primary constructor can be omitted.
// If we don't declare any primary constructor, Compiler automatically creates one with out any parameters.
// Initialization code of a primary constructor can be placed in init block.
// Properties can be val or var/

//================= Secondary Constructor ================
// Secondary constructors are prefixed with constructor keyword in the class body.
// Multiple secondary constructors can be created with different arguments.
// The parameters of secondary constructors can't be declared with var or val.

// To delegate to another constructor of the same class, this keyword is used.
// If the class has a primary constructor, each secondary constructor needs to delegate to
// the primary constructor.
// It always call a primary constructor first then secondary constructor


class Greetings{ //with no constructor
	public var name:String="Saad"  //Property, can be private, public or protected by default it is public
	fun sayHello(){ //Function, can be private, public or protected by default it is public
		println("Hello! $name")
	}
}
class Abc() { //default empty constructor

}
class Xyz constructor() //with constructor keyword with can be omitted
{

}

class Greetings2(var name:String) //taking name in Constructor
{
	init { //init block executes when object is created
		println("Creating Object Greetings2 Class")
	}

	fun sayHello(){
		println("Hello! $name")
	}
}

//Class with multiple constructors
class MultipleConstructors(name:String){
	init {
		println("Hello! $name, Object is Created using Primary Constructor")
	}
	constructor() : this(name.toString()) {
		println("Hello!, Object is Created using Secondary Constructor without name")
	}

	constructor(name: String,age:Int) : this(name) {
		println("Hello! $name you are $age year old, Object is Created using Secondary Constructor with name & age")
	}
}

fun main()
{
	var myObj = Greetings() //object
	myObj.sayHello() //calling class public function

	myObj.name = "Bilal" // accessing public property
	myObj.sayHello()

	println()
	println()

	var myObj2=Greetings2("SAAD")
	myObj2.sayHello()

	println()
	println()
	//create objects of class with multiple constructors
	var obj1 = MultipleConstructors("Awais")
	println()
	var obj2 = MultipleConstructors()
	println()
	var obj3 = MultipleConstructors("Ahmad",20)
}