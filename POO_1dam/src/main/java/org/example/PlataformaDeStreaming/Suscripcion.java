package org.example.PlataformaDeStreaming;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;
    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }




    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public abstract void obtenerBeneficios();


    public void mostrarInfo(){
        System.out.println(nombrePlan + " Precio: "+ precio);
    }


}
