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
    // Other methods for simulating the race, calculating winners, etc., can be added as needed

    private int getIncrement(Horse horse) {
        if(this.raceSurface.equals("Dirt")){
            double dirtRating=(Math.abs(this.getRaceLength()-horse.getPreferredLength())-horse.getDirtRating());
            // the smaller the number, the better the rating/random number they should get
            if(dirtRating>=20)
                return ((int)(Math.random() * 5))+1; // figure out range we want to give - BAD RATING (1-5)
            else if(dirtRating<20 && dirtRating>=15)
                return (int)(Math.random() * 2)+5; // figure out range we want to give (5-7)
            else if(dirtRating<15 && dirtRating>=10)
                return (int)(Math.random() * 3)+7; // figure out range we want to give (7-10)
            else if(dirtRating<10 && dirtRating>=0)
                return (int)(Math.random() * 3)+10; // figure out range we want to give (10-13)
            else
                return (int)(Math.random() * 2)+13; // figure out range we want to give - BEST RATING (13-15)
            }
        else if(this.raceSurface.equals("Mud")){
            double mudRating=(Math.abs(this.getRaceLength()-horse.getPreferredLength())-horse.getMudRating());
            // the smaller the number, the better the rating/random number they should get
            if(mudRating>=20)
                return ((int)(Math.random() * 5))+1; // figure out range we want to give - BAD RATING (1-5)
            else if(mudRating<20 && mudRating>=15)
                return (int)(Math.random() * 2)+5; // figure out range we want to give (5-7)
            else if(mudRating<15 && mudRating>=10)
                return (int)(Math.random() * 3)+7; // figure out range we want to give (7-10)
            else if(mudRating<10 && mudRating>=0)
                return (int)(Math.random() * 3)+10; // figure out range we want to give (10-13)
            else
                return (int)(Math.random() * 2)+13; // figure out range we want to give - BEST RATING (13-15)
        }
        
        else{
            double grassRating=(Math.abs(this.getRaceLength()-horse.getPreferredLength())-horse.getGrassRating());
            // the smaller the number, the better the rating/random number they should get
            if(grassRating>=20)
                return ((int)(Math.random() * 5))+1; // figure out range we want to give - BAD RATING (1-5)
            else if(grassRating<20 && grassRating>=15)
                return (int)(Math.random() * 2)+5; // figure out range we want to give (5-7)
            else if(grassRating<15 && grassRating>=10)
                return (int)(Math.random() * 3)+7; // figure out range we want to give (7-10)
            else if(grassRating<10 && grassRating>=0)
                return (int)(Math.random() * 3)+10; // figure out range we want to give (10-13)
            else
                return (int)(Math.random() * 2)+13; // figure out range we want to give - BEST RATING (13-15)
        }
    }

    private void resetHorses() {
        for (Horse horse : horses) {
            horse.resetCurrenPosition();
        }
    }
}
