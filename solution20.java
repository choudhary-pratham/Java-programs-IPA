import java.util.*;

class Music{
    private int playListNo;
    private String type;
    private int count;
    private double duration;

    Music(int playListNo,String type,int count,double duration){
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public int getPlayListNo(){
        return this.playListNo;
    }
    public void setPlayListNo(int playListNo){
        this.playListNo = playListNo;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public double getDuration(){
        return this.duration;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }
}
class sortByDuration implements Comparator<Music>{
    public int compare(Music a,Music b){
        return Double.compare(a.getDuration(),b.getDuration());
    }
}
public class solution20 {
    static int findAvgOfCount(ArrayList<Music>music,int Count){
        int sum = 0,count = 0;
        for(Music m:music){
            if(m.getCount()>Count){
                count++;
                sum += m.getCount();
            }
        }
        if(count == 0) return 0;
        return (sum/count);
    }
    static ArrayList<Music> sortTypeByDuration(ArrayList<Music>music,double duration){
        ArrayList<Music>ans = new ArrayList<>();
        for(Music m:music){
            if(m.getDuration()>duration){
                ans.add(m);
            }
        }
        if(ans.size()  == 0){
            ans = null;
        }
        else{
            Collections.sort(ans,new sortByDuration());
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Music>music = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int playListNo = Integer.parseInt(sc.nextLine());
            String type = sc.nextLine();
            int count = Integer.parseInt(sc.nextLine());
            double duration = Double.parseDouble(sc.nextLine());
            Music m = new Music(playListNo,type,count,duration);
            music.add(m);
        }
        int count = Integer.parseInt(sc.nextLine());
        double duration = Double.parseDouble(sc.nextLine());
        int avg = findAvgOfCount(music,count);
        ArrayList<Music> ans = sortTypeByDuration(music,duration);
        if(avg == 0){
            System.out.println("No playlist found");
        }
        else{
            System.out.println(avg);
        }
        if(ans == null){
            System.out.println("No playlist found with mentioned attribute");
        }
        else{
           for(Music m:ans) System.out.println(m.getType());
        }
        sc.close();
    }
}
