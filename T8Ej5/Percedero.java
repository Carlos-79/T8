package T8Ej5;

public class Percedero extends Producto {
	private int diasACaducar;

	public Percedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	public int calcular(int cantidad) {

		super.calcular(cantidad);

		if (diasACaducar == 1) {
			return super.calcular(cantidad)/4; 
			
		}
		
		if (diasACaducar == 2) {
			return super.calcular(cantidad)/3; 

		}
		if (diasACaducar == 3) {
			return super.calcular(cantidad)/2; 

		}
		
		return cantidad;

	}

}
