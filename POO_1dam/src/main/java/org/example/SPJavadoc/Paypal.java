package org.example.SPJavadoc;


/**
 * La clase Paypal representa un método de pago basado en una cuenta
 * de PayPal. Extiende la clase abstracta  MetodoDePago y proporciona
 * el codigo necesaria para validar y procesar pagos mediante este servicio.
 */
public class Paypal extends MetodoDePago {

    /**
     * Expresión regular que define el formato válido para una cuenta de PayPal.
     * Debe ser un correo electrónico con estructura estándar.
     */
    private static final String FORMATO_CUENTA =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    /** Dirección de correo asociada a la cuenta PayPal. */
    private String cuenta;

    /** Saldo disponible en la cuenta PayPal. */
    private double saldo;

    /**
     * Obtiene la cuenta de PayPal asociada.
     *
     * @return correo electrónico de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece la cuenta de PayPal.
     *
     * @param cuenta correo electrónico que se asignará a la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta.
     *
     * @return saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo disponible en la cuenta.
     *
     * @param saldo cantidad de saldo a asignar.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor que crea una cuenta PayPal con un correo asociado.
     * Inicializa el saldo por defecto a 23.00.
     *
     * @param cuenta correo electrónico de la cuenta PayPal.
     */
    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23.00;
    }

    /**
     * Procesa un pago utilizando la cuenta PayPal.
     *
     * @param importe cantidad a pagar.
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " con PayPal");
    }

    /**
     * Valida la cuenta PayPal comprobando que cumple el formato
     * de correo electrónico definido por la expresión regular.
     *
     * @return {@code true} si la cuenta es válida, {@code false} en caso contrario.
     */
    public boolean validarPaypal() {
        return cuenta.matches(FORMATO_CUENTA);
    }
}

