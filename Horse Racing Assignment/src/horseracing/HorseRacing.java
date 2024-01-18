package horseracing;

import java.util.Scanner;

public class HorseRacing {

     public static void main(String[] args) {

        int raceLength = (int)(Math.random()*2)+1;

        Horse SeekAmount = new Horse("Seek Amount", 8, 6, 8, 7);
        Horse HimSometimes = new Horse("Him Sometimes", 7, 2, 6, 6);
        Horse CouldTurn = new Horse("Could Turn", 3, 6, 2, 12);
        Horse AgeMiss = new Horse("Age Miss", 6, 7, 2, 5.5);
        Horse TraditionalPlayer = new Horse("Traditional Player", 8, 1, 9, 6);
        Horse DirectorKid = new Horse("Director Kid", 9, 3, 7, 5);
        Horse QuitePlan = new Horse("Quite Plan", 9, 8, 8, 6);
        Horse ThroughoutPresent = new Horse("Throughout Present", 5, 10, 7, 6);
        Horse EightOf = new Horse("Eight Of", 6, 5, 2, 6);
        Horse OffEarly = new Horse("Off Early", 10, 4, 10, 5.5);
        Horse SeasonMorning = new Horse("Season Morning", 9, 10, 2, 7);
        Horse StyleMeet = new Horse("Style Meet", 4, 4, 4, 5.5);
        Horse SaveGroup = new Horse("Save Group", 2, 8, 8, 8);
        Horse LaterBegin = new Horse("Later Begin", 5, 1, 3, 9);
        Horse RealizeNo = new Horse("Realize No", 2, 2, 8, 10);
        Horse OfficialRole = new Horse("Official Role", 8, 3, 1, 5);
        Horse CareerPopulation = new Horse("Career Population", 5, 2, 1, 5.5);
        Horse RecentlyEmployee = new Horse("Recently Employee", 2, 10, 6, 9);
        Horse CutChallenge = new Horse("Cut Challenge", 8, 4, 7, 5);
        Horse WantType = new Horse("Want Type", 8, 8, 5, 5.5);
        Horse ReflectStandard = new Horse("Reflect Standard", 8, 2, 6, 10);
        Horse LookAdmit = new Horse("Look Admit", 1, 7, 6, 5.5);
        Horse SoBill = new Horse("So Bill", 4, 7, 9, 7);
        Horse MissKeep = new Horse("Miss Keep", 6, 1, 5, 8);
        Horse TypeEspecially = new Horse("Type Especially", 9, 9, 8, 7);
        Horse WinThough = new Horse("Win Though", 4, 2, 1, 9);
        Horse ShowKnowledge = new Horse("Show Knowledge", 8, 6, 5, 5.5);
        Horse FallBelieve = new Horse("Fall Believe", 3, 2, 3, 8);
        Horse SomebodyRecognize = new Horse("Somebody Recognize", 10, 8, 10, 7);
        Horse BankSerious = new Horse("Bank Serious", 6, 2, 9, 5.5);
        Horse AffectDiscussion = new Horse("Affect Discussion", 4, 1, 1, 5.5);
        Horse ElectionFather = new Horse("Election Father", 3, 2, 9, 9);
        Horse FormForget = new Horse("Form Forget", 1, 1, 9, 9);
        Horse IdentifyResponsibility = new Horse("Identify Responsibility", 10, 7, 3, 5);
        Horse FishRecognize = new Horse("Fish Recognize", 3, 5, 10, 10);
        Horse SupportCut = new Horse("Support Cut", 4, 3, 8, 8);
        Horse PressureTend = new Horse("Pressure Tend", 9, 2, 1, 8);
        Horse ParentHit = new Horse("Parent Hit", 1, 4, 6, 9);
        Horse UntilStation = new Horse("Until Station", 3, 2, 6, 5);
        Horse ChooseRole = new Horse("Choose Role", 8, 3, 10, 10);
        Horse BoyLess = new Horse("Boy Less", 4, 4, 2, 9);
        Horse CatchTen = new Horse("Catch Ten", 3, 2, 3, 9);
        Horse WriteMuch = new Horse("Write Much", 7, 8, 1, 7);
        Horse NightYear = new Horse("Night Year", 6, 8, 2, 9);
        Horse SocialMilitary = new Horse("Social Military", 2, 8, 8, 10);
        Horse StageUnder = new Horse("Stage Under", 8, 8, 9, 5.5);
        Horse SuddenlyChoose = new Horse("Suddenly Choose", 3, 1, 3, 12);
        Horse FederalLate = new Horse("Federal Late", 1, 7, 2, 7);
        Horse ManyCase = new Horse("Many Case", 1, 3, 8, 8);
        Horse BeTown = new Horse("Be Town", 3, 4, 4, 8);
        Horse EffectEspecially = new Horse("Effect Especially", 10, 4, 10, 7);
        Horse NeedAsk = new Horse("Need Ask", 1, 5, 2, 6);
        Horse TripEasy = new Horse("Trip Easy", 8, 1, 9, 9);
        Horse DetailBed = new Horse("Detail Bed", 4, 2, 7, 10);
        Horse ThereTheir = new Horse("There Their", 2, 10, 6, 5.5);
        Horse PeaceEmployee = new Horse("Peace Employee", 7, 10, 6, 5);
        Horse StudentBit = new Horse("Student Bit", 4, 3, 1, 9);
        Horse PmSingle = new Horse("Pm Single", 4, 5, 5, 5);
        Horse HoldFrom = new Horse("Hold From", 9, 2, 9, 12);
        Horse DogDifficult = new Horse("Dog Difficult", 2, 5, 3, 6);
        Horse DifferenceBillion = new Horse("Difference Billion", 6, 2, 6, 9);
        Horse HotPopular = new Horse("Hot Popular", 8, 9, 2, 5.5);
        Horse DogExample = new Horse("Dog Example", 5, 6, 2, 12);
        Horse RevealFoot = new Horse("Reveal Foot", 2, 3,2,10);
        Horse EffectVote = new Horse("Effect Vote", 6, 10, 10, 9);
        Horse RangeSpeech = new Horse("Range Speech", 5, 2, 10, 10);
        Horse BloodEmployee = new Horse("Blood Employee", 3, 10, 10, 12);
        Horse AreaLose = new Horse("Area Lose", 1, 2, 2, 7);
        Horse ResourceStandard = new Horse("Resource Standard", 8, 2, 10, 6);
        Horse DriveChance = new Horse("Drive Chance", 10, 5, 3, 6);
        Horse FutureWhen = new Horse("Future When", 8, 9, 1, 5);
        Horse OutsideLearn = new Horse("Outside Learn", 5, 7, 5, 7);
        Horse ProgramCivil = new Horse("Program Civil", 9, 5, 7, 5.5);
        Horse EnvironmentMovie = new Horse("Environment Movie", 6, 3, 3, 7);
        Horse AlsoMarriage = new Horse("Also Marriage", 4, 10, 9, 8);
        Horse SomeSuggest = new Horse("Some Suggest", 7, 5, 3, 5.5);
        Horse ItThrow = new Horse("It Throw", 10, 9, 6, 12);
        Horse BloodSimple = new Horse("Blood Simple", 8, 9, 4, 10);
        Horse PowerMe = new Horse("Power Me", 3, 4, 9, 12);
        Horse WifeEat = new Horse("Wife Eat", 4, 6, 6, 6);
        Horse MeasureTry = new Horse("Measure Try", 8, 6, 4, 12);
        Horse GetDegree = new Horse("Get Degree", 7, 8, 10, 5.5);
        Horse FilmCatch = new Horse("Film Catch", 5, 1, 7, 5.5);
        Horse SoldierTown = new Horse("Soldier Town", 9, 7, 9, 12);
        Horse ParticularHow = new Horse("Particular How", 5, 5, 2, 5);
        Horse TeacherTraining = new Horse("Teacher Training", 10, 10, 8, 5.5);
        Horse AboutCourse = new Horse("About Course", 6, 2, 7, 10);
        Horse PrettyAbove = new Horse("Pretty Above", 4, 8, 1, 6);
        Horse CenturyCulture = new Horse("Century Culture", 5, 6, 7, 8);
        Horse PmField = new Horse("Pm Field", 9, 1, 10, 6);
        Horse GreenPolitical = new Horse("Green Political", 5, 9, 7, 5.5);
        Horse CenturyMan = new Horse("Century Man", 3, 6, 10, 5.5);
        Horse LastHere = new Horse("Last Here", 2, 4, 3, 10);
        Horse BeyondSuccessful = new Horse("Beyond Successful", 8, 6, 2, 7);
        Horse PlayFuture = new Horse("Play Future", 9, 5, 5, 8);
        Horse AnyoneApproach = new Horse("Anyone Approach", 10, 10, 9, 10);
        Horse CarryCommercial = new Horse("Carry Commercial", 9, 10, 1, 10);
        Horse DemocraticHerself = new Horse("Democratic Herself", 8, 5, 10, 9);
        Horse HouseYour = new Horse("House Your", 9, 1, 6, 5);
        Horse OwnerProfessional = new Horse("Owner Professional", 1, 9, 3, 9);
        Horse AddressMedia = new Horse("Address Media", 5, 7, 8, 5.5);
        Horse TaskThink = new Horse("Task Think", 10, 4, 4, 8);
        Horse DemocraticStock = new Horse("Democratic Stock", 7, 2, 3, 7);
        Horse TripLaw = new Horse("Trip Law", 5, 8, 8, 7);
        Horse ClearPerform = new Horse("Clear Perform", 7, 9, 5, 12);
        Horse PutGoal = new Horse("Put Goal", 8, 7, 6, 9);
        Horse BlueWhite = new Horse("Blue White", 8, 10, 6, 8);
        Horse CostLawyer = new Horse("Cost Lawyer", 5, 2, 8, 8);
        Horse TraditionalSenior = new Horse("Traditional Senior", 1, 2, 10, 9);
        Horse ElectionWhy = new Horse("Election Why", 2, 8, 7, 10);
        Horse WaterNorth = new Horse("Water North", 9, 4, 5, 10);
        Horse CustomerCourt = new Horse("Customer Court", 4, 10, 2, 7);
        Horse CampaignReturn = new Horse("Campaign Return", 7, 4, 8, 9);
        Horse JustGame = new Horse("Just Game", 5, 8, 2, 12);
        Horse RaiseSchool = new Horse("Raise School", 6, 1, 7, 5.5);
        Horse LateHusband = new Horse("Late Husband", 2, 6, 10, 10);
        Horse AvailableJust = new Horse("Available Just", 1, 3, 6, 6);
        Horse HitCompany = new Horse("Hit Company", 5, 8, 2, 9);
        Horse ChurchConsumer = new Horse("Church Consumer", 5, 10, 2, 5);
        Horse SomeoneTen = new Horse("Someone Ten", 7, 9, 4, 6);
        Horse BodyLater = new Horse("Body Later", 5, 7, 4, 6);
        Horse ShouldPiece = new Horse("Should Piece", 8, 10, 7, 9);
        Horse AddressThem = new Horse("Address Them", 9, 6, 3, 5);
        Horse WinMaintain = new Horse("Win Maintain", 2, 4, 1, 8);
        Horse BagStudy = new Horse("Bag Study", 7, 8, 8, 9);
        Horse DemocratHelp = new Horse("Democrat Help", 7, 2, 1, 8);
        Horse LaterDecade = new Horse("Later Decade", 1, 10, 8, 12);
        Horse TodayChance = new Horse("Today Chance", 4, 1, 3, 9);
        Horse CompareOld = new Horse("Compare Old", 2, 7, 4,12);


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
