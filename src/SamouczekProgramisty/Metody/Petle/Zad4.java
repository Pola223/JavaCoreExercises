package SamouczekProgramisty.Metody.Petle;

import java.util.Scanner;

public class Zad4 {
    static boolean isEven(double b) {
        if (b % 2 == 0) {
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        isEven(a);


    }
}
