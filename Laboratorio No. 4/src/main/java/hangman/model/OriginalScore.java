package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */

public class OriginalScore implements GameScore {
    private int score=100;
    private final int incorrect = 10;

    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 10 puntos
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     */
    @Override
    public int calculateScore (int correctCount, int incorrectCount){
        while(score >0 && incorrectCount>0){
            score -= incorrect;
            incorrectCount--;
        }
        return score;
    }

    public void restart() {
        score = 100;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
