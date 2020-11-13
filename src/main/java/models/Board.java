package models;

import java.util.Scanner;
import java.io.*;
import java.math.*;


public class Board { public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    int P = input.nextInt();
    if (input.hasNextLine()) {
        input.nextLine();
    }
    for (int i = 0; i < P; i++) {
        String player = input.nextLine();
    }
    int D = input.nextInt();
    if (input.hasNextLine()) {
        input.nextLine();
    }
    for (int i = 0; i < D; i++) {
        String dice = input.nextLine();
    }
    for (int i = 0; i < 24; i++) {
        String boardline = input.nextLine();
    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println("answer");
}
}





