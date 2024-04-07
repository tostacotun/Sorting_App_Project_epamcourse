package com.sorting_app;

import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args){
        if (args.length <10){
            System.out.println("No son suficientes numeros enteros");
            return;
        }

        if (args.length > 10){
            System.out.println("Mas argumentos de los requeridos");
            return;
        }

        int[] numeros;
        try {
            numeros = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        }catch (NumberFormatException e){
            System.out.println("Error de formato ¿son numeros?");
            return;
        }

        Sorting claseorganiza = new Sorting(numeros);
        claseorganiza.Organizar();




    }
}
