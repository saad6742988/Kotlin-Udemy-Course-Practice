      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                      lateinit & lazy                       //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

//================== lateinit =========================
// Normally, all properties should be initialized in Kotlin but,
// Marking a property with the lateinit modifier allows us to initialize the property after creating a object.

// lateinit follows the rules below:
//      - Only var properties can use lateinit.
//      - lateinit can be used on only properties in the class body and Top-Level, not on constructor's
//        properties.
//      - lateinit can be used on the properties that don't have custom getter or setter.
//      - nullable properties can't use lateinit.
//      - Property's data type shouldn't be one of the primary data types

//================ lazy ========================
// If we use lazy keyword, we don't need to initialize the property until it is used.
// Normally, we mark a property with "by lazy {}" and initialize the property in the curly braces({})

//lazy follows the rules below:
//    - val properties can use it.
//    - We can use it on primary constructor's properties.

//================= Question =============
// If I declare nullable properties or initialize properties, there is no need to delay
// initialization by using lateinit or lazy. Do we need to delay initialization?
// Answer: Yes.
// In case the property cannot have null and it can't be initialized yet.

// Like accessing components in Android, the component property we declared in started
// can be null and then in OnCreate() we bind component using findByID().

public class A{
    //var a:String //not initialized so gives error
    lateinit var a:String

    val b:String by lazy {
        println("initializing Lazy")
        "Hello World!" //it will be returned as initial value when used
    }
}

fun main()
{
    val myObj = A()
    myObj.a = "I am A" // we initialed class member here


    myObj.b   //property b will be initialized when used here
}