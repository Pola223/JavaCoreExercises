package SamouczekProgramisty.Metody.Petle;


import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.hypot;

//trójkąt prostokątny
public class Zad8 {
    static boolean czyTrojkat(double a,double b,double c){
        if ((hypot(a, b))==abs(c) ){
            return true;
        }else if( (hypot(c,b))==abs(a)){
            return true;
        }else if((hypot(b,c))==abs(b)){
            return true;
        }else{
            return false;
        }


    }


    public static void main(String[] args) {
        System.out.println("Podaj trzy liczby ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        double c = scanner3.nextDouble();

        System.out.println("Czy da się zbudować trójkąt prostokątny? " + czyTrojkat(a,b,c));
    }
}
