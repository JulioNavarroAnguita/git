import java.util.Scanner;
//importamos la clase Scanner

/**
 * Programa que nos dice 
 * si un dia es laborable
 * o si es un dia festivo
 * @author Julio Navarro
 * @version 1.0
 * */

public class TipoDias {
	public static void main (String[] args) {
		//indicamos por pantalla que se escriba un dia de la semana
		System.out.println("Indique un dia de la semana");
		//creamos el Scanner
		Scanner in = new Scanner (System.in);
		String dia = in.next();
		in.close();
		//cerramos Scanner

		//Switch donde le pasamos los dias y segun el dia nos dice 
		//si es laboral o no
		switch (dia) {
			case "lunes":
				System.out.println("el lunes es un dia laboral");
				break;
			case "martes":
				System.out.println("el martes es un dia laboral");
				break;
			case "miercoles":
				System.out.println("el miercoles es un dia laboral");
				break;
			case "jueves":
				System.out.println("el jueves es un dia laboral");
				break;
			case "viernes":
				System.out.println("el viernes es un dia laboral");
				break;
			case "sabado":
				System.out.println("el sabado es festivo");
				break;
			case "domingo":
				System.out.println("el domingo es festivo");
				break;
		}
	}

}
