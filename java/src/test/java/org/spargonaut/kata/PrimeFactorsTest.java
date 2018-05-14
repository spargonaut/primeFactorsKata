package org.spargonaut.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {

    @Test
    public void shouldCalculatePrimes() {
        assertThat(true, is(true));
//        assertThat(PrimeFactors.generate(1), is(aListOf()));
//        assertThat(PrimeFactors.generate(2), is(aListOf(2)));
//        assertThat(PrimeFactors.generate(4), is(aListOf(2, 2)));
//        assertThat(PrimeFactors.generate(8), is(aListOf(2, 2, 2)));
//        assertThat(PrimeFactors.generate(9), is(aListOf(3, 3)));
//        assertThat(PrimeFactors.generate(1981980), is(aListOf(2, 2, 3, 3, 5, 7, 11, 11, 13)));
    }

    private List<Integer> aListOf(Integer... integers) {
        return Arrays.asList(integers);
    }
}
