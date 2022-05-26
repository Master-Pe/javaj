

package com.mycompany.practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Practica1 {

    public static void main(String[] args) throws FileNotFoundException {
    
       
        for(int i = 0 ; i < 2 ; i ++){
        Escribir("Esto es una prueba que ya funciona a la perfeccion");
        }
        
    }
    
    public static String Sumar (int num1, int num2){
        //int resultado ;
        int resultado = num1 + num2 ;
        String parcero = String.valueOf(resultado) ;
        
        return parcero;
    }
    
    public static String Multiplicar (int num1, int num2){
        //int resultado ;
        int resultado = num1 * num2 ;
        String parcero = String.valueOf(resultado);
        return parcero;
    }
    public static void CrearArchivo (){
        File archivo = new File("new.txt");
        
        try{
            if(archivo.createNewFile()){
                System.out.println("la ruta del archivo es " + archivo.getCanonicalFile());
            }
            else{
                System.out.println("ya existe el archivo..");
            }
        }catch(IOException ex){
           // Logger.getLogger(archivo.class.getName()).log(Level.SEVERED null ex);
           System.out.println("execption captured...");
        }
    }
    
    public static void Escribir (String guardar) throws FileNotFoundException{
        String Leido = Leer();
        FileWriter archivo;

        try {
            archivo = new FileWriter("new.txt");
            archivo.write( Leido + " --- " + guardar);
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String Leer() throws FileNotFoundException{
        File lectura = new File("new.txt");
        Scanner guarda = new Scanner(lectura);
        String var;
        while (guarda.hasNextLine()){
            var = guarda.nextLine();
            return var ;
        }
        return null;
        
    }
}
