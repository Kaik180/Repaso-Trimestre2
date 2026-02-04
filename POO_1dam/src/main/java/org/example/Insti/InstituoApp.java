package org.example.Insti;

import org.example.Estudiante;

public class InstituoApp {
    static void main() {

        Instituto instituto =new Instituto();
        Instituto mariaBlasco = new Instituto("Maria","San vicente");
        System.out.println(instituto);
        Curso curso = new Curso("primero",10);
        Estudiante estudiante =new Estudiante("kevin","adsadasdasdad");
    }
}
