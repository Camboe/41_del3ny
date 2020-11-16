package models;

public class ActionCard {

    private String text;
    private int valueMoney ,fieldValue;
    Boolean bonusTurn;



    public ActionCard(String text, int valueMoney, Boolean bonusTurn, int fieldValue) {
        this.text = text;
        this.valueMoney = valueMoney;
        this.bonusTurn = bonusTurn;
        this.fieldValue = fieldValue;


    }
    public String getText(){
        return text;

    }
    public int getValueMoney(){
        return valueMoney;

    }
    public Boolean getBonusTurn(){
        return bonusTurn;
    }
    public int getFieldValue(){
        return fieldValue;

    }


}

