package org.example.SPJavadoc;

import java.util.Random;
import java.util.Scanner;

/**
 * La clase Bizum representa un método de pago basado en el sistema Bizum.
 * Extiende la clase abstracta MetodoDePago y proporciona el codigo
 * necesaria para validar y procesar pagos mediante un número de teléfono y un PIN.
 */
public class Bizum extends MetodoDePago {
    Scanner teclado = new Scanner(System.in);

    /** Número de teléfono asociado a la cuenta Bizum. */
    private String telefono;

    /** PIN generado automáticamente para validar la operación. */
    private int pin;

    /**
     * Obtiene el número de teléfono asociado al Bizum.
     *
     * @return número de teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono asociado al Bizum.
     *
     * @param telefono número de teléfono a asignar.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el PIN generado para la validación.
     *
     * @return PIN actual.
     */
    public int getPin() {
        return pin;
    }

    /**
     * Establece el PIN del Bizum.
     *
     * @param pin nuevo PIN a asignar.
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * Constructor que crea un nuevo método de pago Bizum.
     * Genera automáticamente un PIN de 6 dígitos.
     *
     * @param telefono número de teléfono vinculado al Bizum.
     */
    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = Integer.parseInt(generarNumerosCadena());
    }

    /**
     * Procesa un pago utilizando Bizum.
     *
     * @param importe cantidad a pagar.
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " mediante Bizum");
    }

    /**
     * Genera una cadena numérica aleatoria de 6 dígitos,
     * utilizada para crear el PIN del Bizum.
     *
     * @return cadena de 6 números aleatorios.
     */
    public String generarNumerosCadena() {
        Random r = new Random();
        String cadena = "";

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(10);
            cadena = cadena + num;
        }

        return cadena;
    }

    /**
     * Valida el Bizum comprobando:
     * Que el número de teléfono tenga exactamente 9 dígitos.
     * Que el PIN introducido por el usuario coincida con el generado.
     *
     * @return true si el Bizum es válido, false en caso contrario.
     */
    public boolean validarBizum() {
        System.out.println("introduce el pin");
        int pin2 = teclado.nextInt();

        if (telefono.length() == 9) {
            if (pin == pin2) {
                return true;
            }
        }

        return false;
    }
}

