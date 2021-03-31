package Ejercicios;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guia1 {
	
//falta el ejercicio 12
	
	/*
	 14.  Se ingresa un número entero por teclado, se pide mostrar la siguiente salida de asteriscos que tiene tantas filas como el número ingresado indica.
    */
	
	public void ejercicio14() {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		numero = sc.nextInt();

		int i = 0;
		int j = 0;

		for (i = 0; i < numero; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void ejercicio10() {
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

	public void ejercicio9() {
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

	public void ejercicio8() {
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

	public void ejercicio7() {
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

	public void ejercicio6Bis() {
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

	public void ejercicio6() {
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

	public void ejercicio5() {
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

	public void ejercicio4() {
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

	public void ejercicio3() {
		int fecha1 = 200319;
		int fecha2 = 151019;

		int dia1, dia2;
		int mes1, mes2;
		int año1, año2;

		dia1 = fecha1 / 10000;
		dia2 = fecha2 / 10000;
		año1 = fecha1 % 100;
		año2 = fecha2 % 100;
		mes1 = fecha1 % 10000; // 0319
		mes1 = mes1 / 100;
		mes2 = fecha2 % 10000; // 1019
		mes2 = mes2 / 100;

		if (año1 > año2) {
			System.out.println("la fecha 1 es mas actual");
		} else if (año1 < año2) {
			System.out.println("la fecha 2 es mas actual");
		} else {
			if (mes1 > mes2) {
				System.out.println("la fecha 1 es mas actual");
			} else if (mes1 < mes2) {
				System.out.println("la fecha 2 es mas actual");
			} else {
				if (dia1 > dia2) {
					System.out.println("la fecha 1 es mas actual");
				} else if (dia1 < dia2) {
					System.out.println("la fecha 2 es mas actual");
				} else {
					System.out.println("la fecha 1 es igual a la fecha");
				}
			}

		}
	}

	public void ejercicio2() {
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

	public void ejercicio1() {
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
	public void ejercicio1GUI() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();//esta la ventana
		frame.setSize(500, 400); 
		frame.setLocationRelativeTo(null);//para centrar la ventana la crearla
		frame.setTitle("CALCULADORA");
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Ingrese un numero");
		lblNumero1.setBounds(20, 60, 150, 25);
		panel.add(lblNumero1);
		
		JTextField txtNumero1 = new JTextField("0");
		txtNumero1.setBounds(180, 60, 150, 25);
		panel.add(txtNumero1);
		
		JLabel lblNumero2 = new JLabel("Ingrese otro numero");
		lblNumero2.setBounds(20, 120, 150, 25);
		panel.add(lblNumero2);
		
		JTextField txtNumero2 = new JTextField("0");
		txtNumero2.setBounds(180,120, 150, 25);
		panel.add(txtNumero2);
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(20, 250, 150, 25);
		panel.add(txtResultado);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setBounds(20, 180, 50, 50);
		panel.add(btnSumar);
		
		btnSumar.addActionListener(e -> {
			txtResultado.setText(sumar(txtNumero1.getText(), txtNumero2.getText()));
		});
		
		JButton btnRestar = new JButton("-");
		btnRestar.setBounds(80, 180, 50, 50);
		panel.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(140, 180, 50, 50);
		panel.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(200, 180, 50, 50);
		panel.add(btnDividir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(260, 180, 150, 50);
		btnLimpiar.addActionListener(e -> {
			txtResultado.setText("");
			txtNumero1.setText("");
			txtNumero2.setText("");
			
		});
		panel.add(btnLimpiar);

	}

	private String sumar(String text, String text2) 
	{
		try
		{
			int numero1 = Integer.parseInt(text);
			int numero2 = Integer.parseInt(text2);
			
			return Integer.toString(numero1 + numero2);
		}
		catch(Exception ex)
		{
			return "Error";
		}
	}
}
