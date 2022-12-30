/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Utilidades;

import Controlador.AutoController;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author David Campoverde
 */
public class Utilidades {
    
    public static boolean guardarArchivoJSON(AutoController ac){
        Gson gson = new Gson();
        String json = gson.toJson(ac);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dataJSON.json"))){
            bw.write(json);
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }    
        
    }
    
    public static AutoController cargarArchivoJSON(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataJSON.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        AutoController ac = gson.fromJson(json, AutoController.class);
        return ac;
    }
    
}

