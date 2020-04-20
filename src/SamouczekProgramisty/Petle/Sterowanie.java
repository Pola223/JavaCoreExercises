package SamouczekProgramisty.Petle;

import java.util.Scanner;

public class Sterowanie {
    public static void main(String[] args) {

//SoloLearn nie rozumiem
        String s="Programming is awesome.";
        System.out.println(s.charAt(s.length()-1));

        int[] ints={0,1,2};
        double doubles[] = {1.0,1.1,1.2};
        int maximum = Math.max(ints.length,doubles.length);
        int sum=10;
        for (int i = 0; i < maximum; i++) {
            sum+=ints[i]+doubles[i];
        }
        System.out.println(sum);



//Metoda wyświetlająca liczby(dodatnie) od zera do x
        new Od0doX();

//Klasa ArrayFactory (zad3)
        int x;
        do{
            System.out.println("\nNowe zadanie\nPodaj dodatnią liczbę całkowitą");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }while(x<=0);

        new ArrayFactory(x);

    }
}
