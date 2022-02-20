
fun exampleFunction(name :String,age :Int) :String{
    return "Hello, my name is $name i am $age years old with function"
}

fun exampleProcedure(name :String,age :Int){
    println("Hello, my name is $name i am $age years old with procedure")
}

fun exampleExpressionFun(name :String,age :Int) = "Hello, my name is $name i am $age years old with expression function"

fun main(){
//=============================================
                    //Introduce
    println("Hello, my name is Faiz Rofi Hencya")

    print("i am ")
    println("20 years old")
//=============================================
                    //Comment

//  single comment

/*
    multiple comment
 */
//=============================================
            //String template

    val name = "Faiz Rofi Hencya"
//    with variable and concat
    println("Hello, My name is "+name+" with variable and concat")

//    with variable and string manipulation
    println("Hello, My name is $name with variable and string manipulation")
//=============================================
                //variable
/*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
 */

/*
    var identifier: Type = initialization
    val -> value can't be manipulation
    var -> value cant be manipulation
*/

//  Escaped String
val statement = "Kotlin is \"Awesome!\""
    println(statement)

/*
    \t: add tab to text.
    \n: add newline to text.
    \’: add single quote to text.
    \”: add double quote to text.
    \\: add backslash to text.
 */

//  Raw String
    val line = """
        line 1 
        line 2
        line 3
    """.trimIndent()
    println(line)

//    Boolean
    /*
        && -> it is for CONJUNCTION
        || -> it is for DISJUNCTION
        !  -> it is for NEGATION
    */
    val buka = 10
    val sekarang = 15
    val tutup = 24
    val isOpen = sekarang >= tutup && sekarang <= buka
    println(isOpen)

//    Number

    /*
        - int (32 bit) range -2^31 Until +2^31-1 -> val intNumber = 100
        - long (64 bit) range -2^63 Until +2^63-1 -> val longNumber: Long = 100 OR val longNumber = 100L
        - Short (16 bit) 16 Bit -> val shortNumber: Short = 10
        - Byte (8 bit) -> val byteNumber = 0b11010010
        - Double (64 Bit) -> 15 - 16 numbers after comma -> val doubleNumber: Double = 1.3
        - Float  (32 Bit) -> 6 - 7 numbers after comma -> val doubleNumber: Float = 0.123456789f

        you can init number with underscore example = 1_000_000 it is equal to 1000000
    */
//=============================================
                //  Function
/*
    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
    }
*/
  val exampleFun = exampleFunction("Faiz Rofi Hencya",21)
  println(exampleFun)

  val exampleProc = exampleProcedure("Faiz Rofi Hencya",21)
  println(exampleProc)

  val exampleExpressFun = exampleExpressionFun("Faiz Rofi Hencya",21)
  println(exampleExpressFun)

//=============================================
                //  If expression
    val openHours = 7
    val now = 20

    if (now > openHours){
        println("Open")
    }else if (now == openHours){
        println("Open")
    }else {
        println("Close")
    }

    //    when
    /*
        if expression usually use if there are two condition
        whereas
        when usually use if there are more than two condition
    */
    val value = 7
    when(value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        9 -> println("Value is 9")
        10 -> println("Value is 10")
    }
//=============================================
            //  Array
/*
    Specific declaration array

    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
*/

    val arrayInteger = arrayOf(1,2,3,4)
    println(arrayInteger)

    val arrayMix = arrayOf(1,"satu",true)
    println(arrayMix)

//    Array with lamda expression

//    Array(Size,{Lamda Expression})
    val lamdaArray = Array(4,{i -> i * i})
    println(lamdaArray)
//=============================================
            //  nullable type
/*
    Eg 1 :
    val text: String = null // compile time error
    val text: String? = null // ready to go

    Eg 2:
    val text: String? = null
    val textLength = text.length // compile time error
    text?.length // Ready to go with safe call operator
    val textLength = text?.length ?: 7 // Ready to go with elvis operator -> value 7 is default value
 */
}

