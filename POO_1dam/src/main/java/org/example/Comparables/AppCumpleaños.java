package org.example.Comparables;

import java.util.*;

public class AppCumpleaños {


    static void main() {
        ArrayList<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado(15, "juan"));
        invitados.add(new Invitado(13, "Carlos"));
        invitados.add(new Invitado(13, "Maria"));
        Collections.sort(invitados, new OrdenarPorEdadNombreHora());

        System.out.println(invitados);

        TreeMap<Invitado,String> mapaInvitados = new TreeMap<>();

        mapaInvitados.put(new Invitado(15, "juan"), "Raqueta");
        mapaInvitados.put(new Invitado(12, "david"), "500€");
        mapaInvitados.put(new Invitado(12, "joaquin"), "Charla con Milei");

        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Invitado,String> mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre()+ " " + mapita.getValue());
        }
    }
}
