package basicExercisesW3schools;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Basics {

    Scanner scanner = new Scanner(System.in);


    // Ex 7. Write a Java program that takes a number as input and prints its multiplication table upto 10
    public void multiplication() {

        System.out.println("Please provide a number to multiply: ");
        int number = scanner.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.printf("%3d x %2d = %-20d%n", number, i, number * i);
        }

    }


    // Ex 17. Write a Java program to add two binary numbers.
    public long addBinaryNums() {

        System.out.println("Provide two binary numbers for addition: ");
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        StringBuilder result = new StringBuilder();

        do {

            if (((num1 % 10) + (num2 % 10)) > 1) {

                result.insert(0, String.valueOf((num1 % 10) + (num2 % 10) - 2));
                num1 += 10;

            } else {
                result.insert(0, ((num1 % 10) + (num2 % 10)));
            }

            num1 = num1 / 10;
            num2 = num2 / 10;

        } while ((num1 > 0) || (num2 > 0));

        System.out.println(result);
        return Integer.parseInt(String.valueOf(result));
    }


    // Ex 18. Write a Java program to multiply two binary numbers.
    public long multiplyBinaryNums() {
        System.out.println("Provide two binary numbers for multiplication: ");
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        long result = num1 * num2;
        StringBuilder binaryResult = new StringBuilder();

        do {

            if ((result % 10) > 1) {
                result += (10 * ((result % 10) / 2));

                binaryResult.insert(0, (result % 10) % 2);
            } else {
                binaryResult.insert(0, result % 10);
            }

            result /= 10;

        } while (result > 0);


        System.out.println(binaryResult);
        return Integer.valueOf(String.valueOf(binaryResult));
    }


    // Ex 19. Write a Java program to convert a decimal number to binary number.
    public long convertDecimalToBinary() {

        System.out.println("Provide decimal number to convert to binary number: ");
        long decimal = scanner.nextLong();
        int pow = 0;

        StringBuilder binary = new StringBuilder();

        while ((decimal - Math.pow(2, pow)) >= 0) {
            pow++;
        }


        for (int i = pow - 1; i >= 0; i--) {

            if ((decimal - Math.pow(2, i)) >= 0) {
                binary.append("1");
                decimal -= Math.pow(2, i);
            } else {
                binary.append("0");
            }

        }

        long result = Integer.valueOf(String.valueOf(binary));
        System.out.println(result);
        return result;
    }


    // Ex 20. Write a Java program to convert a decimal number to hexadecimal number.
    public String convertDecimalToHex() {
        System.out.println("Provide decimal number to convert to hexadecimal number: ");
        long decimal = scanner.nextLong();

        String result = decToHex(decimal);

        System.out.println(result);
        return result;

    }

    public String decToHex(long decimal) {
        int pow = 0;

        StringBuilder hex = new StringBuilder();

        while ((decimal - Math.pow(16, pow)) >= 0) {
            pow++;
        }


        for (int i = pow - 1; i >= 0; i--) {

            int mult = 0;

            while ((decimal - Math.pow(16, i) * mult) >= 0) {
                mult++;
            }

            mult--;

            if (mult < 10) {
                hex.append(String.valueOf(mult));
            } else {
                hex.append((char) (55 + mult));
            }

            decimal -= (Math.pow(16, i) * mult);
        }

        return String.valueOf(hex);
    }


    // Ex 21. Write a Java program to convert a decimal number to octal number.
    public long convertDecimalToOct() {

        System.out.println("Provide decimal number to convert to octal number: ");
        long decimal = scanner.nextLong();
        int pow = 0;

        StringBuilder oct = new StringBuilder();

        while ((decimal - Math.pow(8, pow)) >= 0) {
            pow++;
        }


        for (int i = pow - 1; i >= 0; i--) {

            int mult = 0;

            while ((decimal - Math.pow(8, i) * mult) >= 0) {
                mult++;
            }

            mult--;

            oct.append(mult);

            decimal -= (Math.pow(8, i) * mult);

        }

        String result = String.valueOf(oct);
        System.out.println(result);
        return 123;

    }


    // Ex 22. Write a Java program to convert a binary number to decimal number.
    public int convertBinaryToDecimal() {
        System.out.println("Provide binary number for conversion to decimal: ");
        long binary = scanner.nextLong();

        int decimal = binToDec(binary);

        System.out.println("Decimal equivalent: " + decimal);
        return decimal;
    }

    public int binToDec(long binary) {
        int pow = 0;
        int decimal = 0;

        do {
            decimal += (binary % 10) * Math.pow(2, pow);
            pow++;
            binary = binary / 10;
        } while (binary > 0);

        return decimal;
    }

    // Ex 23. Write a Java program to convert a binary number to hexadecimal number.
    public String convertBinaryToHex() {
        System.out.println("Provide binary number for conversion to hexadecimal: ");
        long binary = scanner.nextLong();

        String hex = decToHex(binToDec(binary));

        System.out.println("Decimal equivalent: " + hex);
        return hex;
    }

    // Ex 31. Write a Java program to check whether Java is installed on your computer.
    public void checkJava() {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    // Ex 36. Write a Java program to compute the distance between two points on the surface of earth.
    public void distanceBetweenTwoPointsOnEarth() {
        System.out.println("Input the latitude of coordinate 1: ");
        double lat1 = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double long1 = scanner.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double lat2 = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate 2: ");
        double long2 = scanner.nextDouble();

        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double radius = 6371.01; //km
        double distance = (radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2)));

        System.out.println("Distance between those two points is: " + distance + " km");
    }

    // Ex 39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
    public void createUniqueNums() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int len = 3;

        System.out.println("Creating unique 3 digit numbers of 4 given numbers: ");
        System.out.println(nums);
        System.out.println("Digits can't be repeated in one number");

        int uniqueNumber=0;
        System.out.println("Of the given set you can make " + unique(len, nums, uniqueNumber) + " different numbers. " );

    }

    public int unique(int len, ArrayList<Integer> nums, int uniqueNumber) {
        int uniqueNumsCounter = 0;

        if (len > 0) {

            for (int n : nums) {
                ArrayList<Integer> subNums = new ArrayList<>();
                subNums.addAll(nums);
                subNums.remove(Integer.valueOf(n));

                uniqueNumber += (int) (n * Math.pow(10, len - 1));

                uniqueNumsCounter += unique(len - 1, subNums, uniqueNumber);

                uniqueNumber -= (int) (n * Math.pow(10, len - 1));
            }

        } else {
            System.out.println(uniqueNumber);
            uniqueNumsCounter++;
        }


        return uniqueNumsCounter;
    }

}