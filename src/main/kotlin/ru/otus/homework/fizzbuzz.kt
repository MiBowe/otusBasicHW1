package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val numbers = Array<String>(n) {"$it"}
    for (i in 0..n-1) {
        numbers[i] = when {
            (i % 3 == 0 && i % 5 == 0) || (i == 0) -> "FizzBuzz"
            (i % 3 == 0) -> "Fizz"
            (i % 5 == 0) -> "Buzz"
            else -> "$i"
        }
    }
    return numbers
}