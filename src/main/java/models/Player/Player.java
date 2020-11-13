package models.Player;

public class Player {
    private String name;
    private int position;
    private final int MaxPlayers = 4;
    private final int MinPlayers = 2;
    private Piece piece;
    private Account account;


    public Player(String name, int position, int account) {
        this.name = name;
        this.position = position;

    }
    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;

    }

    public int getPosition(){
        return position;

    }
    Player player1 = new Player(" Player1 " , 0, 20);
    Player player2 = new Player(" Player 2 " , 0, 20);
    Player player3 = new Player(" Player 3 " , 0, 20);
    Player player4 = new Player(" Player4 " , 0, 20);


}

