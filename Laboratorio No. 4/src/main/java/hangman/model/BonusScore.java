package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */
public class BonusScore implements GameScore{
    private int score=0;
    private int correct=10;
    private int incorrect=5;
    private int minimo=0;

    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 5 puntos
     * y bonifica las letras correctas con 10
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     */
    @Override
    public int calculateScore (int correctCount, int incorrectCount){
        if(score-(incorrectCount*incorrect)+(correctCount*correct)<0){
            return 0;
        }else  if (score-(incorrectCount*incorrect)+(correctCount*correct)>0)
            return score-(incorrectCount*incorrect)+(correctCount*correct);
        return score;
    }

    public void restart() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
