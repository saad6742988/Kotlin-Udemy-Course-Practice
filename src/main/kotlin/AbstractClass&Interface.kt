      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                Abstract Class & Interface                  //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// First of we need to know about Abstract Functions and Properties.

//=============== Abstract Functions ==============
// Abstract function has only the Declaration part.
// Abstract Function don't have a body.
// Abstract function starts with a abstract keyword.
// i.e. abstract fun myFyn()

//=============== Abstract Property ==============
// Abstract Property has only the Declaration part.
// Abstract Property don't have a initial value.
// Abstract Property starts with a abstract keyword.
// i.e. abstract val myStr:String

//=============== Abstract Class ==============
// An abstract class is a class that has abstract functions or abstract properties.
// Abstract class is declared using abstract keyword.

//=============== Using Abstract Class ==============
// We can't create a object of an abstract class.
// A subclass that inherits an abstract class must implements all abstract functions and
// abstract properties. Otherwise the subclass must be declared as an abstract class too.

abstract class AbstractSuperClass{
	//val abstractData:Int //if we don't initialize it we get an error
	abstract val abstractData:Int // no need to initialize abstract property


	//fun abstractFun() //if we dont add body we get an error
	abstract fun abstractFun() // no need to add body to abstract Function

	fun fun1()
	{
		println("I am fun1 in Abstract class")
	}
}

class SubClass:AbstractSuperClass() {
//we need to implement superclass abstract
// functions and properties else we get an error

	override val abstractData: Int = 20
	override fun abstractFun() {
		println("I am abstract function of Abstract class defined in Sub Class")
	}

}


//================== Interface ==================
// An interface is to declare abstract functions.
// We can't create a object of an interface.
// A concrete class that implements an interface must overrides and implements all
// abstract functions and abstract properties.
// All properties and Functions in Interface are Abstract By default.

interface MyInterface{
	val interfaceData:String  // We don't need to add Abstract Keyword as it is Abstract by default
	fun interfaceFun() // We don't need to add Abstract Keyword as it is Abstract by default
}
class InterfaceSubClass :MyInterface{
	override val interfaceData: String = "Hello"
	override fun interfaceFun() {
		println("I am abstract function of Interface defined in interface's Sub Class")
	}
}

// ************************** Abstract Class Vs Interface ***********************
// The main difference between Abstract Class and Inter face is that 'An Abstract Class Can have non-abstract
// functions and properties while an Interface only has abstract functions and properties.
fun main()
{
	//val obj= AbstractSuperClass() //We get an error and unable to make object of abstract class

	//Now we can create object of Sub Class
	val obj = SubClass()
	obj.fun1()
	obj.abstractFun()
	println("Abstract Data  =  ${obj.abstractData}")


	//Interface Subclass Object
	val obj2 = InterfaceSubClass()
	obj2.interfaceFun()
}