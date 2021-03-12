package Ejercicios;

import java.util.Scanner;

public class GuiaIntegradores {
	/*
	 * 2- Se ingresan caracteres que conforman una oración, cada palabra está separada por un espacio en blanco, la oración finaliza con un punto.
	 Se pide mostrar por pantalla:
·         La cantidad de veces que se leyó cada vocal.
·         La cantidad de palabras que contiene la oración.
·         La cantidad de letras que posee la palabra más larga.
	 */
	public void palabrasYcaracteres()
	{
		char caracter;
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		int contadorPalabras = 0;
		int palabrasMasLarga = 0;
		int contadorCaracteres = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese caracteres, un punto para finalizar.");
		caracter = sc.next().charAt(0);
		contadorCaracteres++;
		
		while(caracter != '.')
		{
			System.out.println("Ingreso el caracter " + caracter);
//			if((caracter == 'a') || (caracter == 'A'))
//			{
//				contadorA++;
//			}
//			if((caracter == 'e') || (caracter == 'E'))
//			{
//				contadorE++;
//			}
//			if((caracter == 'i') || (caracter == 'I'))
//			{
//				contadorI++;
//			}
//			if((caracter == 'o') || (caracter == 'O'))
//			{
//				contadorO++;
//			}
//			if((caracter == 'u') || (caracter == 'U'))
//			{
//				contadorU++;
//			}
			
			switch(caracter)
			{
				case 'A':
				case 'a':
					contadorA++;
					break;
				case 'E':
				case 'e':
					contadorE++;
					break;
				case 'I':
				case 'i':
					contadorI++;
					break;
				case 'O':
				case 'o':
					contadorO++;
					break;
				case 'U':
				case 'u':
					contadorU++;
					break;
				case ' ':
					contadorPalabras++;
					if(palabrasMasLarga < contadorCaracteres)
					{
						palabrasMasLarga = contadorCaracteres;
					}
					contadorCaracteres = 0;
					break;
			}
			
			caracter = sc.next().charAt(0);
			contadorCaracteres++;
		}
		
		System.out.println("Ingresaron " + contadorA + " letras A");
		System.out.println("Ingresaron " + contadorE + " letras E");
		System.out.println("Ingresaron " + contadorI + " letras I");
		System.out.println("Ingresaron " + contadorO + " letras O");
		System.out.println("Ingresaron " + contadorU + " letras U");
		System.out.println("La cantidad de palabras es " + (contadorPalabras + 1));
		System.out.println("La cantidad de letras de la palabra mas larga es " + palabrasMasLarga);
	}
}
