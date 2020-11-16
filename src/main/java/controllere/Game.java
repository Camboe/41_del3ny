package controllere;

import gui_main.GUI;
import javafx.scene.control.Skin;
import models.Board.Board;
import models.Die.Die;
import models.Player.Piece;
import models.Player.Player;
import models.Player.PlayerListe;

import java.util.Scanner;

public class Game {
    public Board board;
    public Die die;
    public Player player;

    public Game() {
        this.board = new Board();
        this.die = new Die();



    }



}


