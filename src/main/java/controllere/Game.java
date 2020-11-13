package controllere;

import javafx.scene.control.Skin;
import models.Player.Piece;
import models.Player.PlayerListe;

import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Hvor mange spiller vild du have");
        int playerAmount=input.nextInt();


        PlayerListe playerListe=new PlayerListe(playerAmount);

        for (int i = 0; i < playerAmount ; i++) {

            System.out.println("vægl dit navn ");
            String navn = input.nextLine();
            playerListe.getplayer(i).setName(navn);
            playerListe.getaccount(i).setBalance(playerListe.getaccount(i).StartBalance(playerAmount));
        }
        System.out.println("Spilleren " + playerListe.getplayer(1).getName() +  "har en balance på " + playerListe.getaccount(1).getBalance() );

    }


}


