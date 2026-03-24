package org.example.MercaDam;

import java.util.*;

public class Mercadaw {
    private Set<Cliente> clientes = new HashSet<>();

    public void generarClientes() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random aleatorio = new Random();

        System.out.println("--- CLIENTE GENERADO ---");

        String u = "";
        String c = "";

        for (int j = 0; j < 8; j++) {
            u += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
            c += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
        }


        Cliente nuevo = new Cliente(u, c);
        clientes.add(nuevo);


        System.out.println("Usuario: " + nuevo.getUsuario() + " | Contraseña: " + nuevo.getContrasenya());

        System.out.println("--------------------------------------------------\n");
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}