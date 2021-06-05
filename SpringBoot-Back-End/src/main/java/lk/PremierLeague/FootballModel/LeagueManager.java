package lk.PremierLeague.FootballModel;
import java.io.IOException;
import java.text.ParseException;


public interface LeagueManager {
    void addClub();
    void deleteClub();
    void statisticsTable();
    void saveData() throws IOException;
    void loadData() throws IOException, ClassNotFoundException;
    void playedMatch() throws ParseException;
    void premierLeagueTable();
    void premierLeagueGui();
}
