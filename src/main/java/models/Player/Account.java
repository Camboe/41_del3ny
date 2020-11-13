package models.Player;

public class Account {



    private int balance;


    public Account (int Balance){




    }



    public int getBalance() {
        return balance;
    }

    public int setBalance(int balance) {
        this.balance = balance;
        return balance;
    }

    public int StartBalance(int playerAmount){
        if (playerAmount==2){
            setBalance(20);

        }else if (playerAmount==3){
            setBalance(18);
        }else if (playerAmount==4){
                setBalance(16);
        }

        return playerAmount;
    }



}
