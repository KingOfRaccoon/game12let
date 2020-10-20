fun main() {
    println("начать - 1  не начинать - 0")
    var d = readLine()!!.toInt()
    var f = 0
    while (d == 1) {
        println("1 = +")
        println("2 = -")
        println("3 = *")
        println("4 = /")
        var i = readLine()!!.toInt()
        if (i <= 4){
            println("2 числа")
            var n = readLine()!!.toInt()
            var v = readLine()!!.toInt()
            if (i == 1){
                f = n + v
                println("Ответ: " + f)}
            else if (i == 2){
                f = n - v
                println("Ответ: " + f)}
            else if (i == 3) {
                f = n * v
                println("Ответ: " + f)
            }
            else if (i == 4) {
                f = n / v
                println("Ответ: " + f)
            }
            else{
                println("иди работай ")
                break}
            println("1 = продолжить 2 = закончить")
            var t = readLine()!!.toInt()
            if (t == 1)
                continue
            else
                break


        }
        }


    }




