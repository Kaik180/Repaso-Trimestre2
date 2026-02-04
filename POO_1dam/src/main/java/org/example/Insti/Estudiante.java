package org.example.Insti;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private String nombre;
    private int edad;
    private Curso curso;
}
