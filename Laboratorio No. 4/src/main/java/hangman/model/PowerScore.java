package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */
public class PowerScore implements GameScore{

    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 8 puntos
     * y bonifica la iésima letra correcta con 5^i
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     * @throws  IllegalArgumentException si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        if (correctCount < 0 || incorrectCount < 0) throw new IllegalArgumentException();
        int potencia = 0;
        for (int i=1; i<= correctCount; i++)
            potencia += (int)Math.pow(5, i);
        potencia -= 8*incorrectCount;
        return (potencia <= 0) ? 0 : Math.min(potencia, 500);
    }
}

