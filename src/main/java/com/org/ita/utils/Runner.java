package com.org.ita.utils;

import java.math.BigInteger;
import java.util.Arrays;

public class Runner {

    private Users user;
    private Task currentTask;
    private Viewer view;
    private ConsoleScanner cs;

    public Runner(Viewer view) {
	this.view = view;
	this.cs = new ConsoleScanner(view);
    }

    void setUserImpl(Users user) {
	this.user = user;
    }

    // Kata 5

    public void runArtificialRain() {
	view.printUser(user);
	currentTask = Task.TASK_5_1;
	currentTask.printDescription();
	view.input("int array", currentTask.getInputMessages()[0]);
	int[] input = cs.readArrayInt();
	int result = user.getFive().artificialRain(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runGap() {
	view.printUser(user);
	currentTask = Task.TASK_5_2;
	currentTask.printDescription();
	view.input("int", currentTask.getInputMessages()[0]);
	int g = cs.readInt();
	view.input("int", currentTask.getInputMessages()[1]);
	long m = cs.readLong();
	view.input("int", currentTask.getInputMessages()[2]);
	long n = cs.readLong();
	long[] result = user.getFive().gap(g, m, n);
	view.output(Arrays.toString(result), currentTask.getResultMessages()[0]);
    }

    public void runZeros() {
	view.printUser(user);
	currentTask = Task.TASK_5_3;
	currentTask.printDescription();
	view.input("int", currentTask.getInputMessages()[0]);
	int input = cs.readInt();
	int result = user.getFive().zeros(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runPerimeter() {
	view.printUser(user);
	currentTask = Task.TASK_5_4;
	currentTask.printDescription();
	view.input("Big Integer", currentTask.getInputMessages()[0]);
	BigInteger input = cs.readBigInteger();
	BigInteger result = user.getFive().perimeter(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runSolveSum() {
	view.printUser(user);
	currentTask = Task.TASK_5_5;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double input = cs.readDouble();
	double result = user.getFive().solveSum(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runSmallest() {
	view.printUser(user);
	currentTask = Task.TASK_5_6;
	currentTask.printDescription();
	view.input("int", currentTask.getInputMessages()[0]);
	long n = cs.readInt();
	long[] result = user.getFive().smallest(n);
	view.output(Arrays.toString(result), currentTask.getResultMessages()[0]);
    }

    // Kata 6

    public void runFindNB() {
	view.printUser(user);
	currentTask = Task.TASK_6_1;
	currentTask.printDescription();
	view.input("long", currentTask.getInputMessages()[0]);
	long input = cs.readLong();
	long result = user.getSix().findNb(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runBalance() {
	view.printUser(user);
	currentTask = Task.TASK_6_2;
	currentTask.printDescription();
	System.out.println("Use default template or your own?\n 1- own 2- default");
	String choice = cs.readLine();
	String b1 = "";
	if (choice.equals("1")) {
	    view.input("String", currentTask.getInputMessages()[0]);
	    String temp;
	    while (true) {
		b1 += cs.readLine();
		System.out.println("Do you want to add new line? 0-no any-yes");
		temp = cs.readLine();
		if (temp.equals("0")) {
		    break;
		} else {
		    b1 += "\n";
		}
	    }
	} else {
	    b1 = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
	}
	String result = user.getSix().balance(b1);
	view.output(result, currentTask.getResultMessages()[0]);
    }

    public void runF() {
	view.printUser(user);
	currentTask = Task.TASK_6_3;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double input = cs.readDouble();
	double result = user.getSix().f(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runRainfall() {
	String data = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9"
		+ "\n"
		+ "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9"
		+ "\n"
		+ "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7"
		+ "\n"
		+ "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2"
		+ "\n"
		+ "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5"
		+ "\n"
		+ "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2"
		+ "\n"
		+ "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4"
		+ "\n"
		+ "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4"
		+ "\n"
		+ "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7"
		+ "\n"
		+ "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

	String data1 = "Rome:Jan 90.2,Feb 73.2,Mar 80.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 147.7,Nov 121.0,Dec 97.9"
		+ "\n"
		+ "London:Jan 58.0,Feb 38.9,Mar 49.9,Apr 42.2,May 67.3,Jun 52.1,Jul 59.5,Aug 77.2,Sep 55.4,Oct 62.0,Nov 69.0,Dec 52.9"
		+ "\n"
		+ "Paris:Jan 182.3,Feb 120.6,Mar 188.1,Apr 204.9,May 323.1,Jun 350.5,Jul 336.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7"
		+ "\n"
		+ "NY:Jan 128.7,Feb 121.8,Mar 151.9,Apr 93.5,May 98.8,Jun 93.6,Jul 142.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2"
		+ "\n"
		+ "Vancouver:Jan 155.7,Feb 121.4,Mar 132.3,Apr 69.2,May 85.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 69.6,Oct 116.3,Nov 154.6,Dec 171.5"
		+ "\n"
		+ "Sydney:Jan 123.4,Feb 111.0,Mar 151.3,Apr 129.7,May 123.0,Jun 159.2,Jul 102.8,Aug 90.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2"
		+ "\n"
		+ "Bangkok:Jan 20.6,Feb 28.2,Mar 40.7,Apr 81.8,May 189.4,Jun 151.7,Jul 198.2,Aug 197.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4"
		+ "\n"
		+ "Tokyo:Jan 59.9,Feb 81.5,Mar 106.4,Apr 139.2,May 144.0,Jun 186.0,Jul 155.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4"
		+ "\n"
		+ "Beijing:Jan 13.9,Feb 14.7,Mar 18.2,Apr 18.4,May 43.0,Jun 88.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 38.0,Nov 19.3,Dec 2.7"
		+ "\n"
		+ "Lima:Jan 11.2,Feb 10.9,Mar 10.7,Apr 10.4,May 10.6,Jun 11.8,Jul 14.4,Aug 13.1,Sep 23.3,Oct 1.7,Nov 0.5,Dec 10.7";
	view.printUser(user);
	currentTask = Task.TASK_6_4;
	currentTask.printDescription();
	System.out.println("Use default template or your own?\n 1- own 2- default");
	String choice = cs.readLine();
	String town1 = "";
	String town2 = "";
	String strng1 = "";
	String strng2 = "";
	String[] towns = new String [] {"Rome", "London", "Paris", "NY", "Vancouver", "Sydney", "Bangkok", "Tokyo",
	        "Beijing", "Lima", "Montevideo", "Caracas", "Madrid", "Berlin"};
	for(String town : towns) {
	    System.out.print(town+", ");
	    
	}
	System.out.println();
	if (choice.equals("2")) {
	    view.input("String", currentTask.getInputMessages()[0]);
	    town1 = cs.readLine();
	    view.input("String", currentTask.getInputMessages()[2]);
	    town2 = cs.readLine();
	    strng1 = data;
	    strng2 = data1;
	    
	    

	} else {
	    view.input("String", currentTask.getInputMessages()[0]);
	    town1 = cs.readLine();
	    view.input("String", currentTask.getInputMessages()[1]);
	    strng1 = cs.readLine();
	    view.input("String", currentTask.getInputMessages()[2]);
	    town2 = cs.readLine();
	    view.input("String", currentTask.getInputMessages()[3]);
	    strng2 = cs.readLine();
	}

	double resultMean = user.getSix().mean(town1, data);
	double resultVariance = user.getSix().variance(town2, data1);
	view.output("" + resultMean, currentTask.getResultMessages()[0]);
	view.output("" + resultVariance, currentTask.getResultMessages()[1]);
    }

    public void runNbaCup() {
	view.printUser(user);
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
	currentTask = Task.TASK_6_5;
	currentTask.printDescription();
	System.out.println(teams);
	view.input("String", currentTask.getInputMessages()[1]);
	String toFind = cs.readLine();
	String result = user.getSix().nbaCup(resultSheet, toFind);
	view.output(result, currentTask.getResultMessages()[0]);
    }

    public void runHelpTheBookseller() {
	view.printUser(user);
	currentTask = Task.TASK_6_6;
	currentTask.printDescription();
	view.input("Array string", currentTask.getInputMessages()[0]);
	String[] lstOfArt = cs.readArrayString();
	view.input("Array string", currentTask.getInputMessages()[1]);
	String[] lstOf1stLetter = cs.readArrayString();
	String result = user.getSix().stockSummary(lstOfArt, lstOf1stLetter);
	view.output(result, currentTask.getResultMessages()[0]);
    }

    // Kata 7

    public void runLookingForABenefactor() {
	view.printUser(user);
	currentTask = Task.Task_7_1;
	currentTask.printDescription();
	view.input("Array double", currentTask.getInputMessages()[0]);
	double[] arr = cs.readArrayDouble();
	view.input("Array double", currentTask.getInputMessages()[1]);
	double navg = cs.readDouble();
	double result = user.getSeven().newAvg(arr, navg);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runSeriesSum() {
	view.printUser(user);
	currentTask = Task.TASK_7_2;
	currentTask.printDescription();
	view.input("int", currentTask.getInputMessages()[0]);
	int input = cs.readInt();
	String result = user.getSeven().seriesSum(input);
	view.output(result, currentTask.getResultMessages()[0]);
    }

    public void runWhereIsHe() {
	view.printUser(user);
	currentTask = Task.TASK_7_3;
	currentTask.printDescription();
	view.input("int", currentTask.getInputMessages()[0]);
	int p = cs.readInt();
	view.input("int", currentTask.getInputMessages()[1]);
	int bef = cs.readInt();
	view.input("int", currentTask.getInputMessages()[2]);
	int aft = cs.readInt();
	int result = user.getSeven().whereIsHe(p, bef, aft);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    // Kata 8

    public void runKeepHydrated() {
	view.printUser(user);
	currentTask = Task.TASK_8_1;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double input = cs.readDouble();
	int result = user.getEigth().liters(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runVolumeOfCuboid() {
	view.printUser(user);
	currentTask = Task.TASK_8_2;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double length = cs.readDouble();
	view.input("double", currentTask.getInputMessages()[1]);
	double width = cs.readDouble();
	view.input("double", currentTask.getInputMessages()[2]);
	double height = cs.readDouble();
	double result = user.getEigth().getVolumeOfCuboid(length, width, height);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runMpgToKpm() {
	view.printUser(user);
	currentTask = Task.TASK_8_3;
	currentTask.printDescription();
	view.input("float", currentTask.getInputMessages()[0]);
	float input = cs.readFloat();
	float result = user.getEigth().mpgToKPM(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runSquareOrSquareRoot() {
	view.printUser(user);
	currentTask = Task.TASK_8_4;
	currentTask.printDescription();
	view.input("Array int", currentTask.getInputMessages()[0]);
	int[] input = cs.readArrayInt();
	int[] result = user.getEigth().squareOrSquareRoot(input);
	view.output(Arrays.toString(result), currentTask.getResultMessages()[0]);
    }

    public void runCountPositivesSumNegatives() {
	view.printUser(user);
	currentTask = Task.TASK_8_5;
	currentTask.printDescription();
	view.input("Array int", currentTask.getInputMessages()[0]);
	int[] input = cs.readArrayInt();
	int[] result = user.getEigth().countPositivesSumNegatives(input);
	view.output(Arrays.toString(result), currentTask.getResultMessages()[0]);
    }

    public void runConvertAStringToANumber() {
	view.printUser(user);
	currentTask = Task.TASK_8_6;
	currentTask.printDescription();
	view.input("String", currentTask.getInputMessages()[0]);
	String input = cs.readLine();
	int result = user.getEigth().stringToNumber(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runAmIWilson() {
	view.printUser(user);
	currentTask = Task.TASK_8_7;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double input = cs.readDouble();
	boolean result = user.getEigth().amIWilson(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runTwoDecimalPlaces() {
	view.printUser(user);
	currentTask = Task.TASK_8_8;
	currentTask.printDescription();
	view.input("double", currentTask.getInputMessages()[0]);
	double input = cs.readDouble();
	double result = user.getEigth().twoDecimalPlaces(input);
	view.output("" + result, currentTask.getResultMessages()[0]);
    }

    public void runDivisibleBy() {
	view.printUser(user);
	currentTask = Task.TASK_8_9;
	currentTask.printDescription();
	view.input("Array int", currentTask.getInputMessages()[0]);
	int[] inputArray = cs.readArrayInt();
	view.input("int", currentTask.getInputMessages()[1]);
	int divider = cs.readInt();
	int[] result = user.getEigth().divisibleBy(inputArray, divider);
	view.output(Arrays.toString(result), currentTask.getResultMessages()[0]);
    }
}
