package challenge;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class itinerary {
    protected LinkedList<place> places;
    public itinerary(){
        places = new LinkedList<>();

    }
    public LinkedList<place> getlist(){
        return places;
    }
    public boolean checkduplicate(place p){
        for (place elem : places){
            if (elem.equals(p)){
                return false;
            }
        }
        return true;
    }
    public void display(){
        for(place elem : places){
            System.out.println(elem);
        }
    }
    public void addelement(place p){
        if (checkduplicate(p)){
            ListIterator<place> it = places.listIterator();
            if (!it.hasNext()){
                places.add(p);
                return ;
            }

            while (it.hasNext()){

                place place2 = it.next();
                if ( place2.getdistance() >= p.getdistance() ){
                    it.previous();
                    it.add(p);

                    return;
                }


            }
            places.add(p);
        }

    }

}
