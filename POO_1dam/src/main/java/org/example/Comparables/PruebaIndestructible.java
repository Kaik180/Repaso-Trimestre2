package org.example.Comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaIndestructible {
    static List<Integer> lista =new ArrayList<>();
    static void main() {


        lista.add(2);
        lista.add(50);

        lista = new ArrayList<>();


    }
    public static List<Integer> getlista(){
        return Collections.unmodifiableList(lista);
    }
}
