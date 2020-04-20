package SamouczekProgramisty.Petle.SoloLearn;

import java.util.Scanner;

public class Harshad_numbers {

    public static void main(String[] args){
        int czyHarshad;
        int a, suma=0;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number to check if it's Harshad number");
        czyHarshad = scanner.nextInt();

        for (int i = czyHarshad; i > 0; i=i/10) {
            a=i%10;
            suma = suma+a;
        }

        b =czyHarshad%suma;
        if (b==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        //*****BONUS*****

        int range;

        System.out.println("Please provide a number to check for Harshad number whithin range from 1 to that number");
        range = scanner.nextInt();

        int c;
        int e;

        for (int j = 1; j <= range; j++) {
            int sum=0;

            for (int i = j; i >= 1; i=i/10) {
                c=i%10;
                sum = sum+c;
            }

            e=j%sum;
            if (e==0){
                System.out.println(j);
            }

        }

    }

}
