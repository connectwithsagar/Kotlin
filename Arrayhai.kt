fun main(){

//    type 1 to initialise an Array
    val numbers = arrayOf(1,2,3,4,5)

    println(numbers[0])
    println(numbers[1])
    println(numbers[2])
    println(numbers[3])
    println(numbers[4])

//    type 2 to initialise an Array

    val words: Array<String> = arrayOf("kotlin","java","python")
    println(words[2])

    //change in array
    words[1] = "PhP"

    //Array Size
    println(words.size)

    //Compare arrays(it checks two arrays have the same element in the same order
    println(numbers.contentEquals(words))

    //To shuffle elements in the array
    words.shuffle()

//    type 3 to initialise an Array
    val squares =Array(5){i -> i*i}
    val size = squares.size
    println(size)
    if(squares.isEmpty()){
        println("Array is empty")
    }else{
        println("Array is not empty")
    }

//    val matrix: Array<Array<Int>> = arrayOf(1,2,3, arrayOf(4,5,6, arrayOf(7,8,9)))

}
//fun main(args:Array<String>){
//    var arr1= arrayOf(1,10,4,6,15)
//    println(arr1.lastIndex)
//    println(arr1.indexOf(100))
//    println(arr1.isEmpty())
//    println(arr1.size)
//    println(arr1[2])
//    println(arr1.get(2))
//    println(arr1.set(4,10))
//    println(arr1[4])
//    println(arr1.contains(12))
//    println(arr1.first())
//    println(arr1.last())
//    println(arr1.reversed())
//    println(arr1.sum())
//    println(arr1.average())
//    println(arr1.sorted())
//    println(arr1)
//    println(arr1.minOrNull())