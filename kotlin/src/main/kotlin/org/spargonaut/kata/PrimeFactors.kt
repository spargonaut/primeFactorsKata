package org.spargonaut.kata

import java.util.ArrayList

object PrimeFactors {
    fun generate(input: Int): List<Int> {
        var numberToBeFactored = input

        val primeFactors = ArrayList<Int>()

        for (divisor in 2..numberToBeFactored) {
            while (numberToBeFactored % divisor == 0) {
                primeFactors.add(divisor)
                numberToBeFactored /= divisor
            }
        }

        return primeFactors
    }
}
