import java.util.*;

class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    int getcarid() {
        return this.carId;
    }

    void setcarId(int carId) {
        this.carId = carId;
    }

    String getbrand() {
        return this.brand;
    }

    void setbrand(String brand) {
        this.brand = brand;
    }

    int getnooftestsconducted() {
        return this.noOfTestsConducted;
    }

    void setnooftestsconducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    int getnooftestspassed() {
        return this.noOfTestsPassed;
    }

    void setnooftestspassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    String getenvironment() {
        return this.environment;
    }

    void setenvironment(String environment) {
        this.environment = environment;
    }

    String getgrade() {
        return this.grade;
    }

    void setgrade(String grade) {
        this.grade = grade;
    }
}

public class solution8 {
    static int findTestPassedByEnv(ArrayList<AutonomousCar> car, String environment) {
        int sum = 0;
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getenvironment().equals(environment)) {
                sum += car.get(i).getnooftestspassed();
            }
        }
        return sum;
    }

    static AutonomousCar updateCarGrade(ArrayList<AutonomousCar> car, String brand) {
        AutonomousCar ans = null;
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getbrand().equals(brand)) {
                ans = car.get(i);
                int rating = (ans.getnooftestspassed() * 100) / ans.getnooftestsconducted();
                if (rating >= 80) {
                    ans.setgrade("A1");
                } else {
                    ans.setgrade("B2");
                }
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<AutonomousCar> car = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int carid = Integer.parseInt(sc.nextLine());
            String brand = sc.nextLine();
            int noOfTestsConducted = Integer.parseInt(sc.nextLine());
            int noOfTestsPassed = Integer.parseInt(sc.nextLine());
            String environment = sc.nextLine();
            car.add(new AutonomousCar(carid, brand, noOfTestsConducted, noOfTestsPassed, environment));
        }
        String environment = sc.nextLine();
        String brand = sc.nextLine();
        System.out.println();
        int ans = findTestPassedByEnv(car, environment);
        AutonomousCar ansObj = updateCarGrade(car, brand);
        if (ans == 0) {
            System.out.println("There are no test passed in the particular environment");
        } else {
            System.out.println(ans);
        }
        if (ansObj == null) {
            System.out.println("No car is available with the specified brand");
        } else {
            System.out.printf("%s::%s", ansObj.getbrand(), ansObj.getgrade());
        }
        sc.close();
    }
}
