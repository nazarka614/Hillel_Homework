package homeWork8;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String string = "масло, мас..........ло, масло,te........st,te......st, Nazar,nazar,колбаса....................   .....,molotok, молоко, Кот, Соба.     ........ка, том, Том, рыба, рыба..................";
        updateString(string);
    }
    private static void updateString(String string){
        String[] words = string.toLowerCase().replace(".", "").replace(" ", "").split(",");
        HashSet<String> myHashSetList = new HashSet<String>();
        Collections.addAll(myHashSetList, words);
        String[] words2 = myHashSetList.toString().split(",");
        String tempString = "";
        for (int y = 1; y<=words2.length-1; y++){
            tempString = words2[y];
            String result = (tempString.substring(0, 2).toUpperCase() + tempString.substring(2));
            if (y==words2.length-1) {
                System.out.println(result.substring(1, result.length() - 1));
            }else {
                System.out.println(result.substring(1));
            }
        }
    }

}

