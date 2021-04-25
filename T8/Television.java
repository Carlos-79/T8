package T8;

public class Television extends Electrodomestico {
	private double resolucion;
	private Boolean smartTV;

	public Television(double resolucion, Boolean smartTV) {
		this.resolucion = 20;
		this.smartTV = false;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.smartTV = false;
	}

	public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion,
			Boolean smartTV) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public Boolean getSmartTV() {
		return smartTV;
	}

	public void setSmartTV(Boolean smartTV) {
		this.smartTV = smartTV;
	}

	public double precioFinal() {
		double result = 0;
		if (resolucion > 40 && smartTV == true) {
			result = (getPrecioBase()) * 30;
		} else {
			result = (getPrecioBase());
		}
		result = result + getConsumoEnergetico();

		return result;

	}
}
