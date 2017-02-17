/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doble;

/**
 *
 * @author karimnot
 */
public class Nodo<T> {
    
    private T dato;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;
    
    public Nodo(T elemento){
        dato = elemento;
        siguiente = null;
        anterior = null;
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

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
    
    
    
}
