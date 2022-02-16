package hangman.model;

import hangman.controller.GameException;

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
     * @throws  GameException si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    public  int calculateScore (int correctCount, int incorrectCount ) throws GameException {

    }
}

