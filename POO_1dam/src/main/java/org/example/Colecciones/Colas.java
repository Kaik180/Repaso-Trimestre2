package org.example.Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {
    static void main() {
        Deque<String> cola = new LinkedList<>();
        cola.offer("Blessd");
        cola.offer("Yatra");
        cola.offer("Morat");

        System.out.println(cola.poll());
        System.out.println(cola.peek());

        Queue<String> cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Juan");
        cola2.offer("Jorge");
        cola2.offer("Adrian");
        System.out.println(cola2);


    }
}
