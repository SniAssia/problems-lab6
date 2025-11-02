package problem3;

import java.util.Objects;

public class Book extends Document {
    protected String author;
    protected int nbrPages;

    public Book(String title,String author,int nbrPages) {
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return super.toString()+String.format(" , the author is %s and number of pages is %d",author,nbrPages);
    }
    public boolean equals(Object o){
        Book book = (Book) o;
        return super.equals(book) && Objects.equals(this.author,book.author) && this.nbrPages==book.nbrPages;
    }
}
