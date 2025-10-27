package problem2;

import java.util.ArrayList;

public class Bank {
    protected String name;
    protected ArrayList<Customer> customers = new ArrayList<Customer>();
    public ArrayList<Customer> getcustomers(){
        return customers;
    }
    public Bank(String name){
        this.name = name;
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addTransaction(double amount ,Customer c){
        for (Customer customer : customers){
            if (customer.equals(c)){
                c.addTransaction(amount);
            }
        }
    }
    public void print_summary(){
        for (Customer customer : customers){
            System.out.println(customer.toString());
        }
    }

}
