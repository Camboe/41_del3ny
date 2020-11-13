package models.Player;

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
            pieces[i]=new Piece(null);

        }

    }
}
