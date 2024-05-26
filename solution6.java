import java.util.*;

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getmedicineName() {
        return this.medicineName;
    }

    public void setmedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getbatch() {
        return this.batch;
    }

    public void setbatch(String batch) {
        this.batch = batch;
    }

    public String getdisease() {
        return this.disease;
    }

    public void setdisease(String disease) {
        this.disease = disease;
    }

    public int getprice() {
        return this.price;
    }

    public void setprice(int price) {
        this.price = price;
    }
}

public class solution6 {
    static ArrayList<Integer> getPriceByDisease(ArrayList<Medicine> medicine, String disease) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < medicine.size(); i++) {
            if (medicine.get(i).getdisease().equalsIgnoreCase(disease)) {
                arr.add(medicine.get(i).getprice());
            }
        }
        Collections.sort(arr);
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Medicine> medicine = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            Medicine medObj = new Medicine(medicineName, batch, disease, price);
            medicine.add(medObj);
        }
        String finddisease = sc.nextLine();
        ArrayList<Integer> arr = getPriceByDisease(medicine, finddisease);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}