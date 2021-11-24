
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {

                String data = fileScanner.nextLine();

                String[] csv = data.split(",");
                String homeTeam = csv[0];
                String awayTeam = csv[1];
                int homeScore = Integer.parseInt(csv[2]);
                int awayScore = Integer.parseInt(csv[3]);

                Team home = getTeamByName(teams, homeTeam);
                Team away = getTeamByName(teams, awayTeam);

                if (homeScore > awayScore) {
                    home.win();
                    away.lose();
                } else if (awayScore > homeScore) {
                    home.lose();
                    away.win();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teams;
    }

    public static Team getTeamByName(ArrayList<Team> teams, String name) {
        // Check ArrayList to find team with given `name`        
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        Team newTeam = new Team(name);
        teams.add(newTeam);
        return newTeam;
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scan = new Scanner(System.in);

        // Read filename from user
        System.out.println("File: ");
        String file = scan.nextLine();

        // Read team name from user
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        // Create ArrayList<Team> for all teams in `file`
        ArrayList<Team> teams = readRecordsFromFile(file);

        // Find the target team and print their info
        Team targetTeam = getTeamByName(teams, teamName);
        System.out.println(targetTeam);
    }
}
