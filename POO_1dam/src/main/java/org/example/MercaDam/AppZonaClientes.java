package org.example.MercaDam;

import java.util.*;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadaw mercadam = new Mercadaw();
        mercadam.generarClientes();
        autenticacion(mercadam.getClientes());
    }

    static void autenticacion(Set<Cliente> clientes) {
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("=== COMPRA ONLINE EN MERCADAW ===");
            System.out.print("usuario: ");
            String user = teclado.nextLine();
            System.out.print("contraseña: ");
            String pass = teclado.nextLine();

            for (Cliente c : clientes) {
                if (c.getUsuario().equals(user) && c.getContrasenya().equals(pass)) {
                    cliente = c;
                    iniciarCompra();
                    return;
                }
            }
            intentos--;
            if (intentos > 0){
                System.out.println("Credenciales no válidas. Intentos: " + intentos);
            }
        }
        System.err.println("ERROR DE AUTENTICACIÓN");
    }

    static void iniciarCompra() {
        System.out.println("Bienvenido, " + cliente.getUsuario());
        cliente.crearPedido();
        imprimirProductos();
    }

    static void imprimirProductos() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Elige un producto de la lista...");
            for (Producto p : Producto.values()) {
                System.out.println(p.name() + ": " + p.getPrecio() + "€");
            }
            System.out.print("Elige un producto: ");
            String pStr = teclado.nextLine().toUpperCase();

            try {
                Producto p = Producto.valueOf(pStr);
                cliente.insertarProducto(p);
                System.out.println("Has añadido " + p.name() + ". Total: " + cliente.getPedido().getImporteTotal() + "€");
            } catch (Exception e) {
                System.out.println("Producto no reconocido. Elige otro...");
                continue;
            }

            System.out.print("¿Quieres añadir más productos (S/N)? ");
            if (teclado.nextLine().equalsIgnoreCase("N")){
                seguir = false;
            }
        }
        imprimirResumen();
    }

    static void imprimirResumen() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        cliente.getPedido().getPedido().forEach((p, cant) -> {
            System.out.println(cant + " " + p.name() + " " + p.getPrecio());
        });
        System.out.println("Importe total: " + cliente.getPedido().getImporteTotal() + "€");
        mostrarOpciones();
    }

    static void mostrarOpciones() {
        System.out.println("[1]. Aplicar promos. [3]. Terminar.");
        String op = teclado.nextLine();
        if (op.equals("1")) {
            if (!cliente.hasPromociones()) {
                cliente.getPedido().aplicarPromo3x2();
                cliente.getPedido().aplicarPromo10();
                cliente.setPromociones(true);
                System.out.println("PROMO 3x2 y 10% DESC. APLICADAS");
                imprimirResumen();
            } else {
                System.out.println("Ya has aplicado las promos.");
            }
        } else if (op.equals("3")) {
            imprimirDespedida();
        }
    }

    static void imprimirDespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en: " + cliente.getDireccion());
    }
}