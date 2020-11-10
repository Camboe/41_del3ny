package models;

import java.util.Scanner;
import java.io.*;
import java.math.*;


public class Board { public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int P = in.nextInt();
    if (in.hasNextLine()) {
        in.nextLine();
    }
    for (int i = 0; i < P; i++) {
        String player = in.nextLine();
    }
    int D = in.nextInt();
    if (in.hasNextLine()) {
        in.nextLine();
    }
    for (int i = 0; i < D; i++) {
        String dice = in.nextLine();
    }
    for (int i = 0; i < 24; i++) {
        String boardline = in.nextLine();
    }

    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println("answer");
}
}

    }



