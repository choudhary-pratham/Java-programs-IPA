import java.util.*;

class Employee {
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    int getemployeeId() {
        return this.employeeId;
    }

    void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    String getname() {
        return this.name;
    }

    void setname(String name) {
        this.name = name;
    }

    String getbranch() {
        return this.branch;
    }

    void setbranch(String branch) {
        this.branch = branch;
    }

    double getrating() {
        return this.rating;
    }

    void setrating(double rating) {
        this.rating = rating;
    }

    boolean getcompanyTransport() {
        return this.companyTransport;
    }

    void setcompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}

public class solution4 {
    static int findCountOfEmployeesUsingCompTransport(ArrayList<Employee> emp, boolean isUsingCompanyTransport) {
        int ans = 0;
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getcompanyTransport() == isUsingCompanyTransport)
                ans++;
        }
        return ans;
    }

    static Employee findEmployeeWithSecondHighestRating(ArrayList<Employee> emp) {
        Employee highest = null;
        Employee secondHighest = null;
        double first = -1, second = -1;
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getcompanyTransport() == false) {
                double rating = emp.get(i).getrating();
                if (first == -1) {
                    first = rating;
                    highest = emp.get(i);
                } else if (first < rating) {
                    second = first;
                    secondHighest = highest;
                    first = rating;
                    highest = emp.get(i);
                } else if (second < rating) {
                    second = rating;
                    secondHighest = emp.get(i);
                }
            }
        }
        return secondHighest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<Employee>();
        for (int i = 0; i < 4; i++) {
            int empid = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            boolean companyTransport = Boolean.parseBoolean(sc.nextLine());
            Employee empobj = new Employee(empid, name, branch, rating, companyTransport);
            emp.add(empobj);
        }
        boolean check = Boolean.parseBoolean(sc.nextLine());
        int count = findCountOfEmployeesUsingCompTransport(emp, check);

        Employee second = findEmployeeWithSecondHighestRating(emp);

        System.out.println();
        System.out.println(count);
        System.out.println(second.getemployeeId());
        System.out.println(second.getname());
        sc.close();
    }
}
