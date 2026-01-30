package org.example.PartidoTenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    public Set(int puntosJ1, int puntosJ2) {
        validarPuntuacion( puntosJ1, puntosJ2);

    }
    private void validarPuntuacion(int puntuacion1, int puntuacion2){
        if (puntuacion1 < 0 || puntuacion2 < 0 ){
            System.out.println("no se puede colocar puntuacion menor a 0");
        }else if (puntuacion1 >= 7 && puntuacion2 >= 7){
                if (puntuacion2<=2-puntuacion1){
                    System.out.println("Gana jugador 1");
                }else{
                    System.out.println("timebreak");
                }
                if (puntuacion1<=2-puntuacion2){
                    System.out.println("Gana jugador 2");
                }else{
                    System.out.println("timebreak");
                }
            this.puntosJ1 = puntosJ1;
            this.puntosJ2 = puntosJ2;
        }
    }



}
