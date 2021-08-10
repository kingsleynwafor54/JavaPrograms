package GradeException;

public class GradeIndexException extends Exception {
    public GradeIndexException() {
    }

    public GradeIndexException(String message) {
        super(message);
    }

    public GradeIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeIndexException(Throwable cause) {
        super(cause);
    }

    public GradeIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
