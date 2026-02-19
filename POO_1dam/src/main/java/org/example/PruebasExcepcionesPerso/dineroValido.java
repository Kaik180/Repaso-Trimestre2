package org.example.PruebasExcepcionesPerso;

public class dineroValido extends Throwable {
    public dineroValido(String s) {
        System.out.println(s);
    }
}
