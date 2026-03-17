package org.example.PruebasUnitarias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Suite;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora calc = new Calculadora(3,5);
        int valorEsperado = 8;
        int valorObtenido = calc.suma();
        assertEquals(valorEsperado,valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void resta() {
        Calculadora calc = new Calculadora(10,3);
        int valorEsperado = 7;
        int valorObtenido = calc.resta();
        assertEquals(valorEsperado, valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void multiplica() {
        Calculadora calc = new Calculadora(3,5);
        int valorEsperado = 15;
        int valorObtenido = calc.multiplica();
        assertEquals(valorEsperado,valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculadora calc = new Calculadora(1,1);
        int valorEsperado = 1;
        int valorObtenido = calc.divide();
        assertEquals(valorEsperado,valorObtenido);
    }
    void textDivideExcepcion() {
        Calculadora calc = new Calculadora(30,0);
        String valorEsperado = "Division por 0";
        String valorDevuelto = "";
        try {
            calc.divide();
        }catch (ArithmeticException e){
            valorDevuelto= e.getMessage();
        }
        assertEquals(valorEsperado,valorDevuelto);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testSumaConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);
        int valorEsperado =num+5;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado,valorDevuelto);
    }
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "4, 5, 9",
            "-1, -2, -3",
            "0, 0, 0"
    })
    public void testSumaConCvsSource(int a, int b, int valorEsperado){
        Calculadora calc = new Calculadora(a,b);
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado,valorDevuelto);
    }

}