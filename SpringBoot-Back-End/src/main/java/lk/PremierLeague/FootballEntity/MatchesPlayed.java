package lk.PremierLeague.FootballEntity;
import java.io.Serializable;
import java.time.LocalDate;

public class MatchesPlayed implements Serializable {
    private LocalDate matchDate;
    private String firstClub;
    private String secondClub;
    private int firstClubGoals;
    private int secondClubGoals;
    private String result;

    public MatchesPlayed(LocalDate matchDate, String firstClub, String secondClub, int firstClubGoals, int secondClubGoals, String result) {
        this.matchDate = matchDate;
        this.firstClub = firstClub;
        this.secondClub = secondClub;
        this.firstClubGoals = firstClubGoals;
        this.secondClubGoals = secondClubGoals;
        this.result = result;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getFirstClub() {
        return firstClub;
    }

    public void setFirstClub(String firstClub) {
        this.firstClub = firstClub;
    }

    public String getSecondClub() {
        return secondClub;
    }

    public void setSecondClub(String secondClub) {
        this.secondClub = secondClub;
    }

    public int getFirstClubGoals() {
        return firstClubGoals;
    }

    public void setFirstClubGoals(int firstClubGoals) {
        this.firstClubGoals = firstClubGoals;
    }

    public int getSecondClubGoals() {
        return secondClubGoals;
    }

    public void setSecondClubGoals(int secondClubGoals) {
        this.secondClubGoals = secondClubGoals;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MatchesPlayed{" +
                "matchDate=" + matchDate +
                ", firstClub='" + firstClub + '\'' +
                ", secondClub='" + secondClub + '\'' +
                ", firstClubGoals=" + firstClubGoals +
                ", secondClubGoals=" + secondClubGoals +
                ", result='" + result + '\'' +
                '}';
    }
}


