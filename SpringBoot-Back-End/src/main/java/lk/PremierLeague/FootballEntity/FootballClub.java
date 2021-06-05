package lk.PremierLeague.FootballEntity;

import java.io.Serializable;

public class FootballClub extends SportsClub implements Serializable {

    private int goalScored;
    private int goalsReceived;
    private int goalDifference;
    private int totalPoints;
    private int matchesPlayed;
    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;

    public FootballClub(String clubName, String clubLocation, String clubType, int goalScored, int goalsReceived, int goalDifference, int totalPoints, int matchesPlayed, int numberOfWins, int numberOfDraws, int numberOfDefeats) {
        super(clubName, clubLocation, clubType);
        this.goalScored = goalScored;
        this.goalsReceived = goalsReceived;
        this.goalDifference = goalDifference;
        this.totalPoints = totalPoints;
        this.matchesPlayed = matchesPlayed;
        this.numberOfWins = numberOfWins;
        this.numberOfDraws = numberOfDraws;
        this.numberOfDefeats = numberOfDefeats;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public void setNumberOfDraws(int numberOfDraws) {
        this.numberOfDraws = numberOfDraws;
    }

    public int getNumberOfDefeats() {
        return numberOfDefeats;
    }

    public void setNumberOfDefeats(int numberOfDefeats) {
        this.numberOfDefeats = numberOfDefeats;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "goalScored=" + goalScored +
                ", goalsReceived=" + goalsReceived +
                ", goalDifference=" + goalDifference +
                ", totalPoints=" + totalPoints +
                ", matchesPlayed=" + matchesPlayed +
                ", numberOfWins=" + numberOfWins +
                ", numberOfDraws=" + numberOfDraws +
                ", numberOfDefeats=" + numberOfDefeats +
                '}';
    }
}
