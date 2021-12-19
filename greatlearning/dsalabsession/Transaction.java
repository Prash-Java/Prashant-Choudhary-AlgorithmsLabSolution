package com.greatlearning.dsalabsession;

import com.greatlearning.service.MergeSortImplementation;

import java.util.Scanner;

public class Transaction {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Taking Inputs From User Using Scanner object
        System.out.println("Enter the size of transaction array");
        int totalTransactions = sc.nextInt();
            //Capturing values of transaction in array
            int[] arr = new int[totalTransactions];
            System.out.println("Enter the values of array");
            for (int i = 0; i < totalTransactions; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the total no of targets that needs to be achieved");
            int totalTransactionsCheck = sc.nextInt();
            int sum = 0;
            //Checking if Target Is Acheived by validating that sum of array index values>=target and accordingly counting the transaction
                for (int i = 0; i < totalTransactionsCheck; i++) {
                    int count = 0;
                    System.out.println("Enter the value of target");
                    int target = sc.nextInt();
                        for (int j = 0; j < arr.length; j++) {
                            sum = sum + arr[j];
                            ++count;
                            if (sum >= target) {
                                System.out.println("Target acheived after " + count + " transactions");
                                break;
                            }
                            if (count == arr.length && sum < target) {
                                System.out.println("Given target is not acheived..");
                            }
                        }
                        sum = 0;
                    }
                }
            }
