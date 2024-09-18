package com.example;
import java.util.Arrays;
import java.util.List;

public class SomaDosQuadrados {
	public static int somaQuadrados(List<Integer> numeros) {
		return numeros.stream()
				.map(n -> n * n)
				.reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);     //Pode alterar esses valores
		System.out.println("Soma dos quadrados: " + somaQuadrados(numeros));
	}
}
