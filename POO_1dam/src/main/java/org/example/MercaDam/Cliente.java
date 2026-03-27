package org.example.MercaDam;

import java.util.HashMap;

public class Cliente {
    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public String getUsuario() { return usuario; }
    public String getContrasenya() { return contrasenya; }
    public String getDireccion() { return direccion; }
    public Pedido getPedido() { return pedido; }
    public boolean hasPromociones() { return promociones; }
    public void setPromociones(boolean valor) { this.promociones = valor; }

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.direccion = "Calle falsa, 13";
        this.pedido = null;
        this.promociones = false;
    }

    public void crearPedido() {
        this.pedido = new Pedido();
    }

    public void insertarProducto(Producto producto) {
        if (this.pedido != null) {
            HashMap<Producto, Integer> lista = this.pedido.getPedido();
            lista.put(producto, lista.getOrDefault(producto, 0) + 1);
            this.pedido.actualizarImporteTotal(producto.getPrecio());
        }
    }

}
