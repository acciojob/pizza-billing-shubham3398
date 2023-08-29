package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        } else {
            // Non-Veg
            this.price = 400;
        }
        this.bill = "";
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            this.price += 80;
        }
        this.isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            if(!isExtraToppingsAdded) {
                this.price += 70;

            }
        }else{
            if(!isExtraToppingsAdded) this.price += 120;
        }
        this.isExtraToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) this.price += 20;
        this.isTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        if(isTakeAway) {
            if(isVeg) {
                this.bill += "Base Price Of The Pizza: 300"+"\n";
                if(isExtraCheeseAdded) this.bill += "Extra Cheese Added: 80" + "\n";
                else this.bill += "Extra Cheese Added: 0" + "\n";
                if(isExtraToppingsAdded) this.bill += "Extra Toppings Added: 70" + "\n";
                else this.bill += "Extra Toppings Added: 0" + "\n";
                this.bill += "Paperbag Added: 20"+"\n";
                this.bill += "Total Price: " + this.getPrice();
            }else{
                this.bill += "Base Price Of The Pizza: 400"+"\n";
                if(isExtraCheeseAdded) this.bill += "Extra Cheese Added: 80" + "\n";
                else this.bill += "Extra Cheese Added: 0" + "\n";
                if(isExtraToppingsAdded) this.bill += "Extra Toppings Added: 120" + "\n";
                else this.bill += "Extra Toppings Added: 0" + "\n";
                this.bill += "Paperbag Added: 20"+"\n";
                this.bill += "Total Price: " + this.getPrice();
            }
        } else {
            if(isVeg) {
                this.bill += "Base Price Of The Pizza: 300"+"\n";
                if(isExtraCheeseAdded) this.bill += "Extra Cheese Added: 80" + "\n";
                else this.bill += "Extra Cheese Added: 0" + "\n";
                if(isExtraToppingsAdded) this.bill += "Extra Toppings Added: 70" + "\n";
                else this.bill += "Extra Toppings Added: 0" + "\n";
                this.bill += "Total Price: " + this.getPrice();
            }else{
                this.bill += "Base Price Of The Pizza: 400"+"\n";
                if(isExtraCheeseAdded) this.bill += "Extra Cheese Added: 80" + "\n";
                else this.bill += "Extra Cheese Added: 0" + "\n";
                if(isExtraToppingsAdded) this.bill += "Extra Toppings Added: 120" + "\n";
                else this.bill += "Extra Toppings Added: 0" + "\n";
                this.bill += "Total Price: " + this.getPrice();
            }
        }
        return this.bill;
    }
}
