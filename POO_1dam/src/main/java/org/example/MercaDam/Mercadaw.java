package org.example.MercaDam;

import java.util.*;

public class Mercadaw {
    private Set<Cliente> clientes = new HashSet<>();

    public void generarClientes() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();

        System.out.println("--- CLIENTES GENERADOS (Copia uno para entrar) ---");

        for (int i = 0; i < 5; i++) {
            StringBuilder u = new StringBuilder();
            StringBuilder c = new StringBuilder();
            for (int j = 0; j < 8; j++) { // Tamaño 8 según instrucciones [cite: 73]
                u.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
                c.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
            }

            Cliente nuevo = new Cliente(u.toString(), c.toString());
            clientes.add(nuevo);


            System.out.println("Usuario: " + nuevo.getUsuario() + " | Contraseña: " + nuevo.getContrasenya());
        }
        System.out.println("--------------------------------------------------\n");
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}