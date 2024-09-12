package com.example;

import java.util.Arrays;

public class AlgoritmosDeOrdenacao {

    //Bubble Sort
    public static void ordenacaoBolha(int[] array) {
        int n = array.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break; //Se não houve troca, o array já está ordenado
        }
    }

    //Quick Sort
    public static void ordenacaoRapida(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particiona(array, inicio, fim);
            ordenacaoRapida(array, inicio, indicePivo - 1);  //Recursão para o lado esquerdo do pivô
            ordenacaoRapida(array, indicePivo + 1, fim);     //Recursão para o lado direito do pivô
        }
    }

    private static int particiona(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (array[j] < pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }

    //Merge Sort
    public static void ordenacaoIntercalacao(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            ordenacaoIntercalacao(array, esquerda, meio);         // Recursão para a primeira metade
            ordenacaoIntercalacao(array, meio + 1, direita);      // Recursão para a segunda metade
            intercala(array, esquerda, meio, direita);            // Junta as duas metades
        }
    }

    private static void intercala(int[] array, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
        int[] arrayEsquerda = new int[n1];
        int[] arrayDireita = new int[n2];

        System.arraycopy(array, esquerda, arrayEsquerda, 0, n1);
        System.arraycopy(array, meio + 1, arrayDireita, 0, n2);

        int i = 0, j = 0, k = esquerda;
        while (i < n1 && j < n2) {
            if (arrayEsquerda[i] <= arrayDireita[j]) {
                array[k] = arrayEsquerda[i];
                i++;
            } else {
                array[k] = arrayDireita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arrayEsquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayDireita[j];
            j++;
            k++;
        }
    }

    //Teste e comparação dos algoritmos, pode mudar os números padrão se quiser
    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();

        System.out.println("Array original: " + Arrays.toString(array1));

        //Ordenação por Bolha
        ordenacaoBolha(array1);
        System.out.println("Ordenado com Ordenação por Bolha: " + Arrays.toString(array1));

        //Ordenação Rápida
        ordenacaoRapida(array2, 0, array2.length - 1);
        System.out.println("Ordenado com Ordenação Rápida: " + Arrays.toString(array2));

        //Ordenação por Intercalação
        ordenacaoIntercalacao(array3, 0, array3.length - 1);
        System.out.println("Ordenado com Ordenação por Intercalação: " + Arrays.toString(array3));
    }
}
