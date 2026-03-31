package org.example;

import java.util.ArrayList;
import java.util.List;

public class Anonimas {
    public static void main(String[] args) {
        List<Dispositivo> listaDispositivos = new ArrayList<>();

        Dispositivo proyector = new Dispositivo() {
            private boolean encendido = false;

            @Override
            public void encender() {
                if (!encendido) {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    encendido = true;
                    sincronizarEspecial();
                } else {
                    System.out.println("El proyector ya está encendido.");
                }
            }

            private void sincronizarEspecial() {
                ControlRemoto control = new ControlRemoto() {
                    @Override
                    public void sincronizar() {
                        System.out.println("Sincronizando proyector con control remoto de presentación...");
                    }
                };
                control.sincronizar();
            }
        };

        Dispositivo hornoInteligente = new Dispositivo() {
            private boolean encendido = false;

            @Override
            public void encender() {
                if (!encendido) {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    encendido = true;
                } else {
                    System.out.println("El horno ya está encendido.");
                }
            }
        };

        listaDispositivos.add(proyector);
        listaDispositivos.add(hornoInteligente);

        for (Dispositivo dispositivoActual : listaDispositivos) {
            dispositivoActual.encender();
        }
    }
}
