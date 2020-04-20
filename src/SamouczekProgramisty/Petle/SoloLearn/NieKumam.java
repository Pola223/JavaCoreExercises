package SamouczekProgramisty.Petle.SoloLearn;

import java.sql.SQLOutput;
import java.util.*;

public class NieKumam {

    //Zadanie 1 którego nie skumałam

//    public static void main(String[] args) {
//        int x=5;
//        System.out.print(x);
//        sqrNumber(3);
//        System.out.print(x);
//    }
//    static void sqrNumber(int x){
//        x=x*x;
//    }
    //wyświetla: 55  , ponieważ nie wołam sqrNumber nic nie zwraca, a ja do tego nie wołam x z metody sqrNumber

 //   public static void main(String[] args) {

        //Zadanie nie przekminione na czas (tylko w bloku kodu psvm)
//        int x=4;
//        double y=4.5;
//        boolean flag = !false;
//        if (!flag)
//            System.out.print(y++/x);
//        else
//            System.out.print(++x%y);
        //flag=true, czyli if(false) czyli instrukcja w if nie nie wykonuje bo warunek if jest niespełniony


        //Dobła dobła. Zadanie z czelendża
//        int a=5;
//        double b=a/10;
//        System.out.println(b);
        //najpierw chyba dzieli, a potem dodaje miejsce po przecinku i dlatego wyświetla 0.0
//}

    //Zadanie z czelendża. dalej nie kumam, jedyie podejrzewam
//    static int i;
//    static{i=0;}
//    public static void main(String[] args) {
//        System.out.print(i);
//        i=1;
//    }
//    static{ i=2;}
    //myślę, że pod i przypisuje się ostatnia wartość static spoza kodu psvm


//    public static void main(String[] args) {

        //Zad typy danych - nie kumam, ale to chyba specyfika działania w tym przypadku
//        System.out.println(Math.abs(Integer.MAX_VALUE)==Math.abs(Integer.MIN_VALUE-1));
        //math.abs wyświetla wartość bezwzględną
        //Integer.max value to maksymalna wartość, którą można zadeklarować za pomocą typu danych integer, a min value to najmniejsza
        //nie wiem dlaczego, ale math.abs z min value jest wciąż ujemne, ale jeśli się odejmie jakąś liczbę, (oprócz zera) to już się robi dodatnie ale dale o wartości min value (czyli to samo co max value)


        //zadanie
//        System.out.println((int)Math.random()*10);
        //math.random wyświetla liczbę od zera do 0.(9), a jak dodamy inta z tego to wyjdzie zawsze zero. Jeśli zrobimy *10 to 0*10 dalej daje 0


        //zadanie
//        int x=18;
//        for (int i=0;i<15;++i){
//            ++x;
//        }
//        System.out.print(x);
        //pętla wykona się 15 razy


        //ZAdanie (właściwie rozpisałam je sobie na 2óch pętlach for żeby lepiej zrozumieć dlaczego odpowiedź brzmiała że wyświetli 7 i NIE WYSWIETLA 7

//        for (int x = 0; x < 10; x++) {
//
//            x -= -(++x) - x;        //ta linijka w uproszczeniu: x = x +(++x)+ x;
//                                    //System.out.println(x);  po tej linijce i tyle w forze wyświetliłby 2 11 i to tyle
//                                    //czyli w pierwszej iteracji: x=0 --> x=0+1+1 (to drugie 1 bo było "++x" czyli dodaliśmy do x jeden i przypisaliśmy mu tą wartość czyli wyświetla 2
//                                    //x=2 ; zaczynamy drugą iterację, czyli x++, czyli x=3 ---> x=3+4+4 ---> x=11 (a to więcej niż 10 czyli nie przechodzimy więcej przez tą pętlę
//            System.out.println(x);
//        }
//        for (int x = 0; x < 10; x++) {
//            if (x==6)
//                System.out.print(++x);
//            if (x==9)
//                System.out.println(x--);
//            x -= -(++x) - x;
//        }
        //ten drugi for to właściwa treść zadania. Pytanie brzmiało "Co zwróci taki program" i odpowiedź brzmi NIC
        //( 2 i 11 są wyświetlone z pierwszego fora - tego do przekminy)


//    }

    //Zadanie
//    public static void main(String[] args) {
//        System.out.println(tri(3));
//    }
//    static int tri(int n){
//        //operator warunkowy ?: to jedyny trójdzielny operator w Java
//        // (condition)?(true branch):(false branch)
//        //    param1       param2        param3
//        return n==0 ? 0 : n==1 ? 1 : tri(n-1)+tri(n-2);
//        //     gdy n=0 wyświetl 0
//        //                gdy n=1 wyświetl 1
//        //                          gdy n nie jest równe 1 powtórz funkcję dla n-1 (czyli 2)
//        //                                                  i dla n-2(czli dla 1) i dodaj co wyszło z tych funkcji
//        //okej, czyli muszę to przeliczyć dla 2 i dla 1
//        //  tri(2) ---> muszę to przeiczyć tri(1) i tri(0) i je dodać
//        //              tri(0) ----> return 0;
//        //              tri(1) ----> return 1;
//        //              czyli wyszła wartość z tri(2) =1
//        //  tri(1) ---> return 1;
//        // więc w sumie wyszło że tri(3) = 2
//    }
    //tyle liczenia...


    //Zadanie z compareTo . podstępna bestia
//    public static void main(String[] args) {
//        System.out.println(min("Jak to działa","Jak to działa"));
//        //0 tzn, że stringi są takie same
//        System.out.println(min("aleksandra","bleksandra"));
//        //-1 bo b jest o 1 pozycję wyżej niż a
//        System.out.println(min("aleksandra","alfksandra"));
//        //-1 bo f jest o 1 pozycję wyżej niż e
//        System.out.println(min("aleksandra","alfmmmmmmm"));
//        //-1 bo liczy się tylko pierwsza zmieniona literka
//        System.out.println(min("aleksandra","algmmmmmmmm"));
//        //-2 bo jak już się zmieni jakąś literkę to zwraca uwagi na długość
//        System.out.println(min("aleksandra","aleksandra1234"));
//        //jeśli jeden string jest taki sam, a drugi taki sam, tylko ma coś dodanego to zwraca o ile jest dłuższy (lub krótszy)
//        System.out.println(min("aleksandra","Aleksandra"));
//        //wielkość liter ma znaczenie najpierw jest slafabet dużych liter
//        //(czyli każda duża litera będzie miała pozycję o 32 mniejszą niż jej mały odpowiednik)
//        System.out.println(min("aleksandra","aleks andra"));
//        //przerwy w środku stringa mają znaczenie
//        System.out.println(min("aleksandra","aleksandra "));
//        //przerwy na końcu stringa też są oznaczane
//    }
//    static Integer min(String a, String b){
//        int wynik = a.compareTo(b);
//        return wynik;
//    }
    //ogólnie wynik w wyświetlaniu zależy od pozycji literek w alfabecie i długości stringa


    //Zadanie w FOR inkrementacja i następuje po wykonaniu instrukcji
//    public static void main(String[] args) {
//        int x =1;
//        for(;x<6;x++){
//            x*=x;
//        System.out.print(x);}
//        System.out.print("\n"+x);
//    }
    //w pętli for wartość x zwiększa się po wykonaniu całyh instrukcji
    //dlatego wyświetla się ostatecznie 26 a nie 25 po wyjściu z pętli



    //HOWLING PRIMES
//    public static void main(String[] args) {
//        int input;
//        int i, j;
//        int k, l;
//        System.out.println("Please give me a prime number to check if it's howling prime");
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextInt();
//        if (input<2){
//            System.out.println("Prime number is a natural number, but not 0 nor 1");
//        }
//
//        //this for loop checks if number is actually a prime
//        for (i=(input-1) ; i>=2 ; i-- ) {
//            k = (input % i);
//            switch (k) {
//                case 0:
//                    System.out.println("That's not a prime number.");
//                    i=0;
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        //if actually a prime if loop check if it's howling
//        if (i==1){
//            //this for loop counts sum of digits in number
//            int a, m, sumOfDigits=0 ;
//            for ( m=input; m >=10 ; m=m/10) {
//                a=m%10;
//                sumOfDigits=sumOfDigits+a;
//            }
//            sumOfDigits=sumOfDigits+m;
//            System.out.println("Sum of digits: " + sumOfDigits);
//
//            //that loop is checking if sum of digits is also a prime
//            for (j = sumOfDigits-1; j>=2; j--){
//                l = (sumOfDigits % j);
//                switch (l) {
//                    case 0:
//                        System.out.println("That's not a howling prime, yet it's a prime number");
//                        j=0;
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//            //just so a person can see
//            if (j==1){
//                System.out.println("Holly Molly, it's a HOWLING PRIME!\n\n");
//            }
//
//        }
//
//        //BONUS print holing primes at a given range
//        System.out.println("Please give me a range to print howling primes");
//        int input2 = scanner.nextInt();
//        ArrayList<Integer> howlingPrimes = new ArrayList<Integer>(1);
//        howlingPrimes.add(2);
//
//        //this for loop checks if number is actually a prime
//        int n;
//        for (n = 3; n <= input2 ; n++) {
//            for (i = (n - 1); i >= 2; i--) {
//                k = (n % i);
//                switch (k) {
//                    case 0:
//                        i = 0;
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//          //if actually a prime if loop check if it's howling
//          if (i==1) {
//                //this for loop counts sum of digits in number
//                int a, m, sumOfDigits = 0;
//                for (m = n; m >= 10; m = m / 10) {
//                    a = m % 10;
//                    sumOfDigits = sumOfDigits + a;
//                }
//                sumOfDigits = sumOfDigits + m;
//
//                //that loop is checking if sum of digits is also a prime
//                for (j = sumOfDigits - 1; j >= 2; j--) {
//                    l = (sumOfDigits % j);
//                    switch (l) {
//                        case 0:
//                            j = 0;
//                            break;
//                        default:
//                            break;
//                    }
//                }
//
//                if (j == 1) {
//                    howlingPrimes.add(n);
//                }
//        }
//        }
//        System.out.println(howlingPrimes);
//}

    //Zadanie What will be the output
//    public static void main(String[] args){
//        System.out.print(giveAns(2,6));
//    }
//    public static int giveAns(int a, int b){
//        int c = a;
//        for(c = a; c < b; c++){
//            c += c;
//        }                           //w pętli for inkrementacja działa tak jakby w najostatniejszej linijce fora, tuż przed zamknięciem nawiasu
//        return c;
//    }


    //Zadanie What is output?
//    public static void main(String[] args){
////        for (int x = 1; x < 10; x++) {
////            if (x == 6)
////                System.out.print(++x);
////            if (x == 9)
////                System.out.print(x--);
////            x -= -(++x) - x;
////        }
////    }


//    Zadanie What is the output?
//    public static void main(String[] args){
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(3);
//        nums.add(36);
//        nums.add(73);
//        nums.add(40);
//        nums.add(1);
//        Collections.sort(nums);
//        System.out.println(nums.get(0));
//    }


    //Zadanie z SoloLearn
//    static int rec(int m, int n){
//        if(m % n == 0){
//            return n;
//        }else{
//            return rec(n, m%n);
//        }
//    }
//    public static void main(String[] args){
//        System.out.print(rec(15,9));
//    }

    //Zadanie z SoloLearn
//    public static void main(String[] args) {
//        int x = 2;
//        if ((x++ == 2) || false) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }

    //Zadanie z SoloLearn
//    public static void main(String[] args){
//        LinkedList lst;
//        List I = Arrays.asList(1,2,3);
//        lst = new LinkedList(I);
//        lst.add(1,4);
//        System.out.println(lst);
//    }

    //Zadanie z Solo
//    public static void main(String[] args){
//        System.out.println(5-3+12/2*3);
//    }


    //Zad z Solo
//    public static void main(String[] args){
//        int[] a={10,3,2};
//        for (int i = 1; i < 2 ; i++) {
//            a[0] /= a[1];
//        }
//        System.out.println(a[0]);
//    }


    //Zad z SoloLearn
//    public static void main(String[] args){
//        System.out.println("Hi, ABC, good".matches("ABC ") + " ");
//        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//    }

    //Zad z Solo
//    public static int main(){
//        System.out.println("hello");
//        return 1;
//    }
//    public static void main(String[] args){
//        System.out.println(main());
//    }


    //Zad z Solo
    //Zamiana systemu dwójkowego na dziesiątkowy!
//    public static void main(String[] args) {
//        int result = Integer.parseInt("11", 2);
//        System.out.println(result);
//    }


    //Zad z Solo
//    public static void main(String[] args){
//        String a = "45,67,88,32";
//        String[] arr = a.split(",");
//        System.out.println(arr[3]);
//    }

    //Zad z Solo
    //What is output?
//    public static void main(String[] args){
//        int x =1;
//        for (;x < 6; x++) {
//            x *= x;
//        }
//        System.out.printf("%d",x);
//    }


    //Zad z SoloLearn
    //What is output?
    static int i;
    static{i =0;}
    public static void main(String[] args){
        System.out.println(i);
        i=1;
    }
    static{ i=2; }


}
//Jak działa final int i
//Jak działa dziedziczenie
//Jak działa LinkedList i dodawanie w niej?
//Struktury danych
//Jak to coś działa:         System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//Jak się robi testy w Java