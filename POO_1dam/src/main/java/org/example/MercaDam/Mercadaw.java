package org.example.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mercadaw {
    public HashSet<Cliente> getClienteSet() {
        return clientes;
    }

    public void setClienteSet(HashSet<Cliente> clienteSet) {
        this.clientes = clienteSet;
    }

    public Mercadaw() {
        this.clientes = clientes;
    }
    public void generarClientes(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        String cadena = "";

        for (int i = 0; i < 6; i++) {

        }
    }
    public Set<Cliente> getClientes() {
        // Devuelve una versión protegida
        return Collections.unmodifiableSet(clientes);
    }
    private HashSet<Cliente> clientes;

    public void generarcliente(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String usuario = "";
        String contrasenya = "";

        for (int i = 0; i < 8; i++) {
            int pos = random.nextInt(caracteres.length());
            usuario += caracteres.charAt(pos);
        }
        for (int i = 0; i < 8; i++) {
            int pos = random.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(pos);
        }

        System.out.println("Usuario generado: " + usuario + " contraseña generada: "+ contrasenya);
        Cliente cliente = new Cliente(usuario, contrasenya);
        clientes.add(cliente);

    }


}
