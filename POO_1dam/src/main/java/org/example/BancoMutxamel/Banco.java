package org.example.BancoMutxamel;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void altaCliente(String nombre, String apellidos) {
        clientes.add(new Cliente(nombre, apellidos));
    }

    public void bajaCliente(String nombre, String apellidos) {
        Cliente c = buscarCliente(nombre, apellidos);
        if (c != null) {
            // quitar titular de sus cuentas
            for (Cuenta cu : cuentas) {
                if (cu.getTitular() == c) {
                    cu.setTitular(null);
                }
            }
            clientes.remove(c);
        }
    }

    public Cliente buscarCliente(String nombre, String apellidos) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(nombre)
                    && c.getApellidos().equalsIgnoreCase(apellidos)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Cuenta> cuentasDe(Cliente c) {
        ArrayList<Cuenta> lista = new ArrayList<>();
        for (Cuenta cu : cuentas) {
            if (cu.getTitular() == c) {
                lista.add(cu);
            }
        }
        return lista;
    }

    public Cuenta buscarCuentaPorIban(String iban) {
        for (Cuenta cu : cuentas) {
            if (cu.getIban().equalsIgnoreCase(iban)) {
                return cu;
            }
        }
        return null;
    }

    public Cuenta crearCuenta(Cliente titular) {
        Cuenta c = new Cuenta();
        c.setTitular(titular);
        cuentas.add(c);
        return c;
    }
}

