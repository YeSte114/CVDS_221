package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */

public class OriginalScore implements GameScore{
    private int score=100;
    private int incorrect=10;

    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 10 puntos
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     * @throws GameException ,si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    public int calculateScore (int correctCount, int incorrectCount )  {
        while(score>0 && incorrectCount>0){
            score-=incorrectCount*incorrect;
        }
        return score;
    }
}
