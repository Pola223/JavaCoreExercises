package Quicksort;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(3);
        myList.add(7);
        myList.add(-9);
        myList.add(0);
        myList.add(-2);
        myList.add(11);


        QuicksortImpl qs = new QuicksortImpl(myList);

    }
}
