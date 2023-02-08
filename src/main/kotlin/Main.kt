fun main() {
    greetMe("Yekebedi")
    modulus(111,4)
   var r = addition( 55, 22, 66, 9 )
    println(r)
    intresringfact("yekebedi")


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
    println("i am energetic and positive" +name )
}

