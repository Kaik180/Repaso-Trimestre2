package org.example.Carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona{
    static Scanner teclado = new Scanner(System.in);
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa() {
        System.out.println("introducir la empresa a la que trabaja::");
        empresa = teclado.next();
        teclado.nextLine();
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    public Seguridad(int codigo, String nombre, int sueldo, ArrayList<String> armas) {
        super(codigo, nombre, sueldo);
        setEmpresa();
        this.armas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("trabaja para la empresa"+ empresa);
        System.out.println("tiene las siguientes armas equipadas:");
        for (String a : armas){
            System.out.println(a);
        }
    }

    @Override
    public void trabajar() {
        System.out.println("vigilar el carrefour y sospechosos");
    }

    public void listaArmasAdd(String arma){
        this.armas.add(arma);

    }
    public void listaArmasremove(String arma){
        this.armas.remove(arma);

    }

    private String empresa;
    private ArrayList<String> armas;
}
