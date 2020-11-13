package models.Board;

public class Field {
    protected int position;
    private String title;
    private int price;
    private String payRent;
    Boolean propertyOwner;
    private String colour;



    public Field(int position, String title, int price, String payRent, Boolean propertyOwner, String colour) {
        this.position = position;
        this.title = title;
        this.price = price;
        this.payRent = payRent;
        this.propertyOwner = propertyOwner;
        this.colour = colour;
    }

    public void setPosition(int numPosition){

        position = numPosition;
    }

    public int getPosition() {

        return position;

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

    public String getPayRent() {
        return payRent;
    }

    public void setPayRent(String payRent) {
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
        return "Field{"+ position  + "\n" + colour + "\n" + title + "\n" + price + "\n" + payRent + "\n" + propertyOwner};


    }
}
