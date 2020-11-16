package controllere;

import gui_main.GUI;
import javafx.scene.control.Skin;
import models.Board.Board;
import models.Board.Field;
import models.Die.Die;
import models.Player.Piece;
import models.Player.Player;
import models.Player.PlayerListe;

import java.util.Scanner;

public class Game {
    public Board board;
    public Die die;


    public Game() {
        this.board = new Board();
        this.die = new Die();



    }
   // returnere felt spilleren står på
    public Field getCurrentField(Player currentPlayer){
        return this.board.field[currentPlayer.getPosition()];
    }

   public boolean canBuyField (Player currentPlayer){
       Field currentField = getCurrentField(currentPlayer);
       return currentField.getPropertyOwner() == null;

   }

   //Returne om hvis balance er støre end field price
   public boolean checkAccount (Player currentPlayer, Field currentField) {
        return currentPlayer.getAccount().getBalance() >= currentField.getPrice();


   }

    public void buyField (Player currentPlayer){
        Field currentField = getCurrentField(currentPlayer);
        currentField.setPropertyOwner(currentPlayer);


    }

}


