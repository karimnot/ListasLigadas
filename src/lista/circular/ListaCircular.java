/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.circular;

/**
 *
 * @author redoaxaca
 */
public class ListaCircular<T> {
    
    private Nodo<T> inicio;
    private Nodo<T> origen;
    private Sentido sentido;
    
    public ListaCircular(){
        this(Sentido.CLOCKWISE);
    }    
    
    public ListaCircular(Sentido sentido){
        this.sentido = sentido;
        inicio = null;
        origen = null;
    }
    
    public boolean isListaVacia(){
        return inicio == null;
    }
    
    public void insertar(T elemento){
        Nodo<T> nuevo = new Nodo(elemento);
        if (isListaVacia()){
            origen = nuevo;
        }else{
            Nodo aux = origen;
            while (aux.getSiguiente() != origen){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(origen);
            if (sentido == Sentido.COUNTERCLOCKWISE){
                origen = nuevo;
            }
        } 
        reset();

    }
    
    public void reset(){
        inicio = origen;
    }
    
    public T getElemento(){
        T aux = inicio.getDato();
        inicio = inicio.getSiguiente();
        return aux;
    }
    
    public boolean isInitializated(){
        return  inicio == origen;
    }
    

}
