package challenge;

import java.util.ListIterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        itinerary places = new  itinerary();
        place p1 = new place("sydney",0);
        place p2 = new place("washington",100);
        place p3 = new place("harry",202);
        place p4 = new place("jersey",33);
        place p5 = new place("fork",34590);
        places.addelement(p1);
        places.display();
        System.out.println("#################");
        places.addelement(p2);
        places.display();
        System.out.println("#################");

        places.addelement(p3);
        places.display();
        System.out.println("#################");

        places.addelement(p4);
        places.display();
        System.out.println("#################");

        places.addelement(p5);
        places.display();

         Scanner scan = new Scanner(System.in);

        ListIterator<place> it = places.getlist().listIterator();
        int element =1;
        while (element ==1){
            System.out.println("Available actions (select letter) :(F)orward , (B)ackward , (L)ist places, (M)enu ,(Q)uit ");
            char elem = scan.next().charAt(0);
            switch(elem){
                case 'F':
                    if (it.hasNext()) {

                        place p = it.next();
                        System.out.println(p.toString());
                    }
                    else {
                        System.out.println("no next elements ");
                    }
                    break;
                case 'B':
                    if(it.hasPrevious()){
                        it.previous();
                        place p= it.previous();
                        System.out.println(p.toString());
                    }
                    else {
                        System.out.println("There is no previous place");
                    }
                    break;
                case 'L':
                    places.display();
                case 'M':
                    System.out.println("Available actions (select letter) :(F)orward , (B)ackward , (L)ist places, (M)enu ,(Q)uit ");
                    break;

                case 'Q':
                    element=0;

            }
        }


    }

}
