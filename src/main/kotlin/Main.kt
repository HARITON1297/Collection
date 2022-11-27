
import kotlin.collections.ArrayList

fun main() {
    println("Первое задание: ")
    val num1 : ArrayList<Int> = arrayListOf(2,5,8,1,9,3,4,7,6,10)
    val sortedNum = num1.sorted().toMutableList()
    var exchange : Int = 0
    for (i in sortedNum){
        exchange = sortedNum[0]
    }
    sortedNum[0] = sortedNum[sortedNum.size - 1]
    sortedNum[sortedNum.size - 1] = exchange
    println(sortedNum)

    println("Второе задание: ")
    val num2 :ArrayList<Double> = arrayListOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)
    var avg = num2.average()
    for(i in num2){
      num2[i.toInt() - 1] = avg
    }
    println(num2)
    
}