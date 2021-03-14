package algorithm.hellocoding

fun qsort(list: List<Int>): List<Int>{
    if(list.size < 2){
        return list
    }

    val pivot = list[list.size / 2]
    val left = list.filter { it < pivot }
    val right = list.filter { it > pivot }

    return qsort(left) + listOf(pivot) + qsort(right)
}

fun quickSortArr(array: IntArray, left:Int = 0, right:Int = array.size-1){
    var index: Int = arrPartition(array, left, right)

    if(left < index-1){
        quickSortArr(array, left, index-1)
    }
    if(right > index){
        quickSortArr(array, index, right)
    }
}

fun arrPartition(array: IntArray, left:Int, right:Int): Int{
    var start = left
    var end = right
    var pivot = array[(start+end)/2]

    while(start <= end){
        while (array[start]<pivot){
            start++
        }

        while(array[end]>pivot){
            end--
        }

        if(start<=end){
            val temp = array[end]
            array[end] = array[start]
            array[start] = temp
            start++
            end--
        }
    }
    return start
}

// 제자리 정렬을 사용하여 메모리를 좀 더 효율적으로 사용
fun qsortArr(array: IntArray, left:Int = 0, right: Int = array.size-1){

    val index = partition(array, left, right) // 두번째방의 첫번째 인덱스를 반환
    if(left < index - 1){ // 첫번째 방의 사이즈가 한개보다 클 경우 첫번째 방으로 다시 재귀 호출
        qsortArr(array, left, index-1) // 원배열, 첫시작 인덱스, 첫번째 방 마지막 인덱스
    }
    if(index < right){ // 두번째 방의 사이즈가 한개보다 클 경우 두번째 방으로 재귀 호출
        qsortArr(array, index, right) // 원배열, 두번째 방 첫번째 인덱스, 마지막 인덱스
    }
}

fun qsortArr2(arr: IntArray, left: Int = 0, right:Int = arr.size-1){
    var index = partition2(arr, left, right)
    if(left < index-1){
        qsortArr2(arr,left,index-1)
    }
    if(index<right){
        qsortArr2(arr,index,right)
    }
}

fun partition2(arr: IntArray, left:Int, right:Int): Int{
    var start = left
    var end = right
    val pivot = arr[(start + end) / 2]

    while(start <= end){
        while (arr[start] < pivot){
            start++
        }
        while (arr[end]>pivot){
            end--
        }

        if(start <= end){
            val temp = arr[end]
            arr[end] = arr[start]
            arr[start] = temp
            start++
            end--
        }
    }
    return start
}

fun partition(array:IntArray, start:Int, end:Int): Int{
    var left = start
    var right = end
    val pivot = array[(left + right)/2] // 배열의 중간 값으로 pivot 설정

    while(left <= right){ // 하나씩 이동하면서 만나면 loop 종료

        while (array[left] < pivot){ // start값이 pivot보다 작으면 무시하고 넘어가기, start값이 pivot보다 크면 잠시 멈춰
            left ++
        }

        while (array[right] > pivot){ // end값이 pivot보다 크면 무시하고 넘어가기, end값이 pivot보다 작으면 잠시 멈춰
            right --
        }

        if(left <= right){ // 두 값이 지나치지 않았는지 확인
            val temp = array[left] // 두 방의 값을 swap
            array[left] = array[right]
            array[right] = temp
            left++ //다시 시작하도록 start값 +1
            right-- // end값 -1
        }

    }
    return left // 두번째 방의 첫번째 인덱스 반환
}


fun main() {
    var testList = qsort(listOf<Int>(5,2,3,1,7,6,8,9,4,10))
    testList.forEach { print(" $it") }
    println()
    var testArr = intArrayOf(2,3,1)
    for(i in testArr) print(" $i")
    println()
    qsortArr(testArr)
    for(i in testArr) print(" $i")
    println()
    var testArr2 = intArrayOf(1,6,3,7,8,5,4,9,2)
    qsortArr2(testArr2)
    for(i in testArr2) print(" $i")

    println()
    var testArr3 = intArrayOf(5,3,2,1,6,8,4,9,10)
    quickSortArr(testArr3)
    for(i in testArr3) print(" $i")
}