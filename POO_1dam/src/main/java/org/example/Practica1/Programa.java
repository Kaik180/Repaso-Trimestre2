package org.example.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void addEmpleado(Empleado e) {
        listaEmpleados.add(e);
    }

    public void addInvitado(Invitado i) {
        listaInvitados.add(i);
    }


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }

    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = director;
        cadena.addPrograma(this);
    }
    public void invitadosTemporada(int temporadaBuscada) {
        int contador = 0;
        for (Invitado i : listaInvitados) {
            if (i.getTemporada() == temporadaBuscada) {
                System.out.println("Nombre: " + i.getNombre() + ", Profesión: " + i.getProfesion());
                contador++;
            }
        }
        System.out.println("Total de invitados en la temporada " + temporadaBuscada + ": " + contador);
    }
    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }
        return contador;
    }
    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre);
        System.out.println("El invitado " + nombre + " ha acudido " + veces + " veces.");

        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(" - Fecha: " + i.getFecha() + ", Temporada: " + i.getTemporada());
            }
        }
    }
    public boolean buscarInvitado(String nombre) {
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    public static void invitadoAntes(String nombre, Programa p1, Programa p2) {
        LocalDate fecha1 = null;
        LocalDate fecha2 = null;

        for (Invitado i : p1.getListaInvitados()) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                fecha1 = i.getFecha();
                break;
            }
        }

        for (Invitado i : p2.getListaInvitados()) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                fecha2 = i.getFecha();
                break;
            }
        }

        if (fecha1 != null && fecha2 != null) {
            if (fecha1.isBefore(fecha2)) {
                System.out.println(nombre + " estuvo primero en el programa " + p1.getNombre() + " el día " + fecha1);
            } else if (fecha2.isBefore(fecha1)) {
                System.out.println(nombre + " estuvo primero en el programa " + p2.getNombre() + " el día " + fecha2);
            } else {
                System.out.println(nombre + " estuvo en ambos programas el mismo día: " + fecha1);
            }
        } else {
            System.out.println("El invitado no ha estado en ambos programas.");
        }
    }





}
