package org.example;

public class FraudeExcepcion extends RuntimeException {
    public FraudeExcepcion(String message) {
        super(message);
    }
}
