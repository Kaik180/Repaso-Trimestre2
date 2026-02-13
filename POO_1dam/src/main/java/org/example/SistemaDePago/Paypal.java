package org.example.SistemaDePago;

public class Paypal extends MetodoDePago {
    private static String FORMATO_CUENTA="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23.00;
    }

    private String cuenta;
    private double saldo;

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+ importe + " con tarjeta de credito ");
    }
    public boolean validarPaypal() {

        if (cuenta.matches(FORMATO_CUENTA)){
            return true;
        }
        return false;
    }
}
