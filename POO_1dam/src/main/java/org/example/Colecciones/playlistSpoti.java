package org.example.Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class playlistSpoti {
    static void main() {
        Queue<String> playlist = new LinkedList<>();
        playlist.offer("cancion1");
        playlist.offer("cancion2");
        playlist.offer("cancion3");
        System.out.println("Estado inicial de la playlist: ["+ playlist.poll() +"]");
        for (int i=0; i<=playlist.size();i++){
            System.out.println("Estado de la playlist despues de reproducir una cancion: ["+playlist.poll() +"]");
        }
        System.out.println("La playlist ha terminado");

        // otra manera de hacerlo
        playlist.offer("cancion1");
        playlist.offer("cancion2");
        playlist.offer("cancion3");
        System.out.println("Estado inicial de la playlist: ["+ playlist.poll() +"]");
        while (!playlist.isEmpty()){
            System.out.println("Estado de la playlist despues de reproducir una cancion: ["+playlist.poll() +"]");
        }
        System.out.println("La playlist ha terminado");
    }
}
