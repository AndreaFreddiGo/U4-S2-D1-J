package es2.exceptions;

public class NumberEqualToZeroException extends Exception {
    public NumberEqualToZeroException() {
        super("Il numero inserito non può essere uguale a 0");
    }
}
