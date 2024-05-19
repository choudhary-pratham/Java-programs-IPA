public class cricketer {

    private int cricketerId;
    private int matchesPlayed;
    private int totalRuns;
    private String cricketerName;
    private String team;

    cricketer(int cricketerId, int matchesPlayed, int totalRuns, String cricketerName, String team) {
        this.cricketerId = cricketerId;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.cricketerName = cricketerName;
        this.team = team;
    }

    public int getCricketerId() {
        return this.cricketerId;
    }

    public int getMatchesPlayed() {
        return this.matchesPlayed;
    }

    public int getTotalRuns() {
        return this.totalRuns;
    }

    public String getCricketerName() {
        return this.cricketerName;
    }

    public String getTeam() {
        return this.team;
    }

    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
