fun main(args: Array<String>) {
    println(" ")
    print("Enter the number : ")
    val num= readLine()!!.toInt()
    val sum = sumOfDigits(num)
    println("Sum of the digits : $sum")
}
fun sumOfDigits(num: Int) : Int{
    if (num != 0) {
        return num%10 + sumOfDigits(num/10)
    }else{
        return num
    }
}