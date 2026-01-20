package org.example;

public class TelevisorA {
    private static final int def_canal=1;
    private static final int def_volumen=5;
    private int canal;
    private int volumen;
    public TelevisorA(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }
    public TelevisorA() {
        this.canal = def_canal;
        this.volumen = def_volumen;
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
    public  void subircanal(){
        if (canal==100){
            this.canal = 1;
        }else{
            this.canal = canal+1;
        }
        System.out.println("Canal:"+ getCanal());
    }
    public  void bajarcanal(){
        if (canal==1){
            this.canal = 100;
        }else{
            this.canal = canal-1;
        }
        System.out.println("Canal:"+ getCanal());

    }
    public  void subirvolumen(){

        if (volumen==100){
            System.out.println("No se pueden bajar mas el volumen");
        }else{
            this.volumen = volumen+1;
            System.out.println("Volumen:"+ getvolumen());
        }
    }
    public  void bajarvolumen(){

        if (volumen==1){
            System.out.println("No se pueden bajar mas el volumen");
        }else{
            this.volumen = volumen-1;
            System.out.println("Volumen:"+ getvolumen());
        }
    }
}
