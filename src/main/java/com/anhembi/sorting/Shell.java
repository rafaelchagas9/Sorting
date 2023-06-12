/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.sorting;

import java.util.ArrayList;

public class Shell {

    public static ArrayList<Integer> sort(ArrayList<Integer> unorderedList) {

        int n = unorderedList.size(); // Tamanho da lista
        for (int gap = n / 2; gap > 0; gap /= 2) { // Define o tamanho do gap
            for (int i = gap; i < n; i++) { // Percorre a lista
                int temp = unorderedList.get(i); // Armazena o valor atual
                int j;
                for (j = i; j >= gap && unorderedList.get(j - gap) > temp; j -= gap) { // Compara os valores
                    unorderedList.set(j, unorderedList.get(j - gap)); // Troca os valores
                }
                unorderedList.set(j, temp); // Armazena o valor atual na posição correta
            }
        }
        return unorderedList; // Retorna a lista ordenada
    }
}
