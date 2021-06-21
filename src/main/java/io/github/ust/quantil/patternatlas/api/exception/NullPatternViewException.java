package io.github.ust.quantil.patternatlas.api.exception;

public class NullPatternViewException extends RuntimeException {

    public NullPatternViewException() {
        super("PatternView is null");
    }

    public NullPatternViewException(String message) {
        super(message);
    }
}