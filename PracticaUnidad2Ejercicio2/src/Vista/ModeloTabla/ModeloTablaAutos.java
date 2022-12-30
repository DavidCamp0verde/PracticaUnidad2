/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.ModeloTabla;

import Controlador.AutoController;
import Modelo.Auto;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaAutos extends AbstractTableModel{
    private AutoController listaAutos;
    
    @Override
    public int getRowCount() {
        return listaAutos.getAutos().getSize();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Matricula";
            case 2: return "Marca";
            case 3: return "Modelo";
            case 4: return "Precio (USD)";
            default:return null;
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Auto a = null;
        try {
            a = listaAutos.getAutos().obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return (a != null) ? a.getId() : "SIN DEFINIR";
            case 1: return (a != null) ? a.getMatricula() : "SIN DEFINIR";
            case 2: return (a != null) ? a.getMarca(): "SIN DEFINIR";
            case 3: return (a != null) ? a.getModelo(): "SIN DEFINIR";
            case 4: return (a != null) ? a.getPrecio().toString(): "SIN DEFINIR";
            default:return null;
        }
    }
    
    public AutoController getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(AutoController listaAutos) {
        this.listaAutos = listaAutos;
    }
    
    
    
}
