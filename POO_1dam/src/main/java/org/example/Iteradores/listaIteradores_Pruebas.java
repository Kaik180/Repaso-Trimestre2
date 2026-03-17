package org.example.Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class listaIteradores_Pruebas {
    static void main() {
        ArrayList<String> ias = new ArrayList<>(Arrays.asList("ChatGPT", "Gemini", "Copilot", "Deepseek", "Canva"));

        ListIterator<String> it = ias.listIterator();
        while (it.hasNext()){
            System.out.println(it.nextIndex());
            String ia = it.next();

            System.out.println(it.nextIndex());

            System.out.println(ia);
        }
        while (it.hasPrevious()){
            System.out.println(it.previousIndex());
            String ia = it.next();
            if (ia.equals("Deepseek")){
                it.add("Claude");
            }
            System.out.println(it.previousIndex());
            System.out.println(ia);
        }
    }
}
