package controllere;

import gui_main.GUI;
import javafx.scene.control.Skin;
import models.Player.Piece;
import models.Player.PlayerListe;

import java.util.Scanner;

public class Game {

    public void spilSpil(){



        Scanner input = new Scanner(System.in);


        GUI gui = new GUI();


        int playerAmount=gui.getUserInteger("Hvor mange spiller vil du have");


        PlayerListe playerListe=new PlayerListe(playerAmount);

        for (int i = 0; i < playerAmount ; i++) {

            String navn = gui.getUserString("vægl dit navn ");
            playerListe.getplayer(i).setName(navn);
            playerListe.getaccount(i).setBalance(playerListe.getaccount(i).StartBalance(playerAmount));
        }
        System.out.println("Spilleren " + playerListe.getplayer(1).getName() +  "har en balance på " + playerListe.getaccount(1).getBalance() );
playerListe.getpiece(1).getPostion();

    }


}


