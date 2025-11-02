package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> stack ;
    public BookQueue() {
        stack = new LinkedList<>();
    }
    public void enqueue(Book book){
        stack.addLast(book);
    }
    public void dequeue(){
        stack.removeFirst();
    }
    public Book peek(){
        return stack.getFirst();
    }
    public void display(){
        for (Book b : stack){
            System.out.println(b);
        }
    }
}
