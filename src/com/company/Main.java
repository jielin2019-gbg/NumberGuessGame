package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGame();
   }

    // Get a random number
    public static int getRandom(){
        Random ran = new Random();
        return ran.nextInt(100) +1 ;
    }

    //Get a guess number from input
    public static int getGuess(){
        Scanner obj = new Scanner(System.in);
        System.out.println("please input a number between 1 and 100.");
        int s = obj.nextInt();
        return s;
    }

    public static void playAgain(){
        System.out.println("would you like to play again?y/n");
        Scanner obj = new Scanner(System.in);
        String input = "";
        input = obj.next();
        if (input.equalsIgnoreCase("y" )){
            playGame();
        }
    }

    public static void playGame(){
        int i =  getRandom();
        int j;
        int count = 0;
        System.out.println(i);
        do{
            j = getGuess();
            count++;
            if (j>i){
                System.out.println("the number is bigger");
            }else if(j<i){
                System.out.println("the number is smaller");
            }else{
                System.out.println("you guess right!");
                System.out.println("it takes you " + count + " steps to finish!");
                playAgain();
            }
        }while(j!=i);
    }
}
