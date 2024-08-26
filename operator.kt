fun main(){
//    var x=24;
//    println(x.shr(1))
//    println(x.shl(1))

//    var x=true;
//    var y=false;

//    println(x && y)
//    println(x and y)

//    println(x++)
//    println(++x)
//    println(x--)
//    println(--x)
//    val result = expression ?: defaultValue
//    val result = 10+20 ?: 0
//    println(result)


   // elvis operator
    var str : String? =null
    var str2: String? = "May be declare nullable string"
    var len1 : Int = str ?.length ?: -1
    var len2 : Int = str2 ?.length ?: -1

    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")

//    println("-----------While and Do - while------")
//    var n=5;
//    while (n<10){
//        println("---------$n---------")
//    }
//    do {
//        println("--------++$n++-------")
//    }
    println("-----usage of when--------")
    var choice = 2
    var result = when(choice){
        1->"Hello "
        2->"hi"
        3->"Namaste"
        4->"Vanakkm"
        else->"No need"
    }
    println(result)


    var a=40
    var b=25
    // adding two values
    var adding = a+b
    println(adding)
    //subtracting two values
    var subtracting = a-b
    println(subtracting)
    //multiplying two values
    var multiplying = a*b
    println(multiplying)
    //dividing two value
    var dividing = a/b
    println(dividing)
    //modulous of two values
    var modulous = a%b
    println(modulous)
    //increment values
    println(a++)
    println(++a)
    //decrement values
    println(b--)
    println(--b)


    //Assignment operator
    a+=3
    println(a)
    a-=3
    println(a)
    a*=3
    println(a)
    a/=3
    println(a)
    a%=3
    println(a)


    //Comparison Operator
    //Equal to
    println(a==b)
    //Not equal
    println(a!=b)
    //Greater than
    println(a>b)
    //Less than
    println(a<b)
    //Greater than equal to
    println(a>=b)
    //Less than equal to
    println(a<=b)


    //Logical Operator





}