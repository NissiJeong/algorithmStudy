package algorithm.hellocoding

fun countdown(i: Int){
    print(i)
    if(i<=1){
        return
    } else{
        countdown(i-1)
    }
}

fun factorial(i: Int): Int{
    return if(i==1)
        1
    else{
        i * factorial(i-1)
    }
}

fun arrPlus(arr: Array<Int>): Int{
    return if(arr.isEmpty()){
        0
    }else{
        arr[arr.size-1] + arrPlus(arr.copyOfRange(0,arr.size-1))
    }
}

fun main() {
    countdown(10)
    println()
    println(factorial(5))

    println(arrPlus(arrayOf(1,2,3,4,5)))
}