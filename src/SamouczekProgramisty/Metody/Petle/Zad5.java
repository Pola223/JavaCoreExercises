package SamouczekProgramisty.Metody.Petle;

import java.util.Scanner;

public class Zad5 {
    static boolean isDividable(int x){
        if ((x%5==0)&&(x%3==0)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(isDividable(a));
    }
}
