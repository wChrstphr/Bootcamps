package main.java.list.OperacoesBasicas.shoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>ShoppingCart</h2>
 * This class is a basic shopping cart, you can add, remove items and calculate the total price.
 *
 * @author Christopher
 * @since 18/09/2024
 */
public class ShoppingCart {
    private final List<Item> shoppingCarList;

    public ShoppingCart() {
        this.shoppingCarList = new ArrayList<>();
    }

    /**
     * Adds an item to the shopping cart based on the params
     * @param name Name of the item
     * @param price Price of the item
     * @param quantity Quantity of the item
     */
    public void addItem(String name, double price, int quantity) {
        shoppingCarList.add(new Item(name, price, quantity));
    }

    /**
     * Removes an item based on the name
     * @param name Name of the item to be removed
     */
    public void removeItem(String name) {
        for (Item item: shoppingCarList){
            if (item.getName().equalsIgnoreCase(name)) {
                if (item.getQuantity() > 1) {
                    item.setQuantity(item.getQuantity() - 1);
                } else shoppingCarList.remove(item);
                break;
            }
        }
    }

    /**
     * Calculates and returns the total price of the shopping cart
     * @return totalPrice
     */
    public double calculateTotalPrice (){
        double totalPrice = 0;
        for (Item item: shoppingCarList) {
            int numOfProducts = item.getQuantity();
            totalPrice += item.getPrice() * numOfProducts;
        }
        return totalPrice;
    }

    /**
     * Shows all shoppingCarList items
     */
    public void showItems(){
        System.out.println(shoppingCarList);
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Onion", 12.45, 3);
        shoppingCart.showItems();
        System.out.println("Shopping cart price is: " + shoppingCart.calculateTotalPrice());
        shoppingCart.addItem("Rice", 15.45, 2);
        shoppingCart.showItems();
        System.out.println("Shopping cart price is: " + shoppingCart.calculateTotalPrice());
        shoppingCart.removeItem("Onion");
        shoppingCart.showItems();
        System.out.println("Shopping cart price is: " + shoppingCart.calculateTotalPrice());
        shoppingCart.removeItem("Onion");
        shoppingCart.showItems();
        System.out.println("Shopping cart price is: " + shoppingCart.calculateTotalPrice());
        shoppingCart.removeItem("Onion");
        shoppingCart.showItems();
        System.out.println("Shopping cart price is: " + shoppingCart.calculateTotalPrice());
    }
}
