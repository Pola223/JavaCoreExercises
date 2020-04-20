package SamouczekProgramisty.Petle;

import java.util.Scanner;

public class Od0doX {
    Od0doX(){
        int x;
        do{
            System.out.println("Podaj dodatnią liczbę całkowitą");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }while(x<=0);

        for (int i = 0; i <= x ; i++) {
            System.out.print(i+", ");
        }


    }
}
