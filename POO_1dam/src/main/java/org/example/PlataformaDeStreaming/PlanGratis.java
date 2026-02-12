package org.example.PlataformaDeStreaming;

public class PlanGratis extends Suscripcion {

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
    }
}
