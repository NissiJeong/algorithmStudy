package chap09.section1

fun main() {
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong","Dooly","Chelsu")
    //mutableList[mutableList.size-1] = "eunjin"
    mutableList.add("eunjin")

    println(mutableList)

    var lista = listOf<String>("1","2","3","4")

    var mutablea = lista.toMutableList()

    mutablea.add("3")
    mutablea.remove("1")
}