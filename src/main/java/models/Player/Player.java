package models.Player;

public class Player {
    private String name;
    protected int position;
    private int account;


    public Player(String name, int position, int account) {
        this.name = name;
        this.position = position;
        this.account = account;
    }
    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;


    }
}

