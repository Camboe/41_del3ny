package models.Fields;

public class Property extends Field {
    private int propertyNumber;
    private int propertyPrice;
    private String propertyOwner;

    public Property(int numPosition, int propertyNumber, int propertyPrice, String propertyOwner) {
        super(numPosition);
        this.propertyNumber = propertyNumber;
        this.propertyPrice = propertyPrice;
        this.propertyOwner = propertyOwner;
    }

}




