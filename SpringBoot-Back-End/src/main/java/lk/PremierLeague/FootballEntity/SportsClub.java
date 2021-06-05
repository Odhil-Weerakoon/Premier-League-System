package lk.PremierLeague.FootballEntity;
import java.io.Serializable;

public class SportsClub implements Comparable, Serializable {
    private String clubName;
    private String clubLocation;
    private String clubType;

    public SportsClub(String clubName, String clubLocation, String clubType) {
        this.clubName = clubName;
        this.clubLocation = clubLocation;
        this.clubType = clubType;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    public String getClubType() {
        return clubType;
    }

    public void setClubType(String clubType) {
        this.clubType = clubType;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}


