package fr.maxime.exception;

public class NotFoundException extends RuntimeException {
    public String message;
    public NotFoundException(String message) {
        this.message = message;
    }
}
