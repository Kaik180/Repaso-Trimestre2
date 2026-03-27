package org.example.PruebasUnitarias;

public class Calculadora {

    private int primerNumero;
    private int segundoNumero;

    public Calculadora(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int suma() {
        int resultado = primerNumero + segundoNumero;
        return resultado;
    }

    public int resta() {

        int resultado = primerNumero - segundoNumero;
        return resultado;
    }

    public int multiplica() {
        int resultado = primerNumero * segundoNumero;
        return resultado;
    }

    public int divide() {
        if (segundoNumero== 0){
         throw  new java.lang.ArithmeticException("division por 0");
        }else {

            int resultado = primerNumero / segundoNumero;
            return resultado;
        }

    }
}

