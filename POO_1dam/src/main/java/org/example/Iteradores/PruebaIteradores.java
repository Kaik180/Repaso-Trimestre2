package org.example.Iteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PruebaIteradores {
    static void main() {
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("kicki Nickole", 4);
        mapa.put("Hermione", 7);

        Iterator<Map.Entry<String,Integer>> itmapita = mapa.entrySet().iterator();

        while (itmapita.hasNext()){
            Map.Entry<String,Integer> novia = itmapita.next();
            System.out.println(novia.getKey()+ "ha durado "+ novia.getValue());

            if (novia.getKey().equals("hermione")){
                itmapita.remove();
            }
        }
    }
}
