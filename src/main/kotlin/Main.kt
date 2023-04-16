import sun.management.Agent

fun main() {
    greetMe("World")
    modulus(111,4)
   var r = addition( 55, 22, 66, 9 )
    println(r)
    intresringfact("yekebedi")
    names("Hello","yekebedi")
    students("Otieno","Akirachix")
    concat("Wycliffe", "Myles")
    println(numbers(139,5))
    var p=numbers(45,2)
    println(p)
    println(sum(55,66,7,88))
    var y= sum(100,60,300,28)
    println(y)
    sentence("practice")
    sentence("Grit and persevearnce")





}
fun greetMe(name: String){
    println("Hello "+name )
}

fun modulus(num1: Int, num2: Int){
    var modulus = (num1 % num2)
    println(modulus)

}

fun addition(num1: Int,num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum


}
fun intresringfact(name: String){
    println("I am energetic and positive" +name )
}


                                 //FUNCTIONS & OPERATORS
fun names(word: String, name: String){
    println("$word $name")

}
fun students(student: String, school:String){
    println("$student" +" "+ "$school")
}

fun concat(friend: String, friend1: String){
    println("Both $friend and  $friend1 are my friends")
}
fun numbers(num:Int, num1:Int): Int{
    var remainder =num % num1
    return remainder
}
fun sum(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var numb= num1 + num2 + num3 + num4
    return numb
}
fun sentence(words:String){
    var sent= "$words"+" " + "makes perfect"
    var send = "$words"+" " + "makes perfect"
    println(sent)
}

