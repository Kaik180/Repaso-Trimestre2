package org.example.AdmiCasa;

import org.example.PracticaInterfaz.Superheroe;
import org.example.PracticaInterfaz.Superman;

import java.util.ArrayList;

public class CasaApp {
    static void main() {

        Dispositivo horno = new Dispositivo("Horno",false) {
            @Override
            public void enceder() {
                if (isEstado()==false){
                    setEstado(true);
                    System.out.println("Encendiendo proyector");
                }else {
                    System.out.println("el proyector ya esta encendido");
                }
            }
        };
        horno.enceder();
        ControlRemoto proyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando el proyector con el control remoto");

            }
        };

        AireAcondicionado aire = new AireAcondicionado("aire acondicionado",false);
        Televisor televisor = new Televisor("televisor", false);
        ParlanteInteligente parlante = new ParlanteInteligente("parlante", false);
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(aire);
        listaDispositivos.add(televisor);
        listaDispositivos.add(parlante);
        listaDispositivos.add(horno);
        for (Dispositivo a : listaDispositivos){
            a.enceder();
            a.mostrarEstado();
            a.apagar();
            if (a instanceof Televisor || a instanceof AireAcondicionado){
                ((ControlRemoto) a).sincronizar();
            }
        }
    }

}
