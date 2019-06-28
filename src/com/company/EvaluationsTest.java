package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Wes Lanning
 * @version 2019-06-28
 */
class EvaluationsTest {
    private Evaluations eval;
    private int randomNum;

    @BeforeEach
    void setUp() {
        eval = new Evaluations();
        randomNum = eval.createRandomNumber();
    }

    @RepeatedTest(100)
    void createRandomNumber() {
        assertTrue(randomNum >= 0 && randomNum < 100, "Random number should be greater than 0, less than 100");
    }

    @Test
    void reallySmallNumber() {
        assertTrue(eval.reallySmallNumber(14), "14 should be a really small number");
        assertFalse(eval.reallySmallNumber(15), "15 should be a small number");
    }

    @Test
    void smallNumber() {
        assertTrue(eval.smallNumber(15), "15 should be a small number");
        assertTrue(eval.smallNumber(39), "39 should be a small number");
        assertFalse(eval.smallNumber(40), "40 should be a medium number");
        assertFalse(eval.smallNumber(14), "14 should be a really small number");
    }

    @Test
    void reallyAverageNumber() {
        assertTrue(eval.reallyAverageNumber(50), "50 should be an average number");
        assertFalse(eval.reallyAverageNumber(49), "49 should be a medium number");
        assertFalse(eval.reallyAverageNumber(51), "51 should be a medium number");
    }

    @Test
    void mediumNumber() {
        assertTrue(eval.mediumNumber(40), "40 should be a medium number");
        assertTrue(eval.mediumNumber(70), "70 should be a medium number");
        assertFalse(eval.mediumNumber(39), "39 should be a small number");
        assertFalse(eval.mediumNumber(71), "71 should be a big number");
        assertFalse(eval.mediumNumber(50), "50 should be a really average number");
    }

    @Test
    void bigNumber() {
        assertTrue(eval.bigNumber(71), "71 should be a big number");
        assertTrue(eval.bigNumber(90), "90 should be a big number");
        assertTrue(eval.bigNumber(91), "91 should be a really big number");
        assertFalse(eval.bigNumber(70), "70 should be a medium number");
    }

    @Test
    void reallyBigNumber() {
        assertTrue(eval.reallyBigNumber(91), "91 should be a really big number");
        assertFalse(eval.reallyBigNumber(90), "90 should be a big number");
    }

    @Test
    void print1to30() {
        String result = eval.print1to30();
        assertFalse(result.contains("0"), "0 should not be in the result");
        assertFalse(result.contains("31"), "31 should not be in the result");

        for (int i = 1; i <= 30; ++i) {
            assertTrue(result.contains(Integer.toString(i)), (String.format("Result should contain %d", i)));
        }
    }

    @Test
    void print20to0() {
        String result = eval.print20to0();
        assertFalse(result.contains("21"), "21 should not be in the result");
        assertFalse(result.contains("-1"), "-1 should not be in the result");

        for (int i = 20; i >= 0; --i) {
            assertTrue(result.contains(Integer.toString(i)), (String.format("Result should contain %d", i)));
        }
    }

    @Test
    void compareNumber() {
        assertEquals(NumberSize.REALLY_SMALL, eval.compareNumber(1), "1 should be a really small number");
        assertEquals(NumberSize.REALLY_SMALL, eval.compareNumber(14), "14 should be a really small number");
        assertEquals(NumberSize.SMALL, eval.compareNumber(15), "15 should be a small number");
        assertEquals(NumberSize.SMALL, eval.compareNumber(39), "39 should be a small number");
        assertEquals(NumberSize.MEDIUM, eval.compareNumber(40), "40 should be a medium number");
        assertEquals(NumberSize.REALLY_AVERAGE, eval.compareNumber(50), "50 should be a really average number");
        assertEquals(NumberSize.MEDIUM, eval.compareNumber(70), "71 should be a medium number");
        assertEquals(NumberSize.BIG, eval.compareNumber(71), "71 should be a big number");
        assertEquals(NumberSize.BIG, eval.compareNumber(90), "90 should be a big number");
        assertEquals(NumberSize.REALLY_BIG, eval.compareNumber(91), "91 should be a really big number");
    }
}