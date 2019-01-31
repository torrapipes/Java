package org.lasencinas;

public class ScoreCard {

    // Global variables
    private int STRIKE = 10;
    private int SPARE = 10;
    private int ZERO = 0;
    private String pinsSerie = "-123456789";
    private String scoreCard = "";
    private int scoreTotal = 0;


    // Constructors
    public ScoreCard() {
    }

    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }


    // Getters
    public int getSTRIKE() {
        return this.STRIKE;
    }

    public int getZERO() {
        return this.ZERO;
    }

    public int getSPARE() {
        return this.SPARE;
    }


    //Methods
    public void computeStrike(String strike, int ball) {

            scoreTotal += this.getSTRIKE();
            scoreTotal += this.computePins(strike.charAt(ball + 1));
            scoreTotal += this.computePins(strike.charAt(ball + 2));

    }


    public void computeSpare(String spare, int ball) {
        try {
            if (spare.charAt(ball) == '/') {
                scoreTotal += this.getSPARE() - this.computePins(spare.charAt(ball - 1));
            } else {
                scoreTotal += this.getZERO();
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(0);
        }
    }


    public int computePins(char pins) {
        return this.pinsSerie.indexOf(pins);
    }


    public int computeScoreCard(String scoreCard) {
        for (int ball = 0; ball < scoreCard.length(); ball++) {
            if (scoreCard.charAt(ball) == 'X') {
                computeStrike(scoreCard, ball);
            }
            else if(scoreCard.charAt(ball) == '/') {
                computeSpare(scoreCard, ball);
            }
            else
             {
                scoreTotal += this.computePins(scoreCard.charAt(ball));
            }
        }
        return scoreTotal;
    }

    // Main Method
    public static void main(String[] args) {
    }
}
