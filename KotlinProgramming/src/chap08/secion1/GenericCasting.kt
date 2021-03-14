package chap08.secion1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1 : Parent= Parent()
    val obj2 : Child= Child()

    val obj3 :Cup<Parent> = Cup<Parent>()
    val obj4 :Cup<Child > = Cup<Child>()
}