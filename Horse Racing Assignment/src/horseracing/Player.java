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
        System.out.print("Please enter your name: ");
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
        if (mode.equalsIgnoreCase("win")){
            win();
        }else if (mode.equalsIgnoreCase("place")){
            place();
        }else if (mode.equalsIgnoreCase("show")){
            show();
        }
       }

    
    private void win() {
        Scanner in=new Scanner(System.in);
        System.out.println("Which horse would you like to bet on to win? ");
        String winBetHorse=in.nextLine();
    }



    private void place() {
        Scanner in=new Scanner(System.in);
        System.out.println("Which horse would to like to bet on to win first or second? ");
        String placeBetHorse=in.nextLine();
    }



    private void show() {
       Scanner in=new Scanner(System.in);
       System.out.println("Which horse would you like to bet on to win first, second or third? ");
       String showBetHorse=in.nextLine();
    }



    public void askBet(List<Horse> horses) {
        Scanner in = new Scanner(System.in);
        boolean validBet=false;
        boolean validHorse = false;
        double amount = 0;
        System.out.println("Made it here");
        while(!validBet) {
            System.out.println("Wallet: " + getWallet());
            int min=0; 
            double max=wallet;

            boolean isValid = false;
            int result = 0;
    
            while(!isValid){
                System.out.print("Please enter a bet amount: ");
                
                try{
                    amount = Integer.parseInt(in.nextLine());
                    if (result < min || result > max)
                        System.out.println("Ensure your bet is within our wallet limit and more than the minimum bet, $2.");
                    else{
                        isValid = true;
                        validBet = true;
                    }
                }catch(NumberFormatException badThing){
                    System.out.println("Numbers only!");
                }
    
            }

        System.out.println("What kind of bet would you like to make, win, place, or show?");
        String bettingMode=in.nextLine();
        this.betMode(bettingMode); // figure out errors'
        
        while(!(bettingMode.equalsIgnoreCase("win")|| bettingMode.equalsIgnoreCase("place")|| bettingMode.equalsIgnoreCase("show"))){
            System.out.println("Please enter a valid bet type (win, place, or show");
            bettingMode=in.nextLine();
        }


        

        for (Horse horse : horses) {

        }
        setBet(amount);
        setWallet((getWallet() - amount));
       }
       
       
    }

}