fun sumOfDigits(num: Int) {
    if (num != 0) {
        return num%10 + sumOfDigits(num/10)
    }
}
fun main() {
     println("Enter the number : ")
     var num= readLine()!!.toInt()
     val sum = sumOfDigits(num)
     println("Sum of the digits : $sum")
    }
