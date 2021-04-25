/**
 * 
 */
package T8;

/**
 * @author Carlos
 * @since 14/04/2021
 */

/** Atributos privados */
public class Electrodomestico {
	private double precioBase;
	private String color;
	private double peso;
	private char consumoEnergetico;
	// *******************************************

	/** Contructores sin parametros con atributos inicializados */
	public Electrodomestico() {
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = 100;
		this.peso = 5;

	}

	/** Contructor inicialiciando solo dos de los parametros */
	/**
	 * @param prcioBase Inicializamos this.precioBase
	 * @param peso      Inicializamos this.peso
	 */

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
	}

	/** Contructor con parametros */
	/**
	 * @param prcioBase         Inicializamos this.prcioBase
	 * @param peso              Inicializamos this.peso
	 * @param color             Inicializamos this.color
	 * @param consumoEnergetico Inicializamos this.consumoEnergetico
	 */

	public Electrodomestico(double prcioBase, double peso, String color, char consumoEnergetico) {
		comprobarColor(color);
		comprobarConsumo(consumoEnergetico);

		// this.color = color;
		// this.consumoEnergetico = consumoEnergetico;
		this.precioBase = prcioBase;
		this.peso = peso;

	}

	// *******************************************

	/** Geter and seter */

	/**
	 * @return precioBase Devuelve el precioBase
	 */

	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase this.preciobase es igual al preciobase
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return color Devuelve el color
	 */

	public String getColor() {
		return color;
	}

	/**
	 * @param color this.color es color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return peso Debuelve peso
	 */

	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso this.peso es peso
	 */

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return consumoEnergetico Devuelve el consumoEnergetico
	 */

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @param consumoEnergetico consumo energetico es el this.consumoEnergetico
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	// *******************************************

	/** Metodos */

	/**
	 * @param letra Se llama a la letra
	 * @return true Aqui se Devuelve un booleand del consumo energetico
	 */

	private boolean comprobarConsumo(char letra) {

		if (letra >= 'A' && letra <= 'F') {
			consumoEnergetico = letra;
			return true;
		} else {
			consumoEnergetico = 'F';
			return false;
		}
	}

	/**
	 * @return true Aqui se Devuelve un booleand para comprobar el color
	 * @param color Se llama al color
	 */
	private boolean comprobarColor(String color) {
		if (color == "blanco" && color == "negro" && color == "rojo" && color == "azul" && color == "gris") {
			this.color = color;
			return true;

		} else {
			color = "blanco";
			return true;

		}
	}

	public double precioFinal() {
		comprobarConsumo(consumoEnergetico);

		switch (consumoEnergetico) {
		case 'A':
			this.precioBase = precioBase + 100;
			break;
		case 'B':
			this.precioBase = precioBase + 80;
			break;
		case 'C':
			this.precioBase = precioBase + 60;
			break;
		case 'D':
			this.precioBase = precioBase + 50;
			break;
		case 'E':
			this.precioBase = precioBase + 30;
			break;
		case 'F':
			this.precioBase = precioBase + 10;
			break;
		default:
			break;
		}

		if (peso <= 19) {
			this.precioBase = precioBase + 10;

		}
		if (20 <= peso && peso <= 49) {
			this.precioBase = precioBase + 50;

		}
		if (50 <= peso && peso <= 79) {
			this.precioBase = precioBase + 80;

		}
		if (80 <= peso) {
			this.precioBase = precioBase + 100;
		}
		return this.precioBase;
	}

	// *******************************************
}
