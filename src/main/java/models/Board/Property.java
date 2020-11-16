package models.Board;

public class Property extends Field {


    private int fieldPossion;
    private int propertyPrice;
    private String propertyOwner;

    public Property(int numPosition, int fieldPossion, int propertyPrice, String propertyOwner) {
        super(numPosition);
        this.fieldPossion = fieldPossion;
        this.propertyPrice = propertyPrice;
        this.propertyOwner = propertyOwner;
    }

}




