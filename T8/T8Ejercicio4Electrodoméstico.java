package T8;

public class T8Ejercicio4Electrodoméstico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Electrodomestico e = new Electrodomestico(4554,321);
		Lavadora l = new Lavadora(455);
		Television t = new Television(999, true);
		
		System.out.println("Precio final de Lavadora: "+l.precioFinal());
		System.out.println("Precio final de Television: "+t.precioFinal());
		System.out.println("Precio final de Electrodomestico: "+e.precioFinal());

		
		System.out.println(l.precioFinal()+t.precioFinal()+e.precioFinal());
		
		
	}

}
