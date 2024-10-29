import java.util.*;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return this.simId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getRatePerSecond() {
        return this.ratePerSecond;
    }

    public String getCircle() {
        return this.circle;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

class sortByRatePerSecond implements Comparator<Sim> {
    public int compare(Sim a, Sim b) {
        return Double.compare(b.getRatePerSecond() ,a.getRatePerSecond());
    }
}

public class solution15 {
    static ArrayList<Sim> transferCustomerCircle(ArrayList<Sim> sim, String circleOld, String circleNew) {
        ArrayList<Sim> ans = new ArrayList<>();
        for (Sim s : sim) {
            if (s.getCircle().equals(circleOld)) {
                s.setCircle(circleNew);
                ans.add(s);
            }
        }
        Collections.sort(ans, new sortByRatePerSecond());
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sim> sim = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int simId = Integer.parseInt(sc.nextLine());
            String customerName = sc.nextLine();
            double balance = Double.parseDouble(sc.nextLine());
            double ratePerSecond = Double.parseDouble(sc.nextLine());
            String circle = sc.nextLine();
            Sim obj = new Sim(simId, customerName, balance, ratePerSecond, circle);
            sim.add(obj);
        }
        String circleOld = sc.nextLine();
        String circleNew = sc.nextLine();
        ArrayList<Sim> ans = transferCustomerCircle(sim, circleOld, circleNew);
        for (Sim s : ans) {
            System.out.printf("%d %s %s %.1f\n\n", s.getSimId(), s.getCustomerName(), s.getCircle(),
                    s.getRatePerSecond());
        }
        sc.close();
    }
}
