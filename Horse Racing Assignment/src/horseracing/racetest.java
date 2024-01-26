package horseracing;

import java.util.ArrayList;
import java.util.List;

public class racetest {

    private List<Horse> horses;
    private double raceLength; // in furlongs
    private String raceSurface; // "grass", "dirt", or "mud" 


    private List<Horse> results;


    public racetest(List<Horse> horses, double raceLength, String raceSurface) {
        this.horses = horses;
        this.raceLength = raceLength;
        this.raceSurface = raceSurface;
        this.currentHorse = 0;
        this.results = new ArrayList<Horse>();
    }

    //main start race function

    public void startRace(){
        resetHorses();
        int numSpaces = (int)(raceLength*10);
        boolean done = false;
        HorseRacingHelper.pauseForMilliseconds(1000);
        HorseRacingHelper.playBackgroundMusicAndWait("Race.wav");
        HorseRacingHelper.playBackgroundMusic("horse_gallop.wav", true);

        while(!done){
            HorseRacingHelper.pauseForMilliseconds(100);
            HorseRacingHelper.clearConsole();
            HorseRacingHelper.updateTrack(numSpaces, horses);
            Horse horse = getNextHorse();
           

            if(!horse.raceFinished() && horse.getCurrentPosition() >= numSpaces){
                results.add(horse);
                horse.setRaceFinished(true);
            } else if(!horse.raceFinished()){
                horse.incrementPosition(getIncrement(horse)); 
            }

            displayResults();

            if (results.size() == horses.size())
                done = true;
        }

        HorseRacingHelper.stopMusic();
    }


    //increment and logic functions

    private int getIncrement (Horse horse){

        
        
        int baseMove = (int)(Math.random() * 4);
        int increment = (int)(baseMove*surfaceOddsMultiplyer(0)*lengthOddsMultiplyer(0));


        
        return increment;
    }

    
    public double lengthOddsMultiplyer (int x){

        Horse horseOdds = horses.get(x);
        double lengthMultiplyer = (int)(7 - Math.abs(horseOdds.getPreferredLength() - this.raceLength));
        lengthMultiplyer /=2;
        return lengthMultiplyer;

    }

    public double surfaceOddsMultiplyer (int x){

        Horse horseOdds = horses.get(x);
        double surfaceMultiplyer = 0;
        boolean multiComplete = true;

        while (multiComplete!=false){
        if (raceSurface.equals("grass"))
            surfaceMultiplyer += horseOdds.getGrassRating() / 2;
            multiComplete = false;
        if (raceSurface.equals("dirt"))
            surfaceMultiplyer += horseOdds.getDirtRating() / 2;
            multiComplete = false;
        if (raceSurface.equals("mud"))
            surfaceMultiplyer += horseOdds.getMudRating() / 2;
            multiComplete = false;
        }
        return surfaceMultiplyer;
    }

    //output to terminal functions

    public void displayRaceInfo() {
        System.out.println("-----Race Information:-----");
        System.out.println("+---------------+---------------+");
        String a1 = "Race Surface";
        String k1 = "Race Length";
        System.out.printf("|%15s|%15s|\n", a1, k1 );
        String k3 = raceSurface;
        String k4 = "" + raceLength;
        System.out.println("+---------------+---------------+");
        System.out.printf("|%-15s|%15s|\n", k3, k4 );
        System.out.println("+---------------+---------------+");
        displayHorseTable();
    }

    public void displayHorseTable(){ 

        System.out.println(" ");
        System.out.println("+-----+-------------------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
        String a1 = "#";
        String k1 = "Horse Name";
        String k2 = "Prefered Length";
        String k3 = "Grass Rating"; 
        String k4 = "Mud Rating";
        String k5 = "Dirt Rating";
        String k6 = "Win Odds";
        String k7 = "Place Odds";
        String k8 = "Show Odds";

        System.out.printf("|%-5s|%-25s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|\n", a1, k1, k2, k3, k4, k5, k6, k7, k8);

        for (int i = 0; i < horses.size(); i++) {
            Horse horse = horses.get(i);
            String n1 = "" + i;
            String s1 = "" + horse.getName();
            String s2 = "" + horse.getPreferredLength();
            String s3 = "" + horse.getGrassRating();
            String s4 = "" + horse.getMudRating();
            String s5 = "" + horse.getDirtRating();
            String s6 = "" + this.getWinOdds(i);
            String s7 = "" + this.getPlaceOdds(i);
            String s8 = "" + this.getShowOdds(i);
 
            System.out.println("+-----+-------------------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
            System.out.printf("|%-5s|%-25s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|\n", n1, s1, s2, s3, s4, s5, s6, s7, s8);
        }
        System.out.println("+-----+-------------------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
    }

    public void displayResults(){
        System.out.println("\n\nRace Results");
        System.out.println("------------");
        for(int i=0; i<results.size(); i++){
            System.out.println((i+1) + ": " + results.get(i).getName() + "("+results.get(i).getNumber()+")");
        }
    }

    //get functions

    public List<Horse> getHorses() {
        return horses;
    }

  
    public Horse getNextHorse(){
        if (currentHorse == horses.size())
            currentHorse = 0;
        
        return horses.get(currentHorse++);
    }

    public double getRaceLength() {
        return raceLength;
    }

    public Horse getCurrentHorse(){
        return horses.get(currentHorse);
    }

    public String getRaceSurface() {
        return raceSurface;
    }

    // functions

    private void resetHorses() {
        for (Horse horse : horses) {
            horse.resetCurrenPosition();
        }
    }

    public int numHorses(){
        return horses.size();
    }
}