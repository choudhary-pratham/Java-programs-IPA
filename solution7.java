import java.util.*;

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getphoneId() {
        return this.phoneId;
    }

    public void setphoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getos() {
        return this.os;
    }

    public void setos(String os) {
        this.os = os;
    }

    public String getbrand() {
        return this.brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public int getprice() {
        return this.price;
    }

    public void setprice(int price) {
        this.price = price;
    }
}

public class solution7 {
    static int findPriceForGivenBrand(ArrayList<Phone> phone, String brand) {
        int ans = 0;
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getbrand().equalsIgnoreCase(brand)) {
                ans += phone.get(i).getprice();
            }
        }
        return ans;
    }

    static Phone getPhoneIdBasedOnOs(ArrayList<Phone> phone, String os) {
        Phone ans = null;
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getos().equalsIgnoreCase(os) && phone.get(i).getprice() >= 50000) {
                ans = phone.get(i);
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> phone = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int pid = Integer.parseInt(sc.nextLine());
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            phone.add(new Phone(pid, os, brand, price));
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();
        int ans = findPriceForGivenBrand(phone, brand);
        Phone ansObj = getPhoneIdBasedOnOs(phone, os);
        if (ans == 0) {
            System.out.println("The given brand is not available");
        } else {
            System.out.println(ans);
        }
        if (ansObj == null) {
            System.out.println("No phones are available with specified os and price range");
        } else {
            System.out.println(ansObj.getphoneId());
        }
        sc.close();
    }
}