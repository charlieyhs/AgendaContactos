/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteAgenda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTHA
 */
public class Archivo {
    private File archivo;
    
    public void crearArchivo(){
        
        archivo = new File("agendaContactos.txt");
        
        try {
            if(archivo.createNewFile()){
                
                //Archivo Creado
                
            }
        } catch (IOException ex) {
            
            System.out.println("Error, "+ex);
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void escribirTexto(ClasePersona persona){
        
        try {
            
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getCelular()+"\r\n");
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println("Error, "+ex);
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
