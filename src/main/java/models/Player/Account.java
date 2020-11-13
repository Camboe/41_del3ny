package models.Player;

public class Account {

    protected int account;
    private int bottomBalance;

    //set balance to startbalance
    public Account (){
        account = 20;

    }

    public void setAccount(int account){
        this.account =account;
    }

    public void addPoint(int squareValue) {
        account += squareValue;
        }
    }

