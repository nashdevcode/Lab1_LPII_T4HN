package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		//Crear Empleado
		String empleado = new EmpleadoController().createEmpleado("Ramos", "Dennis",22, "Masculino", 1836);
		
		
		//Eliminar Empleado
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		
		//Actualizar Empleado
		//String empleado = new EmpleadoController().updateEmpleado(1, "Kevin");
		
		//Leer Empleado
		//String empleado = new EmpleadoController().getEmpleado(3);
		
		System.out.println(empleado);
	}

}