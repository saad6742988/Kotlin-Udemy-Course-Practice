      ////////////////////////////////////////////////////////////////
     //                                                            //
    //                                                            //
   //                         Null Safety                        //
  //                                                            //
 //                                                            //
////////////////////////////////////////////////////////////////

// Property types are distinguished between a nullable type and a non-nullable type.
// We can mark property as Nullable with '?' after property type.
// Nullable property can cause null pointer exception.
// '?.' is used as null safety operator. It returns value is property is not null otherwise returns null.
// '?:' is Elvis Operator and it is used to define return value instead of returning null if property is null.
// i.e. if value is not null left side of Elvis operator is returned else if it is null then right side is returned.

// '!!' operator is used to throw null exception. It is mostly used to forcefully tell compiler that
// the property will not be null when you are using it. So saves compile time error

// 'as?' operator is null safety cast. If property can't be cast it returns null instead of error.

var nonNullable:Int = 10 //non-nullable
var nullable:Int? = 5 //nullable

fun main(){
	//nonNullable = null //error
	nullable = null

	var str:String? = "Hello"
	//var len:Int = str.length //here compiler gives error,
    // because it sees a nullable property that can cause issue if null

	var len:Int? = str?.length //it will return length is str in not null otherwise it returns null
	println("Length of not null string is $len")

	var nullStr:String? = null
	var len1:Int? = nullStr?.length
	println("Length of null string is $len1")

	//another way
	var len2:Int = nullStr?.length?:0 //it will return length if not null and return 0 if string is null
	//here we don't need to mark length integer variable as nullable as expression is not returning null
	println("Length of null string with Elvis Operator is $len2")


	var strToInt:Int? = str as? Int // string can't be cast to Int so returns null
	println("Casting String To Integer = $strToInt")



	nullStr!!.length //this will just throw exception
}