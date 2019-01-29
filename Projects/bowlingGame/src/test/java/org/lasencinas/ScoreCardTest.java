package org.lasencinas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple ScoreCard.
 */
public class ScoreCardTest {

    @Test
    public void computeStrikeTest() {

        ScoreCard scoreCard = new ScoreCard();

        assertEquals((10), ScoreCard.computeStrike("X"));
    }
}
