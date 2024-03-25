fun main() {
    println(calculate(arrayOf(1,2,3,5,4,6,7,8,9,10)).contentToString())
    volumeOfSphere(4.0)
    println(isPalindrome("madam"))
    println(isPalindrome("mrs"))
    println(isPalindrome("kayak"))
    println(isPalindrome("nancy"))
    stringExclude("Barnie bakes brown bagels and buns")

}
fun stringExclude(sentence:String){
 if ('b' in sentence){
     println(sentence.slice(1..0))
 }

}
fun calculate(values:Array<Int>):Array<Any>{

    return arrayOf(values.sum() , values.count() , values.average() )

}
fun volumeOfSphere(radius:Double){
   val cal1 = (4/3)*(3.14159)*(radius*radius*radius)
    println(cal1)
}
fun isPalindrome(word:String):Boolean{
    return word.reversed()==word
}