import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public char getGrade() {
        return this.grade;
    }

    public String getDate() {
        return this.date;
    }
}

public class solution11 {
    static ArrayList<Student> findStudentByGradeAndMonth(ArrayList<Student> student, char grade, int month) {
        ArrayList<Student> ans = new ArrayList<Student>();
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getGrade() == grade
                    && Integer.parseInt(student.get(i).getDate().split("/")[1]) == month) {
                ans.add(student.get(i));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.size() - i - 1; j++) {
                if (ans.get(j).getRollNo() > ans.get(j + 1).getRollNo()) {
                    Collections.swap(ans, j, j + 1);
                }
            }
        }
        if (ans.size() == 0)
            return null;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        for (int i = 0; i < 4; i++) {
            int rollNo = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();
            student.add(new Student(rollNo, name, subject, grade, date));
        }
        char grade = sc.nextLine().charAt(0);
        int month = Integer.parseInt(sc.nextLine());
        ArrayList<Student> ans = findStudentByGradeAndMonth(student, grade, month);
        if (ans == null) {
            System.out.println("No Student Found");
        } else {
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(ans.get(i).getName());
                System.out.println(ans.get(i).getSubject());
            }
            System.out.println(ans.size());
        }
        sc.close();
    }
}
