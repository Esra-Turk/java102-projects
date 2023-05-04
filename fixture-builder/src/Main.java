import java.util.List;

class Team{
    String teamName;
    boolean isInFixture = false;

    public Team(String teamName) {
        this.teamName = teamName;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Team> teams = FixtureBuilder.readUserInput();
        if(teams.size() % 2 != 0){
            teams.add(new Team("Bay"));
        }

        FixtureBuilder.randomMatches(teams);
    }
}