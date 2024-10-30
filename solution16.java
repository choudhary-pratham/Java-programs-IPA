import java.util.*;

class Employee{
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;
    
    Employee(int employeeId,String name,String branch,double rating,boolean companyTransport){
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBranch(){
        return this.branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public double getRating(){
        return this.rating;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public boolean getCompanyTransport(){
        return this.companyTransport;
    }
    public void setCompanyTransport(){
        this.companyTransport = companyTransport;
    }
}

public class solution16 {
    static int findCountOfEmployeesUsingCompTransport(ArrayList<Employee>emp,String branch){
        int count = 0;
        for(Employee e:emp){
            if(e.getBranch().equals(branch) && e.getCompanyTransport() == true){
                count++;
            }
        }
        return count;
    }
    static Employee findEmployeeWithSecondHighestRating(ArrayList<Employee>emp){
        Employee highest = null,secondHighest = null;
        for(Employee e:emp){
            if(e.getCompanyTransport() == false){
                if(highest == null){
                    highest = e;
                }
                else{
                    if(e.getRating()>highest.getRating()){
                        secondHighest = highest;
                        highest = e;
                    }
                    else if(secondHighest.getRating()<e.getRating()){
                        secondHighest = e;
                    }
                }
            }
        }
        return secondHighest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee>emp = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int employeeId = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            boolean companyTransport = Boolean.parseBoolean(sc.nextLine());
            Employee obj = new Employee(employeeId,name,branch,rating,companyTransport);
            emp.add(obj);
        }

        String branch = sc.nextLine();
        int count = findCountOfEmployeesUsingCompTransport(emp,branch);
        Employee ans = findEmployeeWithSecondHighestRating(emp);

        if(count == 0){
            System.out.println("No such Employees");
        }
        else{
            System.out.println(count);
        }

        if(ans == null){
            System.out.println("All Employees using company transport");
        }
        else{
            System.out.printf("%d\n%s",ans.getEmployeeId(),ans.getName());
        }

        sc.close();
    }
}
