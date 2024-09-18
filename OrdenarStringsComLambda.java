package com.example;
import java.util.List;
import java.util.Arrays;

public class OrdenarStringsComLambda {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("banana", "uva", "maçã", "laranja");
		
		palavras.stream()
			.sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
			.forEach(System.out::println);
	}

}
