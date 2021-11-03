package com.org.ita.utils;

public enum Task {
	TASK_8_9(
			"Find numbers which are divisible by given number\n"
			+"The function takes an array of numbers and a divisor, and returns all numbers which are divisible by the given divisor."
			+"First argument is an array of numbers and the second is the divisor.",
			new String[]{"any positive numbers", "divisor"},
			new String[]{"all numbers which are divisible by the divisor"}),
	
	TASK_8_8("Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.",
			 new String[]{"any positive double number"},
			 new String[]{"resulting rounded number"}),
	
	TASK_8_7("Your task is to create a function that returns true if the given number is a Wilson prime",
			new String[]{"Any positive number"},
		    new String[] {"Is Wilson prime number?"}),
	
	TASK_8_6("Convert a String to a Number!\nWe need a function that can transform a string into a number.\nNote: all inputs must be strings, and every string is a perfectly valid representation of an integral number.",
			new String[]{"any numbers as a string:"},
			new String[]{"Output:"}),
	
	TASK_8_5("Count of positives / sum of negatives\n"
	         + "A method, that will get an integer array as parameter and will process every number from this array."
	         + "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.",
	         new String[]{"any integer numbers"},
	         new String[]{"resulting array"}),
	
	TASK_8_4("To square(root) or not to square(root)\n"
			+ "A method, that will get an integer array as parameter and will process every number from this array. "
			+ "Return a new array with processing every number of the input-array like this:",
			new String[]{"any positive number"},
			new String[]{"resulting array"}),
	
	TASK_8_3("Miles per gallon to kilometers per liter\n )"
			+"Method to quickly be able to convert miles per imperial gallon into kilometers per liter."
		    +"Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).",
			new String[]{"miles per gallon in float"},
			new String[]{"resulting float in kilometers per liter"}),
	
	TASK_8_2("Volume of a Cuboid\n"
			+"Calculate the volume of a cuboid.",
			new String[]{"length, width, height"},
			new String[]{"volume of a cuboid"}),
	TASK_8_1(
			"Keep Hydrated!\n"
			+"Nathan loves cycling.\nBecause Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\n"
			+"You input the time in hours and the function returns the number of litres Nathan will drink.",
			new String[]{"hours of cycling"},
			new String[]{"number of liters"}),
	
	Task_7_1("Looking for a benefactor\n"
			+"The function should return the expected donation"
			+"(rounded up to the next integer) that will permit to reach the average navg.",
			new String[]{"array of the donations, average "},
			new String[]{"expected average navg"}),
	
	TASK_7_2("Sum of the first nth term of Series\n"
			+"Your task is to write a function which returns the sum of following series upto nth term(parameter)."
		    +"Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...",
			new String[]{"any positive integer"},
			new String[]{"resulting integer"}),
	
	TASK_7_3("Where is Vasya?\n"
			+"Vasya stands in line with number of people p (including Vasya),\n"
			+"but he doesn't know exactly which position he occupies. He can say that there\n"
			+"are no less than b people standing in front of him and no more than a people\n"
			+"standing behind him. Find the number of different positions Vasya can occupy.",
			new String[]{
			"Total amount of people in the line",
			"Number of people standing in front of him",
			"Number of people standing behind him"},
			new String[]{"amount of possible positions"}),
   
	TASK_6_6("Help the bookseller!\n"
			+"bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each\n"
			+"book has a code c of 3, 4, 5 or more characters. The 1st character of a code is a capital\n"
			+"letter which defines the book category. Your task is to find all the books of L\n"
			+"with codes belonging to each category of M and to sum their quantity according to each category.",
			new String[]{"stocklist"},
			new String[]{"amount of books of given categories"}),
	TASK_6_5(
			"Ranking NBA teams/n"
			+"You are given a string with results of NBA teams separated by commas e.g:"
			+"Given a string of results and the name of a team your function nba_cup will return as a string\n"
			+"the name of the team followed by : and\n"
			+"the number of matches won by the team\n"
			+"the number of draws\n"
			+"the number of matches lost by the team\n"
			+"the total number of points scored by the team\n"
			+"the total number of points conceded by the team\n",
			new String[]{"team name"},
			new String[]{"team results"}),
	TASK_6_4("Rainfall! "
			+ "function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1.\r\n"
			+ "function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.",
			new String[] {"town1","measurement data1","town2","measurement data2"},
			new String[]{"Mean","Variance"}),
	TASK_6_3("Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?",
			new String[] {"Insert x"},
			new String[] {"Approximation result is: "}),
	TASK_6_2("Easy Balance Checking\nYou are given a (small) check book as a - sometimes - cluttered (by non-alphanumeric characters) string:\n" +
			 "The first line shows the original balance. Each other line (when not blank) gives information: check number, category, check amount.\n" +
			  "First you have to clean the lines keeping only letters, digits, dots and spaces.\n" +
			  "Then return a report as a string. On each line add the new balance and then in the last two lines the total expense and the average expense.\n" +
			  "Round to 2 decimals your results. It may happen that one (or more) line(s) is (are) blank.",
			new String[]{"Enter books list:"},
			new String[]{"Result:"}),
	
	TASK_6_1("Build a pile of Cubes\n"
	        + "A method, that will get a long value as parameter(the total volume m of the building)."
	        + "Return the integer value of cubes you can build from total volume.",
	        new String[]{"any positive number"},
	        new String[]{"resulting integer value"}),
	
	TASK_5_6("Return an array or a tuple or a string depending on the language (see Sample Tests) with:\n"
		    +"the smallest number you got\n"
		    +"the index i of the digit d you took, i as small as possible\n"
		    +"the index j (as small as possible) where you insert this digit d to have the smallest number.",
			new String[]{"any long number"},
			new String[]{"returned array with the smallest number, first index and second index"}),
	
	TASK_5_5("Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.",
			new String[] {"Any positive number"},
			new String[] {"Result: "}),
	TASK_5_4("Perimeter of squares in a rectangle\n"
			+"The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. The sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80.\n" +
			 "Give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing.\n" +
			 "The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.",
			 new String[]{"Enter number of squares:"},
			 new String[]{"The sum of their perimeters:"}),
	
	TASK_5_3("Number of trailing zeros of N!\n"
            + "A method, that will get an integer value as parameter."
            + "Return the integer value of trailing zeros in a factorial of a given number.",
           new String[]{"any positive number"},
           new String[]{"resulting integer value"}),
	
	TASK_5_2("Gap in Primes\n"
			+"So this function should return the first pair of two prime numbers spaced with\n"
			+"a gap of g between the limits m, n if these numbers exist otherwise null.",
			new String[]{"the gap we are looking for","start of the search","end of the search"},
			new String[]{"the first pair of two prime numbers spaced with a gap between the limits"}),

    TASK_5_1("Artificial Rain\n"
		   +"Creating artificial rain is an expensive operation. That's why we limit ourselves to creating the artificial rain only above one section. The water will then flow to the neighbouring sections but only if each of their heights does not exceed the height of the previous watered section."
		   +"Let's say there's a garden consisting of 5 rectangular sections of heights 4, 2, 3, 3, 2."
		   +"Creating the artificial rain over the left-most section is inefficient as the water WILL FLOW DOWN to the section with the height of 2, but it WILL NOT FLOW UP to the section with the height of 3 from there. Only 2 sections will be covered: 4, 2."
		   +"The most optimal choice will be either of the sections with the height of 3 because the water will flow to its neighbours covering 4 sections altogether: 2, 3, 3, 2.",
		   new String[]{"any array of integers"},
		   new String[]{"resulting integer"});
	
	private final String description;
	private final String[] inputMessages;
	private final String[] resultMessages;
	
	
	public String getDescription() {
		return description;
	}


	public String[] getInputMessages() {
		return inputMessages;
	}


	public String[] getResultMessages() {
		return resultMessages;
	}


	private Task(String description, String[] inputMessages, String[] resultMessages) {
		this.description = description;
		this.inputMessages = inputMessages;
		this.resultMessages = resultMessages;
	}
	
}
