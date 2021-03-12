package Ejercicios;

import java.util.Scanner;

public class Guia2 {
	/*
	 * 8-Escribir una función que reciba una palabra e informe cuantos
	 * caracteres contiene, cual es la primera y la última letra y responda si
	 * contiene la palabra “.com”
	 */
	public void analizador(String palabra) {
		System.out.println(palabra.length());
		System.out.println(palabra.charAt(0));
		System.out.println(palabra.charAt(palabra.length() - 1));
		System.out.println(palabra.contains(".com"));

	}
	/*
	 * Escribir una función que pida al usuario números enteros y devuelva el
	 * factorial de dichos números, la función deberá preguntar al usuario si
	 * desea continuar después de cada factorial calculado.
	 */

	public void factoriales() {
		int numero;
		Scanner sc = new Scanner(System.in);

		Boolean continuar = true;

		while (continuar) {
			System.out.println("Ingrese un numero entero");
			numero = sc.nextInt();
			System.out.println(factorial(numero));

			System.out.println("Ingrese un 1 para continuar");
			numero = sc.nextInt();
			continuar = (numero == 1);
		}
	}

	public void reemplazarLetras(String texto) {
		System.out.println(texto.replace('o', 'e'));
	}

	public int mcd(int A, int B) {
		/*
		 * Dividir A por B y calcular el resto (0 < R < B). · Si R = 0, el MCD
		 * es B, sino continuar. · Reemplazar A por B, B por R y volver al
		 * primer paso.
		 */

		int R = A % B;
		if (R == 0) {
			return B;
		}

		return mcd(B, R);
	}

	public double ladoCuadrado(double areaCirculo) // area del cuadrado
															// = L * L = area
															// del circulo
	{
		double lado = Math.sqrt(areaCirculo);// para calcular la raiz cuadrada
		return lado;
	}

	public double areaCirculo(int radio) {
		double area = Math.PI * radio * radio;
		return area;
	}

	public long factorial(int n) {
		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public void ejercicio2_g2(int a, int b, int c) {
		int x = -b / (2 * a);
		int y = a * x * x + b * x + c;

		System.out.println("El vertice de la parabola es (" + x + ", " + y + ")");
	}

	public void ejercicio1_g2(int lado1, int lado2, int lado3) {
		if ((lado1 == lado2) && (lado2 == lado3)) {
			System.out.println("el triangulo es equilatero");
		} else if ((lado1 != lado2) && (lado3 != lado2) && (lado1 != lado3)) {
			System.out.println("el triangulo es escaleno");
		} else {
			System.out.println("el triangulo es isoceles");
		}

	}

}
