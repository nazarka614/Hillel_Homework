package homeWork8;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        String string = "масло, мас..........ло, масло, колбаса.....   ....., молоко, Кот, Соба.     ........ка, том, Том, рыба, рыба..................";
        updateString(string);

    }
    private static void updateString(String string){
        string = string.toLowerCase().replace(".", "").replace(" ", "");;
        String[] words = string.split(",");
        int t =  words.length;
        HashSet<String> h = new HashSet<String>();
        for (int i = 0; i<=t-1; i++){h.add(words[i]);
        }
        String b = h.toString();
        String[] words2 = b.split(",");
        String o = "";
        for (int y = 1; y<=words2.length-1; y++){
            o = words2[y];
            String result = (o.substring(0, 2).toUpperCase() + o.substring(2));
            if (y==words2.length-1) {
                System.out.println(y + " " + result.substring(1, result.length() - 1));
            }else {
                System.out.println(y + " "  + result.substring(1));
            }
        }
    }

}

