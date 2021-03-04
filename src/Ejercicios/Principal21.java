package Ejercicios;

import java.util.Scanner;
import java.util.function.Function;

public class Principal21 {
	public static void main(String[] args) {
		
		Function <Integer, Integer> cubo = (x -> x * x * x);
		System.out.println(cubo.apply(3));
		
		//ejercicio1_g2(3, 2, 3);
		//ejercicio2_g2(1, 3, 5);
		//System.out.println(factorial(4));
		//System.out.println(areaCirculo(4));
		//System.out.println(ladoCuadrado(areaCirculo(4)));
		//System.out.println(mcd(120, 60));
		//reemplazarLetras("Esto es un texto de prueba para ver si el algoritmo funciona");
		//analizador("algoritmo.como");
		//factoriales();
		// ejercicio1();
		// ejercicio2();
		//ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio6Bis();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio14();
	}
	/*
	 * 8-Escribir una función que reciba una palabra e informe cuantos caracteres contiene,
	 *  cual es la primera
	 *   y la última letra 
	 *   y responda si contiene la palabra “.com”
	 */
	private static void analizador(String palabra)
	{
		System.out.println(palabra.length());
		System.out.println(palabra.charAt(0));
		System.out.println(palabra.charAt(palabra.length() - 1));
		System.out.println(palabra.contains(".com"));
		
	}
	/*
	 * Escribir una función que pida al usuario números enteros
	 *  y devuelva el factorial de dichos números,
	 *   la función deberá preguntar al usuario si desea continuar después de cada factorial calculado.
	 */
	
	private static void factoriales()
	{
		int numero;
		Scanner sc = new Scanner(System.in);
		
		Boolean continuar = true;
		
		while(continuar)
		{
			System.out.println("Ingrese un numero entero");
			numero = sc.nextInt();
			System.out.println(factorial(numero));
			
			System.out.println("Ingrese un 1 para continuar");
			numero = sc.nextInt();
			continuar = (numero == 1);
		}
	}
	
	private static void reemplazarLetras(String texto)
	{
		System.out.println(texto.replace('o', 'e'));
	}
	
	private static int mcd(int A, int B)
	{
		/*
		 Dividir A por B y calcular el resto (0 < R < B).
·         Si R = 0, el MCD es B, sino continuar.
·         Reemplazar A por B, B por R y volver al primer paso.
		 */
		
		int R = A % B;
		if (R == 0)
		{
			return B;
		}
		
		return mcd(B, R);
	}
	
	private static double ladoCuadrado(double areaCirculo) // area del cuadrado = L * L = area del circulo
	{
		double lado = Math.sqrt(areaCirculo);// para calcular la raiz cuadrada
		return lado;
	}
	
	private static double areaCirculo(int radio)
	{
		double area = Math.PI * radio * radio;
		return area;
	}
	
	private static long factorial(int n)
	{
        if(n <= 1)
        {
        	return 1;
        }
        
        return n * factorial(n - 1);
	}
	
	private static void ejercicio2_g2(int a, int b, int c)
	{
		int x = - b / (2 * a);
		int y = a * x * x + b * x + c;
		
		System.out.println("El vertice de la parabola es (" + x + ", " + y + ")");
	}
	

	private static void ejercicio1_g2(int lado1, int lado2, int lado3)
	{
		if((lado1 == lado2) && (lado2 == lado3))
		{
			System.out.println("el triangulo es equilatero");
		}
		else if ((lado1 != lado2) && (lado3 != lado2) && (lado1 != lado3))
		{
			System.out.println("el triangulo es escaleno");
		}
		else
		{
			System.out.println("el triangulo es isoceles");
		}
			
	}
	

 	private static void ejercicio14() {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		numero = sc.nextInt();
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < numero; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private static void ejercicio10() {
		int numero;
		int acumulador = 0;
		int maximo = 0;
		int minimo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numeros enteros, y un numero negativo para finalizar");

		numero = sc.nextInt();
		minimo = numero;

		while (numero >= 0) {
			if (maximo < numero) {
				maximo = numero;
			}
			if (minimo > numero) {
				minimo = numero;
			}

			acumulador = acumulador + numero;
			numero = sc.nextInt();
		}

		System.out.println("la suma de todos los numeros es " + acumulador);
		System.out.println("El maximo es " + maximo);
		System.out.println("El minimo es " + minimo);
	}

	private static void ejercicio9() {
		int numero;
		int acumulador = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numeros enteros, y un numero negativo para finalizar");

		numero = sc.nextInt();

		while (numero >= 0) {

			acumulador = acumulador + numero;
			numero = sc.nextInt();
		}

		System.out.println("la suma de todos los numeros es " + acumulador);
	}

	private static void ejercicio8() {
		int i = 0;
		int contador = 0;

		for (i = 0; i < 200; i = i + 2) {
			if ((i % 4) == 0) {
				contador = contador + 1;
			}

			System.out.println(i);
		}

		System.out.println("los multiplos de 4 son " + contador);
	}

	private static void ejercicio7() {
		int i = 0;

		// for (i = 0; i > 100; i++) {
		// if ((i % 2) == 0) {
		// System.out.println(i);
		// }
		// }

		for (i = 0; i < 200; i = i + 2) {
			System.out.println(i);
		}
	}

	private static void ejercicio6Bis() {
		short mes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 12");
		mes = (short) sc.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 dias");
			break;
		case 2:
			System.out.println("El mes tiene 28 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 dias");
			break;
		default:
			System.out.println("No es un mes valido, ingrese un numero del 1 al 12");
		}
	}

	private static void ejercicio6() {
		short mes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 12");
		mes = (short) sc.nextInt();

		if ((mes >= 1) && (mes <= 12)) {
			if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
				System.out.println("El mes tiene 31 dias");
			}
			if (mes == 2) {
				System.out.println("El mes tiene 28 dias");
			}
			if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
				System.out.println("El mes tiene 30 dias");
			}
		} else {
			System.out.println("No es un mes valido");
		}
	}

	private static void ejercicio5() {
		short nota1 = 0;
		short nota2 = 0;
		short nota3 = 0;
		float promedio;
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Ingrese un numero del 1 al 10");
			nota1 = (short) sc.nextInt();
			System.out.println("Ingrese otro numero del 1 al 10");
			nota2 = (short) sc.nextInt();
			System.out.println("Ingrese otro numero del 1 al 10");
			nota3 = (short) sc.nextInt();
			if ((nota1 >= 0) && (nota1 <= 10) && (nota2 >= 0) && (nota2 <= 10) && (nota3 >= 0) && (nota3 <= 10)) {
				promedio = (nota1 + nota2 + nota3) / 3;
				if ((nota1 >= 4) && (nota2 >= 4) && (nota3 >= 4) && (promedio >= 4)) {
					System.out.println("El alumno esta aprobado");

					if ((nota3 == 10) || (promedio >= 8)) {
						System.out.println("El alumno promociona");
					} else {
						System.out.println("El alumno no promociona");
					}

				} else {
					System.out.println("El alumno esta desaprobado");
				}
			} else {
				System.out.println("no se pudo calcular, verifique las notas ingresadas");
			}
		} catch (Exception ex) {
			System.out.println("Verifique los datos ingresados");
		}
	}

	private static void ejercicio4() {
		short nota1 = 0;
		short nota2 = 0;
		short nota3 = 0;
		float promedio;
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Ingrese un numero del 1 al 10");
			nota1 = (short) sc.nextInt();
			System.out.println("Ingrese otro numero del 1 al 10");
			nota2 = (short) sc.nextInt();
			System.out.println("Ingrese otro numero del 1 al 10");
			nota3 = (short) sc.nextInt();
			
			if ((nota1 >= 0) && (nota1 <= 10) && (nota2 >= 0) && (nota2 <= 10) && (nota3 >= 0) && (nota3 <= 10)) {
				promedio = (nota1 + nota2 + nota3) / 3;
				if ((nota1 >= 4) && (nota2 >= 4) && (nota3 >= 4) && (promedio >= 4)) {
					System.out.println("El alumno esta aprobado");
				} else {
					System.out.println("El alumno esta desaprobado");
				}
			} else {
				System.out.println("no se pudo calcular, verifique las notas ingresadas");
			}
		} catch (Exception ex) {
			System.out.println("Verifique los datos ingresados");
		}
	}

	private static void ejercicio3() {
		int fecha1 = 200319;
		int fecha2 = 151019;
		
		int dia1, dia2;
		int mes1, mes2;
		int año1, año2;
		
		dia1 = fecha1 / 10000;
		dia2 = fecha2 / 10000;
		año1 = fecha1 % 100;
		año2 = fecha2 % 100;
		mes1 = fecha1 % 10000; //0319
		mes1 = mes1 / 100;
		mes2 = fecha2 % 10000;  //1019
		mes2 = mes2 / 100;
		
		if( año1 > año2)
		{
			System.out.println("la fecha 1 es mas actual");
		}
		else if(año1 < año2)
		{
			System.out.println("la fecha 2 es mas actual");
		}
		else
		{
			if(mes1 > mes2)
			{
				System.out.println("la fecha 1 es mas actual");
			}
			else if(mes1 < mes2)
			{
				System.out.println("la fecha 2 es mas actual");
			}
			else
			{
				if(dia1 > dia2)
				{
					System.out.println("la fecha 1 es mas actual");
				}
				else if(dia1 < dia2)
				{
					System.out.println("la fecha 2 es mas actual");
				}
				else
				{
					System.out.println("la fecha 1 es igual a la fecha");
				}
			}
			
		}
	}

	private static void ejercicio2() {
		int numero1 = 0;
		int numero2 = 0;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Ingrese un numero entero");
			numero1 = sc.nextInt();

			System.out.println("Ingrese otro numero entero");
			numero2 = sc.nextInt();

			if (numero1 > numero2) {
				System.out.println("El mayor es " + numero1);
			} else {
				if (numero1 == numero2) {
					System.out.println("los numeros son iguales");
				} else {
					System.out.println("El mayor es " + numero2);
				}
			}
		} catch (Exception ex) {
			System.out.println("ingreso un valor inesperado");
		}
	}

	private static void ejercicio1() {
		int numero1;
		int numero2;

		float resultado;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Ingrese un numero entero");
			numero1 = sc.nextInt();

			System.out.println("Ingrese otro numero entero");
			numero2 = sc.nextInt();

			resultado = numero1 + numero2;
			System.out.println("La suma es: " + resultado);

			resultado = numero1 - numero2;
			System.out.println("La resta es: " + resultado);

			resultado = numero1 * numero2;
			System.out.println("La multiplicacion es: " + resultado);

			if (numero2 == 0) {
				System.out.println("No se puede dividir por cero");
			} else {
				resultado = numero1 / numero2;
				System.out.println("La division es: " + resultado);
			}

		} catch (Exception ex) {
			System.out.println("Ingreso un valor inesperado");
		}

	}

}
