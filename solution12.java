import java.util.*;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getHeadSetName() {
        return this.headsetName;
    }

    public void setHeadSetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

public class solution12 {
    static int findTotalPriceForGivenBrand(ArrayList<HeadSets> headset, String brand) {
        int ans = 0;
        for (int i = 0; i < headset.size(); i++) {
            if (headset.get(i).getBrand().equalsIgnoreCase(brand)) {
                ans += headset.get(i).getPrice();
            }
        }
        return ans;
    }

    static HeadSets findAvailableHeadsetWithSecondMinPrice(ArrayList<HeadSets> headset) {
        HeadSets ans = null, prev = null;
        int min = (int) 1e9, second_min = (int) 1e9;
        for (int i = 0; i < headset.size(); i++) {
            if (headset.get(i).getAvailable() == true) {
                int price = headset.get(i).getPrice();
                if (min == -1) {
                    min = price;
                    prev = headset.get(i);
                } else if (min > price) {
                    second_min = min;
                    min = price;
                    ans = prev;
                    prev = headset.get(i);
                } else if (second_min > price) {
                    second_min = price;
                    ans = headset.get(i);
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HeadSets> headset = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String headsetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean available = Boolean.parseBoolean(sc.nextLine());
            headset.add(new HeadSets(headsetName, brand, price, available));
        }
        String brand = sc.nextLine();
        int ans = findTotalPriceForGivenBrand(headset, brand);
        HeadSets ansObj = findAvailableHeadsetWithSecondMinPrice(headset);
        if (ans == 0) {
            System.out.println("No Headsets available with the given brand");
        } else {
            System.out.println(ans);
        }
        if (ansObj == null) {
            System.out.println("No Headsets available");
        } else {
            System.out.println(ansObj.getHeadSetName());
            System.out.println(ansObj.getPrice());
        }
        sc.close();
    }
}
