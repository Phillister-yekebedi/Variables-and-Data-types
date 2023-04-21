
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
    str()
    param("Otieno", 22)
    println(lens("Wycliffe"))
    var s = lens("CodeHive bootcamp")
    println(s)
    var m = lens("HopperLab")
    println(m)
    arr(arrayOf(10,14,32,6,43,2,75,8))
    pract(arrayOf("Miriam","Yeke","Rabecca","jebet","Ngugi","Amakove"))
    girls(arrayOf("Ada", "Beth", "Chris", "Diana", "Elsie", "Fiona"))
    sorting(arrayOf("Shadrack", "Primary","College","Training" ))
    rays(arrayOf("Myles", "Kimbo", "Susan", "Wendy"))
    println(arrayOf(names("I am here","but not for long","we all won't make it out alive ")))



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
                                                       //Strings 19/4/2023
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
fun str(){
    val Str = "Akirachix"
    println(Str[1])
    println(Str[3])
    println(Str[4])
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun param(name: String,age:Int){
    println("Hi, my name is ${name} and i am ${age} years old" )

}
//Write a function that takes in a String and returns its length
fun lens(name1:String):Int{
    return name1.length
}

//Write a function that takes in a name and prints out “That’s me!” when your
////name is passed to it, otherwise it prints out “I don’t know who that is”
fun thatMe(names1: String){
    if(names1 == "Sage"){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }

}
//                                                       ARRAYS
fun arr(numArray:Array<Int>){
    println(numArray[3])
    println(numArray[1])
    println(numArray[2])
    println(numArray[4])
}
fun pract(nameArray:Array<String>){
    println(nameArray[4])
    println(nameArray[3])
    println(nameArray[0])
}
fun girls(namesArray: Array<String>){
//    var namesArray= arrayOf("Ada", "Beth", "Chris", "Diana", "Elsie","Fiona")
    println(namesArray.get(4))  //.get is an inbuilt function that gets an element at a certain index.
    namesArray.plus("maureen")
}
fun sorting(school: Array<String>) {
    for (n in school){
        println(n)
    }
}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun rays( word:Array<String>){
    println(word.contentToString())

}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(name1:String,names2: String,name3: String):String{
    var person = arrayOf(name1, names2, name3)
    return person.contentToString()






}











