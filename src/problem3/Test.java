package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of documents : ");
        int n = scan.nextInt();
        Library library1 = new Library(n);
        Document doc1 = new Document("doc1");
        Document doc2 = new Document("doc2");
        library1.add(doc1);
        library1.add(doc2);

        int accept = 1;
        while (accept==1) {
            System.out.println("if you wanna add library press 1 , if you wanna display all documents in this library press 2 , if you wanna delete a document press 3 , if you wanna display authors for exisiting documents press 4 , if you wanna get a document by recorde press 5 ");
            int a = scan.nextInt();
            switch(a){
                case 1:
                    System.out.println("enter the title of document that you wanna add to the library : ");
                    String title = scan.nextLine();
                    System.out.println("if you wanna add a book press 1 , if you wanna add a magazine press 2 , if you wanna add a dictionary press 3  ");
                    int switch1 = scan.nextInt();

                    switch(switch1){
                        case 1 :
                            System.out.println("enter the author : ");
                            String author = scan.nextLine();
                            System.out.println("enter the number of pages : ");
                            String pages = scan.nextLine();
                            System.out.println("if you wanna add a novel enter 1 , if you wanna add a textbook enter 2 :");
                            int switch2 = scan.nextInt();
                            switch(switch2){


                            }



                    }
                    Document doc = new Document(title);
                    library1.add(doc);
                    break;
                case 2:
                    library1.displayDocuments();
                    break;
                case 3:
                    System.out.println("enter the title of document that you wanna delete : ");
                    String title1 = scan.nextLine();
                    Document doc_1 = new Document(title1);
                    library1.delete(doc_1);
                    break;
                case 4:
                    library1.displayAuthors();
                    break;
                case 5:
                    System.out.println("enter document record : ");
                    int record = scan.nextInt();
                    System.out.println(library1.document(record).toString());
                    break;
            }
            System.out.println("if you wanna continue press 1 else press 0 ");
            accept =scan.nextInt();




        }
    }
}
