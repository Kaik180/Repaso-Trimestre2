package org.example.MercaDam;

import java.util.Random;

public class Cliente {
    private String usuario;

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    private String contrasenya;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }

    public void crearPedido(){

    }

    public void insertarProducto(Producto producto){

    }

    private String direccion;
    private Pedido pedido;
    private boolean promociones;

}
