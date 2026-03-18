package org.example.Mapa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.Map;

class DiccionarioTest {

    @BeforeEach
    void setUp() throws Exception {
        Field fichero = Diccionario.class.getDeclaredField("diccionario");
        fichero.setAccessible(true);
        Map<String, String> map = (Map<String, String>) fichero.get(null);
        map.clear();
    }

    @Test
    void testNuevoPar() {
        Diccionario.nuevoPar("perro", "dog");
        assertEquals("dog", Diccionario.traduce("perro"));
    }

    @Test
    void testTraducePalabraExistente() {
        Diccionario.nuevoPar("gato", "cat");
        String resultado = Diccionario.traduce("gato");
        assertEquals("cat", resultado);
    }

    @Test
    void testTraducePalabraNoExistente() {
        String resultado = Diccionario.traduce("elefante");
        assertNull(resultado);
    }

    @Test
    void testPalabraAleatoria() {
        Diccionario.nuevoPar("rojo", "red");
        Diccionario.nuevoPar("azul", "blue");

        String palabra = Diccionario.palabraAleatoria();
        assertTrue(palabra.equals("rojo") || palabra.equals("azul"));
    }

    @Test
    void testPrimeraLetraTraduccion() {
        Diccionario.nuevoPar("casa", "house");
        char letra = Diccionario.primeraLetraTraduccion("casa");
        assertEquals('h', letra);
    }

    @Test
    void testDiccionarioVacio() {
        assertThrows(Exception.class, () -> {Diccionario.palabraAleatoria();});
    }
}