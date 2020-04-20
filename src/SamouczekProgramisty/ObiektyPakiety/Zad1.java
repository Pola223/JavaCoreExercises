package SamouczekProgramisty.ObiektyPakiety;

import java.util.Scanner;

//Human
public class Zad1 {
    public static void main(String[] args) {

//Zadanie Human
        Human human = new Human();
        human.setAge(35);
        human.setHeight(1.86);
        human.setName("Karol");
        human.setSex('M');
        human.setWeight(89.5);

        System.out.println("Człowiek: " +
                "\nimie " + human.getName() +
                "\nwiek " + human.getAge() +
                "\nwysokosc " + human.getHeight() +
                "\nwaga " + human.getWeight() +
                "\npłeć " + human.getSex());

// Zadanie Alfabet
        System.out.print("\nIle liter alfabetu mam wyświetlić? ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        TabliceAlfabet Tab1 = new TabliceAlfabet(a);

//Zadanie odwrocenie tablicy
        System.out.println("\nIle cyfr ma mieć zestaw?");
        int b = scanner.nextInt();

        int[] tabPodana= new int[3];

        for (int j = 0; j < 3; j++) {
            System.out.print("Podaj cyfrę: ");
            int x=scanner.nextInt();
            tabPodana[j]=x;
        }

        TabliceOdwocenie nowa = new TabliceOdwocenie(tabPodana);


    }
}
