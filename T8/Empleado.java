package T8;

public class Empleado {
	private String nombre;
	private String DNI;
	private int edad;
	private boolean casado;
	private double salario;

	public Empleado() {

	}

	public Empleado(String nombre, String DNI, int edad, boolean casado, double salario) {

		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void clasificacion() {

		if (edad < 18) {
			System.out.println("Novato");
		}
		if (edad >= 19 && edad <= 25) {
			System.out.println("Junior");
		}
		if (edad > 25) {
			System.out.println("Senior");
		}
	}

	public void mostrarDatos () {
		System.out.println(""+nombre+" "+DNI+" "+edad+" "+casado+" "+salario);
	}
	
	public double aumentarSueldo(int porcentaje) {
		this.salario=salario * porcentaje;
		
		return this.salario;
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(""+mensaje);
	}
	
}
