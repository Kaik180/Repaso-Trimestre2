package org.example.Mapa;

import java.util.*;

public class Diccionario {
   static Map<String, String> diccionario = new HashMap<>(1334);
    static Random rand = new Random();
    static Scanner teclado = new Scanner(System.in);
    static void main() {


        // --- PROFESIONES (JOBS) ---
        diccionario.put("médico", "doctor"); diccionario.put("enfermero", "nurse");
        diccionario.put("profesor", "teacher"); diccionario.put("ingeniero", "engineer");
        diccionario.put("abogado", "lawyer"); diccionario.put("escritor", "writer");
        diccionario.put("camarero", "waiter"); diccionario.put("conductor", "driver");
        diccionario.put("cocinero", "chef"); diccionario.put("artista", "artist");
        diccionario.put("piloto", "pilot"); diccionario.put("policía", "police");

        // --- PARTES DEL CUERPO (BODY PARTS) ---
        diccionario.put("cabeza", "head"); diccionario.put("mano", "hand");
        diccionario.put("brazo", "arm"); diccionario.put("pierna", "leg");
        diccionario.put("pie", "foot"); diccionario.put("dedo", "finger");
        diccionario.put("espalda", "back"); diccionario.put("hombro", "shoulder");
        diccionario.put("corazón", "heart"); diccionario.put("cerebro", "brain");
        diccionario.put("estómago", "stomach"); diccionario.put("rodilla", "knee");

        // --- ANIMALES (ANIMALS) ---
        diccionario.put("perro", "dog"); diccionario.put("gato", "cat");
        diccionario.put("pájaro", "bird"); diccionario.put("caballo", "horse");
        diccionario.put("pez", "fish"); diccionario.put("león", "lion");
        diccionario.put("elefante", "elephant"); diccionario.put("araña", "spider");
        diccionario.put("serpiente", "snake"); diccionario.put("vaca", "cow");
        diccionario.put("cerdo", "pig"); diccionario.put("oveja", "sheep");

        // --- LUGARES Y CIUDAD (PLACES) ---
        diccionario.put("casa", "house"); diccionario.put("edificio", "building");
        diccionario.put("calle", "street"); diccionario.put("ciudad", "city");
        diccionario.put("parque", "park"); diccionario.put("playa", "beach");
        diccionario.put("aeropuerto", "airport"); diccionario.put("hospital", "hospital");
        diccionario.put("biblioteca", "library"); diccionario.put("tienda", "store");
        diccionario.put("iglesia", "church"); diccionario.put("puente", "bridge");

        // --- COMIDA Y BEBIDA (FOOD & DRINK) ---
        diccionario.put("pan", "bread"); diccionario.put("agua", "water");
        diccionario.put("leche", "milk"); diccionario.put("café", "coffee");
        diccionario.put("manzana", "apple"); diccionario.put("carne", "meat");
        diccionario.put("queso", "cheese"); diccionario.put("azúcar", "sugar");
        diccionario.put("sal", "salt"); diccionario.put("fruta", "fruit");
        diccionario.put("arroz", "rice"); diccionario.put("huevo", "egg");

        // --- ADJETIVOS DE ESTADO ---
        diccionario.put("cansado", "tired"); diccionario.put("hambriento", "hungry");
        diccionario.put("sediento", "thirsty"); diccionario.put("enojado", "angry");
        diccionario.put("emocionado", "excited"); diccionario.put("aburrido", "bored");
        diccionario.put("inteligente", "smart"); diccionario.put("valiente", "brave");
        diccionario.put("silencioso", "quiet"); diccionario.put("ruidoso", "loud");

        // --- VERBOS COMPLEMENTARIOS ---
        diccionario.put("aprender", "learn"); diccionario.put("enseñar", "teach");
        diccionario.put("comprar", "buy"); diccionario.put("vender", "sell");
        diccionario.put("romper", "break"); diccionario.put("arreglar", "fix");
        diccionario.put("abrir", "open"); diccionario.put("cerrar", "close");
        diccionario.put("bailar", "dance"); diccionario.put("cantar", "sing");
        int aciertos = 0;
        int fallos = 0;

        String palabraEsp = palabraAleatoria(); // Usamos tu método
        String traduccionCorrecta = diccionario.get(palabraEsp);
        String respuesta = "";
        int contador = 0;
        while (!respuesta.equals("fin")){
            contador++;
            System.out.print("Palabra " + contador + " [" + palabraEsp + "]: ");
            String respuestaUsuario = teclado.nextLine().trim().toLowerCase();

            if (respuestaUsuario.equals(traduccionCorrecta.toLowerCase())) {
                System.out.println("> ¡Correcto!");
                aciertos++;
            } else {
                System.out.println("> Incorrecto. La respuesta era: " + traduccionCorrecta);
                fallos++;
            }
        }



    }
    public static void nuevoPar(String a, String b){
        diccionario.put(a,b);

    }
    public static String traduce(String a){
        if (diccionario.containsKey(a)){
            return diccionario.get(a);
        }else {
            System.out.println("No se a encontrado ninguna coincidencia");
        }
        return null;
    }
    public static String palabraAleatoria(){
        ArrayList<String> lista = new ArrayList<>(diccionario.keySet());
        int aleatorio = rand.nextInt(lista.size());


        return lista.get(aleatorio);


    }
    public static char primeraLetraTraduccion(String espanol){
        String ingles =diccionario.get(espanol);
        return ingles.charAt(0);

    }


}
