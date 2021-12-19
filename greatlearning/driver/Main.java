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
        mergeSortImplementation.sort(notes,0,notes.length-1);
        for (int i = 0; i < size; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println();
        if(amount>0) {
            notesCount.notesCountImplementation(notes, amount);
        }
        else{
            System.out.println("Entered Amount Value Is Less Than Or Equals Zero..");
        }
    }
}