package anagram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class logic {
    
    public static String values(int i){
            String arr [] = "anagram,ambigram,noumenom,immanuel,binary,comatose,ambivalent,venal,nigeria,fail".split(",");
            ArrayList ori = new ArrayList();
            ori.addAll(Arrays.asList(arr));
        return ori.get(i).toString();
     }

    public static String wrdScrmbl(String s){
          String [] arr = s.split("");
          ArrayList ori = new ArrayList();
          ori.addAll(Arrays.asList(arr));
          ori.remove(0);
          Collections.shuffle(ori);
          String n = "";
            for(int i=0; i<ori.size(); i++){
               n += ori.get(i).toString();
            }
        return n;
    }
}