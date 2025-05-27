var full_name = "Dimitri Dgebuadze"
fun main(){

//    println(full_name.uppercase())
//
//    println(full_name.lowercase())
//
//    println(full_name.reversed())
//
//    println(full_name[3].toString() + full_name[11].toString())
//
//    println(check(3) + check(11))
//
//    println(full_name.replace(' ', '_'))
//
//    fun new_line(){
//        for (i in full_name){
//            if (i != ' ')
//            {
//                println(i)
//            }else{
//                continue
//            }
//            }
//    }
//    new_line()
//
//    println(full_name.take(9))
//
//    println(full_name.slice(0..8))
//
//    fun change(txt: String){
//        for (i in txt){
//            when(i){
//                'a' -> println('i')
//                'i' -> println('a')
//                'o' -> println('u')
//                'e' -> println('i')
//                else -> println(i)
//            }
//
//        }
//    }
//    change(full_name)
//
//    repeat(10){
//        println(full_name)
//    }
//
//    val lst = full_name.toList()
//    println(lst)
//
//    println(full_name.split(' '))
//
//    println(full_name.take(6) + full_name.takeLast(6))

//    fun print_string(txt: String): String{
//        print("Enter text: ")
//        val txt = readLine()
//        if (txt.toString() in full_name){
//            return println("Contains").toString()
//        }else{
//            return println("Doesn't contain").toString()
//        }
//    }
//    print_string(full_name)
//
//    fun return_string(txt: String): String{
//        print("Enter text: ")
//        val txt = readLine()
//        if (txt.toString() in full_name){
//            return "Contains"
//        }else{
//            return "Doesn't contain"
//        }
//    }
//    return_string(full_name)
//
//    fun retandprint_string(txt: String): String{
//        print("Enter text: ")
//        val txt = readLine()
//        var res = ""
//        if (txt.toString() in full_name){
//            res = "Contains"
//        }else{
//            res = "Doesn't contain"
//        }
//        println(res)
//        return res
//    }
//    retandprint_string(full_name)

//    fun sum () :Int {
//        println("Enter first number: ")
//        val a = readLine()?.toIntOrNull() ?:0
//        println("Enter second number: ")
//        val b = readLine()?.toIntOrNull() ?:0
//
//        val res = a + b
//        println(res)
//        return res
//    }

//    sum()

//    // ეს ვარიანტი null-ს 0-ად იღებს
//    fun calc() : Int{
//        println("Enter first number: ")
//        val a = readLine()?.toIntOrNull() ?:0
//        println("Enter second number: ")
//        val b = readLine()?.toIntOrNull() ?:0
//        println("Enter operation: ")
//        val op = readLine()
//        var res = 0
//        when(op){
//            "+" -> res = a+b
//            "-" -> res = a-b
//            "*" -> res = a*b
//            "/" -> res = a/b
//        }
//    println(res)
//    return res
//    }
//    calc()


//        fun calc2() : Int{
//
//        var a: Int? = null
//
//        while( a == null){
//            println("Enter first number: ")
//            val inputA = readLine()?.toIntOrNull()
//            a = inputA
//            if (inputA == null){
//                println("Invalid input, try again: ")
//            }
//        }
//
//            var b: Int? = null
//
//            while( b == null){
//                println("Enter second number: ")
//                val inputB = readLine()?.toIntOrNull()
//                b = inputB
//                if (inputB == null){
//                    println("Invalid input, try again: ")
//                }
//            }
//
//        println("Enter operation: ")
//
//        val op = readLine()
//        var res = 0
//
//        when(op){
//            "+" -> res = a+b
//            "-" -> res = a-b
//            "*" -> res = a*b
//            "/" -> res = a/b
//        }
//    println(res)
//    return res
//    }
//    calc2()

//    // პირველად რიცხვად აღებულია 0
//    fun fib(n: Int){
//        var arr = mutableListOf(0, 1)
//        var nxt = 0
//
//        for (i in 0..n){
//            nxt = arr[i] + arr[i+1]
//            arr.add(nxt)
//        }
//        var res = arr.take(n).sum()
//        println(res)
//
//    }
//    fib(5)

//    fun usg(a: Int, b: Int) : Int{
//        var mcire = 0
//        if(a > b){
//            mcire = b
//        }else{
//            mcire = a
//        }
//    var lst = mutableListOf<Int>()
//        for (i in 1..mcire){
//            if (a % i == 0 && b % i == 0) {
//                lst.add(i)
//            }
//        }
//    println(lst.max())
//    return lst.max()
//    }
//    usg(32, 40)

//    fun usj(a: Int, b: Int) : Int {
//        var didi = 0
//        var list = mutableListOf<Int>()
//        if (a > b) {
//            didi = a
//        } else {
//            didi = b
//        }
//        val namravli = a * b
//        for (i in didi..namravli) {
//            if( i % a == 0 && i % b == 0){
//                list.add(i)
//            }
//        }
//        println(list.min())
//        return list.min()
//    }
//    usj(4, 8)

//    fun checkString(txt: String): String{
//        if (txt.contains("$")){
//            return println("Contains").toString()
//        }else{
//            return println("Doesn't contain").toString()
//        }
//    }
//    checkString("hello$")
//    checkString("hello")

//    fun luwJam(n: Int): Int{
//         if (n < 0) return 0
//    return if (n % 2 == 0)
//        n + luwJam(n - 2)
//    else
//        luwJam(n - 1)
//            }
//
//    println(luwJam(100))

//    fun rev(n: Int): Int{
//        var res = n.toString().reversed().toInt()
//        println(res)
//        return res
//    }
//    rev(10220)

//    fun pal(txt: String): String{
//        var rev = txt.reversed()
//        if (txt == rev){
//            return print("It's a palindrome").toString()
//        }else{
//            return print("It's not a palindrome").toString()
//        }
//    }
//
//    pal("madam")
//
//    pal("hello")
}



fun check(a: Int): String {
    val xmovani = listOf("a", "e", "i", "o", "u", "y")
    if (full_name[a].toString() !in xmovani){
        return full_name[a].toString()
    }else{
        return check(a+1)
    }

}

