/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.ListaEnlazada;

import Controlador.ListaEnlazada.Excepciones.ListaVaciaExcepcion;
import Controlador.ListaEnlazada.Excepciones.PosicionNoEncontradaException;
import Controlador.Utilidades.Utilidades;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/**
 *
 * @author David Campoverde
 */
public class ListaEnlazada<E> {

    private NodoLista<E> cabecera;
    private Integer size;
    private final Integer ascendente = 1;
    private final Integer descendente = 2;

    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    public Boolean estaVacia() {
        return cabecera == null;
    }

    /*
    private Integer tamanio(){
        Integer tamanio = 0;
        NodoLista<E> aux = cabecera;
        
        while(aux != null){
            tamanio++;
            aux = aux.getSiguiente();
        }
        
        
        return tamanio;
    }*/
    public void insertar(E dato) {
        NodoLista<E> nodo = new NodoLista<>(dato, null);

        if (estaVacia()) {
            this.cabecera = nodo;

        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        size++;
    }

    public void insertarCabecera(E dato) {

        if (estaVacia()) {
            insertar(dato);
        } else {
            NodoLista<E> nodo = new NodoLista<>(dato, null);
            nodo.setSiguiente(cabecera);
            cabecera = nodo;
            size++;
        }
    }

    public void insertarPosicion(E dato, Integer pos) throws PosicionNoEncontradaException {
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            if (pos == 0) {
                insertarCabecera(dato);
            } else {
                NodoLista<E> nodo = new NodoLista(dato, null);
                NodoLista<E> aux = cabecera;

                for (int i = 0; i < (pos - 1); i++) {
                    aux = aux.getSiguiente();
                }
                NodoLista<E> siguiente = aux.getSiguiente();
                aux.setSiguiente(nodo);
                nodo.setSiguiente(siguiente);
                size++;
            }

        } else {
            throw new PosicionNoEncontradaException();
        }
    }

    public void modificarPosicion(E dato, Integer pos) throws PosicionNoEncontradaException {
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            if (pos == 0) {
                cabecera.setDato(dato);
            } else {

                NodoLista<E> aux = cabecera;

                for (int i = 0; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setDato(dato);
            }

        } else {
            throw new PosicionNoEncontradaException();
        }
    }

    public E obtener(Integer pos) throws ListaVaciaExcepcion, PosicionNoEncontradaException {

        if (!estaVacia()) {
            E dato = null;
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    dato = cabecera.getDato();
                } else {
                    NodoLista<E> aux = cabecera;

                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getDato();
                }

            } else {
                throw new PosicionNoEncontradaException();
            }
            return dato;
        } else {
            throw new ListaVaciaExcepcion();
        }

    }

    public E eliminar(Integer pos) throws ListaVaciaExcepcion, PosicionNoEncontradaException {
        if (!estaVacia()) {
            E dato = null;
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    dato = cabecera.getDato();
                    cabecera = cabecera.getSiguiente();
                    size--;

                } else {
                    NodoLista<E> aux = cabecera;

                    for (int i = 0; i < pos - 1; i++) {
                        aux = aux.getSiguiente();
                    }

                    dato = aux.getDato();
                    NodoLista<E> proximo = aux.getSiguiente();
                    aux.setSiguiente(proximo.getSiguiente());
                    size--;
                }

            } else {
                throw new PosicionNoEncontradaException();
            }
            return dato;
        } else {
            throw new ListaVaciaExcepcion();
        }

    }

    public E[] toArray() {
        E[] matriz = null;
        if (this.size > 0) {
            matriz = (E[]) Array.newInstance(cabecera.getDato().getClass(), this.size);
            NodoLista<E> aux = cabecera;
            for (int i = 0; i < this.size; i++) {
                matriz[i] = aux.getDato();
                aux = aux.getSiguiente();
            }
        }
        return matriz;
    }

    public ListaEnlazada<E> toList(E[] matriz) {
        this.vaciar();
        for (int i = 0; i < matriz.length; i++) {
            this.insertar(matriz[i]);
        }
        return this;
    }

    public ListaEnlazada<E> ordenarShell(String atributo, Integer tipoOrdenacion) {
        E[] arreglo = toArray();
        Class<E> clazz = null;

        if (size > 0) {
            int intervalo, i, j, k;
            int n = arreglo.length;
            intervalo = n / 2;
            Object aux;
            clazz = (Class<E>) cabecera.getDato().getClass();
            Boolean isObject = Utilidades.isObject(clazz);
            if (isObject) {

            } else {
                while (intervalo > 0) {
                    for (i = intervalo; i < n; i++) {
                        j = i - intervalo;
                        while (j >= 0) {
                            k = j + intervalo;
                            intercambioDato(arreglo, j, k, intervalo, tipoOrdenacion);
                            j -= intervalo;
                        }
                    }
                    intervalo = intervalo / 2;
                }
            }
        }
        if (arreglo != null) {
            toList(arreglo);
        }
        return this;
    }

    public void intercambioDato(E[] arreglo, int j, int k, int intervalo, int tipoOrdenacion) {
        Class clazz = arreglo[0].getClass();
        Object aux;

        if (Utilidades.isNumber(clazz)) {
            if (tipoOrdenacion == descendente) {
                if (((Number) arreglo[j]).doubleValue() > ((Number) arreglo[k]).doubleValue()) {
                    j = -1;
                } else {
                    aux = (Number) arreglo[j];
                    arreglo[j] = arreglo[k];
                    arreglo[k] = (E) aux;
                }
            } else {
                if (((Number) arreglo[j]).doubleValue() < ((Number) arreglo[k]).doubleValue()) {
                    j = -1;
                } else {
                    aux = (Number) arreglo[j];
                    arreglo[j] = arreglo[k];
                    arreglo[k] = (E) aux;
                }
            }
        }
    }

    public float generarNumeroAleatorio() {
        float numAleatorio = 0;
        numAleatorio = (float) (Math.random() * 1000);
        return numAleatorio;
    }

    public void llenarLista(Integer tamanio) {
        Object aux;
        for (int i = 0; i < tamanio; i++) {
            aux = generarNumeroAleatorio();
            insertar((E)aux);
        }
    }

    public void vaciar() {
        this.cabecera = null;
    }

    public void imprimir() {
        System.out.println("-------------------------LISTA ENLAZADA-------------------------");
        NodoLista<E> aux = cabecera;
        while (aux != null) {
            System.out.print(aux.getDato().toString());
            aux = aux.getSiguiente();
        }
        System.out.println("-------------------------LISTA ENLAZADA-------------------------");
        System.out.println("\n");
    }

    public void imprimirListaFloat() {
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("-------------------------------LISTA ENLAZADA-------------------------------");
        NodoLista<E> aux = cabecera;
        int i = 0;
        while (aux != null) {
            System.out.print(formato.format(aux.getDato()) + "\t");
            aux = aux.getSiguiente();
            i++;
            if (i > 10) {
                System.out.println("\n");
                i = 0;
            }

        }
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n");
    }

    public NodoLista<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista<E> cabecera) {
        this.cabecera = cabecera;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
