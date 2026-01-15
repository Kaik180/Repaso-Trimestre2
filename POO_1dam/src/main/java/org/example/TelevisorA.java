package org.example;

public class TelevisorA {
    private int canal=1;
    private int volumen=5;
    public TelevisorA(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }
    public int getCanal(){
        return canal;
    }
    public  void setCanal(int canal){
        this.canal = canal;
    }
    public int getvolumen(){
        return volumen;
    }
    public  void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public  void subircanal(int canal){
        if (canal==100){
            System.out.println("No se pueden subir mas canales");
        }else{
            this.canal = canal+1;
        }

    }
    public  void bajarcanal(int canal){
        if (canal==1){
            System.out.println("No se pueden bajar mas canales");
        }else{
            this.canal = canal-1;
        }


    }
    public  void subirvolumen(int volumen){

        if (canal==1){
            System.out.println("No se pueden bajar mas canales");
        }else{
            this.volumen = volumen+1;
        }
    }
}
