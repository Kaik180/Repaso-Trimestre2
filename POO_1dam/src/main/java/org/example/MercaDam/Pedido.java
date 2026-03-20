package org.example.MercaDam;

import java.util.HashMap;

public class Pedido {
    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Pedido() {
        this.pedido = new HashMap<>();
        this.importeTotal = 0;
    }
    public void actualizarImporteTotal(double importe){

    }
    public void aplicarPromo3x2(){

    }
    public void aplicarPromo10(){

    }
    private HashMap<Producto,Integer> pedido;
    private double importeTotal;

}
