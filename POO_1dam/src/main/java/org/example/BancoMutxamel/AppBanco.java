package org.example.BancoMutxamel;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {

    static Scanner teclado = new Scanner(System.in);
    static Banco banco = new Banco();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("[1] Mantenimiento de Clientes");
            System.out.println("[2] Mantenimiento de Cuentas");
            System.out.println("[X] Salir");
            System.out.print("Opción: ");
            String op = teclado.nextLine();

            if (op.equalsIgnoreCase("X")) break;

            opcion = Integer.parseInt(op);

            switch (opcion) {
                case 1 -> menuClientes();
                case 2 -> menuCuentas();
            }

        } while (true);

        System.out.println("Saliendo...");
    }

    // ---------------- CLIENTES ----------------

    public static void menuClientes() {
        int opcion;

        do {
            System.out.println("\nCLIENTES:");
            System.out.println("[1] Altas");
            System.out.println("[2] Bajas");
            System.out.println("[3] Modificaciones");
            System.out.println("[4] Listado de clientes");
            System.out.println("[X] Volver");
            System.out.print("Opción: ");
            String op = teclado.nextLine();

            if (op.equalsIgnoreCase("X")) return;

            opcion = Integer.parseInt(op);

            switch (opcion) {
                case 1 -> altaCliente();
                case 2 -> bajaCliente();
                case 3 -> modificarCliente();
                case 4 -> listarClientes();
            }

        } while (true);
    }

    public static void altaCliente() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        banco.altaCliente(nombre, apellidos);
        System.out.println("Cliente añadido.");
    }

    public static void bajaCliente() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        banco.bajaCliente(nombre, apellidos);
        System.out.println("Cliente eliminado (si existía).");
    }

    public static void modificarCliente() {
        listarClientes();
        System.out.print("ID del cliente a modificar: ");
        int id = Integer.parseInt(teclado.nextLine());

        Cliente c = null;
        for (Cliente cli : banco.getClientes()) {
            if (cli.getId() == id) c = cli;
        }

        if (c == null) {
            System.out.println("No existe ese cliente.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        c.setNombre(teclado.nextLine());
        System.out.print("Nuevos apellidos: ");
        c.setApellidos(teclado.nextLine());

        System.out.println("Cliente modificado.");
    }

    public static void listarClientes() {
        ArrayList<Cliente> lista = banco.getClientes();
        System.out.println("\nListado de clientes (" + lista.size() + "):");
        for (Cliente c : lista) {
            System.out.println(c);
        }
    }

    // ---------------- CUENTAS ----------------

    public static void menuCuentas() {
        int opcion;

        do {
            System.out.println("\nCUENTAS:");
            System.out.println("[1] Consultar cuentas cliente");
            System.out.println("[2] Ver todas las cuentas");
            System.out.println("[X] Volver");
            System.out.print("Opción: ");
            String op = teclado.nextLine();

            if (op.equalsIgnoreCase("X")) return;

            opcion = Integer.parseInt(op);

            switch (opcion) {
                case 1 -> consultarCuentasCliente();
                case 2 -> verTodasLasCuentas();
            }

        } while (true);
    }

    public static void verTodasLasCuentas() {
        ArrayList<Cuenta> lista = banco.getCuentas();
        System.out.println("\nCuentas de la sucursal (" + lista.size() + "):");
        for (Cuenta c : lista) {
            System.out.println(c);
        }
    }

    public static void consultarCuentasCliente() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        Cliente c = banco.buscarCliente(nombre, apellidos);

        if (c == null) {
            System.out.println("El cliente no existe.");
            return;
        }

        ArrayList<Cuenta> cuentas = banco.cuentasDe(c);

        if (cuentas.isEmpty()) {
            System.out.println("El cliente no tiene cuentas activas.");
            System.out.println("[1] Crear nueva cuenta");
            System.out.println("[X] Volver");
            String op = teclado.nextLine();
            if (op.equals("1")) {
                banco.crearCuenta(c);
                System.out.println("Cuenta creada.");
            }
            return;
        }

        System.out.println("\nCuentas asociadas a " + c.getNombre() + " " + c.getApellidos() + ":");
        for (Cuenta cu : cuentas) {
            System.out.println(cu.getIban() + " - saldo: " + cu.getSaldo() + "€");
        }

        menuAccionesCuenta(c);
    }

    public static void menuAccionesCuenta(Cliente c) {
        int opcion;

        do {
            System.out.println("\nMENÚ CUENTAS:");
            System.out.println("[1] Ingresar");
            System.out.println("[2] Pagar");
            System.out.println("[3] En rojos");
            System.out.println("[4] Consultar saldo");
            System.out.println("[5] Ver datos del titular");
            System.out.println("[6] Crear nueva cuenta");
            System.out.println("[X] Volver");
            System.out.print("Opción: ");
            String op = teclado.nextLine();

            if (op.equalsIgnoreCase("X")) return;

            opcion = Integer.parseInt(op);

            switch (opcion) {
                case 1 -> ingresar();
                case 2 -> pagar();
                case 3 -> enRojos();
                case 4 -> consultarSaldo();
                case 5 -> System.out.println(c);
                case 6 -> {
                    banco.crearCuenta(c);
                    System.out.println("Cuenta creada.");
                }
            }

        } while (true);
    }

    public static Cuenta pedirCuenta() {
        System.out.print("IBAN: ");
        String iban = teclado.nextLine();
        Cuenta cu = banco.buscarCuentaPorIban(iban);
        if (cu == null) System.out.println("Cuenta no encontrada.");
        return cu;
    }

    public static void ingresar() {
        Cuenta cu = pedirCuenta();
        if (cu == null) return;

        System.out.print("Cantidad a ingresar: ");
        double cant = Double.parseDouble(teclado.nextLine());
        cu.ingresar(cant);
        System.out.println("Ingreso realizado.");
    }

    public static void pagar() {
        Cuenta cu = pedirCuenta();
        if (cu == null) return;

        System.out.print("Cantidad a pagar: ");
        double cant = Double.parseDouble(teclado.nextLine());
        cu.pagar(cant);
        System.out.println("Pago realizado.");
    }

    public static void enRojos() {
        Cuenta cu = pedirCuenta();
        if (cu == null) return;

        if (cu.enRojos()) System.out.println("La cuenta está en números rojos.");
        else System.out.println("La cuenta NO está en números rojos.");
    }

    public static void consultarSaldo() {
        Cuenta cu = pedirCuenta();
        if (cu == null) return;

        System.out.println("Saldo actual: " + cu.getSaldo() + "€");
    }
}

