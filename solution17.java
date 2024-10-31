import java.util.*;

class Course{
    private String courseName;
    private int courseNumber;
    private String mode;
    private boolean shareData;

    Course(String courseName,int courseNumber,String mode,boolean shareData){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.mode = mode;
        this.shareData = shareData;
    }

    public String getCourseName(){
        return this.courseName;
    }
    public int getCourseNumber(){
        return this.courseNumber;
    }
    public String getMode(){
        return this.mode;
    }
    public boolean getShareData(){
        return this.shareData;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    public void setMode(String mode){
        this.mode = mode;
    }
    public void setShareData(boolean shareData){
        this.shareData = shareData;
    }
}

public class solution17 {
    static String findCourseStatus(ArrayList<Course>course,String courseName){
        String ans = "No course found";
        for(Course c:course){
            if(c.getCourseName().equalsIgnoreCase(courseName) == true){
                int courseNumber = c.getCourseNumber();
                if(courseNumber>=1000) ans = "High";
                else if(courseNumber>=500 && courseNumber<1000) ans = "Medium";
                else ans = "Low";
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Course>course = new ArrayList<>();
        for(int i = 0;i<4;i++){
            String courseName = sc.nextLine();
            int courseNumber = Integer.parseInt(sc.nextLine());
            String mode = sc.nextLine();
            boolean shareData = Boolean.parseBoolean(sc.nextLine());
            Course c = new Course(courseName,courseNumber,mode,shareData);
            course.add(c);
        }
        String courseName = sc.nextLine();
        String ans = findCourseStatus(course, courseName);
        System.out.println();
        System.out.println(ans);
        sc.close();
    }
}
