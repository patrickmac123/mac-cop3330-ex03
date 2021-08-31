package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 3 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner x = new Scanner(System.in);
        System.out.print( "What is the quote? " );
        String quote = x.nextLine();
        System.out.print( "Who said it? " );
        String author = x.nextLine();
        System.out.println(author+" says, \"" +quote+ "\"");
    }
}