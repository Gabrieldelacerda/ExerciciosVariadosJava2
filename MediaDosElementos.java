package com.example;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Arrays;

public class MediaDosElementos {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		OptionalDouble media = numeros.stream()
				.mapToInt(Integer::intValue)
				.average();
		
		media.ifPresent(m -> System.out.println("Média: " + m));

	}

}
