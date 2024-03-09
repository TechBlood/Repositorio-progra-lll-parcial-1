/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listacircularessimple;
import java.util.Scanner;
/**
 *
 * @author jcasb
 */
public class ListaCircularesSimple {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        //Crea una nueva lista circular simple
        ListasCirculares lista = new ListasCirculares();
        
        //Creamos un menu
        /*Bucle Infinito*/
        while(true){
            //MOstrar las opciones
            System.out.println("Opciones: "); //Este lo defines aqui mismo en su CASE
            System.out.println("1.Insertar elemento al inicio: ");
            System.out.println("2.Insertar elemento al final: ");
            System.out.println("3.Eliminar el primer elemento: ");
            System.out.println("4.Imprimir la lista: ");//Este lo defines aqui mismo en su CASE
            System.out.println("5.Salir: ");//Este lo defines aqui mismo en su CASE
            System.out.println("Seleccione una opcion: ");
            //lee la opcion seleccionada por el usuario
            int opcion = scanner.nextInt();
            
            //Creamos un switch para evaluar la seleccion del usuario
            switch(opcion){
                case 1:
                    //Se solicita al usuario ingresar el elemento
                    System.out.print("Ingrese el elemento al insertar: ");
                    //lee el elemento al final de la lista
                    int elementoInicio = scanner.nextInt();
                    lista.insertarAlInicio(elementoInicio);
                    break;
                case 2:
                    
                    System.out.print("Ingrese el elemento a insertar al final: ");
                    
                    int elementoFin = scanner.nextInt();
                    lista.insertarAlFinal(elementoFin);
                    break;
                case 3:
                  
                    lista.eliminarAlInicio();
                    break;
                case 4:
                    
                    lista.imprimirLista();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    
                    scanner.close();
                    
                    System.exit(0);
                    
                    
                    default:
                        System.out.print("La opcion ingresada no es correcta, por favor ingrese una que si lo sea");
                    
                    
            }     
            }
            
        }
    }


