import java.util.*;

class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public int getResortId() {
        return this.resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return this.resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

public class solution13 {
    static int findAvgPriceByCategory(ArrayList<Resort> resort, String category) {
        int avg = 0, count = 0;
        for (int i = 0; i < resort.size(); i++) {
            if (resort.get(i).getCategory().equalsIgnoreCase(category) && resort.get(i).getRating() > 4) {
                avg += resort.get(i).getPrice();
                count++;
            }
        }
        if (count != 0)
            avg = avg / count;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Resort> resort = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int resortId = Integer.parseInt(sc.nextLine());
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            double rating = Double.parseDouble(sc.nextLine());
            resort.add(new Resort(resortId, resortName, category, price, rating));
        }
        String category = sc.nextLine();
        int ans = findAvgPriceByCategory(resort, category);
        if (ans == 0) {
            System.out.println("There are no such available resort");
        } else {
            System.out.printf("Average price of the 3 Star Resort:%d", ans);
        }
        sc.close();
    }
}
