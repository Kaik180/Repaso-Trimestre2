package org.example.Prueba_enums;

public enum Semaforo {
    AMARILLO,ROJO,VERDE;

    public Semaforo siguiente(Semaforo color){
        switch (color){
            case AMARILLO:
                return ROJO;

            case ROJO:
                return VERDE;

            case VERDE:
                return AMARILLO;

        }
        return null;
    }
}
