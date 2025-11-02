package problem3;

public class Novel extends Book {
    public double price;
    public Novel(double price, String title,String author,int nbrPages) {
        super(title,author,nbrPages);
        this.price=price;
    }
    public String toString(){
        return super.toString()+String.format(", the price of this novel : %f \n",this.price);
    }
    public boolean  equals(Object o){
        Novel n = (Novel)o;
        return super.equals(n) && this.price==n.price;
    }
}
