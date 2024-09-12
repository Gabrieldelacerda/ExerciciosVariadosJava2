package com.example;

class TarefaImprimirNumeros implements Runnable {
	private String nomeDaThread;
	
	public TarefaImprimirNumeros(String nome) {
		this.nomeDaThread = nome;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(nomeDaThread + " - Número: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(nomeDaThread + " foi interrompida.");
			}
		}
		System.out.println(nomeDaThread + " terminou a execução.");
	}
}

public class ExemploMultithreading {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new TarefaImprimirNumeros("Thread 1"));
		Thread thread2 = new Thread(new TarefaImprimirNumeros("Thread 2"));
		Thread thread3 = new Thread(new TarefaImprimirNumeros("Thread 3"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}

