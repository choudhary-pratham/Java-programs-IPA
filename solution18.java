import java.util.*;
class Engine{
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    Engine(int engineId,String engineName,String engineType,double enginePrice){
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId(){
        return this.engineId;
    }

    public void setEngineId(int engineId){
        this.engineId = engineId;
    }

    public String getEngineName(){
        return this.engineName;
    }
    
    public void setEngineName(String engineName){
        this.engineName = engineName;
    }

    public String getEngineType(){
        return this.engineType;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    public double getEnginePrice(){
        return this.enginePrice;
    }

    public void setEnginePrice(double enginePrice){
        this.enginePrice = enginePrice;
    }
}
class sortByID implements Comparator<Engine>{
    public int compare(Engine a,Engine b){
        return Integer.compare(a.getEngineId(),b.getEngineId());
    }
}
public class solution18 {
    static int findAvgEnginePriceByType(ArrayList<Engine>engine,String engineType){
        int sum = 0,count = 0;
        for(Engine e:engine){
            if(e.getEngineType().equalsIgnoreCase(engineType)){
                sum += e.getEnginePrice();
                count++;
            }
        }
        if(count == 0) return 0;
        return (sum/count);
    }
    static ArrayList<Engine> searchEngineByName(ArrayList<Engine>engine,String engineName){
        ArrayList<Engine>ans = new ArrayList<>();
        for(Engine e:engine){
            if(e.getEngineName().equalsIgnoreCase(engineName)){
                ans.add(e);
            }
        }
        Collections.sort(ans,new sortByID());
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Engine>engine = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int engineId = Integer.parseInt(sc.nextLine());
            String engineName = sc.nextLine();
            String engineType = sc.nextLine();
            double enginePrice = Double.parseDouble(sc.nextLine());
            Engine e = new Engine(engineId,engineName,engineType,enginePrice);
            engine.add(e);
        }
        String engineType = sc.nextLine();
        String engineName = sc.nextLine();
        int avg = findAvgEnginePriceByType(engine, engineType);
        ArrayList<Engine>ans = searchEngineByName(engine, engineName);
        System.out.println(avg);
        for(Engine e:ans){
            System.out.println(e.getEngineId());
        }
        sc.close();
    }
}
