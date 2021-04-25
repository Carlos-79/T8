package T8Ej5;

public class NoPercedero extends Producto{
	private int tipo;
	
	public NoPercedero(String nombre, int precio,int tipo) {
		super(nombre, precio);
		this.tipo=tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int calcular(int cantidad) {

		return tipo =super.calcular(cantidad);
	}
}
