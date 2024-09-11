package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorDeArquivo {
	public static void main(String[] args) {
		//Você tem que alterar este caminho aqui para o caminho do arquivo que você deseja ler
		String caminhoDoArquivo = "seuarquivo.txt";
		
		int contagemPalavras = 0;
		int contagemLinhas = 0;
		int contagemCaracteres = 0;
		
		try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
			String linha;
			while ((linha = leitor.readLine()) != null) {
				contagemLinhas++;
				
				String[] palavras = linha.split("\\s+");
				contagemPalavras += palavras.length;
				contagemCaracteres += linha.length();
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		System.out.println("Número de linhas: " + contagemLinhas);
		System.out.println("Número de palavras: " + contagemPalavras);
		System.out.println("Número de caracteres: " + contagemCaracteres);
	}
}
