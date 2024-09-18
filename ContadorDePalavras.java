package com.example;

import java.util.HashMap;
import java.util.Map;

public class ContadorDePalavras {

    public static void main(String[] args) {
        String texto = "Oi! Este é um exemplo de texto com palavras repetidas. Este exemplo nos mostra como contar palavras.";   //Variável de texto, pode alterar para o que quiser aqui.

        String[] palavras = texto.toLowerCase().split("\\W+");

        HashMap<String, Integer> frequenciaPalavras = new HashMap<>();

        for (String palavra : palavras) {
            frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entrada : frequenciaPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
