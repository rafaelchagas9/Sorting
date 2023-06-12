/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.sorting;

import java.util.ArrayList;

public class Selection {

    public static ArrayList<Integer> sort(ArrayList<Integer> unorderedList) {

        for (int i = 0; i < unorderedList.size(); i++) {
            int currentValue = unorderedList.get(i);
            int lowest_value = unorderedList.get(i);
            int lowest_value_index = i;

            int j = i + 1;

            while (j < unorderedList.size()) {
                if (unorderedList.get(j) < lowest_value) {
                    // Atualiza o menor valor e seu índice
                    lowest_value = unorderedList.get(j);
                    lowest_value_index = j;
                }
                j++;
            }
            
            // Troca o valor atual pelo menor valor encontrado
            unorderedList.set(i, lowest_value);
            unorderedList.set(lowest_value_index, currentValue);
        }

        return unorderedList;
    }
}
