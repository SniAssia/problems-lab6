package problem3;

import java.util.Objects;

public class Document {
    static int record = 0;
    protected  int numRec;
    protected String title;
    public  Document( String title){
        this.numRec = record++;
        this.title = title;
    }
    public int getnum(){
        return this.numRec;
    }
    public String toString(){
        return String.format("the document   %s has number of enregistration : %d",this.title,this.numRec);
    }
    public boolean equals(Object o){
        Document d = (Document) o;
        return d.numRec == this.numRec && Objects.equals(d.title, this.title);
    }
}
