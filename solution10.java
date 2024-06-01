import java.util.*;

class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted,
            String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselId() {
        return this.vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return this.vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return this.noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return this.noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassification() {
        return this.classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}

public class solution10 {
    static int findAvgVoyagesByPct(ArrayList<NavalVessel> naval, int percentage) {
        int ans = 0, count = 0;
        for (int i = 0; i < naval.size(); i++) {
            int per = (naval.get(i).getNoOfVoyagesCompleted() * 100) / naval.get(i).getNoOfVoyagesPlanned();
            if (per == percentage) {
                ans += naval.get(i).getNoOfVoyagesCompleted();
                count++;
            }
        }
        if (count == 0)
            return 0;
        return (ans / count);
    }

    static NavalVessel findVesselByGrade(ArrayList<NavalVessel> naval, String purpose) {
        NavalVessel ans = null;
        for (int i = 0; i < naval.size(); i++) {
            if (naval.get(i).getPurpose().equalsIgnoreCase(purpose)) {
                ans = naval.get(i);
                int per = (naval.get(i).getNoOfVoyagesCompleted() * 100) / naval.get(i).getNoOfVoyagesPlanned();
                if (per == 100) {
                    naval.get(i).setClassification("Star");
                } else if (per >= 80 && per <= 99) {
                    naval.get(i).setClassification("Leader");
                } else if (per >= 55 && per <= 79) {
                    naval.get(i).setClassification("Inspirer");
                } else {
                    naval.get(i).setClassification("Striver");
                }
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NavalVessel> naval = new ArrayList<NavalVessel>();
        for (int i = 0; i < 4; i++) {
            int vesselId = Integer.parseInt(sc.nextLine());
            String vesselName = sc.nextLine();
            int noOfVoyagesPlanned = Integer.parseInt(sc.nextLine());
            int noOfVoyagesCompleted = Integer.parseInt(sc.nextLine());
            String purpose = sc.nextLine();
            naval.add(new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose));
        }
        int percentage = Integer.parseInt(sc.nextLine());
        String purpose = sc.nextLine();
        int ans = findAvgVoyagesByPct(naval, percentage);
        NavalVessel n = findVesselByGrade(naval, purpose);
        if (ans == 0) {
            System.out.println("Nothing found as such!");
        } else {
            System.out.println(ans);
        }
        if (n == null) {
            System.out.println("No Naval Vessel is available with the specified purpose");
        } else {
            System.out.print(n.getVesselName() + "%");
            System.out.print(n.getClassification());
        }
        sc.close();
    }
}
