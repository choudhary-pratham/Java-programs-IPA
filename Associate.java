public class Associate {
    private int id;
    private String name;
    private double scores;
    private int experience;

    Associate(int id, String name, double scores, int experience) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.experience = experience;
    }

    public int getid() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getScores() {
        return this.scores;
    }

    public int getExperience() {
        return this.experience;
    }
}