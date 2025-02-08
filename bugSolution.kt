```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filterNot { it % 2 == 0 }
    println(list) // Original list remains unchanged
    println(filteredList) // Filtered list contains only odd numbers
}
```