package T8Ej5;

public class T8Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto[]  P = new Producto [10];
		 
		P[0] = new Percedero("Pescado", 51, 3);
		P[1] = new Percedero("Guisantes", 45, 2);
		P[2] = new Percedero("Leche", 45, 1);
		P[3] = new Percedero("ColaCao", 2, 2);
		P[4] = new Percedero("Pizza Barbacoa", 12, 3);

		
		
		 P[5] = new NoPercedero("Kitkatd", 12, 2);
		 P[6] = new NoPercedero("Neskuik", 13, 3);
		 P[7] = new NoPercedero("Chetos", 5, 1);
		 P[8] = new NoPercedero("Doritos", 3, 3);
		 P[9]= new NoPercedero("Filipinos", 5, 2);

		 for (int i = 0; i < P.length; i++) {
			System.out.println(P[i].toString());
			System.out.println(P[i].calcular(5));

		}
		
		
	}

}
