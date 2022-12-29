/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidad2;

import Controlador.AutoController;
import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Auto;


/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.crearAutos();
        ac.getAutos().imprimir();
        ac.getAutos().ordenarShell("matricula",1).imprimir();

        
        
    }
    
}
