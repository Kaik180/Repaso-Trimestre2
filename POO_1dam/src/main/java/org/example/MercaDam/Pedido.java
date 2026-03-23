package org.example.MercaDam;

import java.util.HashMap;

public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importeTotal;

    public Pedido() {
        this.pedido = new HashMap<>();
        this.importeTotal = 0.0;
    }

    public void actualizarImporteTotal(double importe) {
        this.importeTotal += importe;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void aplicarPromo3x2() {
        for (Producto p : pedido.keySet()) {
            int cantidad = pedido.get(p);
            if (cantidad >= 3) {
                int unidadesGratis = cantidad / 3;
                this.importeTotal -= (unidadesGratis * p.getPrecio());
            }
        }
    }


    public void aplicarPromo10() {
        this.importeTotal = this.importeTotal * 0.90;
    }
}
