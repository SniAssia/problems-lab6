package problem3;

public class Document {
    protected int numRec=0;
    protected String title;
    public  Document( String title){
        this.numRec ++;
        this.title = title;
    }
    public int getnum(){
        return this.numRec;
    }
    public String toString(){
        return String.format("the docuent   %s has number of enregistration : %d",this.title,this.numRec);
    }
}
