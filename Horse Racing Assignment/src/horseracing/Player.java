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
        //while(!(winBetHorse.equals(getHorses()))){
            System.out.println("Please enter a valid horse that is racing: ");
        }
        
    //}



    private void place() {
        Scanner in=new Scanner(System.in);
        System.out.println("Which horse would to like to bet on to win first or second? ");
        String placeBetHorse=in.nextLine();
        //while(!(placeBetHorse.equals(getHorses()))){
            System.out.println("Please enter a valid horse that is racing: ");
        }
    //}



    private void show() {
       Scanner in=new Scanner(System.in);
       System.out.println("Which horse would you like to bet on to win first, second or third? ");
       String showBetHorse=in.nextLine();
       //while(!(showBetHorse.equals(getHorses()))){
        System.out.println("Please enter a valid horse that is racing: ");
    }
    //}

    public void displayPlayerInfo(){
        for (int i = 0; i < 5; i++){
            String s1 = "name: " + name;
            String s2 = "ballance: " + wallet;
            String s3 = "bet amount: " + currentBet; // make multiple betts and make the table dependent 
            //String s4 = "horse: " + horse;

            System.out.println("+-----+-----+-----+-----+");
            System.out.printf("|%5s|%5s|%5s|%5s|\n", s1,s2,s3);
            }
            System.out.printf("+-----+-----+-----+-----+");
        }


        public void askBet(List<Horse> horses) {
            Scanner in = new Scanner(System.in);
            boolean validBet=false;
            boolean validHorse = false;
            double amount = 0;
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

            }
    
            System.out.println("What kind of bet would you like to make? (win, place, or show)");
            String bettingMode=in.nextLine();
            this.betMode(bettingMode); 
            
            while(!(bettingMode.equalsIgnoreCase("win")|| bettingMode.equalsIgnoreCase("place")|| bettingMode.equalsIgnoreCase("show"))){
                System.out.println("Please enter a valid bet type (win, place, or show)");
                bettingMode=in.nextLine();
            }
    
            if(bettingMode.equalsIgnoreCase("win"))
                win();
            else if(bettingMode.equalsIgnoreCase("place"))
                place();
            else
                show();

            setBet(amount);
            setWallet((getWallet() - amount));
           
           
           
        }
       
    }
       
       
    

