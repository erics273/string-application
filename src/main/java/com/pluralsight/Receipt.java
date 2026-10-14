package com.pluralsight;

public class Receipt {

    public static void main(String[] args) {

        String itemName = "Cool Gizmo";
        double itemPrice= 2.99;
        int quantity = 10;

        //without formatted string
        System.out.println("You bought " + quantity + " " + itemName + "'s for $" + itemPrice * quantity + "."  );

        //with formatted string
        System.out.printf("you bought %d %s's for $%.2f", quantity, itemName, itemPrice * quantity);

    }

}
