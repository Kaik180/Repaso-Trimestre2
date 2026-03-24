package org.example.Ejemplos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilasYcolas {
    public static void main(String[] args) {
        // PILA (Stack): LIFO (Último en entrar, primero en salir)
        Stack<String> pilaRevision = new Stack<>();
        pilaRevision.push("Libro A");
        pilaRevision.push("Libro B");
        System.out.println("Revisando ahora: " + pilaRevision.pop()); // Saca Libro B

        // COLA (Queue): FIFO (Primero en entrar, primero en salir)
        Queue<String> filaClientes = new LinkedList<>(); // LinkedList implementa Queue
        filaClientes.offer("Juan");
        filaClientes.offer("Maria");
        System.out.println("Atendiendo a: " + filaClientes.poll()); // Sale Juan
    }
}
