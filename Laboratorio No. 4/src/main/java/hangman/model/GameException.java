package hangman.model;

public class GameException extends Exception{
    public static final String NumerosNegativos = "Numero negativo";
    public GameException(String message ){
        super( message);
    }
}
