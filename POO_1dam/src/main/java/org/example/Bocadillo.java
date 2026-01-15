package org.example;

public class Bocadillo {
    private String nombre;
    private String pan;
    private String ingredientes;
    private String salsas;
    private double precio;

    public Bocadillo( String nombre, String pan, String ingredientes,  String salsas, double precio ){
     this.nombre = nombre;
     this.pan = pan;
     this.ingredientes = ingredientes;
     this.salsas =salsas;
     this.precio=precio;
    }
    public void Imprimirinfobocata(){
        System.out.println("nombre: "+ nombre);
        System.out.println("tipo de pan: "+ pan);
        System.out.println("ingredientes: "+ ingredientes);
        System.out.println("salsa: "+ salsas);
        System.out.println("precio: "+ precio);
    }
    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPan(){
        return pan;
    }
    public  void setPan(String pan){
        this.pan = pan;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    public  void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    public String getSalsas(){
        return salsas;
    }
    public  void setSalsas(String salsas){
        this.salsas = salsas;
    }
    public double getprecio(){
        return precio;
    }
    public  void setprice(double precio){
        this.precio = precio;
    }
    public Bocadillo(){

    }
}
