package org.example;

public class Televisorb {
    static void main() {
        TelevisorA lg= new TelevisorA(5,50);
        lg.subircanal();
        lg.subircanal();
        lg.subircanal();
        lg.bajarvolumen();
        lg.bajarvolumen();

        System.out.println(lg.getCanal()+ " "+ lg.getvolumen());
    }


}
