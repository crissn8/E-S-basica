package edu.upc.eetac.dsa.csanchez.DSA4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class comparar {
	
	public static void main(String [] arg) throws Exception {
		
		 File fitxer = null;
		 FileReader read = null;
	     BufferedReader bfr = null;
	     
	     
	     try{
	    	 
	    	 fitxer = new File("C:\\Users\\Cristina\\Documents\\registro.txt");
			 read = new FileReader (fitxer);
			 bfr = new BufferedReader(read);
	    	 
	    	 
	     }
	     
	     catch(IOException e){
	         System.out.println("Error E/S: el fichero no existe");
		 }
				
			
		 finally{
	         try{
	        	 if(null !=read ) {
	        		 read.close();
	        	 }       	
	         }catch (Exception e2){
	        	 e2.printStackTrace();
	         }
		 }
	  
	
	
	     
	}
	
	
}
