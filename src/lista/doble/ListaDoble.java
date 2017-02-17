/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doble;

import java.util.Iterator;

/**
 *
 * @author karimnot
 */
public class ListaDoble<T> implements Iterable<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    private boolean reversa;

    public ListaDoble() {
        inicio = null;
        fin = null;
        reversa = false;
    }

    public boolean isReversa() {
        return reversa;
    }

    public void setReversa(boolean reversa) {
        this.reversa = reversa;
    }
    
    public boolean isListaVacia() {
        return inicio == null;
    }

    public void insertarInicio(T elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
            fin = inicio;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFinal(T elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
            fin = inicio;
        } else {
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void insertarOrdenado(Comparable<T> elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            Nodo aux = inicio;
            Nodo ant = null;
            while ((aux != null) && (elemento.compareTo((T) aux.getDato()) > 0)) {
                ant = aux;
                aux = aux.getSiguiente();
            }
            if (ant == null) {
                nuevo.setSiguiente(inicio);
                inicio.setAnterior(nuevo);
                inicio = nuevo;
            }else{
                ant.setSiguiente(nuevo);
                nuevo.setAnterior(ant);
                nuevo.setSiguiente(aux);
                if (aux != null){
                    aux.setAnterior(nuevo);  
                }else{
                    fin = nuevo;
                }
            }
        }
    }
      
    public void eliminarInicio(){
       if (!isListaVacia()){
            if (inicio == fin){
                inicio = null;
                fin = null;
            }else{
                Nodo aux = inicio;  
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
                aux.setSiguiente(null);
            }
       }
    }
    
    public void eliminarFinal(){
       if (!isListaVacia()){
            if (inicio == fin){
                inicio = null;
                fin = null;
            }else{
                Nodo aux = fin;  
                fin = fin.getAnterior();
                fin.setSiguiente(null);
                aux.setAnterior(null);
            }
       }
    }    

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            
            Nodo<T> aux = reversa ? fin : inicio;

            @Override
            public boolean hasNext() {
                return aux != null;
            }
            
            @Override
            public T next() {
                T tmp = aux.getDato();
                aux = reversa ? aux.getAnterior() : aux.getSiguiente();
                return tmp;
            }
        };
    }
    

}
