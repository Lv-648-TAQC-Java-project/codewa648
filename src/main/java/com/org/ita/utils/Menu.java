package com.org.ita.utils;

public class Menu {

    private final Viewer view = new Viewer();
    private ConsoleScanner cs;
    private Users user;
    private Runner runner;
    private String[] nameKatas = new String[]{"Five", "Six", "Seven", "Eigth"};
    private String[] optionsAllCommands = new String[]{"Show all users", "Set user implementation and run task", "Show tasks"};
    private String[] nameTasksEigth = new String[]{"KeepHydrated", "VolumeOfCuboid", "MpgToKpm", "SquareOrSquareRoot", "CountPositivesSumNegatives", "ConvertAStringToANumber", "AmIWilson", "TwoDecimalPlaces", "DivisibleBy"};
    private String[] nameTasksSeven = new String[]{"LookingForABenefactor", "SeriesSum", "WhereIsHe"};
    private String[] nameTasksSix = new String[]{"FindNB", "Balance", "F", "Rainfall", "NbaCup", "HelpTheBookseller"};
    private String[] nameTasksFive = new String[]{"ArtificialRain", "Gap", "Zeros", "Perimeter", "SolveSum", "Smallest"};
    private String msgOnPrevious = "on previous level";
    private String msgTaskToRun = "task to run";

    public void run() {
        cs = new ConsoleScanner(view);
        runner = new Runner(view);
        listCommands();
    }

    public void listCommands() {
        view.chooseId("action", "");
        view.allPoints(1, optionsAllCommands);
        int userInput = cs.readInt();
        switch (userInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Users.printAllUserName();
                break;
            case 2:
                chooseImpl();
                break;
            case 3:
                Task.printAllDescription();
                break;
            default:
                view.inputError();
                chooseImpl();
        }
        listCommands();
    }

    private void chooseImpl() {
        view.chooseId("implementation", msgOnPrevious);
        Users.printAllUserName();
        int userId = cs.readInt();
        switch (userId) {
            case 0:
                listCommands();
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

    private void chooseKata() {
        view.printUser(user);
        view.chooseId("kata", msgOnPrevious);
        view.allPoints(5, nameKatas);
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
        view.printUser(user);
        view.chooseId(msgTaskToRun, msgOnPrevious);
        view.allPoints(1, nameTasksEigth);
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
        view.printUser(user);
        view.chooseId(msgTaskToRun, msgOnPrevious);
        view.allPoints(1, nameTasksSeven);
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
        view.printUser(user);
        view.chooseId(msgTaskToRun, msgOnPrevious);
        view.allPoints(1, nameTasksSix);
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
        view.printUser(user);
        view.chooseId(msgTaskToRun, msgOnPrevious);
        view.allPoints(1, nameTasksFive);
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
