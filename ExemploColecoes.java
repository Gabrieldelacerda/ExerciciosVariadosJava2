package com.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExemploColecoes {

	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<>();
		listaNomes.add("João");
		listaNomes.add("Maria");
		listaNomes.add("Pedro");
		listaNomes.add("Ana");
		
		System.out.println("ArrayList de nomes: " + listaNomes);
		
		HashSet<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(10);
		conjuntoNumeros.add(20);
		conjuntoNumeros.add(30);
		conjuntoNumeros.add(20); //Esse valor não será adicionado, pois já é existente.
		
		System.out.println("HashSet de números: " + conjuntoNumeros);
		
		HashMap<String, Integer> mapaIdades = new HashMap<>();
		mapaIdades.put("João", 25);
		mapaIdades.put("Maria", 30);
		mapaIdades.put("Gabriel", 22);
		
		System.out.println("HashMap de idades: " + mapaIdades);
		
		System.out.println("Idade do João: " + mapaIdades.get("João"));
	}

}
