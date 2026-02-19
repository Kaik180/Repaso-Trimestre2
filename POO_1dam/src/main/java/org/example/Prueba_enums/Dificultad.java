package org.example.Prueba_enums;

public enum Dificultad {
    FACIL(2),MEDIO(4),DIFICIL(8),EXPERTO(10);

    private int multiplicador;

    Dificultad(int d){
        this.multiplicador =d;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

}
