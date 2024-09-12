package com.example;

class Animal {
	public void emitirSom() {
		System.out.println("O animal faz um determinado som!");
	}
}

class Cachorro extends Animal {
	@Override
	public void emitirSom() {
		System.out.println("Cachorro faz Au Au!");
	}
}

class Gato extends Animal {
	@Override
	public void emitirSom() {
		System.out.println("Gatinho faz Miau!!");
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Animal meuCachorro = new Cachorro();
		Animal meuGatinho = new Gato();
		
		meuCachorro.emitirSom();
		meuGatinho.emitirSom();
	}
}
