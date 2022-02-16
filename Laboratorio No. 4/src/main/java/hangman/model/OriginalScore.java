package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */

public class OriginalScore implements GameScore{

    public static final int PUNTAJE_INICIAL = 100;

    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 10 puntos
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     * @throws GameException ,si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        if (correctCount < 0 || incorrectCount < 0) throw new IllegalArgumentException();
        return Math.max(OriginalScore.PUNTAJE_INICIAL - 10*incorrectCount, 0);
    }
}
