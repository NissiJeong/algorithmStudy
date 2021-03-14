package algorithm.youtube.engineering

class LinkedList(){
    lateinit var header: Node
    init {
        header = Node()
    }

    class Node(){
        var data: Int? = null
        var next: Node? = null
    }

    fun append(d:Int){
        var end: Node = Node()
        end.data = d
        var n: Node = header
        while(n.next != null){
            n = n.next!!
        }
        n.next = end
    }

    fun delete(d: Int){
        var n: Node = header
        while(n.next != null){
            if(n.next!!.data == d){
                n.next = n.next!!.next!!
            }else{
                n = n.next!!
            }
        }
    }

    fun retrieve(){
        var n: Node = header.next!!
        while(n.next != null){
            print("${n.data} -> ")
            n = n.next!!
        }
        println(n.data)
    }

    fun removeDups(){
        var n:Node = header
        while(n?.next != null){
            var r :Node = n
            while(r.next != null){
                if(n.data == r.next!!.data){
                    r.next = r.next!!.next
                }else{
                    r = r.next!!
                }
            }
            n = n.next!!
        }
    }
}

fun main() {
    var ll : LinkedList = LinkedList()
    ll.append(2)
    ll.append(1)
    ll.append(2)
    ll.append(3)
    ll.append(4)
    ll.append(4)
    ll.append(5)
    ll.append(5)
    ll.retrieve()

    ll.removeDups()
    ll.retrieve()
}