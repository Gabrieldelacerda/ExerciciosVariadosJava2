package com.example;

class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

public class ArvoreBinariaDeBusca {
    
    No raiz;

    public ArvoreBinariaDeBusca() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    private No inserirRecursivamente(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRecursivamente(raiz.direita, valor);
        }

        return raiz;
    }

    public void percorrerInOrder(No raiz) {
        if (raiz != null) {
            percorrerInOrder(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            percorrerInOrder(raiz.direita);
        }
    }

    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Percorrendo a árvore in-order:");
        arvore.percorrerInOrder(arvore.raiz);
    }
}
