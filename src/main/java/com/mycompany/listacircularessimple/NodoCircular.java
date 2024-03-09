/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listacircularessimple;

/**
 *
 * @author jcasb
 */

//EL NODO NECESITA UN DATO Y UNA REFERENCIA
public class NodoCircular {
    
    int dato;//Almacenar el valor del nodo
    
    NodoCircular siguiente;//Referencia al siguiente nodo
    
    //Constructor para crear un nuevo nodo con el valor proporcionado
    public NodoCircular(int dato){
        
        //Inicializamos los valores de nodo como null
        this.dato = dato;
        this.siguiente = null;
        
    }
    
}
