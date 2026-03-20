package org.example.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mercadaw {
    public HashSet<Cliente> getClienteSet() {
        return clienteSet;
    }

    public void setClienteSet(HashSet<Cliente> clienteSet) {
        this.clienteSet = clienteSet;
    }

    public Mercadaw() {
        this.clienteSet = clienteSet;
    }
    public void generarClientes(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        String cadena = "";

        for (int i = 0; i < 6; i++) {

        }
    }
    public Set<Cliente> getClientes(){

        return null;
    }
    private HashSet<Cliente> clienteSet;
}
