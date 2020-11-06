package models.Player;

import java.util.Scanner;

public class Piece {

    private boolean bilLock;
    private boolean racebilLock;
    private boolean traktorLock;
    private boolean ufoLock;


    public void pieceselect(){

        System.out.println("Tryk 1 for at være Bilen " +
                "\nTryk 2 for at være Racerbilen " +
                "\nTryk 3 for at være Traktoren " +
                "\nTryk 4 for at være UFO'en");


        while (true){

            System.out.println("vælg din piece");
            Scanner scan=new Scanner(System.in);
            String characterSelect=scan.nextLine();

            if (characterSelect.equals("1")){

            }

        }




    }
}
