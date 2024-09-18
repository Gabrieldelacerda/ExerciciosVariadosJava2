package com.example;

interface Forma {
	double area();
}

class Circulo implements Forma {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * raio * raio; // pi * raio ao quadrado
	}
}

class Retangulo implements Forma {
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return largura * altura;
	}
}

public class Main {
	public static void main(String[] args) {
		Forma forma1 = new Circulo(5.0);
		Forma forma2 = new Retangulo(4.0, 6.0);
		
		System.out.println("Área do círculo: " + forma1.area());
		System.out.println("Área do retângulo: " + forma2.area());
	}
}