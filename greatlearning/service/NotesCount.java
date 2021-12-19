package com.greatlearning.service;

public class NotesCount {
    //This is the first version of logic in this class which deals with Indian Currency as given in problem statement
    public void notesCountImplementation(int[] notes, int amount){
        int notesCount=0;
        while(amount>0 && amount%notes[notes.length-1]==0){
            for(int i=0;i<notes.length;i++){
                int balanceRatio = (int)(amount/notes[i]);
                notesCount = notesCount + balanceRatio;
                amount = amount-(notes[i]*balanceRatio);
                System.out.println("Total Number Of Notes For " + notes[i] + " is " + balanceRatio);
                if(amount==0){
                    break;
                }
            }
        }
        System.out.println("Total Minimum Notes: " + notesCount);
        if(amount>0){
            System.out.println("Entered Amount Is Not Valid..");
        }
    }
}
