package org.example.SistemaDePago;
import java.util.Scanner;
public class Tienda {
    Scanner teclado = new Scanner(System.in);
    public void realizarPago(MetodoDePago metodo){
        System.out.println("Que importe desea realizar (cantidad)");
        double cantidad = teclado.nextInt();
        teclado.nextLine();
      metodo.procesarPago(cantidad);

    }
    public void iniciarPago(){
        System.out.println("Seleccione método de pago: tarjeta, Paypal, Bizum");
        String opcion = teclado.next().toLowerCase();
        teclado.nextLine();
        switch (opcion){
            case "tarjeta":
                System.out.println("introduce el numero de tarjeta");
                String numero = teclado.next();
                teclado.nextLine();
                System.out.println("introduce el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]");
                String tipo2 = teclado.next().toLowerCase();
                teclado.nextLine();
                TarjetaCredito tarjeta = new TarjetaCredito(numero,tipo2);
                if (tarjeta.validarTarjeta()){
                 realizarPago(tarjeta);
                }else {
                    System.out.println("Los datos de tu tarjeta no son correctos");
                }
                break;
            case "bizum":
                System.out.println("introduce el telefono vinculado");
                String telvin = teclado.next();
                teclado.nextLine();
                Bizum bizum= new Bizum(telvin);
                System.out.println("chivato pin:"+ bizum.getPin());
                if (bizum.validarBizum()){
                    realizarPago(bizum);
                }else {
                    System.out.println("Los datos de tu bizum no son correctos");
                }

                break;
            case "paypal":
                System.out.println("introduce tu cuenta de paypal");
                String cuenta = teclado.next();
                teclado.nextLine();
                Paypal paypal = new Paypal(cuenta);
                if (paypal.validarPaypal()){
                    realizarPago(paypal);
                }else {
                    System.out.println("Los datos de tu paypal no son correctos");
                }

                break;
            default:
                System.out.println("Método no reconocido");

        }

    }

}
























