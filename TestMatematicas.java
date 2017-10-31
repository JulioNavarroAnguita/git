public class TestMatematicas {
	public static void main (String [] args) {
	
		int numero = 21;
		boolean resultadoUno = Matematicas.esPar(numero);
		System.out.println("El numero " + numero + " es par? " 
				+ resultadoUno);

		boolean resultadoDos = Matematicas.esDivisiblePorTres (numero);
		System.out.println("el numero " + numero + 
			" ¿es divisible entre 3? " + resultadoDos);
		
		boolean resultadoTres = Matematicas.esDivisiblePorCinco (numero);
		System.out.println("El numero " + numero + 
				" ¿es divisible entre 5? " + resultadoTres);

	}

}
