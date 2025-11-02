package problem5;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        Book book = new Book("book1","author1",2020);
        Book book2 = new Book("book2","author2",2021);
        Book book3 = new Book("book3","author3",2022);
        Book book4 = new Book("book4","author4",2023);
        Book book5 = new Book("book5","author5",2024);
        LinkedList<Book> books = new LinkedList<>();
        BookQueue bookqueue = new BookQueue();
        bookqueue.enqueue(book);
        bookqueue.display();
        System.out.println("#######################################");
        bookqueue.enqueue(book2);
        bookqueue.display();
        System.out.println("#######################################");

        bookqueue.enqueue(book3);
        bookqueue.display();
        System.out.println("#######################################");

        bookqueue.enqueue(book4);
        bookqueue.display();
        System.out.println("#######################################");

        bookqueue.enqueue(book5);
        bookqueue.display();
        System.out.println("#######################################");

        System.out.println("after removing sirst elem : ");
        bookqueue.dequeue(); // remove first elemeent
        bookqueue.display();
        System.out.println("#######################################");

        System.out.println("first element : "+bookqueue.peek()); // get  first element


        BookStack bookstack = new BookStack();
        bookstack.push(book);
        bookstack.display();
        System.out.println("#######################################");
        bookstack.push(book2);
        bookstack.display();
        System.out.println("#######################################");

        bookstack.push(book3);
        bookstack.display();

        System.out.println("======================================================================");
        bookstack.push(book4);
        bookstack.display();
        System.out.println("#######################################");


        bookstack.push(book5);
        bookstack.display();
        System.out.println("#######################################");


        bookstack.pop();
        System.out.println("after removing first elem : ");
        bookstack.display();
        System.out.println("#######################################");


        System.out.println("last element :(top) "+ bookstack.peek());



    }
}
