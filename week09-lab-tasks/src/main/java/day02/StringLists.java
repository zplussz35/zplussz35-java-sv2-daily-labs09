package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words){
        List<String> result= new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for (String word:words) {
            if(word.length()<min){
                min=word.length();
            }
        }
        for (String word:words) {
            if(word.length()==min){
                result.add(word);
            }
        }
        return result;
    }
}
