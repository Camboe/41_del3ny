package models.Fields;

public class Field {
    protected int position;

    public Field(int numPosition) {
        position = numPosition;

    }
    public void setPosition(int numPosition){
        position = numPosition;
    }

    public int getPosition() {
        return position;
    }
}
