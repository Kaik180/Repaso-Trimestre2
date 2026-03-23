package org.example.Colecciones;

import java.util.Stack;
import java.util.HashSet;
import java.util.Set;

public class AppInforme {
    public static void main(String[] args) {
        Stack<Informe> pilaInformes = new Stack<>();

        pilaInformes.push(new Informe(101, "Revisión de actas", TipoTarea.ADMINISTRATIVO));
        pilaInformes.push(new Informe(202, "Presupuesto anual", TipoTarea.EMPRESARIAL));
        pilaInformes.push(new Informe(101, "Revisión de actas (copia)", TipoTarea.ADMINISTRATIVO));
        pilaInformes.push(new Informe(303, "Cita médica", TipoTarea.PERSONAL));
        pilaInformes.push(new Informe(202, "Presupuesto anual (copia)", TipoTarea.EMPRESARIAL));

        Set<Informe> tareasUnicas = new HashSet<>(pilaInformes);
        System.out.println(">>> RECUENTO DE TAREAS ÚNICAS: " + tareasUnicas.size());
        System.out.println("--------------------------------------------------");


        System.out.println("Despachando los 5 informes originales:");
        while (!pilaInformes.isEmpty()) {

            System.out.println("- " + pilaInformes.pop());
        }

        System.out.println("\n--- Añadiendo 3 informes nuevos ---");
        pilaInformes.push(new Informe(404, "Auditoría interna", TipoTarea.EMPRESARIAL));
        pilaInformes.push(new Informe(405, "Organizar archivos", TipoTarea.ADMINISTRATIVO));
        pilaInformes.push(new Informe(406, "Comprar billetes", TipoTarea.PERSONAL));

        System.out.println("El próximo informe en la lista de salida es: " + pilaInformes.peek());

        System.out.println("\nNuevo orden de salida:");
        for (int i = pilaInformes.size() - 1; i >= 0; i--) {
            System.out.println((pilaInformes.size() - i) + "º en salir: " + pilaInformes.get(i));
        }
    }
}