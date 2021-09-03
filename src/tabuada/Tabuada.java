package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int multiplicando;
		int multiplicador;
		int contador = 0;
		int resultado;

		System.out.println("digite o multiplicando ");
		multiplicando = leitor.nextInt();
		System.out.println("digite o multiplicador");
		multiplicador = leitor.nextInt();

		

		while (contador < multiplicador) {
			contador++;
			resultado = multiplicando * contador;
			
			System.out.println(multiplicando + " X " + contador + " = " + resultado);
			
		
		}
		leitor.close();

	}

}
