package com.company;

/**
 * @author Wes Lanning
 * @version 2019-06-28
 */
public class Evaluations {

    /**
     * Creates a random integer between 0 and 99
     * @return
     */
    public int createRandomNumber()
    {
        return (int) (Math.random() * 100);
    }

    /**
     * Returns true for numbers greater than 70 and less than or equal to 90
     *
     * @param number
     * @return
     */
    public boolean bigNumber(int number)
    {
        // TODO: write implementation and change the return value
        return false;
    }

    /**
     * Returns true if the number is greater than 90
     *
     * @param number
     * @return
     */
    public boolean reallyBigNumber(int number) {
        // TODO: write implementation and change the return value
        return false;
    }

    /**
     * Returns true for numbers greater than or equal to 15 and less than 40
     *
     * @param number
     * @return
     */
    public boolean smallNumber(int number)
    {
        // TODO: write implementation and change the return value
        return false;
    }

    /**
     * Returns true if the number is less than 15
     *
     * @param number
     * @return
     */
    public boolean reallySmallNumber(int number) {
        // TODO: write implementation and change the return value
        return false;
    }

    /**
     * Returns true for numbers greater than or equal to 40, not 50, and less than or equal to 70.
     *
     * @param number
     * @return
     */
    public boolean mediumNumber(int number)
    {
        // TODO: write implementation and change the return value
        return false;
    }

    /**
     * Returns true if the number is equal to 50.
     * @param number
     * @return
     */
    public boolean reallyAverageNumber(int number)
    {
        // TODO: write implementation and change the return value
        return false;
    }

    public String print1to30()
    {
        // TODO: make a for loop that produces a string of the numbers 1 to 30 (be sure to put a line break after each number)
        // then return that string (we will print it somewhere else)
        return "";
    }

    public String print20to0()
    {
        // TODO: make a for loop that produces a string of the numbers 20 down to 0 (be sure to put a line break after each number)
        // then return that string (we will print it somewhere else)
        return "";
    }

    /**
     * Checks to see if the number is small/medium/large/etc
     *
     * @param number - the number to compare for size
     * @return the number size type for the number being compared
     */
    public NumberSize compareNumber(int number)
    {
        // TODO: use if/else if/else statement to determine what type of number this is
        // then return either NumberSize.SMALL, NumberSize.REALLY_SMALL, NumberSize.REALLY_AVERAGE, NumberSize.MEDIUM, NumberSize.BIG or NumberSize.REALLY_BIG
        return NumberSize.NAN;
    }
}

enum NumberSize {
    NAN, // NAN means not a number (we're using this as a default value)
    REALLY_SMALL,
    SMALL,
    REALLY_AVERAGE,
    MEDIUM,
    BIG,
    REALLY_BIG
}