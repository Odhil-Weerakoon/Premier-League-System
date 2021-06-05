package lk.PremierLeague.FootballEntity;

public class UniversityFootballClub extends FootballClub{
    private String unifbclubname;

    public UniversityFootballClub(String clubName, String clublocation, String clubType, int goalScored, int goalsReceived, int goalDifference, int totalPoints, int matchesPlayed, int numberofWins, int numberofDraws, int numberofDefeats, String unifbclubname) {
        super(clubName, clublocation, clubType, goalScored, goalsReceived, goalDifference, totalPoints, matchesPlayed, numberofWins, numberofDraws, numberofDefeats);
        unifbclubname = unifbclubname;
    }

    public void setUnifbclubname(String unifbclubname) {

        unifbclubname = unifbclubname;
    }

    public String getUnifbclubname() {

        return unifbclubname;
    }
}



