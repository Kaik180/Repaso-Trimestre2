package org.example.AdmiCasa;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void enceder() {
        if (isEstado()==false){
            setEstado(true);
            System.out.println("Activando parlante con comando de voz");
        }else {
            System.out.println("el parlante ya esta encendido");
        }
    }
}
