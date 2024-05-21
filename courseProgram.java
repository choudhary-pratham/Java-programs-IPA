import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getcourseId() {
        return this.courseId;
    }

    public void setcourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getcourseName() {
        return this.courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcourseAdmin() {
        return this.courseAdmin;
    }

    public void setcourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getquiz() {
        return this.quiz;
    }

    public void setquiz(int quiz) {
        this.quiz = quiz;
    }

    public int gethandson() {
        return this.handson;
    }

    public void sethandson(int handson) {
        this.handson = handson;
    }
}

public class courseProgram {
    static int findAvgOfQuizByAdmin(ArrayList<Course> courses, String courseAdmin) {
        int avg = 0;
        int count = 0;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseAdmin().equalsIgnoreCase(courseAdmin)) {
                avg += courses.get(i).getquiz();
                count++;
            }
        }
        if (count == 0)
            return 0;
        avg = avg / count;
        return avg;
    }

    static ArrayList<Course> sortCourseByHandsOn(ArrayList<Course> courses, int val) {
        ArrayList<Course> c = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).gethandson() < val) {
                c.add(courses.get(i));
            }
        }
        int size = c.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (c.get(i).gethandson() > c.get(i + 1).gethandson()) {
                    Collections.swap(c, i, i + 1);
                }
            }
        }
        if (c.size() == 0)
            return null;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> carr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int cid = Integer.parseInt(sc.nextLine());
            String cname = sc.nextLine();
            String cadmin = sc.nextLine();
            int quiz = Integer.parseInt(sc.nextLine());
            int handson = Integer.parseInt(sc.nextLine());
            Course temp = new Course(cid, cname, cadmin, quiz, handson);
            carr.add(temp);
        }
        String cadmin = sc.nextLine();
        int ans = findAvgOfQuizByAdmin(carr, cadmin);
        int chandson = Integer.parseInt(sc.nextLine());
        ArrayList<Course> ans1 = sortCourseByHandsOn(carr, chandson);
        System.out.println();
        if (ans == 0) {
            System.out.println("No Course found");
        } else {
            System.out.println(ans);
        }
        if (ans1 == null) {
            System.out.println("No course found with mentioned attribute");
        } else {
            for (int i = 0; i < ans1.size(); i++) {
                System.out.println(ans1.get(i).getcourseName());
            }
        }
        sc.close();
    }
}
