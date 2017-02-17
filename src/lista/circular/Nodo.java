/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.circular;

/**
 *
 * @author karimnot
 */
public class Nodo<T> {
    
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo(T elemento){
        dato = elemento;
        siguiente = this;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
