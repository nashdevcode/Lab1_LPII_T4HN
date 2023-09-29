package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
	//Crear Empleado
	public String createEmpleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		
		try {
			Empleado empleado = new Empleado(apellidos, nombres, edad, sexo, salario);
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
		
			return "Empleado creado";
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	
		return "Proceso error registrar ";
	
	}


	//Eliminar Empleado
	public String deleteEmpleado (int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		//se abre metodo
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, id);
			session.delete(empleado);
			session.getTransaction().commit();
			sessionFactory.close();
			return "Proceso Exitoso Empleado eliminado ";
			
		
		
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	
		return "Proceso error al delate empleado";
	
	}
	
	//Actualizar Empleado
	public String updateEmpleado(int id, String nombres) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			

		
		session.beginTransaction();
		Empleado empleado = session.get(Empleado.class, id);
		empleado.setNombres(nombres);
		session.update(empleado);
		session.getTransaction().commit();
		
		sessionFactory.close();
		
		return "Proceso Exitoso empleado actualizado ";
		
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return "Proceso error al actualizar registro";
	
	}
	
	//Leer Empleado
	public String getEmpleado(int id) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session = sessionFactory.openSession();
	
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, id);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return empleado.toString();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Error empleado no encontrado:";
		
	}
			
}