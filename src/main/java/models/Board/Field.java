package models.Board;

public class Field {


    protected int fieldId;
    private String title;
    private int price,payRent;
    Boolean propertyOwner;
    private String colour;



    public Field(int fieldId, String title, int price, int payRent, Boolean propertyOwner, String colour) {
        this.fieldId = fieldId;
        this.title = title;
        this.price = price;
        this.payRent = payRent;
        this.propertyOwner = propertyOwner;
        this.colour = colour;
    }

    public void setFieldId(int numPosition){

        fieldId = numPosition;
    }

    public int getFieldId() {

        return fieldId;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPayRent() {
        return payRent;
    }

    public void setPayRent(int payRent) {
        this.payRent = payRent;
    }

    public Boolean getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(Boolean propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Field{"+ fieldId + "\n" + colour + "\n" + title + "\n" + price + "\n" + payRent + "\n" + propertyOwner;


    }
}
