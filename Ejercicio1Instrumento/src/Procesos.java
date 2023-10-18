import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	double gastosV =0, gastosT = 0, ahorro = 0, libre;
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
		String documento,nombre;
		double salario;
		ArrayList<String> listaPersonas = new ArrayList<String>();
		documento = JOptionPane.showInputDialog("Ingrese su documento");
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		salario  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
		calcularPresupuesto(salario);
		
		listaPersonas.add(documento);
		listaPersonas.add(nombre);
		listaPersonas.add(salario+"");
		listaPersonas.add(gastosV+"");
		listaPersonas.add(gastosT+"");
		listaPersonas.add(ahorro+"");
		listaPersonas.add(libre+"");
		
		miData.guardarDatos(listaPersonas);
		
		System.out.println("Hola "+nombre+" con documento "+documento+" su salario es de "+salario+" y sus gastos son, vivienda: "+gastosV+",transporte: "+gastosT+",ahorro: "+ahorro+" y su salario libre es de: "+libre);
	}
	
	
	
	public void calcularPresupuesto(double salario) {
		
		if(salario > 50000) {
			gastosV = salario * 30 / 100;
			System.out.println("Sus gastos para vivienda son de: "+ gastosV);
			gastosT = salario * 15 / 100;
			System.out.println("Sus gastos para transporte son de: "+ gastosT);
			ahorro = salario * 20 / 100;
			System.out.println("Su dinero para ahorro es de: "+ ahorro);
			libre = salario - (gastosV + gastosT + ahorro);
			System.out.println("Sus dinero libre es de: "+ libre);
		}else {
			System.out.println("Su salario es muy bajo como para dividirlo");
		}
	
	}
}
