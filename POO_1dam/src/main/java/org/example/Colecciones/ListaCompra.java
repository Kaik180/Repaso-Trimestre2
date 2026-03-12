package org.example.Colecciones;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaCompra {
    public static void añadirProducto(String prudcto){


    }
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        LinkedList<String> lista = new LinkedList();
        while (repetir){
            System.out.println("--- LISTA DE LA COMPRA ---");
            System.out.println("1.Añadir producto al final");
            System.out.println("2.Eliminar primer producto");
            System.out.println("3.Eliminar producto por nombre");
            System.out.println("4.Ver primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostar lista actual");
            System.out.println("X.Salir");
            System.out.println("Selecione una opcion: ");
            String opcion = teclado.nextLine().toLowerCase();

            switch (opcion){
                case "1":
                    System.out.println("Producto a añadir: ");
                    String producto = teclado.nextLine();
                    lista.offerLast(producto);
                    break;
                case "2":
                    System.out.println("Producto elimitado: "+ lista.pollFirst());
                    break;
                case "3":
                    System.out.println("Producto que quieres eleminar: ");
                    String producto3 = teclado.nextLine();
                    if (lista.contains(producto3)){
                        int count = 0;
                        for(String a : lista){
                            if (a.equals(producto3)){
                                lista.remove(count);
                            }
                            count++;
                        }
                    }else {
                        System.out.println("No se ha encontrado el producto en la lista");

                    }


                    break;
                case "4":
                    System.out.println("Primer producto de la lista: "+ lista.peekFirst());
                    break;
                case "5":
                    System.out.println("Producto que quieres buscar: ");
                    String producto5 = teclado.nextLine();
                    if (lista.contains(producto5)){
                        System.out.println("El producto esta en la lista: ");
                    }else {
                        System.out.println("El producto no esta en la lista: ");
                    }
                    break;
                case "6":
                    for(String a : lista){
                        System.out.println(lista.indexOf(a) +". "+ a);
                    }

                    break;
                case "x":
                    repetir=false;
                    break;


            }

        }






    }
}
