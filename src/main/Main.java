/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import lista.circular.ListaCircular;
import lista.circular.Sentido;
import lista.doble.ListaDoble;
import lista.simple.ListaSimple;

/**
 *
 * @author karimnot
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("************** Simple *********************");
        
        ListaSimple<Integer> simple = new ListaSimple();
        
        simple.insertarOrdenado(5);
        simple.insertarOrdenado(1);
        simple.insertarOrdenado(10);
        simple.insertarOrdenado(3);
        simple.insertarOrdenado(9);

        for (Integer elemento : simple) {
            System.out.println(elemento);
        }
        
        
        
        System.out.println("************** Doble *********************");
        
        ListaDoble<Integer> doble = new ListaDoble();
        
        doble.insertarOrdenado(5);
        doble.insertarOrdenado(1);
        doble.insertarOrdenado(10);
        doble.insertarOrdenado(3);
        doble.insertarOrdenado(9);
        
        doble.setReversa(true);

        for (Integer elemento : doble) {
            System.out.println(elemento);
        }
        
        
        
        System.out.println("**************Circular CounterClockWise*********************");
        

        ListaCircular<Integer> circularCounter = new ListaCircular(Sentido.COUNTERCLOCKWISE);

        circularCounter.insertar(1);
        circularCounter.insertar(2);
        circularCounter.insertar(3);
        circularCounter.insertar(4);
        circularCounter.insertar(5);
        circularCounter.insertar(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(circularCounter.getElemento());
            
        }
        
        System.out.println("**************Circular ClockWise*********************");

        ListaCircular<Integer> circular = new ListaCircular();

        circular.insertar(1);
        circular.insertar(2);
        circular.insertar(3);
        circular.insertar(4);
        circular.insertar(5);
        circular.insertar(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(circular.getElemento());
            
        }
    }

}
