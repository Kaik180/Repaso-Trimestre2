package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    private Alien alien;

    @BeforeEach
    void setUp() {
        alien = new Alien("Zog", "Mars-01");
    }

    @Test
    void testConstructorVacio() {
        Alien vacio = new Alien();
        assertEquals("", vacio.getName());
        assertEquals("", vacio.getPlanetId());
    }

    @Test
    void testConstructorConParametros() {
        assertEquals("Zog", alien.getName());
        assertEquals("Mars-01", alien.getPlanetId());
    }

    @Test
    void testSetters() {
        alien.setName("Xylax");
        alien.setPlanetId("Saturn-99");
        assertEquals("Xylax", alien.getName());
        assertEquals("Saturn-99", alien.getPlanetId());
    }

    @Test
    void testEqualsMismoId() {
        Alien otroAlien = new Alien("OtroNombre", "Mars-01");
        assertTrue(alien.equals(otroAlien));
    }

    @Test
    void testEqualsDistintoId() {
        Alien otroAlien = new Alien("Zog", "Jupiter-05");
        assertFalse(alien.equals(otroAlien));
    }

    @Test
    void testToString() {
        String esperado = "Zog Mars-01";
        assertEquals(esperado, alien.toString());
    }

    @Test
    void testFallaIntencionado() {
        assertEquals("Error", alien.getName(), "Este test falla para la captura del informe");
    }
}