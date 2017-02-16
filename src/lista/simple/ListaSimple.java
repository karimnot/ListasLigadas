package lista.simple;

import java.util.Iterator;

/**
 *
 * @author redoaxaca
 */
public class ListaSimple<T> implements Iterable<T> {

    private Nodo<T> inicio;

    public ListaSimple() {
        inicio = null;
    }

    public boolean isListaVacia() {
        return inicio == null;
    }

    public void insertarInicio(T elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertarFinal(T elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void insertarOrdenado(Comparable<T> elemento) {
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            Nodo ant = null;
            while ((aux != null) && (elemento.compareTo((T) aux.getDato()) > 0)) {
                ant = aux;
                aux = aux.getSiguiente();
            }
            if (ant == null) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }else{
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
            }
        }
    }
      
    public void eliminarInicio(){
       if (!isListaVacia()){
            Nodo aux = inicio;  
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);
       }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            
            Nodo<T> aux = inicio;
            
            @Override
            public boolean hasNext() {
                return aux != null;
            }
            
            @Override
            public T next() {
                T tmp = aux.getDato();
                aux = aux.getSiguiente();
                return tmp;
            }
        };
    }
    

}
