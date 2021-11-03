package com.org.ita.utils;

public class Menu {

    private ConsoleScanner cs;
    private Users user;
    private Runner runner;
    private final Viewer view = new Viewer();
    public Menu() {
        
    }
    public void run() {
    	cs = new ConsoleScanner();
        runner = new Runner();
        chooseImpl();
    }

    private void chooseImpl(){
        Users.printAllUserName();
        //System.out.println("Choose id of implementation or type 0 for exit");
        view.chooseId("implementation", "");
        int userId = cs.readInt();
        
        switch(userId) {
            case 0: System.exit(0);
            case 1:
            case 2: 
            case 3:
            case 4:
            case 5: 
            case 6:
            case 7:
            case 8: 
            	user = Users.getById(userId);
            	runner.setUserImpl(user);
            	chooseKata();
            default:
            	view.inputError();
                chooseImpl();
        }
       
    }

    public void listCommands() {
        System.out.println("1-Show users\n2-Set user\n3-Show tasks");
    }

    
    private void chooseKata() {
    	/*System.out.println("Choose kata or type 0 to return on previous level");
        System.out.println("5 - Five \n6 - Six \n7 - Seven\n8 - Eigth");*/
    	view.chooseId("kata", "on previous level");
        int kata = cs.readInt();
        
        switch (kata) {
            case 0:
            	chooseImpl();
                break;
                
            case 5: 
                chooseFive();
                break;
            
            case 6:
                chooseSix();
                break;
                
            case 7: 
                chooseSeven();
                break;
      
            case 8:
                chooseEight();
                break;
            
            default:
                view.inputError();
                chooseKata();
                break;
        }
        chooseKata();
    }
    public void chooseEight() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
        System.out.println(""
        		+ "1 - KeepHydrated\n"
        		+ "2 - VolumeOfCuboid\n"
        		+ "3 - MpgToKpm\n"
        		+ "4 - SquareOrSquareRoot\n"
        		+ "5 - CountPositivesSumNegatives\n"
        		+ "6 - ConvertAStringToANumber\n"
        		+ "7 - AmIWilson\n"
        		+ "8 - TwoDecimalPlaces\n"
        		+ "9 - DivisibleBy\n");
        int task = cs.readInt();
        
        
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 1:
            	runner.runKeepHydrated();
            	break;
            case 2:
            	runner.runVolumeOfCuboid();
            	break;
            case 3:
                runner.runMpgToKpm();
                break;
            case 4:
                runner.runSquareOrSquareRoot();
                break;
            case 5:
                runner.runCountPositivesSumNegatives();
                break;   
            case 6:
                runner.runConvertAStringToANumber();
                break;   
            case 7:
                runner.runAmIWilson();
                break;
            case 8:
                runner.runTwoDecimalPlaces();
                break; 
            case 9:
                runner.runDivisibleBy();
                break; 
            default:
            	view.inputError();
                chooseEight();
                break;
        }
        chooseEight();
    }
    public void chooseSeven() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
    	System.out.println(""
    			+ "1 - LookingForABenefactor\n"
        		+ "2 - SeriesSum\n"
        		+ "3 - WhereIsHe\n");
        
    	int task = cs.readInt();
       
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 1:
                runner.runLookingForABenefactor();
                break;   
            case 2:
                runner.runSeriesSum();
                break;
            case 3:
                runner.runWhereIsHe();
                break;
            
            default:
            	view.inputError();
                chooseSeven();
                break;
        }
        chooseSeven();
    }
    
    public void chooseSix() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
    	System.out.println(""
    			+ "1 - FindNB\n"
        		+ "2 - Balance\n"
        		+ "3 - F\n"
        		+ "4 - Rainfall\n"
        		+ "5 - NbaCup\n"
        		+ "6 - HelpTheBookseller\n");
        int task = cs.readInt();
        
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 1:
                runner.runFindNB();
                break;   
            case 2:
                runner.runBalance();
                break;
            case 3:
                runner.runF();
                break;
            case 4:
                runner.runRainfall();
                break; 
            case 5:
                runner.runNbaCup();
                break;
            case 6:
                runner.runHelpTheBookseller();
                break;
            default:
            	view.inputError();
                chooseSix();
                break;
        }
        chooseSix();
    }
    
    public void chooseFive() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
    	System.out.println(""
    			+ "1 - ArtificialRain\n"
        		+ "2 - Gap\n"
        		+ "3 - Zeros\n"
        		+ "4 - Perimeter\n"
        		+ "5 - SolveSum\n"
        		+ "6 - Smallest\n");
        int task = cs.readInt();
       
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 1:
                runner.runArtificialRain();
                break;   
            case 2:
                runner.runGap();
                break;
            case 3:
                runner.runZeros();
                break;
            case 4:
                runner.runPerimeter();
                break;
            case 5:
                runner.runSolveSum();
                break;
            case 6:
                runner.runSmallest();
                break;
            default:
            	view.inputError();
                chooseFive();
                break;
        }
        chooseFive();
    }
  
}
