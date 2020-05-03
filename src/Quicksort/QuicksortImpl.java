package Quicksort;

import java.util.ArrayList;

public class QuicksortImpl {
    /**
     * This class is sorting ArrayList of different integers in increasing order. It implements quicksort algorithm.
     *
     * @param myList is an ArrayList of different integers
     * @return myList sorted in increasing order
     */
    private ArrayList<Integer> myList = new ArrayList<>();

    public QuicksortImpl(ArrayList<Integer> myList) {

        System.out.println("Unsorted list: ");
        System.out.println(myList.toString());

        System.out.println("Sorted list: ");
        System.out.println(quickSortList(myList, 0, myList.size() - 1).toString());

    }

    private ArrayList<Integer> quickSortList(ArrayList<Integer> myList, int start, int end) {
        int pivotIndex = start + ((end - start) / 2);
        int lastCheckedNumber = end;


        for (int leftIndicator = start; leftIndicator <= pivotIndex; leftIndicator++) {

            boolean dialBack = false;
            if (myList.get(leftIndicator) >= myList.get(pivotIndex)) {

                for (int rightIndicator = lastCheckedNumber; rightIndicator >= leftIndicator; rightIndicator--) {
                    if (leftIndicator == rightIndicator) {

                        //left sub-list
                        if (leftIndicator - start > 1) {
                            ArrayList<Integer> sorted = quickSortList(myList, start, leftIndicator - 1);
                            for (int i = 0; i < sorted.size(); i++) {
                                myList.set(i, sorted.get(i));
                            }
                        }

                        //right sub-list
                        if ((end - rightIndicator) > 1) {
                            ArrayList<Integer> sorted = quickSortList(myList, leftIndicator + 1, end);
                            for (int i = 0; i < sorted.size(); i++) {
                                myList.set(myList.size() - 1 - i, sorted.get(sorted.size() - 1 - i));
                            }
                        }
                    }

                    if (myList.get(rightIndicator) <= myList.get(pivotIndex)) {
                        myList.add(leftIndicator, myList.get(rightIndicator));
                        myList.set(rightIndicator, myList.remove(leftIndicator + 1));

                        if (leftIndicator == pivotIndex) {
                            pivotIndex = rightIndicator;
                        } else if (rightIndicator == pivotIndex) {
                            pivotIndex = leftIndicator;
                            dialBack = true;
                        }

                        if (!(pivotIndex == 0)) {
                            lastCheckedNumber = rightIndicator;
                            break;
                        }


                    }
                }

                if (dialBack) {
                    leftIndicator--;
                }
            }
        }

        return myList;
    }

}
