package hangman.model;

/**
 * Esta clase reliza un calculo para hallar el puntaje
 * @author Yeison Barreto
 * @author Laura García
 */
public class PowerScore implements GameScore{
    private int score=0;
    private int correct=5;
    private int incorrect=8;
    /**
     *Calcula el puntaje del juego penalizando las letras incorrectas con 8 puntos
     * y bonifica la iésima letra correcta con 5^i
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     * @throws  GameException si correctCount, incorrectCount o el puntaje final es menor a cero
     */
    public  int calculateScore (int correctCount, int incorrectCount ){


        if(score+Math.pow(5,correctCount)-(incorrectCount*incorrect)<0){
            score= 0;
        }else if(score+Math.pow(5,correctCount)-(incorrectCount*incorrect)<500) {
            score=  (int) (score+Math.pow(5,correctCount)-(incorrectCount*incorrect));
        }else if(score+Math.pow(5,correctCount)-(incorrectCount*incorrect)>500){
            return 500;
        }
        return score;
    }
}

