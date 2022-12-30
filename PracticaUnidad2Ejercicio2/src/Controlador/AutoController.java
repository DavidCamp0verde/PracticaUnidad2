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
    
//    public void crearAutos(){
//        getAutos().insertar(new Auto("XCB-52013","BMW","X6",10000.99f));
//        getAutos().insertar(new Auto("DAVS-3561","Chevrolet","Aveo",20050.99f));
//        getAutos().insertar(new Auto("MDC","Ford","Mustang",13526f));
//        getAutos().insertar(new Auto("NJM-2219","Honda","Civic",15999.99f));
//        getAutos().insertar(new Auto("SJM-29124","Hyundai","Tucson",22535f));
//        getAutos().insertar(new Auto("DCT-282314","Jeep","Compass",17888f));
//        getAutos().insertar(new Auto("BHR-124","Ferrari","F8 Tributo",70589.99f));
//        getAutos().insertar(new Auto("ZCK-485","Suzuki","Vitara",17999.59f));
//        getAutos().insertar(new Auto("CDA-1542","Ferrari","SF90 Stradale",99999.99f));
//        getAutos().insertar(new Auto("AVD-957","BMW","Serie 1",32954f));
//        
//    }

    public ListaEnlazada<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ListaEnlazada<Auto> autos) {
        this.autos = autos;
    }
    
    
}
