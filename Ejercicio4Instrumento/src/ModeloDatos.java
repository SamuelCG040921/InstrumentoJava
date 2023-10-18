import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapaEmp;
	public ModeloDatos() {
		mapaEmp = new HashMap<String, ArrayList<String>>();
	}
	public void guardarDatos(ArrayList<String> listaEmpleados) {
		mapaEmp.put(listaEmpleados.get(0), listaEmpleados);
		JOptionPane.showMessageDialog(null, "Registro existoso!");
	}
	
	public void imprimirMapa() {
	    Iterator<String> itera=mapaEmp.keySet().iterator();
	    String llave;
	    while (itera.hasNext()) {
	      llave =itera.next();
	      System.out.println(llave + " - "+mapaEmp.get(llave));
	    }
	  }
}
