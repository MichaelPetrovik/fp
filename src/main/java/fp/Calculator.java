package fp;

import java.util.List;

public class Calculator {
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		double seno = Math.sin(Math.toRadians(n));
		double resultado = Math.rint(seno * 100) / 100;
		System.out.println(resultado);
		return resultado;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	
	static int[] stepThisNumber(int number, int step) {
		int resultado[] = new int[10];
		int cont = 0;
		int numero = 0;
		
		for(cont = 0; cont < 10; cont++) {
			System.out.println("number " + number);
			System.out.println("step " + step);
			numero = number - step;
			if(numero <= 0) {
				break;
			}
			step++;
			resultado[cont] = numero;
			System.out.println("resultado " + (resultado[cont]));
		}
		System.out.println(resultado[2]);
		return resultado;
	}
	*/
	
	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 
	static int[] divisors(int n) {
		int resultado[] = new int[10];
		int i = 0;
		int aux = 0;
		for (i = n ; i >= 0 ; i--) {
			if (n % i == 0) {
            	System.out.println (i);
            	resultado[aux] = i;
            	aux++;
			}
		}
		return resultado;
	}
	*/
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> apuesta, List<Integer> aciertos) {
		return null;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		return null;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		return false;
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		return false;
	}
}
