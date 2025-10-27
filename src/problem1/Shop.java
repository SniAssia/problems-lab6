package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            Item item_to_add = new Item(itemName,itemPrice,quantity);
            cart.add(item_to_add);
            System.out.println("your actual cart is : ");
            for (Item elem : cart){
                System.out.println(elem);
            }
            //System.out.println(cart.toString());
            // *** print the contents of the cart object using println
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            scan.nextLine();
        }
        while (keepShopping.equals("y"));
        double total_price = 0;
        for (Item elem : cart){
            total_price += elem.getPrice()*elem.getQuantity();

        }
        System.out.println("your total price is "+total_price+" MAD");
    }
}
