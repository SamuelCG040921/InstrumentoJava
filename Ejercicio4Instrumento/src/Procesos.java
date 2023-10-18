import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	double comisionFormula;
	public Procesos() {
		miData = new ModeloDatos();
		iniciar();
		
		
	}
	private void iniciar() {
		String msj = "Desea continuar? \n";
		msj+= "1. Si \n";
		msj+= "2. No \n";
		msj+= "Ingrese su opcion";
		int opcion;
		do {
			ingresarDatos();
			opcion = Integer.parseInt(JOptionPane.showInputDialog(msj));
		} while (opcion != 2 );
		miData.imprimirMapa();
	}
	
	public void ingresarDatos() {
		String nombre, documento, tipo;
		double ventas;
		ArrayList<String> listaEmpleados = new ArrayList<String>();
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		documento = JOptionPane.showInputDialog("Ingrese su documento: ");
		tipo = JOptionPane.showInputDialog("Ingrese su tipo: (A, B, C o D)");
		ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que hizo en ventas"));
		double comision = calcularComision(ventas, tipo);
		
		listaEmpleados.add(documento);
		listaEmpleados.add(nombre);
		listaEmpleados.add(tipo);
		listaEmpleados.add(ventas+"");
		listaEmpleados.add(comision+"");
		
		miData.guardarDatos(listaEmpleados);
		
		System.out.println("Hola "+nombre+" con documento "+documento+" sus ventas son de: $"+ventas+" y su comision es de: $ "+comision);
	}
	
	public double calcularComision(double ventas, String tipo){
		if(tipo.equalsIgnoreCase("A")){
			comisionFormula = ventas * 0.08;
			System.out.println("Sus comisiones son del 8%");
		}else if(tipo.equalsIgnoreCase("B")) {
			comisionFormula = ventas * 0.06;
			System.out.println("Sus comisiones son del 6%");
		}else if(tipo.equalsIgnoreCase("C")) {
			comisionFormula = ventas * 0.04;
			System.out.println("Sus comisiones son del 4%");
		}else if(tipo.equalsIgnoreCase("D")) {
			comisionFormula = ventas * 0.02;
			System.out.println("Sus comisiones son del 2%");
		}
		return comisionFormula;
		
	}
}
