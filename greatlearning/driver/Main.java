package com.greatlearning.driver;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

import java.util.Scanner;

public class Main {
    //Driver Class That Contains The Logic & control using two other classes for merge sort and notes count in service package,
    public static void main(String[] args) {
        //Service Classes Instantiation, we create objects
        MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
        NotesCount notesCount = new NotesCount();
        //We prompt users to enter currency array size to be built
        System.out.println("Enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //User enters application if array to be built has size greater than 0, which means user input needs to be greater than 0
        if (size > 0) {
            //creating and inserting currency of notes values array
            int[] notes = new int[size];
            System.out.println("Enter the currency denominations value");
            for (int i = 0; i < size; i++) {
                notes[i] = sc.nextInt();
            }
            System.out.println("Enter the amount you want to pay");
            int amount = sc.nextInt();
            mergeSortImplementation.sort(notes, 0, notes.length - 1);
            //Version 1
            if (amount > 0) {
                notesCount.notesCountImplementation(notes, amount);
            }
            //Version 2--> When Denominations have clear GCD where GCD>1, as in case of 100,200,500,2000 denominations, 100 is gcd, in such cases
//        if (amount > 0) {
//            notesCount.notesCountCurrencyImplementation(notes, amount);
//        }
        }
        //if user initially enters 0 or less value for size of currency notes, then this message can be popped on console
        else {
            System.out.println("Enter value greater than 0");
        }
        //closing scanner resource
        sc.close();
    }
}