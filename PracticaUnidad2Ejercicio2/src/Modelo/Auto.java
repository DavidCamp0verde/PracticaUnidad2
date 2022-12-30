/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David Campoverde
 */
public class Auto {
    private Integer id;
    private String matricula;
    private String marca;
    private String modelo;
    private Float precio;
    
//    public Auto(){
//        
//    }
//    
//    public Auto(String matricula, String marca, String modelo, Float precio) {
//        this.matricula = matricula;
//        this.marca = marca;
//        this.modelo = modelo;
//        this.precio = precio;
//    }
//    
//    public Auto(String matricula, String marca, String modelo, Float precio, Integer id) {
//        this(matricula, marca, modelo, precio);
//        this.id = id;
//    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return matricula+" - "+marca+" - "+modelo+" - "+precio+"$";
    }
    
    
    
}
