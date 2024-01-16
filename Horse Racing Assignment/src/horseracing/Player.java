package horseracing;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Player{
        private String name;
        private double currentBet;
        private double wallet;


        public Player(double startingBalance) {
            this.name = askName();
            this.wallet = startingBalance;
            this.currentBet = 0;
        }

        
        
       public String askName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        return in.nextLine();
       }

       public String getName(){
        return name;
       }

       public void setWallet(double amount) {
        wallet = amount;
       }

       public double getWallet() {
        return wallet;
       }

       public double getBet() { // could potentially make the betting odds so that the bank doesnt lose any money
        return currentBet;
       }

       public void setBet(double amount) {
        currentBet = amount;
       }

       public void betMode(String mode){
        if (mode.equals("win")){
            win();
        }else if (mode.equals("place")){
            place();
        }else if (mode.equals("show")){
            show();
        }
       }

    
       private void win() {
        
    }



    private void place() {
        
    }



    private void show() {
       
    }



    public void askBet(List<Horse> horses) {
        Scanner in = new Scanner(System.in);
        boolean validBet = false;
        boolean validHorse = false;
        double amount = 0;
        System.out.println("Made it here");
        while(!validBet) {
            System.out.println("Wallet: " + getWallet());
            System.out.println("Please enter bet amount: ");
            amount = in.nextInt();
            if (amount >= 2 && amount <= wallet) {
                validBet = true;
            } else {
                if(amount < 2) {
                System.out.println("$2 Minimum Bet");
                } else {
                    System.out.println("Not Enough Funds");
                }
            }
        }
        
        for (Horse horse : horses) {

        }
        setBet(amount);
        setWallet((getWallet() - amount));
       }
       
       
    }