package com.anhembi.sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int seed = 0;
        boolean seedValida = true;
        Scanner in = new Scanner(System.in);
        String resposta;
        int listSize = 10;
        ArrayList<Integer> unorderedList = new ArrayList<Integer>();
        ArrayList<Integer> orderedList = new ArrayList<Integer>();

        do {
            System.out.println("\nDeseja configurar uma seed? (S/N)");
            resposta = in.nextLine();
        } while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"));

        if (resposta.equalsIgnoreCase("S")) {
            do {
                try {
                    System.out.println("\nInsira a seed: ");
                    String userInput = in.nextLine();
                    seed = Integer.parseInt(userInput);
                    seedValida = true;
                } catch (Exception e) {
                    seedValida = false;
                }

            } while (!seedValida);
        }
        Random generator = new Random(seed);

        for (int i = 0; i < listSize; i++) {
            int num = generator.nextInt(1000);
            unorderedList.add(num);
        }

        System.out.print("A lista é (");
        for (int i = 0; i < listSize; i++) {
            System.out.print(unorderedList.get(i) + ", ");
        }
        System.out.println(")");

        do {
            System.out.println("\nQual algoritimo deseja usar? \n1 - Shell sort \n2 - Selection sort \n3 - Insertion sort");
            resposta = in.nextLine();
        } while (!resposta.equalsIgnoreCase("1") && !resposta.equalsIgnoreCase("2") && !resposta.equalsIgnoreCase("3"));

        switch (resposta) {
            case "1":
                // Shell sort
                orderedList = Shell.sort(unorderedList);
                break;

            case "2":
                // Selection sort
                orderedList = Selection.sort(unorderedList);
                break;

            case "3":
                // Insertion sort
                orderedList = Insertion.sort(unorderedList);
                break;
        }

        System.out.print("A lista ordenada é (");
        for (int i = 0; i < listSize; i++) {
            System.out.print(orderedList.get(i) + ", ");
        }
        System.out.println(")");

        in.close();
    }
}
