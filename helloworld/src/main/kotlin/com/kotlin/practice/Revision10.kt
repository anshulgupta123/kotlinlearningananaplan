package com.kotlin.practice

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 5, 5, 4, 4, 4, 4, 3, 2, 1)
    val map = mutableMapOf<Int, Int>()

    for (num in numbers) {
        if (map.containsKey(num)) {
            var value: Int? = map.get(num)
            if (value != null) {
                value++
                map.put(num, value)
            }
        } else {
            map.put(num, 1)
        }
    }
    for ((key, value) in map) {
        println("$key  $value")
    }
}