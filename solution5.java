import java.util.*;

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    int getplayerId() {
        return this.playerId;
    }

    void setplayerId(int playerId) {
        this.playerId = playerId;
    }

    String getskill() {
        return this.skill;
    }

    void setskill(String skill) {
        this.skill = skill;
    }

    String getlevel() {
        return this.level;
    }

    void setlevel(String level) {
        this.level = level;
    }

    int getpoints() {
        return this.points;
    }

    void setpoints(int points) {
        this.points = points;
    }
}

public class solution5 {
    static int findPointsForGivenSkill(ArrayList<Player> player, String reqSkill) {
        int ans = 0;
        for (int i = 0; i < player.size(); i++) {
            if (player.get(i).getskill().equals(reqSkill)) {
                ans += player.get(i).getpoints();
            }
        }
        return ans;
    }

    static Player getPlayerBasedOnLevel(ArrayList<Player> player, String reqLevel, String reqSkill) {
        Player p = null;

        for (int i = 0; i < player.size(); i++) {
            if (player.get(i).getskill().equals(reqSkill) && player.get(i).getlevel().equals(reqLevel)
                    && player.get(i).getpoints() >= 20) {
                p = player.get(i);
                break;
            }
        }

        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> player = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int pid = Integer.parseInt(sc.nextLine());
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = Integer.parseInt(sc.nextLine());
            Player pobj = new Player(pid, skill, level, points);
            player.add(pobj);
        }
        String reqSkill = sc.nextLine();
        String reqLevel = sc.nextLine();
        int ans = findPointsForGivenSkill(player, reqSkill);
        Player p = getPlayerBasedOnLevel(player, reqLevel, reqSkill);
        System.out.println();
        if (ans == 0) {
            System.out.println("The given Skill is not available");
        } else {
            System.out.println(ans);
        }
        if (p == null) {
            System.out.println("No player is available with specified level,skill and eligibility points");
        } else {
            System.out.println(p.getplayerId());
        }
        sc.close();
    }
}
