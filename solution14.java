import java.util.*;
class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;

    Resort(int resortId,String resortName,String category,double resortPrice,double resortRating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
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

    public double getResortPrice() {
        return this.resortPrice;
    }

    public void setResortPrice(double resortPrice) {
        this.resortPrice = resortPrice;
    }

    public double getResortRating() {
        return this.resortRating;
    }

    public void setResortRating(double resortRating) {
        this.resortRating = resortRating;
    }
}

public class solution14 {
    static int findAvgPrice(ArrayList<Resort>resort,String category){
        double sum = 0;
        int count = 0;
        for(Resort r:resort){
            if(r.getCategory().equalsIgnoreCase(category) && r.getResortRating()>4){
                sum += r.getResortPrice();
                count++;
            }
        }
        if(count == 0) return 0;
        return ((int)sum/count);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Resort>resort = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int resortId = Integer.parseInt(sc.nextLine());
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double resortPrice = Double.parseDouble(sc.nextLine());
            double resortRating = Double.parseDouble(sc.nextLine());
            Resort obj = new Resort(resortId,resortName,category,resortPrice,resortRating);
            resort.add(obj);
        }
        String category = sc.nextLine();
        int ans = findAvgPrice(resort, category);
        if(ans == 0){
            System.out.println("No such Resort found");
        }
        else{
            System.out.printf("The average price of %s:%d",category,ans);
        }
        sc.close();
    }
}
