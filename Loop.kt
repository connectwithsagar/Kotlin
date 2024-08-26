fun main(){


    //using for loop
    for (i in 1..5 step 2){
        println(i)
    }


    for (i in 6 downTo 1 step  2){
        println(i)
    }

    //Using while loop

    var n=5;
    while (n<10){
        n++
        println("---------$n---------")
    }


    //Using do while loop
    do {
        println("--------++$n++-------")
        n++
    }while (n<10)


//    var n= 5
//    while (n<10){
//        println(n++)
//
//    }
}