package org.example.AdmiCasa;

public class Televisor extends Dispositivo implements ControlRemoto {
    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto");
    }

    @Override
    public void enceder() {
        if (isEstado()==false){
            setEstado(true);
            System.out.println("Encendido televisor");
        }else {
            System.out.println("el televisor ya estaba encendido");
        }

    }
}
