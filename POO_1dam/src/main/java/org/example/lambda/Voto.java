package org.example.lambda;

@FunctionalInterface
interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}

public class Voto {
    public static void main(String[] args) {
        // Lambda que ignora el nombre y valida la edad
        VerificadorVoto validador = (nombre, edad) -> edad >= 18;

        String persona = "Maria";
        int edadPersona = 14;

        System.out.println("Probando " + persona + " con " + edadPersona + " años... "
                + validador.puedeVotar(persona, edadPersona));
    }
}
