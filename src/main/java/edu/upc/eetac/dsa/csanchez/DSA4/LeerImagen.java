package edu.upc.eetac.dsa.csanchez.DSA4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LeerImagen {
	
	public static void main(String [] arg) throws Exception {
		
		 File imagen = null;
		 FileReader Leer = null;
	     BufferedReader bfr = null;
	     String Fichero = "Resgistro.txt";
	 
	     
	     try{
	    	 imagen = new File("C:\\Users\\Cristina\\Documents\\DSAimagen.jpg");
			 Leer = new FileReader (imagen);
			 bfr = new BufferedReader(Leer);
			 Date fecha = new Date();
	         SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        
	         System.out.println(imagen.length());
	     
	         
	         String fyh;
		     fyh = date.format(fecha);
		     
		     File newf = new File("C:\\Users\\Cristina\\Documents\\registro.txt");
		     
		     FileWriter file = new FileWriter(newf,true);
	         BufferedWriter buffer = new BufferedWriter(file);
	         buffer.write(" El fichero " + Fichero +" con fecha y hora "+ fyh + " tiene "+ imagen.length() +" bytes ");
	         buffer.newLine();
	         buffer.close();
	       
	        
	       }
	     
	     catch(IOException e){
	         System.out.println("Error E/S: el fichero no existe");
		 }
				
			
		 finally{
	         try{
	        	 if(null !=Leer ) {
	        		 Leer.close();
	        	 }       	
	         }catch (Exception e2){
	        	 e2.printStackTrace();
	         }
		 }
	     
	}
}
	
