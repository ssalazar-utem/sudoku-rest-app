package cl.utem.inf.sudoku.exceptions;

public class BadProcessException extends RuntimeException {

    public BadProcessException() {
        super("No fue posible procesar su petición");
    }

    public BadProcessException(String message) {
        super(message);
    }

    public BadProcessException(String message, Throwable cause) {
        super(message, cause);
    }
}
