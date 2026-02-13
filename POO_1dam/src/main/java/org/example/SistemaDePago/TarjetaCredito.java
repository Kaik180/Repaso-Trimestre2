package org.example.SistemaDePago;

public class TarjetaCredito extends MetodoDePago {

    private String nro_tarjeta;
    private String tipo;

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+ importe + " con tarjeta de credito "+ tipo);
    }

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

