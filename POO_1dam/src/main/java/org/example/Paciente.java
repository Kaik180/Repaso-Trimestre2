package org.example;

import java.util.Random;

public class Paciente {
    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO =-1;
    private static final int PESO_IDEAL =0;
    private static final int SOBREPESO = 1;
    private static final int MAYORIAEDAD = 1;
    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;

    public Paciente(String nombre, int edad, char genero, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        this.genero = validargenero(genero);
        this.peso = validarpeso(peso);
        this.altura = validaraltura(altura);
    }

    public Paciente() {
        this(null,0,DEF_GENERO,0,0);
    }
    public void Imprimirpaciente(){
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);
        System.out.println("dni: "+ dni);
        System.out.println("genero: "+ genero);
        System.out.println("peso: "+ peso);
        System.out.println("altura: "+ altura+"cm");
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private String generarDNI() {
        String dni = "";

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;


        }
        char numero = sacarletrasdni(dni);
        return (dni+numero);
    }
    public char sacarletrasdni(String dni){
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        int res=Integer.parseInt(dni)%23;
        return letras[res];
    }
    public int calcularimc(){
        double resultado = peso/Math.pow((double) altura/100,2);
        if (resultado < 20){
            return INFRAPESO;
        }else if  (resultado>25){
            return SOBREPESO;
        }else {
            return PESO_IDEAL;
        }
    }
    public boolean esMayorDeEdad(){
        if (edad>=MAYORIAEDAD){
            return true;

        }else {
            return false;
        }
    }
    public char validargenero (char genero){
        if (genero == 'H' || genero=='M'){
            return genero;
        }else {
            return DEF_GENERO;
        }
    }
    public double validarpeso (double peso){
        if (peso == 0){
            return 60;
        }else {
            return peso;
        }
    }
    public int validaraltura (int altura){
        if (altura == 0){
            return 160;
        }else {
            return altura;
        }
    }

    public String toString(){
       return "Paciente [nombre: "+ nombre + " edad: "+ edad + " dni: "+ dni + " genero: "+ genero + " peso: "+ peso + " altura: "+ altura+"cm]";

    }
}
