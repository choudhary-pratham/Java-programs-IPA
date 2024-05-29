import java.util.*;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void getMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

public class solution9 {
    static ArrayList<Movie> getMovieByGenre(ArrayList<Movie> movie, String searchGenre) {
        ArrayList<Movie> ans = new ArrayList<Movie>();
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getGenre().equalsIgnoreCase(searchGenre)) {
                ans.add(movie.get(i));
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = Integer.parseInt(sc.nextLine());
            arr.add(new Movie(movieName, company, genre, budget));
        }
        String searchGenre = sc.nextLine();
        ArrayList<Movie> ans = getMovieByGenre(arr, searchGenre);
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i).getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
        sc.close();
    }
}
