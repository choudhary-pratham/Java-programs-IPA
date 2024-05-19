import java.util.*;

class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public Employee(int employeeId, String employeeName, int age, char gender, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return this.age;
    }

    public void setEmployeeAge(int age) {
        this.age = age;
    }

    public char getEmployeeGender() {
        return this.gender;
    }

    public void setEmployeeGender(char gender) {
        this.gender = gender;
    }

    public double getEmployeeSalary() {
        return this.salary;
    }

    public void setEmployeeSalary(double salary) {
        this.salary = salary;
    }
}

public class solution2 {
    static Employee getEmployeeWithSecondLowestSalary(ArrayList<Employee> empObj) {
        if (empObj.size() < 2)
            return null;
        Employee secondLowest = null;
        double mini = 1e9, secondMini = 1e9;
        for (int i = 0; i < empObj.size(); i++) {
            double salary = empObj.get(i).getEmployeeSalary();
            if (mini > salary) {
                secondMini = mini;
                secondLowest = empObj.get(i);
                mini = salary;
            } else if (secondMini > salary) {
                secondMini = salary;
                secondLowest = empObj.get(i);
            }
        }
        return secondLowest;
    }

    static int countEmployeesBasedOnAge(ArrayList<Employee> empObj, int age) {
        int ans = 0;
        for (int i = 0; i < empObj.size(); i++) {
            int empAge = empObj.get(i).getEmployeeAge();
            if (empAge == age)
                ans++;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> emp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int empid = Integer.parseInt(sc.nextLine());
            String empname = sc.nextLine();
            int empage = Integer.parseInt(sc.nextLine());
            char gender = sc.nextLine().charAt(0);
            double salary = Double.parseDouble(sc.nextLine());
            Employee obj = new Employee(empid, empname, empage, gender, salary);
            emp.add(obj);
        }
        int findAge = Integer.parseInt(sc.nextLine());
        System.out.println();
        Employee secondLowestSalary = getEmployeeWithSecondLowestSalary(emp);
        int ans = countEmployeesBasedOnAge(emp, findAge);
        if (secondLowestSalary == null) {
            System.out.println("Null");
        } else {
            System.out.printf("%d#%s\n", secondLowestSalary.getEmployeeId(), secondLowestSalary.getEmployeeName());
        }
        if (ans == 0) {
            System.out.println("No employee found for the given age");
        } else {
            System.out.println(ans);
        }
        sc.close();
    }
}
