package PROJETO.exception;

public class UserNotFoundExeception extends RuntimeException {
    public UserNotFoundExeception() {
        super("Usuário não encontrado!");
    }

    public UserNotFoundExeception(String message) {
        super(message);
    }

    public UserNotFoundExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundExeception(Throwable cause) {
        super(cause);
    }
}
