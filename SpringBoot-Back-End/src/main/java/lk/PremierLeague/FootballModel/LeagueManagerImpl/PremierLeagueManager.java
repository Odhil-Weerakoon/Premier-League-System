package lk.PremierLeague.FootballModel.LeagueManagerImpl;
import lk.PremierLeague.FootballEntity.FootballClub;
import lk.PremierLeague.FootballEntity.MatchesPlayed;
import lk.PremierLeague.FootballModel.LeagueManager;
import org.springframework.stereotype.Component;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
@Component
public class PremierLeagueManager implements LeagueManager {
    public static ArrayList<FootballClub> footballClubs = new ArrayList<>();
    public static ArrayList<MatchesPlayed> matchesPlayed=new ArrayList<>();
    public static ArrayList<MatchesPlayed>matchDateList=new ArrayList<>();


    @Override
    public void addClub() {
        while (true) {
            int numberOfWins;
            int numberOfDraws;
            int numberOfDefeats;
            int numberOfGoals;
            int goalsReceived;
            int goalDifference;
            int totalPoints;
            int matchesPlayed;
            String clubType="Football";
            Scanner input = new Scanner(System.in);


            System.out.println("Enter the name of the  Football club:  "); //Enter the Name of the Football Club
            String clubName= input.nextLine();

            System.out.println("Enter the location of the club:  ");//Enter the Location of the Football Club
            String clubLocation= input.nextLine();

            System.out.println("Enter the number of wins scored by the club:  ");
            if (input.hasNextInt()) {                                              //check whether the input is an Integer
                numberOfWins = input.nextInt();
            }else{
                System.out.println("Please Enter an integer");                      //check whether the input is an Integer
                continue;
            }

            System.out.println("Enter the number of draws scored by the club:  ");
            if (input.hasNextInt()) {                                                  //check whether the input is an Integer
                numberOfDraws = input.nextInt();
            }else {
                System.out.println("Please Enter an integer");                          //check whether the input is an Integer
                continue;
            }


            System.out.println("Enter the number of defeats scored by the club:  ");
            if (input.hasNextInt()) {
                numberOfDefeats = input.nextInt();
            }else{
                System.out.println("Please Enter an integer");
                continue;
            }

            System.out.println("Enter the number of Goals scored by the club:  ");
            if (input.hasNextInt()) {
                numberOfGoals = input.nextInt();
            }else {
                System.out.println("Please Enter an integer");
                continue;
            }

            System.out.println("Enter the number of Goals received by the club:  ");
            if (input.hasNextInt()) {
                goalsReceived = input.nextInt();
            }else {
                System.out.println("Please Enter an integer");
                continue;
            }

            System.out.println("Enter the goal difference:  ");
            if (input.hasNextInt()) {
                goalDifference = input.nextInt();
            }else {
                System.out.println("Please Enter an integer");
                continue;
            }

            System.out.println("Enter the total points scored by the club:  ");
            if (input.hasNextInt()) {
                totalPoints = input.nextInt();
            }else {
                System.out.println("Please Enter an integer");
                continue;
            }

            System.out.println("Enter the number of matches played by the club:  ");
            if (input.hasNextInt()) {
                matchesPlayed = input.nextInt();
            }else {
                System.out.println(" Please Enter an integer");
                continue;
            }


            FootballClub footballClub=new FootballClub(clubName,clubLocation,clubType,numberOfGoals,goalsReceived,goalDifference,totalPoints,matchesPlayed,numberOfWins,numberOfDraws,numberOfDefeats); //Create a Football object and adding the details Taken by the user
            footballClubs.add(footballClub);   //Add the Football Object to the Arraylist
            System.out.println("Club has been successfully added to the Premier League");
            System.out.println();
            break;

        }
    }

    @Override
    public void deleteClub() {
        Scanner input = new Scanner(System.in);
        boolean deleteClub = false;
        System.out.println("Enter the name of the club you want to delete:  ");
        String clubName= input.next();
        for (int i = 0; i < footballClubs.size(); i++){
            if (footballClubs.get(i).getClubName().equalsIgnoreCase(clubName)){   //Checks whether the Entered football club is already existing in the arraylist or not
                footballClubs.remove(footballClubs.get(i));
                deleteClub = true;
            }
        }
        if(deleteClub){
            System.out.println("The Club "+clubName+" was deleted successfully!");  //If yes the club is been deleted successfully
        }else{
            System.out.println("No club was found by the name "+clubName+",Please Enter a Club that Already exist in the Premier League"); //If not display error message to enter a club in the Premier League
        }
    }

    @Override
    public void statisticsTable() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the club to see club statistics:  ");
        String clubName= input.nextLine();
        boolean clubFound = false; //Assign club found as false

        for (FootballClub clubs : footballClubs){
            String club = clubs.getClubName();
            if (club.equalsIgnoreCase(clubName)){ //checks whether the entered club name is existing in the arraylist or not
                System.out.println("Club Name - " + clubName +'\n'
                        + "Club Location - "+ clubs.getClubLocation() + '\n'
                        + "Club Type - "+ clubs.getClubType() + '\n'
                        + "No of Goals Scored - "+ clubs.getGoalScored() + '\n'
                        + "No of Wins - " + clubs.getNumberOfWins() +'\n'
                        + "No of Defeats - " + clubs.getNumberOfDefeats() +'\n'
                        + "No of Draws - "+ clubs.getNumberOfDraws() + '\n'
                        + "No of Matches Played - "+ clubs.getMatchesPlayed() + '\n'
                        + "Total Points of the Club - "+ clubs.getTotalPoints() + '\n'
                        + "Goal Difference - " + clubs.getGoalDifference() +'\n'
                        + "No of Goals Received - " + clubs.getGoalsReceived() +'\n');
                clubFound=true; //if club is found then assign club found as true
            }
        }
        if(!clubFound){
            System.out.println("Please enter a Valid Club Name to Display Statistics"); //if club is not found then display error message
        }
    }


    public void premierLeagueTable() {
        if(footballClubs.size()!=0){ //Checks whether the Arraylist containing football clubs is empty or not
            Collections.sort(PremierLeagueManager.footballClubs, (o1, o2) -> {  //Sort the arraylist containing Premier League in descending order of points
                int firstTot = o1.getTotalPoints();
                int secondTot = o2.getTotalPoints();
                if(firstTot==secondTot){  //If any of the  two total points are equal then the Arraylist is sorted according to the goal difference
                    int firstGoalDif = o1.getGoalDifference();
                    int secondGoalDif = o2.getGoalDifference();
                    return Integer.compare(secondGoalDif,firstGoalDif);
                }
                else{
                    return Integer.compare(secondTot,firstTot); //If the two total points are different ,then the Arraylist is sorted according to the total points
                }
            });

            System.out.println("//////////Premier League Table//////////");

            System.out.printf("%n%-20s%-20s%-20s%-25s%-20s%-20s%-20s%-25s%-28s%-27s%-25s","Club Name","Club Location",
                    "Club Type","No of Goals Scored","No of Wins","No of Defeats","No of Draws","No of Matches Played"
                            ,"Total Points of the Club","Goals Difference","No of Goals Received"); //Creating the Table columns with the required spaces

            for (FootballClub footballClub : footballClubs){
                System.out.printf("%n%-20s%-20s%-20s%-25d%-20d%-20d%-20d%-25d%-28d%-+27d%-25d",footballClub.getClubName(),footballClub.getClubLocation(),
                        footballClub.getClubType(),footballClub.getGoalScored(),footballClub.getNumberOfWins(),footballClub.getNumberOfDefeats(),footballClub.getNumberOfDraws(),
                        footballClub.getMatchesPlayed(),footballClub.getTotalPoints(),footballClub.getGoalDifference(),footballClub.getGoalsReceived()); //Adding the Table rows taking the data from the premier league arraylist
                System.out.println();
                System.out.println();

            }
        }
        else{
            System.out.println("PLease Enter Football Clubs and there statistics"); //If the arraylist containing the premier league clubs is empty ,display error message telling user to add some clubs first
        }
    }

    @Override
    public void premierLeagueGui() {
        System.out.println("Gui Starting Now..");                   //Method to request and Open LocalHost 4200 and launch GUI
        System.setProperty("java.awt.headless", "false");
        try {
            Desktop.getDesktop().browse(URI.create("http://localhost:4200"));
        } catch (IOException e) {
            System.out.println("Couldn't launch the GUI! Please visit http://localhost:4200 on you web browser");
        }
    }

    @Override
    public void saveData() {
        File premierLeagueFile=new File("PremierLeagueTable.text"); //creating file to store premier league clubs details
        File matchesPlayedFile=new File("MatchesPlayed.text");//creating file to store the played match details
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream1;
        ObjectOutputStream objectOutputStream1;


        try{
            fileOutputStream=new FileOutputStream(premierLeagueFile);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(footballClubs);    //writing the  premier league arraylist to the file

        } catch (FileNotFoundException e){
            System.out.println("Cannot save file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try{
            fileOutputStream1=new FileOutputStream(matchesPlayedFile);
            objectOutputStream1=new ObjectOutputStream(fileOutputStream1);
            objectOutputStream1.writeObject(matchesPlayed);    //writing the matches played arraylist to the file

        } catch (FileNotFoundException e){
            System.out.println("Cannot save file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadData() throws IOException,ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream("PremierLeagueTable.text");
        ObjectInputStream ois = new ObjectInputStream(fileInput);
        FileInputStream fileInputStream = new FileInputStream("MatchesPlayed.text");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

       for(;;) {
            try {
                ArrayList<FootballClub> footballDetails = (ArrayList<FootballClub>) ois.readObject();// reading the arraylist data from the file
                footballClubs.addAll(footballDetails);     //Loading and adding the premier league football clubs to the arraylist
                ArrayList<MatchesPlayed> matchesPlayedDetails = (ArrayList<MatchesPlayed>) objectInputStream.readObject(); // reading the arraylist data from the file
                matchesPlayed.addAll(matchesPlayedDetails);//Loading and adding the Matches played  to the Arraylist
            }
            catch(EOFException e) {
                break;
            }
        }
    }

    @Override
    public void playedMatch()  {
        Scanner input=new Scanner(System.in);
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        boolean checkFirstClub=false;
        boolean checkSecondClub=false;
        String result;
        LocalDate localDate;
        int goalsScored1;
        int goalsScored2;

        while (true){                           //Checking inside whether the date format entered by the user is correct
            System.out.print("Enter the date of the played match in the Format dd/MM/yyyy: ");
            String matchDate=input.nextLine();
            try{
                DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
               localDate=LocalDate.parse(matchDate,dateTimeFormatter);
               break;

            } catch (DateTimeParseException e) {
                System.out.println("Enter a Valid Date in the Required Format");  //If the entered date format is wrong display error message and ask user to renter the date.
            }
        }


        System.out.print("Enter the Name of the first  Football club: ");
        String firstClubName = first.nextLine();

        System.out.print("Enter the Name of the second  Football club: ");
        String secondClubName = second.nextLine();


        for (FootballClub footballClub : footballClubs) {         //Checks whether the two names entered by the user already exist in the premier league or not
            if(footballClub.getClubName().equalsIgnoreCase(firstClubName)){
                checkFirstClub=true;
            }
            else if(footballClub.getClubName().equalsIgnoreCase(secondClubName)){
                checkSecondClub=true;
            }
        }

        if(!checkFirstClub || !checkSecondClub){
            if(!checkFirstClub && !checkSecondClub){
                System.out.println("The Two Teams are not in the Premier League,Please Enter two Teams in the Premier League");  //If the two teams entered by the user are not in the premier league arraylist then display message to enter two teams in the premier league
            }
            else{
                System.out.println("Please Enter two Teams in the Premier League");
            }
        }
        else{
            while(true){
                try{                                                                                          //validating the user input for the goals scored by the two teams
                    Scanner firstTeam=new Scanner(System.in);
                    System.out.print("Enter the number goals scored by the first club:  ");
                    goalsScored1=firstTeam.nextInt() ;
                    if(goalsScored1>=0){
                        break;
                    }
                    else{
                        System.out.println("Please Enter a valid score");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please Enter an Integer");
                }
            }

            while(true){                                                                                        //validating the user input for the goals scored by the two teams
                try{
                    Scanner secondTeam=new Scanner(System.in);
                    System.out.print("Enter the number goals scored by the second club:  ");
                    goalsScored2 =secondTeam.nextInt();
                    if(goalsScored2>=0){
                        break;
                    }
                    else{
                        System.out.println("Please Enter a valid score");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please Enter an Integer");
                }
            }



            if (goalsScored1>goalsScored2){                                                     //Checking  goals scored by the two teams and assigning to the result
                result=firstClubName+"  "+" Won the Match ";
            }
            else if(goalsScored1==goalsScored2){
                result="The Match is a Draw";
            }
            else{
                result=secondClubName+" "+"Won the Match";
            }

            for (FootballClub footballClub : footballClubs) {
                if (footballClub.getClubName().equalsIgnoreCase(firstClubName)) {               //updating the Premier league table and the details of the two clubs that played the match
                    footballClub.setGoalScored(footballClub.getGoalScored()+goalsScored1);

                    if (goalsScored1>goalsScored2){
                        footballClub.setNumberOfWins(footballClub.getNumberOfWins()+1);
                        footballClub.setTotalPoints(footballClub.getTotalPoints()+3);
                    }
                    else if(goalsScored1==goalsScored2){
                        footballClub.setNumberOfDraws(footballClub.getNumberOfDraws()+1);
                        footballClub.setTotalPoints(footballClub.getTotalPoints()+1);
                    }
                    else{
                        footballClub.setNumberOfDefeats(footballClub.getNumberOfDefeats()+1);
                    }

                }
                else if (footballClub.getClubName().equalsIgnoreCase(secondClubName)) {
                    footballClub.setGoalScored(footballClub.getGoalScored()+goalsScored2);
                    if (goalsScored2>goalsScored1){
                        footballClub.setNumberOfWins(footballClub.getNumberOfWins()+1);
                        footballClub.setTotalPoints(footballClub.getTotalPoints()+3);
                    }
                    else if(goalsScored2==goalsScored1){
                        footballClub.setNumberOfDraws(footballClub.getNumberOfDraws()+1);
                        footballClub.setTotalPoints(footballClub.getTotalPoints()+1);
                    }
                    else{
                        footballClub.setNumberOfDefeats(footballClub.getNumberOfDefeats()+1);
                    }
                }
            }
            MatchesPlayed matchPlayed=new MatchesPlayed(localDate,firstClubName,secondClubName,goalsScored1,goalsScored2,result); //creating an Matches Played object
            matchesPlayed.add(matchPlayed);  //Adding the object to the matches played arraylist
            System.out.println("Details of the Match Played between "+firstClubName+" and "+secondClubName+" are updated Successfully");
            System.out.println();
        }
    }
}

