package org.example.Insti;

import lombok.*;

import java.util.Objects;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Instituto {

    private String nombre;
    private String poblacion;

    private void setNombre( String nombre){
        this.nombre= Objects.requireNonNullElse(nombre, "IES");
    }
}
