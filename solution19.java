import java.util.*;

class Fruit{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    Fruit(int fruitId,String fruitName,int price,int rating){
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId(){
        return this.fruitId;
    }
    public void setFruitId(int fruitId){
        this.fruitId = fruitId;
    }
    public String getFruitName(){
        return this.fruitName = fruitName;
    }
    public void setFruitName(String fruitName){
        this.fruitName = fruitName;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getRating(){
        return this.rating;
    }
    public void setRating(int rating){
        this.rating = rating;
    }
}

public class solution19 {
    static Fruit findMaximumPriceByRating(ArrayList<Fruit>fruits,int rating){
        Fruit ans = null;
        int maxPrice = 0;
        for(Fruit f:fruits){
            if(f.getRating()>rating){
                if(maxPrice<f.getPrice()){
                    maxPrice = f.getPrice();
                    ans = f;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Fruit>fruits = new ArrayList<>();
        for(int i = 0;i<4;i++){
            int fruitId = Integer.parseInt(sc.nextLine());
            String fruitName = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int rating = Integer.parseInt(sc.nextLine());
            Fruit f = new Fruit(fruitId,fruitName,price,rating);
            fruits.add(f);
        }
        int rating = Integer.parseInt(sc.nextLine());
        Fruit f = findMaximumPriceByRating(fruits,rating);
        if(f == null){
            System.out.println("No such Fruit");
        }
        else{
            System.out.println(f.getFruitId());
        }
        sc.close();
    }
}
