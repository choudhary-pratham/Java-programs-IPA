import java.util.*;

public class setemployessbycity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> mpp = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            String name = sc.nextLine();
            String city = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            if (mpp.containsKey(city)) {
                list = mpp.get(city);
                list.add(name);
                mpp.put(city, list);
            } else {
                list.add(name);
                mpp.put(city, list);
            }
        }
        for (String key : mpp.keySet()) {
            System.out.printf("%s: ", key);
            ArrayList<String> names = mpp.get(key);
            for (int i = 0; i < names.size(); i++) {
                System.out.print(names.get(i));
                if (i != names.size() - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
        sc.close();
    }
}