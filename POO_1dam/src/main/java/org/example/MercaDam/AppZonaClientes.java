package org.example.MercaDam;

import java.util.*;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);
    static void main() {


    }

    static void autenticacion(List<Cliente> clientes){
        boolean cierto = true;
        while (cierto)
        System.out.println("=== COMPRA ONLINE EN MERCADAW ===");
        System.out.println("usuario:");
        String user = teclado.nextLine();
        System.out.println("contraseña:");
        String contra = teclado.nextLine();
        Set<Cliente> posiblesClientes;
    }
}
