package SamouczekProgramisty.Petle.SoloLearn;

import java.util.Scanner;

public class Anadrome {
    public static void main(String[] args){
        System.out.println("Please enter a word to check if anadrome");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        int leng = a.length();

        for (int i = 0; i < leng; i++) {
            char result = a.charAt(i);
            for (int j = 1; j < leng ; j++) {
                char match = a.charAt(j);
//                boolean c = result.equals(match);
//                if (c){
//                    System.out.println("nie powinno się to wyświetlać");
////                    String str1 = a.substring(0,i);
////                    String str2 = a.substring((i+1),j);
////                    String str3 = a.substring((j+1),(leng));
////                    a = str1.concat(str2).concat(str3);
////                    leng = leng-2;
//                }
                System.out.println(a);
            }
        }

    }
}
