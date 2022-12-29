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
        ac.getAutos().ordenarShell("precio",1).imprimir();
        try {
//            Integer pos = ac.getAutos().busquedaBinaria("precio", 20050.99f);
//            System.out.println(ac.getAutos().obtener(pos));
//              ac.getAutos().busquedaSecuencial("matricula", "dc").imprimir();
            ac.getAutos().busquedaBinariaSecuencial("precio", 22535.8f).imprimir();
        } catch (Exception e) {
            System.out.println("Error ctm: "+e.getMessage()+"\nLinea: "+e.getStackTrace()[0].getLineNumber()+"\nClase: "+e.getStackTrace()[0].getClassName());
        }
        
        
        

        
        
    }
    
}
