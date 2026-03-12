package org.example.Mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperatura {
    static HashMap<String, Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    static void main() {
        boolean repetir = true;
        System.out.println("*** REGISTROS DE TEMPERATURAS ***");
        while (repetir){
            System.out.println("Elige una opcion [insertar,actualizar, consultar, verTodas, salir ");
            String opcion = teclado.nextLine().toLowerCase();
            switch (opcion){
                case "insertar": insertar();
                break;
                case "actualizar": actualizar();
                break;
                case "consultar": consultar();
                break;
                case "ver todos": verTodas();
                break;
                case "salir": return;

                default:
                    System.out.println("no existe la ipcion. vuelve a elegir una opcion");






            }
            System.out.println("*** Mapita Temporal ***");
            for(Map.Entry<String,Double> mapita : mapa.entrySet()){
                System.out.println(mapita.getKey()+ " - "+ mapita.getValue());
            }

        }
    }
    public static void insertar(){
        System.out.println("introduce los datos (ciudad_temperatura");
        String ciudad[]=teclado.next().split("_");
        //San Juan_-15
        mapa.put(ciudad[0],Double.valueOf(ciudad[1]));
    }
    public static void actualizar(){
        insertar();
    }
    public static void consultar(){
        System.out.println("introduce el nombre de la ciudad");
        String ciudad=teclado.nextLine();
            if (mapa.containsKey(ciudad)){
                System.out.println("temperatura en "+ciudad+ ": "+ mapa.get(ciudad));
            }else {
                System.out.println("No se a encontrado ninguna coincidencia");
            }


    }
    public static void verTodas(){
        for(Map.Entry<String,Double> mapita : mapa.entrySet()){
        System.out.println(mapita.getKey()+ ": "+ mapita.getValue());
        }
    }




}
