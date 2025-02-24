package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for(i in 0..numbers.size-2){
        for (l in i+1..numbers.size-1){
            if (numbers[i] + numbers[l] == target) {
                return intArrayOf(i,l)
            }
        }
    }
    throw IllegalArgumentException()
}