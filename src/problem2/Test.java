package problem2;

public class Test {
    public static void main(String[] args){
        Bank bank1 = new Bank("bank_1");
        Customer customer1 = new Customer("customer_1");
        customer1.addTransaction(20);
        customer1.addTransaction(-20);
        customer1.addTransaction(30);
        customer1.addTransaction(-100);
        customer1.addTransaction(-60);
        Customer customer2 = new Customer("customer_2");
        customer2.addTransaction(20);
        customer2.addTransaction(-20);
        customer2.addTransaction(30);
        customer2.addTransaction(-100);
        customer2.addTransaction(-60);
        Customer customer3 = new Customer("customer_3");
        customer3.addTransaction(200);
        customer3.addTransaction(-230);
        customer3.addTransaction(38);

        Customer customer4 = new Customer("customer_4");
        customer4.addTransaction(25);
        customer4.addTransaction(-23);

        Customer customer5 = new Customer("customer_5");
        customer5.addTransaction(2090);

        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);
        bank1.addCustomer(customer3);
        bank1.addCustomer(customer4);
        bank1.addCustomer(customer5);
        bank1.print_summary();

    }
}
