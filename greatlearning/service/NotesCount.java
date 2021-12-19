package com.greatlearning.service;

public class NotesCount {
    //Usage For Global Currencies Including Indian Currency
    public void notesCountImplementation(int[] notes, int amount) {
        /* Notes[] will be Integer Array Sorted In Descending Order of Currencies, and Amount is an Integer Value
           For Maintaining Count Of Each Denomination in sequence in next array and maintained in same index order as denominations index in its array */
        int[] noteCount = new int[notes.length];
        try {
            for (int i = 0; i < notes.length; i++) {
                if (amount >= notes[i]) {
                    noteCount[i] = (int) (amount / notes[i]);
                    amount = (amount % notes[i]);
                }
            }
            //This case represents the remaining amount that still remains and cannot be dealt with existing denominations
            if (amount > 0) {
                System.out.println("exact amount cannot be given with the highest denomination");
            } else {
                System.out.println("Your payment approach in order to give min no of notes will be");
                for (int j = 0; j < notes.length; j++) {
                    if (noteCount[j] != 0)
                        System.out.println(notes[j] + ":" + noteCount[j]);
                }
            }
        } catch (ArithmeticException exc) {
            System.out.println(exc + " notes of denomination 0 is invalid");
        }
    }

    /*This is the another version of logic in this class which deals with Indian Currency as given in problem statement
    Indian Currency Used Are 100,500,2000 denominations, can also include 200 denomination */
    public void notesCountCurrencyImplementation(int[] notes, int amount) {
        //Here we know notes array is sorted in decreasing order and as per problem statement, least denomination is 100, which cab be treated as gcd among 2000,500,100 denominations
        if ((amount > 0) && (amount % notes[notes.length - 1] == 0)) {
            System.out.println("Your payment approach in order to give min no of notes will be");
            for (int value : notes) {
                int balanceRatio = (int) (amount / value);
                amount = amount - (value * balanceRatio);
                if (balanceRatio != 0) {
                    System.out.println(value + ":" + balanceRatio);
                }
                if (amount == 0) {
                    break;
                }
            }
        }
        //In cases where there is still some amount left but is not any multiple of any denominations
        else {
            System.out.println("exact amount cannot be given with the highest denomination");
        }
    }
}
