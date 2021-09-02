/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution01 {
    /*
    create scanner
    ask user their name
    input name as string
    create the string concatenation
    output the final string
     */
    public static void main(String[] args){

        //IN - Asks the user for their name and stores it as a string
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        //OUT - Prints out what the user's name is
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);

    }

}
