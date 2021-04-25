package T8Ej5;

public class Producto {
private String nombre;
private int precio;

public Producto ( ) {
	
}
public Producto (String nombre, int precio) {
	this.nombre=nombre;
	this.precio=precio;

	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
 
public String toString() {
	return ("El nombre del producgo "+getNombre()+" El precio es "+getPrecio());
	
}

public int calcular(int cantidad) {
	
	return precio = precio *cantidad;
	
}

}
