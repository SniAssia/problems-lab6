package problem3;

public class Textbook extends Book{
    public String level ;
    public Textbook(String level,int numRec, String title,String author,int nbrPages) {
        super(numRec,title,author,nbrPages);
        this.level=level;
    }
    public String toString(){
        return super.toString()+String.format("the level of this textbook : %s \n",this.level);
    }
}
