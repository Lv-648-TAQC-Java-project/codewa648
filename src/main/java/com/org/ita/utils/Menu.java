package com.org.ita.utils;

public class Menu {

    private ConsoleScanner cs;
    private Users user;
    private Runner runner;

    public Menu() {
        
    }
    public void run() {
    	cs = new ConsoleScanner();
        runner = new Runner();
        chooseImpl();
    }

    private void chooseImpl(){
        Users.printAllUserName();
        System.out.println("Choose id of implementation or type 0 for exit");
        int userId = cs.readInt();
        
        switch(userId) {
            case 0: System.exit(0);
            case 1:
            case 2: 
            case 3:
            	user = Users.getById(userId);
            	runner.setUserImpl(user);
            	chooseKata();
            default:
            	System.err.println("Wrong input!\n");
                chooseImpl();
        }
       
    }

    public void listCommands() {
        System.out.println("1-Show users\n2-Set user\n3-Show tasks");
    }

    
    private void chooseKata() {
    	System.out.println("Choose kata or type 0 to return on previous level");
        System.out.println("5-Five \n6-Six \n7-Seven\n8-Eigth");
        int kata = cs.readInt();//try catch
        
        switch (kata) {
            case 0:
            	chooseImpl();
                break;
            case 6: 
                chooseSix();
                break;
            
            case 8:
                chooseEight();
                break;
            /*case "6":
                choose_six();
                break;
            case "7":
                choose_seven();
                break;
            case "8":
                choose_eigth();
                break;*/
            default:
                System.err.println("Wrong input!");
                chooseKata();
                break;
        }
        chooseKata();
    }
    public void chooseEight() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
        System.out.println("3-MpgToKpm");
        int task = cs.readInt();
        
        
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 3:
                runner.runMpgToKpm();
                break;
                
            default:
                System.err.println("Wrong input!");
                chooseEight();
                break;
        }
        chooseEight();
    }
    public void chooseSix() {
    	System.out.println("Choose task to run or type 0 to return on previous level: ");
        System.out.println("6-nbaCup\n2-Balance");
        int task = cs.readInt();
        
        
        switch (task) {
            case 0:
            	chooseKata();
                break;
            case 2:
                runner.runBalance();
                break; 
            case 6:
                runner.runNbaCup();
                break;
            default:
                System.err.println("Wrong input!");
                chooseSix();
                break;
        }
        chooseSix();
    }
  /*  private void change_kata() {
        System.out.println("Choose kata:");
        System.out.println("5-Five \n6-Six \n7-Seven\n8-Eigth");
        String pos = sc.nextLine();//try catch
        boolean exit = false;
        int pos1 = 0;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "5":
                choose_five();
                break;
            case "6":
                choose_six();
                break;
            case "7":
                choose_seven();
                break;
            case "8":
                choose_eigth();
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit) {
            change_kata();
        }
    }

    private void choose_five() {
        System.out.println("Choose task to run:");
        System.out.println("1-artificialRain \n2-gap");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_five.artificialRain(new int[]{4, 2, 3, 3, 2});
                break;
            case "2":
                result = Arrays.toString(impl_five.gap(4, 100, 110));
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_five();
        } else {
            choose_five();
        }
    }

    private void choose_six() {
        System.out.println("Choose task to run:");
        System.out.println("1-findNb \n2-f");
        String pos = sc.nextLine();//try catch
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_six.findNb(1071225);
                break;
            case "2":
                result = "" + impl_six.f(0.5);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_six();
        } else {
            choose_five();
        }
    }

    private void choose_seven() {
        System.out.println("Choose task to run:");
        System.out.println("1-newAvg \n2-seriesSum");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = "" + impl_seven.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90);
                break;
            case "2":
                result = impl_seven.seriesSum(4);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_seven();
        } else {
            choose_five();
        }
    }

    private void choose_eigth() {
        System.out.println("Choose task to run:");
        System.out.println("1-sqrt or Wrong input!t sqrt \n2-mpgToKPM");
        String pos = sc.nextLine();
        String result = "";
        boolean exit = false;
        switch (pos) {
            case "0":
                exit = true;
                break;
            case "1":
                result = Arrays.toString(impl_eigth.squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1}));
                break;
            case "2":
                result = "" + impl_eigth.mpgToKPM(15);
                break;
            default:
                System.err.println("Wrong input!");
                break;
        }
        if (!exit && !result.equals("")) {
            System.out.println("\nResult:\n" + result + "\n");
            choose_eigth();
        } else {
            choose_five();
        }
    }//*/
}
