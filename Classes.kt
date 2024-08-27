//class Subway {
//    var name: String = "Po"
//    val age:Int=22
//    fun displayInfo():String {
//        println("My name is $name and my age is $age")
//    }
//    fun message(){
//        println("Good Morning, sunshine!")
//    }
//
//}
//fun main(){
//    val person = Subway()
//    person.displayInfo()
//    person.message()
//}

//val x = anytask();
//fun anytask(num1: Int, num2 :Int):Int{
//    var a:Int
//    var b:Int
//    val c = num1 +num2
//    println(c)
//    return c
//}
//
//var count = 0
//fun rec(){
//    count++;
//    if(count <= 5){
//        println("hello "+count);
//        rec();
//    }
//}
//fun main(){
//    val result = anytask()
//    println(result)
//    val x = anytask(4,2)
//    val y = rec()
//}

//    class car{
//    var make : String =""
//        var model : String = ""
//        var year : Int = 0
//        fun getInfo(){
//        return "$make $model, year $year"
//    }
//}
//class Car1 {
//    var make: String = ""
//    var maodel : String =""
//}

//making a class and create two diff objects with diff parameters for both objects
class data{

    var name :String=""
    var age: Int=0
    var reg_no:String=""

    fun info(name :String, uid:String, age:Int){
        this.name = name
        this.age=age
        this.reg_no=uid

    }
    fun displayInfo(){
        println("name of student is "+name+"\n"+"age of student is "+age+"\n"+"UID of student is "+reg_no)
    }

}

fun main(){

    var myData =data()
    myData.info("Sridha","18805",20)

    myData.displayInfo()
    println()
    myData.info("Agastya","17252",19)
    myData.displayInfo()


}