package horseracing;

import java.util.Scanner;

public class HorseRacing {

     public static void main(String[] args) {

        int raceLength = (int)(Math.random()*2)+1;

        Scanner in = new Scanner(System.in);    
        HorseRacingHelper.prepareHorseRacingSimulation();
        Player player = new Player(500.00);
        boolean gameOver = false;
        while(!gameOver){
            HorseRacingHelper.clearConsole();

            int numHorsesInRace = (int)(Math.random()*7)+5;

            
            Race race = HorseRacingHelper.createRace(numHorsesInRace, raceLength, HorseRacingHelper.DIRT);
            

            race.displayRaceInfo();
            player.askBet(race.getHorses());

            race.startRace();

            System.out.println("Race is Over");
            // race.payOut();

            gameOver = playAgain(in);
        }

        
    }

    private static boolean playAgain(Scanner in) {
        System.out.print("\u001B[?25l");  // Hide the cursor

        System.out.print("Play Again: (y/n): ");
        String result = in.nextLine();

        if (result.equals("n"))
            return true;

        return false;

    }
}
