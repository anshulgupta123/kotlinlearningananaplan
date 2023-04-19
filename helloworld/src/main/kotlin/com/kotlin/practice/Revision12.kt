package com.kotlin.practice

fun main(args: Array<String>) {
    val list = listOf<String>("anna", "noon", "hdhj")
    for (s in list) {
        if (checkPalindrome(s)) {
            println("$s is palindrome")
        }
    }

}

fun checkPalindrome(str: String): Boolean {
    var i: Int = 0
    var j: Int = str.length - 1
    while (i <= j) {
        if (str.get(i) != str.get(j)) {
            return false;
        }
        i++
        j--
    }
    return true;
}

