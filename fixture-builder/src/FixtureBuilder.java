import java.util.*;

public class FixtureBuilder {
    private String name;
    private int round;
    protected static Random rnd = new Random();


    public FixtureBuilder(String name, int round) {
        this.name = name;
        this.round = round;
    }

    public static List<Team> readUserInput() {
        List<Team> teams = new ArrayList<>();
        System.out.println(" Teams ");
        Scanner input = new Scanner(System.in);
        while (true) {
            String line = input.nextLine();
            if (" ".equalsIgnoreCase(line)) {
                break;
            }
            teams.add(new Team(line));
        }
        return teams;
    }

    public static Team randomTeam(List<Team> list, int startIndex, int lastIndex) {
        if (lastIndex != list.size() - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int randomNumber = rnd.nextInt(lastIndex - startIndex + 1) + startIndex;

        Team random = list.get(randomNumber);
        if (!random.isInFixture) {
            random.isInFixture = true;
            return random;
        }

        List<Team> tempList = new ArrayList<>(list);
        tempList.remove(random);

        return randomTeam(tempList, startIndex, (lastIndex - 1));
    }


    public static void getRandomTeams(List<Team> list) {
        HashMap<String, String> matches = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int startIndex = i + 1;
            int lastIndex = list.size() - 1;
            Team chosen = list.get(i);

            if(startIndex == lastIndex || chosen.isInFixture){
               continue;
            }

            Team random = randomTeam(list, startIndex,lastIndex);
            matches.put(chosen.teamName,random.teamName);
            chosen.isInFixture = true;

        }
        matches.forEach((key,value) -> {
            System.out.println(key + " vs " + value);
        });

    }

    public static void randomMatches(List<Team> list){

        for(int i = 0; i<list.size() - 1; i++){
            System.out.println("Round " + (i+1));
            getRandomTeams(new ArrayList<Team>(list));
            

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
