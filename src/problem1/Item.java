package problem1;

import java.text.NumberFormat;
public class Item
{
    private String name;
    private double price;
    private int quantity;//the quantity purchased
    // -------------------------------------------------------
// Create a new item with the given attributes.
// -------------------------------------------------------
    public Item (String itemName, double itemPrice, int numPurchased)
    {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = numPurchased;
    }
    // -------------------------------------------------------
// Return a string with the information about the item
// -------------------------------------------------------
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price*quantity));
    }

// -------------------------------------------------
// Returns the unit price of the item
// -------------------------------------------------

    public double getPrice()
    {
        return price;
    }
    // -------------------------------------------------
// Returns the name of the item
// -------------------------------------------------
    public String getName()
    {
        return name;
    }
    // -------------------------------------------------
// Returns the quantity of the item
// -------------------------------------------------
    public int getQuantity()
    {
        return quantity;
    }
}