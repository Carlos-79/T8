package T8;

public class T8Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e = new Empleado("jesus", "54564896C", 45 ,false,95 );
		
		Programador p = new Programador(354,"Java");
		
		
	

		System.out.println(""+p.getLineasCodigoPorHora()+" "+p.getLenguajeDominante());
		p.nivelProgramacion();

		System.out.println("");
		
		System.out.println(""+e.getNombre()+" "+e.getDNI()+" "+e.getEdad()+" "+e.isCasado()+" "+e.getSalario());
		System.out.println("");
		
		e.mostrarDatos();
		e.clasificacion();
		e.mostrarMensaje("Hola mundo");
		e.aumentarSueldo(15);
		System.out.println(""+e.getSalario());
		
		
		
		
		
		
	}
}
