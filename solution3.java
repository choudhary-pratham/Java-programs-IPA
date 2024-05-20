import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDesignation() {
        return this.designation;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    double getSalary() {
        return this.salary;
    }
}

class Company {
    private String companyName;
    private ArrayList<Employee> empArr = new ArrayList<Employee>();
    private int numEmployees;

    Company(String companyName, ArrayList<Employee> empArr, int numEmployees) {
        this.companyName = companyName;
        this.empArr = empArr;
        this.numEmployees = numEmployees;
    }

    double getAverageSalary() {
        double avgSal = 0;
        int n = empArr.size();
        for (int i = 0; i < n; i++) {
            avgSal += empArr.get(i).getSalary();
        }
        avgSal = avgSal / n;
        return avgSal;
    }

    double getMaxSalary() {
        double maxSal = 0;
        int n = empArr.size();
        for (int i = 0; i < n; i++) {
            maxSal = Math.max(maxSal, empArr.get(i).getSalary());
        }
        return maxSal;
    }

    ArrayList<Employee> getEmployeesByDesignation(String designation) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        int n = empArr.size();
        for (int i = 0; i < n; i++) {
            String desig = empArr.get(i).getDesignation();
            if (desig.equalsIgnoreCase(designation) == true)
                emp.add(empArr.get(i));
        }
        return emp;
    }

}

public class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        String compName = sc.nextLine();
        System.out.print("Enter number of employees: ");
        int numEmp = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee details:\n");
        ArrayList<Employee> emp = new ArrayList<>();
        for (int i = 0; i < numEmp; i++) {
            System.out.printf("Employee %d:\n", i + 1);
            System.out.print("Enter id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter desgination: ");
            String designation = sc.nextLine();
            System.out.print("Enter salary: ");
            Double salary = Double.parseDouble(sc.nextLine());
            Employee obj = new Employee(id, name, designation, salary);
            emp.add(obj);
        }
        Company cmp = new Company(compName, emp, numEmp);
        Double avgSalary = cmp.getAverageSalary();
        System.out.printf("Average Salary: %.1f\n", avgSalary);
        double maxSalary = cmp.getMaxSalary();
        System.out.printf("Max Salary: %.1f\n", maxSalary);
        System.out.print("Employee with designation: ");
        String designation = sc.nextLine();
        ArrayList<Employee> empWithDesignation = cmp.getEmployeesByDesignation(designation);
        for (int i = 0; i < empWithDesignation.size(); i++) {
            System.out.printf("ID: %d, Name: %s, Designation: %s, Salary: %.1f\n", empWithDesignation.get(i).getId(),
                    empWithDesignation.get(i).getName(), empWithDesignation.get(i).getDesignation(),
                    empWithDesignation.get(i).getSalary());
        }
        sc.close();
    }
}
