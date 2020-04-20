package SamouczekProgramisty.Metody.Petle;

import java.util.Scanner;

public class Zad6 {

    static double cube(double x){
        x=x*x*x;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println(cube(a));
    }
}
