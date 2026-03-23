package org.example.Colecciones;

import java.util.Objects;

public class Informe {
    private int codigo;
    private String descripcion;
    private TipoTarea tipo;

    public Informe(int codigo, String descripcion, TipoTarea tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public TipoTarea getTipo() { return tipo; }
    public void setTipo(TipoTarea tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

   // @Override
   // public boolean equals(Object a) {
    //    if (this == a) return true;

     //   if (!(o instanceof Informe)) return false;

    //    Informe otro = (Informe) a;

     //   return this.codigo == otro.codigo && this.tipo == otro.tipo;
    //}

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
