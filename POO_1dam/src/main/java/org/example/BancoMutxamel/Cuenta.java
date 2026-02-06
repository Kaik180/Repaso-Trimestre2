package org.example.BancoMutxamel;

public class Cuenta {

    private static int contadorIban = 1;

    private String iban;
    private Cliente titular;
    private double saldo;

    public Cuenta() {
        this.iban = "ESXX" + contadorIban++;
        this.titular = null;
        this.saldo = 0;
    }

    public String getIban() {
        return iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void pagar(double cantidad) {
        saldo -= cantidad;
    }

    public boolean enRojos() {
        return saldo < 0;
    }

    @Override
    public String toString() {
        String t = (titular == null) ? "sin titular" : titular.getNombre() + " " + titular.getApellidos();
        return iban + " - saldo: " + saldo + "€. Titular: " + t;
    }
}

