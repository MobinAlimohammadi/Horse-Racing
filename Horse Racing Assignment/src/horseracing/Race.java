package horseracing;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Horse> horses;
    private double raceLength; // in furlongs
    private String raceSurface; // "grass", "dirt", or "mud" (Uses HorseRacingHelper constants)
    private int currentHorse;

    private List<Horse> results;


    public Race(List<Horse> horses, double raceLength, String raceSurface) {
        this.horses = horses;
        this.raceLength = raceLength;
        this.raceSurface = raceSurface;
        this.currentHorse = 0;
        this.results = new ArrayList<Horse>();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public int numHorses(){
        return horses.size();
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

    public void displayRaceInfo() {
        System.out.println("Race Information:");
        System.out.println("Race Surface: " + raceSurface);
        System.out.println("Race Length: " + raceLength + " furlongs");
        System.out.println("List of Horses:");
        for (Horse horse : horses) {
            System.out.println("- " + horse.getName());
        }
        displayHorseTable();
    }

    public void displayHorseTable(){
        String k1 = "Horse Name";
        String k2 = "Prefered Length";
        String k3 = "Grass Rating";
        String k4 = "Mud Rating";
        String k5 = "Dirt Rating";
        String k6 = "Win Odds";
        String k7 = "Place Odds";
        String k8 = "Shows Odds";
        System.out.printf("|%-26s|%15s|%12s|%10s|%11s|%8s|%10s|%10s|\n", k1, k2, k3, k4, k5, k6, k7, k8);

        for (int i = 0; i < horses.size(); i++) {
            Horse horse = horses.get(i);
            String s1 = "" + horse.getName();
            String s2 = "" + horse.getPreferredLength();
            String s3 = "" + horse.getGrassRating();
            String s4 = "" + horse.getMudRating();
            String s5 = "" + horse.getDirtRating();
            String s7 = "" + getOdds();
 
            System.out.println("+--------------------------+---------------+------------+----------+-----------+--------+----------+----------+");
            System.out.printf("|%-26s|%15s|%12s|%10s|%11s|\n", s1, s2, s3, s4, s5);
        }
        System.out.println("+--------------------------+---------------+------------+----------+-----------+--------+----------+----------+");
    }

    public String getWinOdds(){
        return 0;
    }

    public void displayResults(){
        System.out.println("\n\nRace Results");
        System.out.println("------------");
        for(int i=0; i<results.size(); i++){
            System.out.println((i+1) + ": " + results.get(i).getName() + "("+results.get(i).getNumber()+")");
        }
    }


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
                horse.incrementPosition(getIncrement(horse)); // cant leave this part the same //we have acsess to the horse in the rrace class
            }

            displayResults();

            if (results.size() == horses.size())
                done = true;
        }

        HorseRacingHelper.stopMusic();
    }

    private int getIncrement(Horse horse) {
        int increment =0;
        increment+=(int)(7-Math.abs(horse.getPreferredLength()-this.raceLength));
        if(raceSurface.equals("Grass"))
            increment+=horse.getGrassRating();
        if(raceSurface.equals("Mud"))
            increment+=horse.getMudRating();
        if(raceSurface.equals("Dirt"))
            increment+=horse.getDirtRating();

        return (int)(Math.random()*increment) + 1;
        }
    

    private void resetHorses() {
        for (Horse horse : horses) {
            horse.resetCurrenPosition();
        }
    }
}
