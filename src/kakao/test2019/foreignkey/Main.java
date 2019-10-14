package kakao.test2019.foreignkey;

import java.io.Console;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int answer = 0;

        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        Map<String,Integer> relationMap = new HashMap<>();
        Map<Integer,Integer> nonKeyMap = new HashMap<>();

        for(int i = 0; i<relation.length; i++) {

           for(int j=0; j<relation[0].length; j++) {
            
              if(relationMap.get(relation[i][j]) == null) {
              relationMap.put(relation[i][j], j);
              }

              else nonKeyMap.put(j,0);
           }

        }

        if(nonKeyMap.keySet().size()<relation[0].length)
        {
            answer += (relation[0].length - nonKeyMap.keySet().size());
        }

        for(int num : nonKeyMap.keySet()) {
 
            for(int k=0; k<relation[0].length; k++) {
                
            }
        }

        System.out.println(relationMap);
        System.out.println(nonKeyMap);
    }
}