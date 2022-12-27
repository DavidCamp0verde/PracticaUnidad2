/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Auto;

/**
 *
 * @author David Campoverde
 */
public class AutoController {
    ListaEnlazada<Auto> autos = new ListaEnlazada<>();

    public ListaEnlazada<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ListaEnlazada<Auto> autos) {
        this.autos = autos;
    }
    
    
}
