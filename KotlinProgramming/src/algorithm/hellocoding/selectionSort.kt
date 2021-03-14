package algorithm.hellocoding

fun selectionSort(){
    val arr = arrayOf(10,9,8,7,6,5,4,3,2,1)

    for(i in arr.indices){
        var min = i

        for(j in i+1 until arr.size){
            if(arr[min] > arr[j]){
                min = j
            }
        }

        swap(arr, i, min)
        println(arr.toList())
    }

    println(arr.toList())
}

fun swap(arr:Array<Int>, ordinary: Int, change: Int){
    val temp = arr[ordinary]
    arr[ordinary] = arr[change]
    arr[change] = temp
}

fun main() {
    selectionSort()
}