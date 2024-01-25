package horseracing;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Player{
        private String name;
        private static double currentBet;
        private static double wallet;
        public static String bettingMode;
        public static String winBetHorse; 
        public static String showBetHorse;
        public static String placeBetHorse;

        public Player(double startingBalance) {
            this.name = askName();
            this.wallet = startingBalance;
            this.currentBet = 0;
            this.bettingMode="";
        }

        
        
       public String askName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        return in.nextLine();
       }

       public String getName(){
            return name;
       }

       public static String getWinBetHorse(){
            return winBetHorse;
       }

       public static String getShowBetHorse(){
            return showBetHorse;
        }

        public static String getPlaceBetHorse(){
            return placeBetHorse;
       }

       public static String getBettingMode(){
        return bettingMode;
    }

       public static void setWallet(double amount) {
        wallet = amount;
       }

       public static double getWallet() {
        return wallet;
       }

       public static double getBet() { // could potentially make the betting odds so that the bank doesnt lose any money
        return currentBet;
       }

       public void setBet(double amount) {
        currentBet = amount;
       }
    
    private void win(List<Horse> horses) {
        Scanner in=new Scanner(System.in);
        int goodHorse = 0;
        while(goodHorse<1){
            System.out.println("Which horse would you like to bet on to win first? Ensure it is a horse racing in this race. ");
            winBetHorse=in.nextLine();
            for (Horse horse : horses) {
                if (winBetHorse.equalsIgnoreCase(horse.getName()))
                    goodHorse++;
            }
        }        
    }


    public void place(List<Horse> horses) {
        Scanner in=new Scanner(System.in);
        int goodHorse = 0;
        while(goodHorse<1){
            System.out.println("Which horse would you like to bet on to win first or second? Ensure it is a horse racing in this race.");
            placeBetHorse=in.nextLine();
            for (Horse horse : horses) {
                if (winBetHorse.equalsIgnoreCase(horse.getName()))
                    goodHorse++;
            }
        }
    }



    public void show(List<Horse> horses) {
        Scanner in=new Scanner(System.in);
        int goodHorse = 0;
        while(goodHorse<1){
            System.out.println("Which horse would you like to bet on to win first, second, or third? Ensure it is a horse racing in this race.");
            showBetHorse=in.nextLine();
            for (Horse horse : horses) {
                if (winBetHorse.equalsIgnoreCase(horse.getName()))
                    goodHorse++;
            }
        }
    }

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
            bettingMode=in.nextLine(); 
            
            while(!(bettingMode.equalsIgnoreCase("win")|| bettingMode.equalsIgnoreCase("place")|| bettingMode.equalsIgnoreCase("show"))){
                System.out.println("Please enter a valid bet type (win, place, or show)");
                bettingMode=in.nextLine();
            }
    
            if(bettingMode.equalsIgnoreCase("win"))
                win(horses);
            else if(bettingMode.equalsIgnoreCase("place"))
                place(horses);
            else
                show(horses);

            setBet(amount);
            setWallet((getWallet() - amount));
           
           
           
        }
       
    }
       
       
    

