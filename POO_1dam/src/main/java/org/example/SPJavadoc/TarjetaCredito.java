package org.example.SPJavadoc;

/**
 * La clase TarjetaCredito representa un método de pago basado en tarjeta
 * de crédito. Extiende la clase abstracta  MetodoDePago y proporciona
 * el codigo necesaria para validar y procesar pagos mediante tarjeta.
 */
public class TarjetaCredito extends MetodoDePago {

    /** Número de la tarjeta de crédito. */
    private String nro_tarjeta;

    /** Tipo de tarjeta (VISA, MAESTRO, MASTERCARD, etc.). */
    private String tipo;

    /**
     * Obtiene el número de la tarjeta.
     *
     * @return número de tarjeta como cadena.
     */
    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    /**
     * Establece el número de la tarjeta.
     *
     * @param nro_tarjeta número de tarjeta a asignar.
     */
    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    /**
     * Obtiene el tipo de tarjeta.
     *
     * @return tipo de tarjeta como cadena.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de tarjeta.
     *
     * @param tipo tipo de tarjeta a asignar.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor que crea una nueva tarjeta de crédito con número y tipo.
     *
     * @param nro_tarjeta número de la tarjeta.
     * @param tipo tipo de tarjeta (VISA, MAESTRO, MASTERCARD, etc.).
     */
    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en texto del objeto {@code TarjetaCredito}.
     *
     * @return cadena con los datos de la tarjeta.
     */
    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    /**
     * Procesa un pago utilizando la tarjeta de crédito.
     *
     * @param importe cantidad a pagar.
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " con tarjeta de credito " + tipo);
    }

    /**
     * Valida la tarjeta comprobando:
     * <ul>
     *     <li>Que el número de tarjeta no supere los 16 caracteres.</li>
     *     <li>Que el tipo de tarjeta coincida con alguno de los tipos permitidos.</li>
     * </ul>
     *
     * @return {@code true} si la tarjeta es válida, {@code false} en caso contrario.
     */
    public boolean validarTarjeta() {

        if (nro_tarjeta.length() > 16) {
            return false;

        } else {
            String[] palabras = {"TarjetaCredito", "PayPal", "Bizum"};
            for (int i = 0; i < palabras.length; i++) {
                if (tipo.contains(palabras[i])) {
                    return true;
                }
            }
        }

        return false;
    }

}

