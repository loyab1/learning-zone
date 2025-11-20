public class Die {
    //Instance Data = new memory is reserved for Instance object variable

    public final int MAX = 6; //final means it cant be changed at all
    private int faceValue;

    public Die(){ //Sets Initial Value
        faceValue = 1;
    }

    public int roll(){ //will roll die if method is called
        faceValue = (int)(Math.random() * MAX ) + 1; //Assigns The Dice value to a random digit 1 through 6

        return faceValue;
    }

    public void setFaceValue(int value){
        faceValue = value;
    }


    public void main (String[] args){
        Die die1 = new Die();
        System.out.println(die1.roll());
    }


}
