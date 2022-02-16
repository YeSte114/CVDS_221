package hangman;

import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {

//    Number	Clase de Equivalencia de OriginalScore		Resultado	Lineas de Frontera
//      1	    correctCount>=0 && incorrectCount>=0		Correcto	correctCount<0
//      2	    score>=0		                            Correcto	correctCount=0
//      3	    correctCount<0		                        Incorrecto	incorrectCount<0
//      4	    incorrectCount<0		                    Incorrecto	incorrectCount=0
//      5	    score<0		                                Incorrecto	incorrectCount>correctCount
//
//
//    Number	Clase de Equivalencia de BonusScore		    Resultado	Lineas de Frontera
//      1	    correctCount>=0 && incorrectCount>=0		Correcto	correctCount<0
//      2	    score>=0		                            Correcto	correctCount=0
//      3	    correctCount<0		                        Incorrecto	incorrectCount<0
//      4	    incorrectCount<0		                    Incorrecto	incorrectCount=0
//      5	    score<0		                                Incorrecto	incorrectCount>10
//
//
//    Number	Clase de Equivalencia de PowerBonusScore	Resultado	Lineas de Frontera
//      1	    correctCount>=0 && incorrectCount>=0		Correcto	correctCount<0
//      2	    score>=0 && score<=500		                Correcto	correctCount=0
//      3	    correctCount<0		                        Incorrecto	incorrectCount<0
//      4	    incorrectCount<0		                    Incorrecto	incorrectCount=0
//      5	    score<0		                                Incorrecto	score>500
//      6	    score>500		                            Incorrecto	score=0

    private GameScore original = new OriginalScore();
    private GameScore bonus= new BonusScore();
    private GameScore power = new PowerScore();

    @Test
    public void validarCorrectoOrigenScore() {
        int score = original.calculateScore(2, 2);
        Assert.assertEquals(score, 80);
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

    //BonusScore

    @Test
    public void validarIgualCeroBonusScore() {
        int score = bonus.calculateScore(0, 0);
        Assert.assertEquals(score, 0);
    }


    @Test
    public void validarIgualDiezBonusScore() {
        int score = bonus.calculateScore(1, 0);
        Assert.assertEquals(score, 10);
    }

    @Test
    public void validarIgualCincoBonusScore() {
        int score = bonus.calculateScore(1, 1);
        Assert.assertEquals(score, 5);
    }

    //PowerScore

    @Test
    public void validarIgual5PowerScore() {
        int score = power.calculateScore(1, 0);
        Assert.assertEquals(score, 5);
    }

    @Test
    public void validarPuntaje0PowerScore(){
        int resultado= power.calculateScore(1,2);
        Assert.assertEquals(0,resultado);
    }

    @Test
    public void validarIgual500PowerScore() {
        int score = power.calculateScore(4, 0);
        Assert.assertEquals(score, 500);
    }

}
