class Person {
    var name: String = "Po"
    val age:Int=22
    fun displayInfo(){
        println("My name is $name and my age is $age")
    }
    fun message(){
        println("Good Morning, sunshine!")
    }

}
fun main(){
    val person = Person()
    person.displayInfo()
    person.message()
}


// Use of $
//fun main(){
//     val a=10
//     val b=20
//     val result = "Sum of the $a and $b is ${a+b}"
//     println(result)