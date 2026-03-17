package org.example.PistasDeportivas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AppPistas {
    static Scanner teclado = new Scanner(System.in);
    static HashMap<Usuario, HashSet<Reserva>> mapaReservas = new HashMap<>();


    static void main() {

    }
    public static void eliminar(HashSet<Reserva> listaReserva) {
        System.out.print("¿Qué tipo de pista quieres eliminar (padel/tenis)? ");
        String tipo = teclado.nextLine().trim().toLowerCase();

        Iterator<Reserva> it = listaReserva.iterator();

        while (it.hasNext()) {
            Reserva r = it.next();

            if (tipo.equals("padel") && r.getPista() instanceof Padel) {
                it.remove();
            }

            if (tipo.equals("tenis") && r.getPista() instanceof Tenis) {
                it.remove();
            }
        }

        System.out.println("Reservas eliminadas correctamente.");
    }

    public static HashSet<Reserva> listaReserva(Usuario usuario) {
        return mapaReservas.get(usuario);
    }
    public static  void reservaCrear (Usuario usuario, Pista pista) {
        Reserva reserva = new Reserva(usuario, pista);

        HashSet<Reserva> listaJacobo = listaReserva(usuario);
        if (listaJacobo.contains(reserva)){
            throw  new ReservDuplicada("ya hay una pista reservada");
        }else {
            mapaReservas.put(usuario,listaJacobo);
        }
    }
}
