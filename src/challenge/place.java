package challenge;

import java.util.Objects;

public class place {
    private String town;
    private int distance ;
    public place(String town, int distance){
        this.town = town;
        this.distance = distance;
    }
    public  String gettown() {
        return town;

    }
    public void settown(String town) {
        this.town = town;
    }
    public int getdistance() {
        return distance;
    }
    public boolean equals(Object o){
        place p = (place) o ;
        return Objects.equals(this.town, p.gettown()) && this.distance==p.getdistance();
    }
    public String toString(){
        return String.format("the place is %s and the distance is %d", this.town,this.distance);
    }

}
