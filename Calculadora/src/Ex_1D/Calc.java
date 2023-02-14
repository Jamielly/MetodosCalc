package Ex_1D;

public class Calc {

	public static void soma(double num1, double num2) {
		double resul = num1 + num2;
		System.out.println("O resultado da soma: " + num1 + " + " + num2 + " = " + resul);
	}
	public static void subtracao(double num1, double num2) {
		double resul = num1 - num2;
		System.out.println("O resultado da subtração: " + num1 + " - " + num2 + " = " + resul);
	}
	public static void multiplicacao(double num1,double num2) {
		double resul = num1 * num2;
		System.out.println("O resultado da multiplicação: " + num1 + " * " + num2 + " = " + resul);
	}
	public static void divisao(double num1,double num2) {
		double resul = num1 / num2;
		System.out.println("O resultado da divisão é: " + num1 + " / " + num2 + " = " + resul);
	}
}