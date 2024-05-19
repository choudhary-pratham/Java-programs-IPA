import java.util.*;

public class solution {
    static cricketer findCricketerWithMinimumMatchesPlayed(ArrayList<cricketer> cric) {
        cricketer c = null;
        int mini = 0;
        for (int i = 0; i < cric.size(); i++) {
            if (cric.get(i).getMatchesPlayed() < mini) {
                mini = cric.get(i).getMatchesPlayed();
                c = cric.get(i);
            }
        }
        return c;
    }

    static cricketer searchCricketerById(ArrayList<cricketer> cric, int id) {
        cricketer c = null;
        for (int i = 0; i < cric.size(); i++) {
            if (cric.get(i).getCricketerId() == id) {
                c = cric.get(i);
            }
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<cricketer> cric = new ArrayList<cricketer>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int cricketerId = Integer.parseInt(sc.nextLine());
            int matchesPlayed = Integer.parseInt(sc.nextLine());
            int totalRuns = Integer.parseInt(sc.nextLine());
            String cricketerName = sc.nextLine();
            String team = sc.nextLine();
            cricketer c = new cricketer(cricketerId, matchesPlayed, totalRuns, cricketerName, team);
            cric.add(c);
        }

        sc.close();
    }
}
