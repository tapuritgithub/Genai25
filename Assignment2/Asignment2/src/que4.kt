
package Day4

fun main(){
    println(Customer("Tapu"))
    println(Customer(null))
}
fun Customer(name:String?):String{
    val guestName=name?:"Guest"
    return "Good Morning dear $guestName"
}
