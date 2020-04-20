package SamouczekProgramisty.Petle.SoloLearn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rotate_matrix {
    public static void main(String[] args){
//        System.out.println("Please specify how many rows and columns you want the square matrix to have");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        int Tab[][]= new int[a][a];
//
//        for (int i = 1; i <= a ; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.println("Please give a number in row "+i+" and column "+ j);
//                int b = scanner.nextInt();
//                Tab[(j-1)][(3-i)]=b;
//            }
//        }
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                System.out.print(Tab[i][j] + " ");
//            }
//            System.out.println(" \n");
//        }

        System.out.println("Please specify how many rows and columns you want the square matrix to have");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int Tab[][]= new int[a][a];

        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.println("Please give a number in row "+i+" and column "+ j);
                int b = scanner.nextInt();
                Tab[(3-j)][(i-1)]=b;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(Tab[i][j] + " ");
            }
            System.out.println(" \n");
        }


    }
}
