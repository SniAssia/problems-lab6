package problem3;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(String month, int year, String title) {
        super(title);
        this.month = month;
        this.year = year;

    }
    public String toString(){
        return super.toString()+String.format("this magazine is published : %s %d",this.month,this.year);
    }
}
