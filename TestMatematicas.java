public class TestMatematicas {
	public static void main (String [] args) {
	
		int numero = 21;
		boolean resultado = Matematicas.esPar(numero);

		System.out.println("El numero " + numero + " es par? " 
				+ resultado);

		System.out.println("El numero " + numero + " es par? " + resultado);

		boolean divisibleEntreTres = Matematicas.esDivisiblePorTres (numero);
		System.out.println("el numero " + numero + 
			" ¿es divisible entre 3? " + divisibleEntreTres);
		
		boolean divisiblePorCinco = Matematicas.esDivisiblePorCinco (numero);
		System.out.println("El numero " + numero + 
				" ¿es divisible entre 5? " + divisiblePorCinco);

	}

}
