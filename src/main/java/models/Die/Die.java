package models.Die;

public class Die {

    private int MAX = 6; // terning har 6 sider
    private int facevalue;
    private String result;

    public Die(int facevalue) {
        this.facevalue = facevalue;
    }

    public  int roll() {
        facevalue = (int)(Math.random()*MAX) + 1;
        return facevalue;
    }

    public int getFaceValue () {
        return facevalue;
    }
    public String toString () {
        return result  = Integer.toString(facevalue);//

    }
}
