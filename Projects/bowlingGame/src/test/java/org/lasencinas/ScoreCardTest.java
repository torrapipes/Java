package org.lasencinas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ScoreCardTest {

    private ScoreCard scoreCard = null;

    @Before
    public void init() {
        scoreCard = new ScoreCard();
    }


    @Test
    public void computePinsTest() {
        String pins = "-123456789";
        assertEquals(0, scoreCard.computePins('-'));

        for (Integer i = 0; i < pins.length(); i++) {
            pins.charAt(i);
        }
    }


    @Test
    public void computeScoreCardTest1(){
        String twentyPins = "11111111111111111111";
        scoreCard = new ScoreCard(twentyPins);

        assertEquals(20, scoreCard.computeScoreCard(twentyPins));
    }


    @Test
    public void computeScoreCardTest2(){
        String regularPins = "-123456789";
        scoreCard = new ScoreCard((regularPins));

        assertEquals(45, scoreCard.computeScoreCard(regularPins));
    }


    @Test
    public void computeScoreCardTest3() {
        String strikePins = "X1234";
        scoreCard = new ScoreCard(strikePins);

        assertEquals(23, scoreCard.computeScoreCard(strikePins));
    }


    @Test
    public void computeScoreCardTest4() {
        String spare = "1/23";
        scoreCard = new ScoreCard(spare);

        assertEquals(15, scoreCard.computeScoreCard(spare));
    }
}
