package problem3;

import java.util.Objects;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(String month, int year, String title) {
        super(title);
        this.month = month;
        this.year = year;

    }
    public String toString(){
        return super.toString()+String.format(", this magazine is published : %s %d",this.month,this.year);
    }
    public boolean equals(Object o){
        Magazine mag = (Magazine)o;
        return super.equals(mag) && this.year == mag.year && Objects.equals(this.month,mag.month);
    }
}
