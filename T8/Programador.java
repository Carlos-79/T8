package T8;

public class Programador {
	private int lineasCodigoPorHora;
	private String lenguajeDominante;

	public Programador() {

	}

	public Programador(int lineasCodigoPorHora, String lenguajeDominante) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;

	}

	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}

	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	public void nivelProgramacion() {

		if (lineasCodigoPorHora <= 200) {
			System.out.println("Level 1");
		}
		if (lineasCodigoPorHora >= 200 && lineasCodigoPorHora <= 500) {
			System.out.println("Level 2");
		}

		if (lineasCodigoPorHora >= 500) {
			System.out.println("Level 3");
		}

	}

}
