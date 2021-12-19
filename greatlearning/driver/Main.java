package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class Main {
    //Driver Class That Contains The Logic & control using two other classes for merge sort and notes count in service package,
    public static void main(String[] args) {
        MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
        NotesCount notesCount = new NotesCount();
        System.out.println("enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println("enter the amount you want to pay");
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
}