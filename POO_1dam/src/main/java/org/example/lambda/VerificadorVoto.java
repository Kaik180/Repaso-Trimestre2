package org.example.lambda;

@FunctionalInterface
interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
