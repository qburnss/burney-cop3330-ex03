/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin Burney
 */
package org.example;

import java.util.Scanner;


public class PrintQuote {

    public static void main(String[] args){
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Who said it?");
        Scanner scanner1 = new Scanner(System.in);
        String input2 = scanner1.nextLine();
        System.out.println(input2 + " says, " + input);

    }
}
