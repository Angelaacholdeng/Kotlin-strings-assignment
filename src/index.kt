fun main() {
    bus()
    var we= see("wato",)
    println(we)
    var achol =("Deng")
    println(achol)
    see("Achol")
    see("Chol")
    println(nameage("achol",23))

}
fun bus(){
    var school= "Akirachix"
    var  a =school[0]
    var  b =school[2]
    var  c = school[3]
    var new=println("$a$b$c")

}
fun nameage(name:String,age:Int) :String{
    return("Hi,my name is$name,I am $age years old")

}
fun length (String:String) :Int{
    var length=String.length
    return length

}
fun see(name:String) {
    if (name == "Achol") {
        println("That is me")
    } else {
        println("I don't know who that is")
    }
}