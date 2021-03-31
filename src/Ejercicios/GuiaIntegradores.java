package Ejercicios;

import java.util.Scanner;

public class GuiaIntegradores {
	public void ejercicio4()
	{
		int cantidadIntegrantes = 0;
		char tipoVivienda;
		String nomYApellido;
		short edad;
		char sexo;
		char nivelEstudios;
		char indicador;
		Scanner sc= new Scanner(System.in);
		int i;
		

		
		while(cantidadIntegrantes >= 0)
		{
			System.out.println("ingrese la cantidad de integrantes");
			cantidadIntegrantes = sc.nextInt();
			System.out.println("ingrese el tipo de vivienda");
			tipoVivienda = sc.next().charAt(0);
			
			for(i = 0; i< cantidadIntegrantes; i++)
			{
				System.out.println("ingrese el nombre y apellido");
				nomYApellido = sc.next();
				System.out.println("ingrese la edad");
				edad = sc.nextShort();
				System.out.println("ingrese el sexo");
				sexo = sc.next().charAt(0);
				System.out.println("ingrese el nivel de estudios: N, P, S, T, U");
				nivelEstudios = sc.next().charAt(0);
				System.out.println("ingrese si esta completo o no: C, I");
				indicador = sc.next().charAt(0);
				
				if(((nivelEstudios == 'P') || (nivelEstudios == 'p')) && ((indicador == 'C') || (indicador == 'c')))
				{
					System.out.print("--------------------------------------------------");
					System.out.print("nombre y apellido ");
					System.out.print("edad ");
					System.out.print("sexo ");
					System.out.print("tipo de vivienda  ");
					
					System.out.print(nomYApellido + " ");
					System.out.print(edad + " ");
					System.out.print(sexo + " " );
					System.out.print(tipoVivienda + " ");
					System.out.println("--------------------------------------------------");
				}
			}
		}
	}
	public void contador()
	{
		int contador = 0;
		int contadorPares = 0;
		int contadorMultiplos = 0;
		
		for(int i = 0; i< 20; i++)
		{
			contador++;
			
			if((i%3) == 0)
			{
				contadorPares++;
			}
		}
	
		int n = 0;
		while(contadorMultiplos < 5)
		{
			if((n%2) == 0)
			{
				contadorMultiplos++;
				System.out.println(contadorMultiplos);
			}
			n++;
		}
		
		System.out.println(contador);
		System.out.println(contadorPares);
	}
	
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
		int palabraMasLarga = 0;
		int contadorCaracteres = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese caracteres, un punto para finalizar.");
		/* Para leer un char habia escrito sc.next().charAt(0); 
		 * La funcion next() lee hasta donde encuentra un espacio,
		 * La funcion nextLine() lee hasta donde encuentra un enter,
		 * Para lo que quiero hacer en este caso necesito usar nextLine()
		 */
		
		caracter = sc.nextLine().charAt(0);
		contadorCaracteres++;
		
		while(caracter != '.')
		{
			
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
					if(palabraMasLarga < contadorCaracteres)
					{
						palabraMasLarga = contadorCaracteres;
					}
					contadorCaracteres = 0;
					break;
			}
			try //este try lo agregue para poder poner si me equivoco varias veces enter y que no se detenga la ejecucion del programa
			{
				caracter = sc.nextLine().charAt(0);//no puede leer el caracter en la posicion 0 si ingreso un enter
				if ((caracter != '.') && (caracter != ' '))
				{
					contadorCaracteres++;
				}
				System.out.println("contadorCaracteres " + contadorCaracteres); 
			}
			catch(Exception ex){
				
			}

		}
		
		System.out.println("Ingresaron " + contadorA + " letras A");
		System.out.println("Ingresaron " + contadorE + " letras E");
		System.out.println("Ingresaron " + contadorI + " letras I");
		System.out.println("Ingresaron " + contadorO + " letras O");
		System.out.println("Ingresaron " + contadorU + " letras U");
		System.out.println("La cantidad de palabras es " + (contadorPalabras + 1));
		System.out.println("La cantidad de letras de la palabra mas larga es " + palabraMasLarga);
	}
}
