package problem3;

import java.util.ArrayList;

import static jdk.dynalink.linker.support.Guards.isInstance;

public class Library {
    private int capacity;
    private ArrayList<Document> documents = new ArrayList<Document>(capacity);
    public Library(int capacity){
        this.capacity = capacity;
    }
    public String toString(){
        StringBuilder s =new StringBuilder();
        for (Document doc :documents){
            s.append(doc.toString());
        }
        return s.toString() ;
    }
    public void displayDocuments(){
        for (Document doc : documents){
            System.out.println(doc.toString());
        }
    }
    public boolean add(Document doc){

        if (documents.size()==capacity){
            return false;
        }
        documents.add(doc);
        return true;
    }
    public boolean delete(Document doc){
        for (Document doc2 : documents){
            if (doc.equals(doc2)){
                documents.remove(doc2);
                return true;
            }
        }

        return false;

    }
    public Document document(int numEnrg){
        for (Document doc : documents){
            if (doc.getnum()==numEnrg){
                return doc;
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (Document doc : documents){
            System.out.println("authors are : \n");
            if (doc instanceof Book){
                Book book = (Book) doc;
                System.out.println(book.getAuthor()+"\n");

            }
        }
    }
}
