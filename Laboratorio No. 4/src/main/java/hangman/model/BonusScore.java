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
     * @throws GameException si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        if (correctCount < 0 || incorrectCount < 0) throw new IllegalArgumentException();
        return Math.max(10*correctCount - 5*incorrectCount, 0);
    }
}
