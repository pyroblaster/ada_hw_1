import kotlin.random.Random

/*
Create a collection of integers

Use Random to fill the collection with 100 random numbers between 1 and 100.

Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10
 */
fun main() {
    val randomValues = List(100) { Random.nextInt(0, 100) }
    println(randomValues)
    loop@for (elements in randomValues) {
        when(elements) {
        in 10..100 -> println(elements)
        else -> break@loop
        }
    }

}