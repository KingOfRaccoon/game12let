fun main()
{
    var isWork = true
    var a = 0
    var b = 0
    while (isWork == true) {
        a = readLine().toString().toInt()
        var act = readLine().toString()
        if (act == "+") {
            b = readLine().toString().toInt()
            println(a + b)
        } else if (act == "-") {
            b = readLine().toString().toInt()
            println(a - b)

        } else if (act == "*") {
            b = readLine().toString().toInt()
            println(a * b)

        } else if (act == "/") {
            b = readLine().toString().toInt()
            println(a / b)

        }
    }}