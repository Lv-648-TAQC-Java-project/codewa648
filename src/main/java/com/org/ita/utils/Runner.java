package com.org.ita.utils;

import java.math.BigInteger;
import java.util.Arrays;

public class Runner {

    private final ConsoleScanner cs = new ConsoleScanner();

    private Users user;
    private Task currentTask;
    private Viewer view = new Viewer();
    
    
    void setUserImpl(Users user) {
        this.user = user;
    }

    public void runMpgToKpm() {
    	currentTask = Task.TASK_8_3;
    	System.out.print(currentTask.getDescription());
    	view.input("float" , currentTask.getInputMessages()[0]);
        float input = cs.readFloat();
        float result = user.getEigth().mpgToKPM(input);
        System.out.println(currentTask.getResultMessages()[0] + result);
    }
    
    public void runNbaCup() {
    	/*System.out.println("¬вед≥ть resultSheet: ");
    	String resultSheet = cs.readString();*/
    	String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"  
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"  
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"  
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"  
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"  
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"  
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"  
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"  
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
        String resultSheet = resultSheet1 + resultSheet2;
        String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
                + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
                + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
                + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
                + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
                + "Golden State Warriors,Dallas Maver";
        
        System.out.println(teams);
    	System.out.println("¬вед≥ть команду: ");
    	String toFind = cs.readString();
    	String result = user.getSix().nbaCup(resultSheet, toFind);
    	
    	System.out.println("Result: " + result);
    	
    }
    
    public void runBalance() {
    	System.out.println("Use default template or your own?\n 1- own 2- default");
    	String choice = cs.readLine();
    	String b1 ="";
    	if(choice.equals("1")) {
    		b1 = cs.readString();
    	}else {
    		b1 = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
    	}
    	 
    	String result = user.getSix().balance(b1);
    	
    	System.out.println("Result: " + result);
    	
    }
    public void runAmIWilson() {
    	System.out.println("Enter double number: ");
    	double input = cs.readDouble();
    	boolean result = user.getEigth().amIWilson(input);
    	System.out.println("Result: " + result);
    }
    
    public void runF() {
    	System.out.println("Enter double number: ");
    	double input = cs.readDouble();
    	double result = user.getSix().f(input);
    	System.out.println("Result: " + result);
    }
    
    public void runSolveSum() {
    	System.out.println("Enter double number: ");
    	double input = cs.readDouble();
    	double result = user.getFive().solveSum(input);
    	System.out.println("Result: " + result);
    }
    
    public void runSeriesSum() {
        System.out.println("Input n: ");
        int input = cs.readInt();
        String result = user.getSeven().seriesSum(input);
        System.out.println("Result: " + result);
    }

    public void runArtificialRain() {
        System.out.println("Input array of int v: ");
        int[] input = cs.readArrayInt();
        int result = user.getFive().artificialRain(input);
        System.out.println("Result: " + result);
    }
    
    public void runSquareOrSquareRoot() {
        int[] input = cs.readArrayInt();
        int[] result = user.getEigth().squareOrSquareRoot(input);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public void runWhereIsHe() {
        System.out.println("Enter number of people in queue:");
        int p = cs.readInt();
        System.out.println("Enter number of people before Vasya:");
        int bef = cs.readInt();
        System.out.println("Enter number of people after Vasya:");
        int aft = cs.readInt();
        int result = user.getSeven().whereIsHe(p, bef, aft);
        System.out.println("Result: " + result);
    }

    public void runGap() {
        System.out.println("Enter gap:");
        int g = cs.readInt();
        System.out.println("Enter start:");
        long m = cs.readLong();
        System.out.println("Enter end:");
        long n = cs.readLong();
        long[] result = user.getFive().gap(g,m,n);
        System.out.println("Result: " + Arrays.toString(result));
        
    }
 
    public void runFindNB() {
        System.out.println("Enter long: ");
        long input = cs.readLong();
        long result = user.getSix().findNb(input);
        System.out.println("Result: "+ result);
    }

    public void runZeros() {
        System.out.println("Enter int: ");
        int input = cs.readInt();
        int result = user.getFive().zeros(input);
        System.out.println("Result: "+ result);
    }

    public void runCountPositivesSumNegatives() {
        System.out.println("Enter int[] array: ");
        int[] input = cs.readArrayInt();
        int[] result = user.getEigth().countPositivesSumNegatives(input);
        System.out.println("Result: "+ Arrays.toString(result));
    }
    public void runKeepHydrated() {
        System.out.println("Input double: ");
        double input = cs.readDouble();
        int result = user.getEigth().liters(input);
        System.out.println("Result: "+ result);
    }

    public void runDivisibleBy() {
        System.out.println("Input array of integers: ");
        int[] inputArray = cs.readArrayInt();
        System.out.println("Input divider: ");
        int divider = cs.readInt();
        int[] result = user.getEigth().divisibleBy(inputArray, divider);
        System.out.println("Result: "+ Arrays.toString(result));
    }
    
    public void runTwoDecimalPlaces(){
        System.out.println("Write double: ");
        double input=cs.readDouble();
        double result=user.getEigth().twoDecimalPlaces(input);
        System.out.println("Result: "+ result);
    }
    
    public void runRainfall(){
        System.out.println("Write town 1: ");
        String town1= cs.readLine();
        System.out.println("Write strng 1: ");
        String strng1= cs.readLine();
        System.out.println("Write town 2: ");
        String town2= cs.readLine();
        System.out.println("Write strng 2: ");
        String strng2= cs.readLine();
        double resultMean=user.getSix().mean(town1,strng1);
        double resultVariance=user.getSix().variance(town2,strng2);
        System.out.println("Result mean: "+ resultMean);
        System.out.println("Result: "+ resultVariance);
    }
    
    public void runSmallest(){
        System.out.println("Write n:");
        long n= cs.readInt();
        long[] result=user.getFive().smallest(n);
        System.out.println(Arrays.toString(result));
    }
    
    public void runConvertAStringToANumber(){
        System.out.println("Enter the string:");
        String input = cs.readString();
        int res = user.getEigth().stringToNumber(input);
        System.out.println("Result" + res);
    }
    
    public void runPerimeter(){
        System.out.println("Enter perimeters:");
        BigInteger input = cs.readBigInteger();
        BigInteger res = user.getFive().perimeter(input);
        System.out.println("Result" + res);
    }
    
    public void runVolumeOfCuboid() {
        System.out.println("Enter length:");
        double length = cs.readDouble();
        System.out.println("Enter width:");
        double width = cs.readDouble();
        System.out.println("Enter height:");
        double height = cs.readDouble();
        double result = user.getEigth().getVolumeOfCuboid(length, width, height);
        System.out.println("Result: " + Double.toString(result));
    }

    public void runLookingForABenefactor(){
        System.out.println("Enter array:");
        double[] arr = cs.readArrayDouble(); 
        System.out.println("Enter double:");
        double navg = cs.readDouble();
        double result = user.getSeven().newAvg(arr, navg);
        System.out.println("Result:" +result);
    }

    public void runHelpTheBookseller(){
        System.out.println("Enter string array:");
        String[] lstOfArt=cs.readArrayString();
        System.out.println("Enter string array:");
        String[] lstOf1stLetter = cs.readArrayString();
        String result = user.getSix().stockSummary(lstOfArt, lstOf1stLetter);
        System.out.println("Result:" +result);
    }
}
