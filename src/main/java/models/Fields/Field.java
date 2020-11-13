package models.Fields;

public class Field {
    protected int position;
    private String description;

    public Field(int numPosition, String description) {
        position = numPosition;
        description = description;

    }
    public void setPosition(int numPosition){
        position = numPosition;
    }

    public int getPosition() {
        return position;
    }
}
