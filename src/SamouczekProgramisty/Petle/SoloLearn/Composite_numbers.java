package SamouczekProgramisty.Petle.SoloLearn;

import java.util.Scanner;

public class Composite_numbers {

    public static void main(String[] args){
//        System.out.println("Please provide a number to check if it's composite number");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        for (int i = 2; i < a ; i++) {
//            int c = a%i;
//            if (c==0){
//                System.out.println("It's composite number");
//                break;
//            }
//        }
//        System.out.println("It's NOT a composite number");
//
        System.out.println("Please provide a range of numbers to check for composite numbers");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        System.out.println("Composite numbers within a range to "+ b);
        for (int j = 2; j < b; j++) {
            for (int i = 2; i < j; i++) {
                int c = j % i;
                if (c == 0) {
                    System.out.println(j);
                    break;
                }
            }
        }

        int k = 5;
        int j = ++k;
        System.out.println(j);


    }


}