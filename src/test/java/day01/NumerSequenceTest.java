package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumerSequenceTest {

    NumerSequence ns = new NumerSequence(55, 1, 100);

    @Test
    void testCreate() {
        assertEquals(55, ns.getNumber().size());
        NumerSequence nsTwo = new NumerSequence(4, 5);
        assertEquals(0, nsTwo.getNumber().size());
        NumerSequence nsThree = new NumerSequence(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(5, nsThree.getNumber().size());
    }

    @Test
    void testCloseToAvarage() {
        for (int number : ns.closeAvarage(20)) {
            assertTrue(Math.abs(number - 50) <= 50);
        }
    }
}
