package hangman.test;

import  org.junit.Assert;
import hangman.model.*;

public class GameScoreTest {
    private GameScore original = new OriginalScore();

    @Test
    public void validarCorrectoOrigenScore() {
        int score = original.calculateScore(1, 1);
        Assert.assertEquals(score, 90);
    }

    @Test
    public void validarIncorrectOrigenScore() {
        int score = original.calculateScore(1, 11);
        Assert.assertEquals(score, -10);
    }

    @Test
    public void validarIgual100OiginalScore() {
        int score = original.calculateScore(1, 0);
        Assert.assertEquals(score, 100);
    }

    @Test
    public void validarIgualCeroOriginalScore() {
        int score = original.calculateScore(1, 10);
        Assert.assertEquals(score, 0);
    }

    @Test
    public void validarIncorrectOrigenScoreNeg() {
        int score = original.calculateScore(-1, -1);
        Assert.assertEquals(score, -10);
    }


    //BonusScore

    @Test
    public void validarIgualCeroBonusScore() {
        int score = original.calculateScore(0, 0);
        Assert.assertEquals(score, 0);
    }

    @Test
    public void validarIgualDiezBonusScore() {
        int score = original.calculateScore(1, 0);
        Assert.assertEquals(score, 10);
    }

    @Test
    public void validarIgualCincoBonusScore() {
        int score = original.calculateScore(1, 0);
        Assert.assertEquals(score, 5);
    }

    @Test
    public void validarIgualInvalidBonusScore() {
        int score = original.calculateScore(1, 3);
        Assert.assertEquals(score, -5);
    }

    //PowerScore

    @Test
    public void validarIgualCeroPowerScore() {
        int score = original.calculateScore(0, 0);
        Assert.assertEquals(score, 0);
    }

    @Test
    public void validarIgualCeroPowerScore() {
        int score = original.calculateScore(0, 0);
        Assert.assertEquals(score, 0);
    }

    @Test
    public void validarIgual500PowerScore() {
        int score = original.calculateScore(14, 0);
        Assert.assertEquals(score, 500);
    }

}