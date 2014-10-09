package edu.upc.eetac.dsa.csanchez.DSA4;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


class LeerContarFichero{
	
	public static void main(String [] arg) throws Exception {
		 
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String Fichero = "Resgistro.txt";
	   
	      
	try {
		 archivo = new File("C:\\Users\\Cristina\\Documents\\FICHERO.txt");
		 fr = new FileReader (archivo);
		 br = new BufferedReader(fr);
         String linea;
         Date fecha = new Date();
         SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	     int cont= 0 ;
	     
	     
	     String impresion;
	     impresion = date.format(fecha);
	                
                 
         while((linea=br.readLine())!=null){
        	 System.out.println(linea);
             System.out.println(linea.length());
             cont = linea.length();
        	 
          }
         File fichero2 = new File("C:\\Users\\Cristina\\Documents\\registro.txt");
	     
	    
         FileWriter frwr = new FileWriter(fichero2,true);
        
         BufferedWriter brwr = new BufferedWriter(frwr);
         brwr.write(" El fichero " + Fichero +" con fecha y hora "+impresion +" contiene "+ cont +" caracteres.\n" );
         brwr.newLine();
         brwr.close();
         
       }
	
	     catch(IOException e){
         System.out.println("Error E/S: el fichero no existe");
	 }
	
	
	
	 finally{
         try{
        	 if(null !=fr ) {
        		 fr.close();
        	 }       	
         }catch (Exception e2){
        	 e2.printStackTrace();
         }
         
	 }
   }
}	