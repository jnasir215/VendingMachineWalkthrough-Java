package com.codedifferently.walkthrough.vendingmachine;
import com.codedifferently.walkthrough.vendingmachine.inventory.*;
import com.codedifferently.walkthrough.vendingmachine.menu.Menu;
import com.codedifferently.walkthrough.vendingmachine.menu.Purchase;
import org.apache.commons.io.IOUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    private final Scanner scan;
    private final Map<String, Product> inventory;

    public VendingMachine() {
        this.scan = new Scanner(System.in);
        this.inventory = new HashMap<>();
    }

    private String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String rawData = IOUtils.toString(classLoader.getResourceAsStream("inventory.txt"));
        return rawData;
    }

    private void init() {
        try {
            String read = readRawDataToString();
            String[] products = read.split("\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Product makeProductFromString(String[] productData) {
        Product product = null;
        String name = productData[1];
        String type = productData[2];
        Double price = Double.valueOf(productData[3]);
        switch(type) {
            case "Chips":
                product = new Chips(name,price);
                break;
            case "Candy":
                product = new Candy(name, price);
                break;
            case "Gum":
                product = new Gum(name, price);
                break;
            case "Drink":
                product = new Drink(name, price);
                break;
            default:
                break;
        }
        return product;
    }

    public void stockVendingMachine(String[] productsIn) {
        for(String product : productsIn) {
            String[] productData = product.split("\\|");
            String key = productData[0];
            Product item = makeProductFromString(productData);
            inventory.put(key, item);
        }
    }

    public void start() {
        init();
        System.out.println("Welcome to the newly Custom Built Vending Machine");
        boolean flag = true;
        ArrayList<String> options = new ArrayList<>();
        options.add("(1) Display Vending Machine Items");
        options.add("(2) Purchase");
        options.add("(3) Exit");
        Menu menu = new Menu(options);
        while(flag) {
            for(String selection : menu.getSelection()) {
                System.out.println(selection);
            }

            String mInput = scan.next();

            if(mInput.equals("3")) {
                flag = false;
                System.out.println("Goodbye");
            }
            else if(mInput.equals("2")) {
                flag = false;
                System.out.println("Proceed with purchasing your item:");
                ArrayList<String> pOptions = new ArrayList<>();
                pOptions.add("(1) Feed Money");
                pOptions.add("(2) Select Product");
                pOptions.add("(3) Finish Transaction");
                Purchase nxtPurchase = new Purchase(pOptions);    //Creates a new instance of Purchase class
                //nxtPurchase.show();                              //Calls the show() method to list purchase options

                for(String pSelection : nxtPurchase.getpOptions()) {
                    System.out.println(pSelection);             //Loop that prints each available purchase optjon
                }
                //String pInput = scan.next();
            }
                //{
                //System.out.println("Try again");
                //}
        }
        scan.close();
    }

    public Map<String, Product> getInventory() {
        return this.inventory;
    }

    public static void main(String[] args) { //throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        //String reader = vendingMachine.readRawDataToString();
        //System.out.println(reader);
        vendingMachine.start();
    }

}
