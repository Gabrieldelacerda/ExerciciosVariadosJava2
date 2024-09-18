package com.example;

public class ExemploTratamentoExcecoes {

	public static void main(String[] args) {
		try {
			int numerador = 10;
			int denominador = 0;
			int resultado = numerador / denominador;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por zero!");
		}
		
		try {
			int[] numeros = {1, 2, 3};
			System.out.println("Vamos acessar o índice fora do limite: " + numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Índice inválido do array.");
		}
		
		try {
			String numeroInvalido = "abc";
			int numeroConvertido = Integer.parseInt(numeroInvalido);
			System.out.println("Número convertido: " + numeroConvertido);
		} catch (NumberFormatException e) {
			System.out.println("Não foi possível converter a string em número.");
		}

	}

}
