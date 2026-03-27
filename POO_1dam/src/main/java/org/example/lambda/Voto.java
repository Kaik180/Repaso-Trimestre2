package org.example.lambda;

public class Voto {
    static void main() {

        VerificadorVoto validador = (nombre, edad) -> edad >= 18;

        String persona = "Maria";
        int edadPersona = 14;

        System.out.println("Probando " + persona + " con " + edadPersona + " años... "
                + validador.puedeVotar(persona, edadPersona));
    }
}
