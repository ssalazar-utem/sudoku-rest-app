package cl.utem.inf.sudoku.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException() {
        super("Ha ocurrido un error de validación");
    }

    public ValidationException(String message) {
        super(message);
    }

}
