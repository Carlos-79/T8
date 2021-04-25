/**
 * 
 */
package T8;

/**
 * @author DAM
 *
 */
public class Lavadora extends Electrodomestico {
	private double carga;

	public Lavadora(double carga) {
		this.carga = 5;

	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = 5;

	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;

	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public double precioFinal() {
		double result = 0;

		if (carga >= 30) {
			result = (getPrecioBase()) + 50;
		} else {
			setPrecioBase(getPrecioBase());
		}
		
		result = result + getConsumoEnergetico();

		
		return result;

	}

}
