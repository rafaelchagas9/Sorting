/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.sorting;

import java.util.ArrayList;

public class Insertion {

    public static ArrayList<Integer> sort(ArrayList<Integer> unorderedList) {

        for (int i = 0; i < unorderedList.size(); i++) {
            int currentValue = unorderedList.get(i);

            int j = i - 1;

            while (j >= 0 && currentValue < unorderedList.get(j)) {
                unorderedList.set(j + 1, unorderedList.get(j));
                j--;
            }

            unorderedList.set(j + 1, currentValue);

        }

        return unorderedList;
    }
}
