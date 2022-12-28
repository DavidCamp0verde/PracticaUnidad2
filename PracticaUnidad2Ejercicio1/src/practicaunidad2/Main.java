/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidad2;

import Controlador.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada<Float> lista = new ListaEnlazada<>();
        ListaEnlazada<Float> lista2 = new ListaEnlazada<>();
        lista.llenarLista(200);
//        lista2.llenarLista(20);
        System.out.println("ASCENDENTE");
        lista.ordenarShell(null, 1).imprimirListaFloat();
//        lista.ordenarShell(null, 2).imprimirListaFloat();
        
//        ListaEnlazada<String> listaS = new ListaEnlazada<>();
//        listaS.insertar("David");
//        listaS.insertar("Nayeon");
//        listaS.insertar("Jeongyeon");
//        listaS.insertar("Momo");
//        listaS.insertar("Sana");
//        listaS.insertar("Jihyo");
//        listaS.insertar("Mina");
//        listaS.insertar("Dahyun");
//        listaS.insertar("Chaeyoung");
//        listaS.insertar("Tzuyu");
//        listaS.imprimir();
//        listaS.busquedaSecuencial(null, "na").imprimir();
        
//        ListaEnlazada<Integer> listaN = new ListaEnlazada<>();
//        ListaEnlazada<Integer> listaN2 = new ListaEnlazada<>();
//        listaN.insertar(-1);
//        listaN.insertar(0);
//        listaN.insertar(2);
//        listaN.insertar(5);
//        listaN.insertar(7);
//        listaN.insertar(9);
//        listaN.insertar(20);
//        listaN.insertar(25);
//        Integer posicion = listaN.busquedaBinaria(null, 20);
//        System.out.println(posicion);
        
    }
    
}
