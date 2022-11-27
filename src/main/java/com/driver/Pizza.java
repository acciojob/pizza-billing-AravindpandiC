package com.driver;

public class Pizza {

    private int price;

    private Boolean isVeg = false;

    private String bill;

    private int extraTopping=0;

    private boolean addCheese = true;
    private boolean addTopping = true;
    private boolean addTakeaway = true;

    private boolean isBill = true;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) {
            this.price =300;
            this.extraTopping=70;
        }
        else {
            this.price = 400;
            this.extraTopping=120;
        }
        bill = "Base price of The Pizza "+price +"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addCheese ) {
            price+=80;
            addCheese = false;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addTopping ) {
            price+=extraTopping;
            addTopping = false;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeaway ) {
            price+=20;
            addTakeaway = false;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBill) {
            isBill=false;
            if (addCheese == false) bill = bill + "Extra Cheese Added: 80" + "\n";
            if (addTopping == false) bill = bill + "Extra Toppings Added: " + extraTopping + "\n";
            if (addTakeaway == false) bill = bill + "Paperbag Added: 20\n";
            bill = bill + "Total price: " + price + "\n";
        }
        return this.bill;
    }
}
