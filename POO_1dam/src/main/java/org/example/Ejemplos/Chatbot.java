package org.example.Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usamos un Map para almacenar las respuestas predefinidas
        Map<String, String> respuestas = new HashMap<>();
        respuestas.put("hola", "Hola, ¿En qué te puedo ayudar?");
        respuestas.put("¿cómo estás?", "¡Estoy listo para ayudarte!");
        respuestas.put("adiós", "¡Hasta luego!");
        respuestas.put("gracias", "¡De nada! Que tengas un buen día.");

        System.out.println("Chatbot: Bienvenido! Escribe <salir> cuando quieras acabar la conversación....");

        while (true) {
            System.out.print("Tú: ");
            String entrada = sc.nextLine().toLowerCase().trim();

            if (entrada.equals("salir")) {
                System.out.println("Chatbot: ¡Adiós!");
                break;
            }

            // Buscamos la respuesta en el mapa
            if (respuestas.containsKey(entrada)) {
                System.out.println("Chatbot: " + respuestas.get(entrada));
            } else {
                System.out.println("Chatbot: No te entiendo :(");
            }
        }
    }
}
