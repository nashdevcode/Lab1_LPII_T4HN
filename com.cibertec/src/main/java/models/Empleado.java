package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "empleado")
public class Empleado {
	@Id
	@Column (name = "IdEmpleado")
	private int IdEmpleado;
	@Column (name = "Apellidos")
	private String Apellidos;
	@Column (name = "Nombres")
	private String Nombres;
	@Column (name = "Edad")
	private int Edad;
	@Column (name = "Sexo")
	private String Sexo;
	@Column (name = "Salario")
	private double Salario;
	
	//Constructor vacio
	public Empleado() {
		
	}
	
	
	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		this.Apellidos = apellidos;
		this.Nombres = nombres;
		this.Edad = edad;
		this.Sexo = sexo;
		this.Salario = salario;
	}
	
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	
	public void setIdEmpleado(int idempleado) {
		this.IdEmpleado = idempleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		this.Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		this.Salario = salario;
	}

	@Override
	public String toString() {
	    return "Empleado [IdEmpleado=" + IdEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
	            + Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}
}