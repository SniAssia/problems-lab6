package problem3;

public class Novel extends Book {
    public double price;
    public Novel(double price,int numRec, String title,String author,int nbrPages) {
        super(numRec,title,author,nbrPages);
        this.price=price;
    }
    public String toString(){
        return super.toString()+String.format("the price of this novel : %f \n",this.price);
    }
}
