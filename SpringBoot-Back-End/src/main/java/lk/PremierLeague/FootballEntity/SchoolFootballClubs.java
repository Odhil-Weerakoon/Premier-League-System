package lk.PremierLeague.FootballEntity;

public class SchoolFootballClubs extends FootballClub{
    private String schoolfbClubName;

    public SchoolFootballClubs(String clubName, String clublocation, String clubType, int goalScored, int goalsReceived, int goalDifference, int totalPoints, int matchesPlayed, int numberofWins, int numberofDraws, int numberofDefeats, String schoolfbClubName) {
        super(clubName, clublocation, clubType, goalScored, goalsReceived, goalDifference, totalPoints, matchesPlayed, numberofWins, numberofDraws, numberofDefeats);
        this.schoolfbClubName = schoolfbClubName;
    }

    public void setSchoolfbclubname(String schoolfbclubname)
    {
        schoolfbClubName= schoolfbclubname;
    }

    public String getSchoolfbclubname() {
        return schoolfbClubName;

    }
}


