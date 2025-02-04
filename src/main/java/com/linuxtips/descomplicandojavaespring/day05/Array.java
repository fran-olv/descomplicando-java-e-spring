package com.linuxtips.descomplicandojavaespring.day05;

import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        // Estrutura de Dados simples para armazenar uma coleção de elementos
        // nao é um dado primitivo

        //forma mais comum de declarar arrays
        int[] arrayDeInt;

        //forma menos comum
        int arrayDeInt2[];

        //inicializando um array -  caso você ja saiba o numero de elementos
        int[] arrayDeInt3 = new int[20];

        //caso você ja saiba os valores que irão dentro do array
        Integer[] arrayDeInt4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        //descobrindo o tamanho do array ()
        int arraySize = arrayDeInt4.length;
        System.out.println("A quatidade de itens é " + arraySize);


        //percorrendo um array
        // precisa transformar os itens do array em listas
        List<Integer> itens = Arrays.asList(arrayDeInt4);
        itens.forEach(System.out::println); //java 8 method reference (::) forma funcional de chamar um metodo



        //copiando um array - copyOfRange
        String[] treinamento = new String[]{"treinamento", "descomplicando", "java", "e", "spring", "da", "linux", "tips"};
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5); //array comeca em zero <5 {descomplicando java e spring} 
        List<String> treinamentoList = List.of(treinamento); //outra forma de converter array pra lista List.of
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoList.forEach(System.out::println);
        treinamentoNomeList.forEach(System.out::println);


        //copiando um array - copyOf - nao escolhe o range escolhe
        String[] arrayCom2 = Arrays.copyOf(treinamentoNome,2);
        List<String> arrayCom2List = List.of(arrayCom2); //pra imprimir no console transforma arrayCom2 em lista
        arrayCom2List.forEach(System.out::println);


        //parte 2
        //preenchendo um array os mesmos valores - fill
        String[] java = new String[10];
        Arrays.fill(java, "java");

        List<String> javaList = List.of(java);
        javaList.forEach(System.out::println);


        //validando se dois arrays são iguais - equals
        int[] arraydeInt1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arraydeInt2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println("Os arrays são iguais: " + Arrays.equals(arraydeInt1, arraydeInt2));

        //ordenando arrays - sorted (ordenacao)
        String[] sorted = Arrays.copyOf(treinamento, 5); //cria o array sorted com os valores
        Arrays.sort(sorted); //ordena em ordem alfabetica o sort em 
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);
    }
}
