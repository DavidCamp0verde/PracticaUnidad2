/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.modeloTabla;

import Controlador.ListaEnlazada.ListaEnlazada;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class modeloTablaListaNumeros extends AbstractTableModel{
    private ListaEnlazada<Float> lista;
    
     @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Posición";
            case 1: return "Número";
            default:return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Float num = null;
        try {
            num = lista.obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return rowIndex;
            case 1: return num;
            default:return null;
        }
    }

    public ListaEnlazada<Float> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Float> lista) {
        this.lista = lista;
    }
    
    
}
