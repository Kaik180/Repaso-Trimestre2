package org.example.SistemaDePago;
import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoDePago {
    Scanner teclado = new Scanner(System.in);

    public String getTelefono() {

        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = Integer.parseInt(generarNumerosCadena());
    }

    private String telefono;
    private int pin;
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+ importe + " con tarjeta de credito ");
    }

    public String generarNumerosCadena() {
        Random r = new Random();
        String cadena = "";

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(10);
            cadena = cadena + num;
        }

        return cadena;
    }
    public boolean validarBizum() {
        System.out.println(pin);
        if (telefono.length()==9){
            System.out.println("introduce el pin");
            int pin2 = teclado.nextInt();
            teclado.nextLine();
            if (pin==pin2){
                return true;
            }

        }

        return false;
    }







}
