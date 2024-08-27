//find out factorial
fun fac(num:Int): Int{

    if(num==0){
        return 1
    }
    return num*fac(num-1)
}


//find out the sum of n numbers
fun sum(n:Int): Int{

    if(n==0){
        return 0
    }
    return n+sum(n-1)

}
//find out sum of even numbers for the given range

fun sumEvenAndOdd(n:Int){
    val start = 1
    val end = n

    var sumEven = 0
    var sumOdd = 0

    for (number in start..end) {
        if (number % 2 == 0) {
            sumEven += number
        } else {
            sumOdd += number
        }

    }
    println("sum of even number from 1 to $end is " + sumEven)
    println("sum of odd number from 1 t0 $end is "+ sumOdd)

}

fun main(){
    println("factorial is "+fac(5))
    println("sum of 5 natural numbers "+sum(5))
    println("sum of required"+ sumEvenAndOdd(12))

}
