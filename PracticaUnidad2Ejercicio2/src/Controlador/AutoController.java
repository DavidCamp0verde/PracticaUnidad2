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
    
    public void crearAutos(){
        getAutos().insertar(new Auto(1,"XCB-52013","BMW","X6",10000.99f));
        getAutos().insertar(new Auto(2,"DAVS-3561","Chevrolet","Aveo",20050f));
        getAutos().insertar(new Auto(3,"MDC","Ford","Mustang",13526f));
        getAutos().insertar(new Auto(4,"NJM-2219","Honda","Civic",15999.99f));
        getAutos().insertar(new Auto(5,"SJM-29124","Hyundai","Tucson",22535f));
        getAutos().insertar(new Auto(6,"DCT-282314","Jeep","Compass",17999.59f));
        getAutos().insertar(new Auto(7,"BHR-124","Ferrari","F8 Tributo",70589f));
        getAutos().insertar(new Auto(8,"ZCK-1485","Suzuki","Vitara",17999.59f));
        
    }

    public ListaEnlazada<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ListaEnlazada<Auto> autos) {
        this.autos = autos;
    }
    
    
}
