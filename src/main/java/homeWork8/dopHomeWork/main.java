package homeWork8.dopHomeWork;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        HashMap <String , Product> map = new HashMap<>();
        map.put("Footboll", new Product(Type.Sport));
        map.put("Kukla", new Product(Type.Girly));
        map.put("Monopoly", new Product(Type.TableGame));
        map.put("Car", new Product(Type.Sport));
        map.put("Boll", new Product(Type.Sport));
        printKay(map);
        printValue(map);
        entrySet(map);

    }

    public static void printKay(Map<String, Product> map)
    {
        for(Map.Entry<String, Product> pair : map.entrySet())
        {
            System.out.println(pair.getKey());
        }
    }

    public static void printValue(Map<String, Product> map)
    {
        for(Map.Entry<String, Product> pair : map.entrySet())
        {
            System.out.println(map.get(pair.getKey()));
        }
    }

    public static void entrySet(Map<String, Product> map)
    {
        for(Map.Entry<String, Product> pair : map.entrySet())
        {
            System.out.println(pair);
        }
    }
}
