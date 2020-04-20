package SamouczekProgramisty.ObiektyPakiety;

import java.util.Arrays;

public class TabliceOdwocenie {

    TabliceOdwocenie(int[] tablica){

        int[] odwrocona = new int[tablica.length];

        for (int i = 0; i < tablica.length ; i++) {
            odwrocona[i] = tablica[tablica.length-1-i];
        }

        System.out.println(Arrays.toString(odwrocona));

    }

}
