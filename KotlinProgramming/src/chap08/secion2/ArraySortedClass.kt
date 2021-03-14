package chap08.secion2

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 30.00),
            Product("Keyboard", 150.00),
            Product("Monitor", 500.00),
            Product("Tablet", 900.00),
    )

    //products.sortBy { it.price }
    //products.forEach { println(it) }

    products.sortWith(Comparator<Product> { p1, p2 ->
        when {
            p1.price > p2.price -> 1
            p1.price == p2.price -> 0
            else -> -1
        }
    })

    products.forEach { println(it) }
    println()

    products.sortWith(compareBy({it.name},{it.price}))
    products.forEach { println(it) }
    println()
}