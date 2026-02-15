package org.example.SPJavadoc;

/**
 * La clase MetodoDePago representa un método de pago genérico dentro del sistema.
 * Es una clase abstracta que define la estructura básica que deben seguir todos los
 * métodos de pago implementados (tarjeta de crédito, Bizum, PayPal, etc.).
 * Cada método de pago debe proporcionar su propia implementación del proceso de pago.
 */
public abstract class MetodoDePago {

    /**
     * Procesa un pago por el importe indicado.
     * Cada método de pago debe implementar su propio codigo para realizar el pago.
     *
     * @param importe cantidad que se desea pagar.
     */
    public abstract void procesarPago(double importe);
}

