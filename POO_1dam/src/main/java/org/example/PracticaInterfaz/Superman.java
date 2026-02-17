package org.example.PracticaInterfaz;

public class Superman extends Superheroe implements Volador, Ataques{

    @Override
    public void volar() {
        System.out.println("volando sobre la ciudad vigilando a los malvados");

    }

    @Override
    public void rayolaser() {
        System.out.println("Disparando láser con los ojos!!!");
    }

    @Override
    public void alientogelido() {
        System.out.println("Superman te sopla en la cara");
    }
}
