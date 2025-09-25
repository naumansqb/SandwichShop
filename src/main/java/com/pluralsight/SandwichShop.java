package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int userChoice;
        double regularCost=5.45;
        double largeCost=8.95;
        double discount=0;
        double finalcost=0;
        System.out.printf("(1): Regular: base price $%.2f\n",regularCost);
        System.out.printf("(2): Large: base price $%.2f\n",largeCost);

        System.out.println("Please chose which sandwich you'd like from above: ");
        userChoice=scan.nextInt();


        System.out.println("\n Please enter your age below: ");
        int userAge=scan.nextInt();

        if(userAge <=17){
            discount=.10;
        }else if(userAge>=65){
            discount=.20;
        }else{
            System.out.println("Sorry you don't qualify for any discounts");
        }

        if(userChoice==1){
            finalcost+=regularCost-(discount*regularCost);
        }else{
            finalcost+=largeCost-(discount*largeCost);
        }

        System.out.printf("The final price of your sandwich is: %.2f",finalcost);

    }
}