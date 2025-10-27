package problem2;

import java.util.ArrayList;

public class Customer {
    protected String name;
    // array lists take wrapper classes not primitives
    protected ArrayList<Double> transactions = new ArrayList<Double>();
    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append("\nhis transactions : \n ");
        for (double amount : transactions){
            str.append(amount);
            str.append("\n");
        }
        return str.toString();
    }

}
