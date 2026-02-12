package org.example.PlataformaDeStreaming;

public class PlanPremiun extends Suscripcion{
    public PlanPremiun(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
    }
}
