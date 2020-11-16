package models.Player;

import java.util.Scanner;

public class Piece {

    private String type;
    private int postion;

    public Piece(String type,int postion){
        this.postion=postion;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPostion(){
        return postion;
    }
    public void setPostion(int sæt){
        this.postion=sæt;

    }


































//    private boolean bilLock=false;
//    private boolean racebilLock;
//    private boolean traktorLock;
//    private boolean ufoLock;
//
//
//
//    public void pieceselect(){
//
//        System.out.println("Tryk 1 for at være Bilen " +
//                "\nTryk 2 for at være Racerbilen " +
//                "\nTryk 3 for at være Traktoren " +
//                "\nTryk 4 for at være UFO'en");
//
//
//        while (true){
//
//            System.out.println("vælg din piece");
//            Scanner scan=new Scanner(System.in);
//            String characterSelect=scan.nextLine();
//
//            if (characterSelect.equals("1")){
//
//                if(!bilLock){
//                    this.bilLock=true;
//                    System.out.println("Du har valgt Bilen");
//                    break;
//                }
//
//            }
//            if (bilLock && characterSelect.equals("1")){
//                System.out.println("Bilen er allerde taget");
//                continue;
//            }
//
//            if (characterSelect.equals("2"))
//                if (!racebilLock){
//                    this.racebilLock=true;
//                    System.out.println("Du har valgt Racerbilen");
//                    break;
//                }
//            if (racebilLock && characterSelect.equals("2")){
//                System.out.println("Billen er allerde taget");
//                continue;
//            }
//
//            if (characterSelect.equals("3"))
//                if (!traktorLock){
//                    this.traktorLock=true;
//                    System.out.println("Du har valgt TraktorLock");
//                    break;
//                }
//            if (traktorLock && characterSelect.equals("3")){
//                System.out.println("Bilen er allerde taget");
//                continue;
//            }
//
//            if (characterSelect.equals("4"))
//                if (!ufoLock){
//                    this.ufoLock=true;
//                    System.out.println("Du har valgt UfoLock");
//                    break;
//                }
//            if (ufoLock && characterSelect.equals("4")){
//                System.out.println("Bilen er allede taget ");
//                continue;
//            }
//
//
//        }
//
//
//
//
//
//
//    }
}

/*
import java.util.Scanner;

public class Piece {

    int bilLock,racebilLock,traktorLock,ufoLock,choise;


    public  Piece(){



        Scanner input =new Scanner(System.in);

        System.out.println("Enter your choise:");

        System.out.println("1. for at være bilLock");
        System.out.println("2. for at være raceBillock");
        System.out.println("3. for at være traktorLock");
        System.out.println("4. for at være ufoLock");

        choise = input.nextInt();


        switch (choise){

            case 1 :
                System.out.println("Du har valgt bilLock"+bilLock);
                break;
            case 2 :
                System.out.println("DU HAR valgt racebilLock"+racebilLock);
                break;
            case 3 :
                System.out.println("Du har valgt traktorLock"+traktorLock);
                break;
            case 4 :
                System.out.println("Du har valgt ufoLock"+ufoLock);
                break;
            default:
                System.out.println("Denne numer som du har valgt findes ikke");




        }



    }



    }


 */




