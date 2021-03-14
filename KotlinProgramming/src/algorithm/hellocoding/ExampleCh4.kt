package algorithm.hellocoding

fun sum(arr:List<Int>): Int{
    return if(arr.isEmpty()) 0
    else arr[0] + sum(arr.subList(1,arr.size))
}

fun count(arr: IntArray): Int{
    if(arr.isEmpty()) return 0
    return 1 + count(arr.copyOfRange(1,arr.size))
}

fun findMax(list:List<Int>): Int{
    if(list.size == 2) return if(list[0] > list[1]) list[0] else return list[1]
    var subMax = findMax(list.subList(1,list.size))
    return if(list[0]>subMax) list[0] else subMax
}

fun binarySearch(arr:IntArray, start: Int = 0, end:Int = arr.size-1, value: Int): Int{
    return if(start > end) -1
    else if(start == end) {
        if(arr[start] == value) start
        else -1
    } else{
        var mid = (start+end) / 2
        when {
            arr[mid] == value -> mid
            arr[mid] < value -> binarySearch(arr,mid+1,end, value)
            else -> binarySearch(arr,start,mid-1,value)
        }
    }
}

fun sum1(x:Int=0, y:Int): Int{
    return x+y
}

fun main() {
    println(sum(listOf<Int>(1,2,3,4,5)))

    println(count(intArrayOf(1,2,3,4,5,6,7)))

    println(findMax(listOf(1,2,3)))

    println(sum1(y=3))
    //println(binarySearch(arr = intArrayOf(1,2,3,4,5,6,7,8,9),value = 9))
    //println(secondSearch(listOf(1,2,3,4,5,6,7,8),8))
}