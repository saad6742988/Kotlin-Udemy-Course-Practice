      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                         Property                           //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// In Kotlin, a variable is not a field but a property.
// A variable has accessors (getter and setter functions) to be accessed from outside.

// Getter is used to get the value of variable.
// Setter is used to set the value of a variable.

// If we do not write getter and setter explicitly, it will use default getter and setter.
// var has both get() and set() while val has only get() as we can't change its value
var num = 10 //this is property
    get()=field  //this is default getter
    set(value)  {field = value} // this is default setter

// let see some customized getter setter
var customProperty = 10
    get() {
        println("customProperty getter is called")
        return field
    }
    set(value) {
        println("customProperty setter is called")
        field=value
    }
val num1 = 10
    get() = field
    //set(value) {} //gives error

// Age Example
var age = 0
    set(value) { // if negative age is set it will make it zero
        if(value<0)
        {
            field=0
        }
        else
        {
            field=value
        }
    }

// name example with nullable value
var name:String? = null
    set(value) {
        field = value?.uppercase()
    }
fun main(){
    println(customProperty) // here getter will be called
    customProperty = 20 //here setter will be called
    println(customProperty) // again, getter will be called with updated value
    println()
    println()


    age = -2 //setting negative age
    println("after negative age is set = $age")
    age = 13 //setting positive age
    println("after positive age is set = $age")
    println()
    println()


    name="saad"
    println("name = $name")
}