
fun main(args: Array<String>) {


//Дано натуральное число n.
// Выяснить, можно ли представить его в виде произведения трех последовательных натуральных чисел.
println("Введите число n:")
val n = readln().toInt()
println("Введите 1-е последовательное число:")
val a = readln().toInt()
println("Введите 2-е последовательное число:")
val b = readln().toInt()
println("Введите 3-е последовательное число:")
val  c  = readln().toInt()
if (n < 6) println("Число должно быть 6 или больше")
mul(a, b, c)
sms(a, b, c,n)
println(sms(a, b, c, n))


}

fun mul(a: Int, b: Int, c:Int): Int = a * b * c

fun  sms(a: Int, b: Int, c:Int, n:Int){
    if (mul(a, b, c)>n) {
        println("Что-то тут не так")
    }
    if (mul(a, b, c)<n){
        println("Что-то тут не так")
    }
    else if(mul(a, b, c)==n) {
        println("$n = ${mul(a, b, c)} ПОБЕДА!!!")
    }
}