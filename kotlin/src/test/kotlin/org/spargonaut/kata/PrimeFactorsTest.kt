package org.spargonaut.kata

import org.junit.Test

import org.junit.Assert.assertEquals

class PrimeFactorsTest {

    @Test
    fun shouldCalculatePrimes() {
        assertEquals(true, true)
        assertEquals(PrimeFactors.generate(1), mutableListOf<Int>())
        assertEquals(PrimeFactors.generate(2), mutableListOf(2))
        assertEquals(PrimeFactors.generate(4), mutableListOf(2, 2))
        assertEquals(PrimeFactors.generate(8), mutableListOf(2, 2, 2))
        assertEquals(PrimeFactors.generate(9), mutableListOf(3, 3))
        assertEquals(PrimeFactors.generate(1981980), mutableListOf(2, 2, 3, 3, 5, 7, 11, 11, 13))
    }
}
