fun main(){
    checkNames("Joy","Roy","Pete","Wayne")
    country("harare","mumbai","dodoma","jakarta")
    numbersCheck(32,17,4,213,78,43,90,31,3,73,11,158,62)
println(takeNames("Joy","Pete","Were"))
}
fun checkNames(name1: String, name2:String,name3:String,name4:String){
    var names = arrayOf(name1,name2,name3,name4)
    println(names.contentToString())
}
fun country(city1:String, city2:String, city3:String, city4:String){
    var cities = arrayOf(city1,city2,city3,city4)
    cities.forEach { city -> println(city.capitalize())}
}
fun numbersCheck(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int,num6:Int,num7:Int,num8:Int,num9:Int,num10:Int,num11:Int,num12:Int,num13:Int){
    var numbers = arrayOf(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13)
println(numbers[2]+numbers[5])
    println( numbers.indexOf(num12))
    println(numbers.sortedArray().contentToString())
//numbers.forEach{ z -> println(num3+num6) }
}
fun takeNames(nameA: String,nameB: String,nameC: String):String{
    var naming = arrayOf(nameA,nameB,nameC)
    return naming.contentToString()

}