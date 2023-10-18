import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapPersonas;
	public ModeloDatos() {
		  //inicializamos el Hasmap y creamos el objeto
	  mapPersonas=new HashMap<String, ArrayList<String>>();
	}
	
	public void guardarDatos(ArrayList<String> listaPersonas) {
		  
	    mapPersonas.put(listaPersonas.get(0), listaPersonas);
	   
	    JOptionPane.showMessageDialog(null, "Registro existoso!");
	  }
	public void imprimirMapa() {
	    Iterator<String> itera=mapPersonas.keySet().iterator();
	    String llave;
	    while (itera.hasNext()) {
	      llave =itera.next();
	      System.out.println(llave + " - "+mapPersonas.get(llave));
	    }
	  }
}


