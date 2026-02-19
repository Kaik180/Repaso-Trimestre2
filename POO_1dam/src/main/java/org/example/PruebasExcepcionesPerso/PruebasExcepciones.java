package org.example.PruebasExcepcionesPerso;

import com.sun.jdi.VMCannotBeModifiedException;

import java.util.zip.DataFormatException;

public class PruebasExcepciones {

    public static void main() throws DataFormatException {

        int edad = 15;

        if (edad>=15){

            throw new EdadValida("hola");

        }

    }


}
