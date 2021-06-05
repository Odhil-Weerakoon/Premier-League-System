package lk.PremierLeague;
import lk.PremierLeague.FootballModel.LeagueManagerImpl.PremierLeagueManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
@RestController

public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    private PremierLeagueManager obj;


    public static void main(String[] args)  {
        SpringApplication.run(ConsoleApplication.class, args);
    }



    @Override
    public void run(String... args) {
        Scanner input = new Scanner(System.in);


        try {
            obj.loadData();
            System.out.println();
            System.out.println("Data Loaded Successfully");
        } catch (IOException e) {
            System.out.println("No Data to Load From File");
        } catch (ClassNotFoundException e) {
            System.out.println("Error!!");
        }
        System.out.println();

        while (true) {
            System.out.println("enter \"A\" to add a Football Club");
            System.out.println("enter \"D\" to delete a Football Club");
            System.out.println("enter \"T\" to  Display Statistics");
            System.out.println("enter \"P\" to  Display Premier League Table");
            System.out.println("enter \"M\" to  Add the Details of a Played Match");
            System.out.println("enter \"G\" to  Launch GUI");
            System.out.println("enter \"S\" to Save all the Details");
            System.out.println("enter \"Q\" to quit the program");
            System.out.print("Enter the option you choose out of the following:");
            String option = input.next();

            if (option.equalsIgnoreCase("A")) {
                obj.addClub();
            } else if (option.equalsIgnoreCase("D")) {
                obj.deleteClub();
            } else if (option.equalsIgnoreCase("T")) {
                obj.statisticsTable();
            } else if (option.equalsIgnoreCase("P")) {
                obj.premierLeagueTable();
            } else if (option.equalsIgnoreCase("M")) {
                obj.playedMatch();
            }
            else if (option.equalsIgnoreCase("G")) {
                obj.premierLeagueGui();
                System.out.println();
            }else if (option.equalsIgnoreCase("S")) {
                obj.saveData();
                System.out.println("Data has been saved Successfully");
                System.out.println();
            } else if (option.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for using our System");
                System.exit(0);
            } else {
                System.out.println("Invalid option Chosen,PLease choose and re-enter a valid choice");
                System.out.println();
            }
        }
    }
}

