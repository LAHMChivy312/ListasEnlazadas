/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasluisangel;

import java.util.Scanner;
public class ListasLuisAngel {

    




    public static int LeerInt(String linea) {
        Scanner leer = new Scanner(System.in);
        System.out.println(linea);
        int dato = leer.nextInt();
        return dato;
    }

    
    public static void main(String[] args) {
        Lista coleccion = new Lista();
        int opcion;
        do {
            System.out.println("1.- Ingrese Datos: ");
            System.out.println("2.- Mostrar Lista");
            System.out.println("3.- Suprimir los que Sobrepasan el Limite");
            System.out.println("4.- Salir");
            opcion = LeerInt("Escoja una Opción:");

            switch (opcion) {
                case 1: {
                    int nuevo = LeerInt("Inserte elementos de la lista: ");
                    coleccion.agregarFin(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista es: ");
                    coleccion.imprimir();
                    break;
                }
                case 3: {
                    int valor = LeerInt("Ingrese el valor que sirva de limite: ");
                    coleccion.eliminar(valor);
                    break;
                }
                case 4: {
                    System.out.println("Aqui termina el programa ¡¡¡Gracias!!!");
                    break;
                }
            }
        } while (opcion != 4);
    }
}
