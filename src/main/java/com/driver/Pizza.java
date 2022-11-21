package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg = false;
    private String bill;
    private boolean addCheese = true;
    private boolean addTopping = true;
    private boolean addTakeaway = true;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = 300;
        bill = 0;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addCheese && isVeg) {
            bill = Integer.parseInt(bill) + 80;
            addCheese = false;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addTopping && isVeg) { 
            bill = Integer.parseInt(bill) + 70;
            addTopping = false;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeaway && isVeg) {
            bill = Integer.parseInt(bill) + 20;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
