package es.examen.primeraparte;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principal {

	public static void main(String[] args) {

		Principal principal = new Principal();
		principal.gestionCurso(3);

		// TODO Auto-generated method stub

	}

	private void gestionCurso(int numMaster) {
		List<Master> listaMaster = new ArrayList<>();
		Master master = null;
		
		

		for (int i = 0; i < numMaster; i++) {
			master = new Master("Curso" + (i + 1),(i + 1),i+3, true);

			listaMaster.add(master);
		}
		
	    	  
	 int codigoBorrar = Utilidades.pideDatoNumerico("indica el numero del curso que deseas borrar");
		  for (int i = 0; i <listaMaster.size(); i++) {
          Master borrar = listaMaster.get(i);
          if (borrar.getCodigo()== codigoBorrar) {
		      listaMaster.remove(i--);
		        
	     }
          
          Master oficial = listaMaster.get(i);
          if (oficial.isOficial()== true) {
        	  
        	  System.out.println(listaMaster.toString());  
          }
      	

                
		  } 
		 
	          

		  
		
	}
}