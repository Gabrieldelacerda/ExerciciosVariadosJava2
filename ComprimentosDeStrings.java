package com.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComprimentosDeStrings {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("banana", "uva", "maçã", "laranja");
		
		List<Integer> comprimentos = palavras.stream()
											 .map(String::length)
											 .collect(Collectors.toList());
		System.out.println(comprimentos);

	}

}
