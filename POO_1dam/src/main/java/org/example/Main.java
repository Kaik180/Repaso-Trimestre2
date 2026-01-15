package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Bocadillo pepito = new Bocadillo("pepito", "normal", "beacon", "tartara",10);

        pepito.Imprimirinfobocata();

        System.out.println(pepito.getNombre()+""+pepito.getprecio()+"€");
        Bocadillo vacio = new Bocadillo();
        vacio.setNombre("chivito");
    }
}
