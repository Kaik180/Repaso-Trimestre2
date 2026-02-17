package org.example.AdmiCasa;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicinado con control remoto");

    }

    @Override
    public void enceder() {
        if (isEstado()==false){
            setEstado(true);
            System.out.println("Encendiendo aire acondicinado");
        }else {
            System.out.println("el aire acondicionado ya esta encendido");
        }
    }
}
