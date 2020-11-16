package models.Player;

import javax.swing.text.Position;

public class PlayerListe {

    Player[] players;
    Account[] accounts;
    Piece[] pieces;


    public PlayerListe( int playerAmount) {
        accounts =new Account[playerAmount];
        players =new Player[playerAmount];
        pieces= new Piece[playerAmount];


        for (int i = 0; i < playerAmount; i++) {

            accounts [i]=new Account(0);
            players [i]=new Player(null,0,0);
            pieces[i]=new Piece(null,0);


        }
    }


    public Player getplayer(int num ){
        return players[num];
    }

    public Account getaccount( int num){
        return accounts[num];


    }

    public Piece getpiece( int num){
        return pieces[num];

    }











}
