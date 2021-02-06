import java.util.Scanner;

public class Principal21 {


	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		ejercicio4();
		
	}
	
	private static void ejercicio4()
	{
		short nota1 = 0;
		short nota2 = 0;
		short nota3 = 0;
		float promedio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 10");
		nota1 = (short) sc.nextInt();
		
		System.out.println("Ingrese otro numero del 1 al 10");
		nota2 = (short) sc.nextInt();
		
		System.out.println("Ingrese otro numero del 1 al 10");
		nota3 = (short) sc.nextInt();
		
		if ((nota1 >=0) && (nota1 <= 10) && (nota2 >=0) && (nota2 <= 10) && (nota3 >=0) && (nota3 <= 10))
		{
			promedio = (nota1 + nota2 + nota3) / 3;
			
			if ((nota1 >= 4) && (nota2 >= 4) && (nota3 >=4) && (promedio >=4))
			{
				System.out.println("El alumno esta aprobado");
			}
			else
			{
				System.out.println("El alumno esta desaprobado");
			}
		}
		else
		{
			System.out.println("no se pudo calcular, verifique las notas ingresadas");
		}
		
		
		
		
	}
	private static void ejercicio3()
	{
		int fecha1 = 200319;
		int fecha2 = 151019;
		
		if (fecha1 > fecha2)
		{
			
		}
	}
	
	private static void ejercicio2()
	{
		int numero1= 0;
		int numero2 = 0;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Ingrese un numero entero");
			numero1 = sc.nextInt();
			
			System.out.println("Ingrese otro numero entero");
			numero2 = sc.nextInt();
			
			if(numero1 > numero2)
			{
				System.out.println("El mayor es " + numero1);
			}
			else
			{
				if (numero1 == numero2)
				{
					System.out.println("los numeros son iguales");
				}
				else
				{
					System.out.println("El mayor es " + numero2);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("ingreso un valor inesperado");
		}
	}
	
	private static void ejercicio1()
	{
		// ejercicio 1
		int numero1;
		int numero2;
		
		float resultado;
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
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
			
			if (numero2 == 0)
			{
				System.out.println("No se puede dividir por cero");
			}
			else
			{
				resultado = numero1 / numero2;
				System.out.println("La division es: " + resultado);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Ingreso un valor inesperado");
		}
		
		
		
	}

}
