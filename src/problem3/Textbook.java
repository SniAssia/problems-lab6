package problem3;

import java.util.Objects;

public class Textbook extends Book{
    public String level ;
    public Textbook(String level, String title,String author,int nbrPages) {
        super(title,author,nbrPages);
        this.level=level;
    }
    public String toString(){
        return super.toString()+String.format(", the level of this textbook : %s \n",this.level);
    }
    public boolean  equals(Object o){
        Textbook t = (Textbook)o;
        return super.equals(t) && Objects.equals(this.level,t.level);
    }
}
