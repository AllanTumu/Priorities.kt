/*
Operation rules(Priority rules)
Once performing a calculation, the program excecutes according to priorities e.g
This is the order of priorities
1. Brackets()
2. Power ^
3. Times(*) and divide (/)
4. Add(+), Subtraction(-)
5. Equals(=)
 */
fun main (args:Array<String>){
    println("-------------Priority rules in basic calculations-------------------------")
    println("input your 1s digit")
    var x:Float = readLine()!!.toFloat()

    println("Enter your 2nd value")
    var y:Float = readLine()!!.toFloat()

    println("Enter your 3rd value")
    var z = readLine()!!.toFloat()

    var sum:Float?
    sum = (x+y+z)*10-3
    /*This will 1st calculate what is in the brackets
    then multiply by 10 and subtract by 3*/
    
    println("$sum is your output")
}

