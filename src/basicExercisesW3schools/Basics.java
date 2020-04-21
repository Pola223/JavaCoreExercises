package basicExercisesW3schools;

import java.util.Scanner;

public class Basics {

    Scanner scanner = new Scanner(System.in);


    public void multiplication() {

        System.out.println("Please provide a number to multiply: ");
        int number = scanner.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.printf("%3d x %2d = %-20d%n", number, i, number * i);
        }

    }


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


    public String convertDecimalToHex() {
        System.out.println("Provide decimal number to convert to hexadecimal number: ");
        long decimal = scanner.nextLong();
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

        String result = String.valueOf(hex);
        System.out.println(result);
        return result;

    }


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


}