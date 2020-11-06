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

                if(!bilLock){
                    this.bilLock=true;
                    System.out.println("Du har valgt Bilen");
                    break;
                }

            }
            if (bilLock && characterSelect.equals("1")){
                System.out.println("Bilen er allerde taget");
                continue;
            }

            if (characterSelect.equals("2"))
                if (!racebilLock){
                    this.racebilLock=true;
                    System.out.println("Du har valgt Racerbilen");
                    break;
                }
            if (racebilLock && characterSelect.equals("2")){
                System.out.println("Billen er allerde taget");
                continue;
            }

            if (characterSelect.equals("3"))
                if (!traktorLock){
                    this.traktorLock=true;
                    System.out.println("Du har valgt TraktorLock");
                    break;
                }
            if (traktorLock && characterSelect.equals("3")){
                System.out.println("Bilen er allerde taget");
                continue;
            }

            if (characterSelect.equals("4"))
                if (!ufoLock){
                    this.ufoLock=true;
                    System.out.println("Du har valgt UfoLock");
                    break;
                }
            if (ufoLock && characterSelect.equals("4")){
                System.out.println("Bilen er allede taget ");
                continue;
            }


        }






    }
}
