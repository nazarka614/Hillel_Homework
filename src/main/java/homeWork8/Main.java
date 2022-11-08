package homeWork8;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String string = "масло, мас..........ло, масло,te........st,te......st, Nazar,nazar,Roma,roma,roma,колбаса....................   .....,molotok, молоко, Кот, Соба.     ........ка, том, Том, рыба, рыба..................";
        updateString(string);
    }
    private static void updateString(String string){
        String[] words = string.toLowerCase().replace(".", "").replace(" ", "").split(",");
        HashSet<String> myHashSetList = new HashSet<>();
        Collections.addAll(myHashSetList, words);
        myHashSetList.forEach(word -> System.out.println(word.substring(0,1).toUpperCase()+word.substring(1)));
    }

}

