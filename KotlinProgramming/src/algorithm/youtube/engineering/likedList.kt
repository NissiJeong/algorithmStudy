package algorithm.youtube.engineering

class Node(var data: Int){
    var next: Node? = null

    fun append(d:Int){
        var end: Node = Node(d)
        var n: Node = this
        while(n.next != null){
            n = n.next!!
        }
        n.next = end
    }

    fun delete(d: Int){
        var n: Node = this
        while(n.next != null){
            if(n.next!!.data == d){
                n.next = n.next!!.next!!
            }else{
                n = n.next!!
            }
        }
    }

    fun retrieve(){
        var n: Node = this
        while(n.next != null){
            print("${n.data} -> ")
            n = n.next!!
        }
        println(n.data)
    }
}

fun main() {
    var head: Node = Node(1)
    head.append(2)
    head.append(3)
    head.append(4)
    head.append(5)
    head.retrieve()
    head.delete(2)
    head.delete(3)
    head.retrieve()
}