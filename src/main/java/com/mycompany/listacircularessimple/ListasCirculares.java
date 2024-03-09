/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listacircularessimple;

/**
 *
 * @author jcasb
 */
public class ListasCirculares {
    
    //Referenciamos al primer nodo de la lista circular
    NodoCircular cabeza;
    
    //Creamos un constructor para inicializar la lista como vacia
    public ListasCirculares(){
        this.cabeza = null;//La cabeza de la lista circular comienza en vacia 
    }
    
    /*AQUI DEFINES LOS METODOS PARA LA LISTA DE OPCIONES DE LA LISTA*/
    
    //Metodo para insertar un nuevo nodo al inicio de la lista circular 
    public void insertarAlInicio(int dato){
        //Creamos un nuevo nodo con el valor proporcionado
        NodoCircular nuevoNodo = new NodoCircular(dato);
        //Verificamos si la lista esta vacia
        if(cabeza ==  null){
            //Establecer el siguiente del nuevo nodo como el mismo 
            nuevoNodo.siguiente = nuevoNodo;
            //El nuevo nodo se convierte en cabeza de la lista circular
            cabeza = nuevoNodo;
            
        }else{
        //Se establece el nuevo nodo como la cabeza actual
        nuevoNodo.siguiente = cabeza;
        NodoCircular temp = cabeza;
        //Avanzamos hasta el ultimo nodo de la lista
        while(temp.siguiente != cabeza){
            temp = temp.siguiente;
        }
        
        //Establecemos el enlace o siguiente del ultimo nodo como el nuevo nodo
        temp.siguiente  = nuevoNodo;
        //Actualizamos la cabeza para que apunte al nuevo nodo
        cabeza = nuevoNodo;
        
        
    }
        
    }
    
    public void insertarAlFinal(int dato){
        //Creamos un nuevo nodo con el valor proporcionado
        NodoCircular nuevoNodo = new NodoCircular(dato);
        //Verificamos si la lista esta vacia
        if(cabeza ==  null){
            //Establecer el siguiente del nuevo nodo como el mismo 
            nuevoNodo.siguiente = nuevoNodo;
            //El nuevo nodo se convierte en cabeza de la lista circular
            cabeza = nuevoNodo;
            
        }else{
        //Se establece el nuevo nodo como la cabeza actual
        nuevoNodo.siguiente = cabeza;
        NodoCircular temp = cabeza;
        //Avanzamos hasta el ultimo nodo de la lista
        while(temp.siguiente != cabeza){
            temp = temp.siguiente;
        }
        
        //Establecemos el enlace o siguiente del ultimo nodo como el nuevo nodo
        temp.siguiente  = nuevoNodo;
        
        
    }
    
}
    
    public void eliminarAlInicio(){
        
        
        //Verificamos si la lista esta vacia       
        //!= significa "si no esta"
        if(cabeza !=  null){
            NodoCircular temp = cabeza;
            //Avanzamos hasta el ultimo nodo
            while(temp.siguiente != cabeza){
                temp = temp.siguiente;
            }
            if (temp == cabeza){
                cabeza = null;
            }else{
                //Elimina el enlaze al primer nodo
               temp.siguiente = cabeza.siguiente;
               //La cabeza se mueve al siguiente nodo
               cabeza = cabeza.siguiente;
            }
        }else{
            System.out.println("La lista se enceuntra vacia.");
        }
    }
    
    //Metodo para imprimir los elementos de la lista circular
    public void imprimirLista(){
        //verificar si la lista circular esta vacia
        if(cabeza == null){
            System.out.println("Lista Circular esta vacia");
            return;
        }
        NodoCircular temp = cabeza;
        System.out.println("Lista circular");
        do{
            //Imprime el valor del nodo actual
            System.out.println(temp.dato + " ");
            //Avanza al siguiente nodo
            temp = temp.siguiente;
            //Repite hasta volver al inicio de la lista circular simple
        }while(temp != cabeza);
        System.out.println();
        
        }
    }

    

       
        
        
    


