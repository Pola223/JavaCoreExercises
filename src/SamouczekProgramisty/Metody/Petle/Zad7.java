package SamouczekProgramisty.Metody.Petle;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Potęga: "+pow(a,2));
        System.out.println("Pierwiastek: "+sqrt(a));
    }
}
