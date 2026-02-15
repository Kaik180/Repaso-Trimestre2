package org.example.SPJavadoc;

import java.util.Scanner;

/**
 * La clase Tienda gestiona el proceso de selección y realización
 * de pagos mediante diferentes métodos implementados en el sistema.
 * Permite al usuario elegir un método de pago, validar los datos
 * introducidos y procesar el importe solicitado.
 */
public class Tienda {
    Scanner teclado = new Scanner(System.in);

    /**
     * Solicita al usuario la cantidad a pagar y delega el procesamiento
     * del pago en el método de pago recibido.
     *
     * @param metodo objeto que implementa que tipo de procesar pago queremos dependiendo del metodo de pago
     */
    public void realizarPago(MetodoDePago metodo) {
        System.out.println("Que importe desea realizar (cantidad)");
        double cantidad = teclado.nextInt();
        teclado.nextLine();
        metodo.procesarPago(cantidad);
    }

    /**
     * Inicia el proceso de pago permitiendo al usuario seleccionar
     * entre los métodos disponibles: tarjeta de crédito, Bizum o PayPal.
     * Según la opción elegida, solicita los datos necesarios,
     * valida la información y, si es correcta, procede a realizar el pago.
     */
    public void iniciarPago() {
        System.out.println("Seleccione método de pago: tarjetaCredito, Paypal, Bizum");
        String opcion = teclado.next().toLowerCase();
        teclado.nextLine();

        switch (opcion) {

            case "tarjetacredito":
                System.out.println("introduce el numero de tarjeta");
                String numero = teclado.next();
                teclado.nextLine();

                System.out.println("introduce el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]");
                String tipo2 = teclado.next();
                teclado.nextLine();

                TarjetaCredito tarjeta = new TarjetaCredito(numero, tipo2);

                if (tarjeta.validarTarjeta()) {
                    realizarPago(tarjeta);
                } else {
                    System.out.println("Los datos de tu tarjeta no son correctos");
                }
                break;

            case "bizum":
                System.out.println("introduce el telefono vinculado");
                String telvin = teclado.next();
                teclado.nextLine();

                Bizum bizum = new Bizum(telvin);
                System.out.println("chivato pin:" + bizum.getPin());

                if (bizum.validarBizum()) {
                    realizarPago(bizum);
                } else {
                    System.out.println("Los datos de tu bizum no son correctos");
                }
                break;

            case "paypal":
                System.out.println("introduce tu cuenta de paypal");
                String cuenta = teclado.next();
                teclado.nextLine();

                Paypal paypal = new Paypal(cuenta);

                if (paypal.validarPaypal()) {
                    realizarPago(paypal);
                } else {
                    System.out.println("Los datos de tu paypal no son correctos");
                }
                break;

            default:
                System.out.println("Método no reconocido");
        }
    }
}
