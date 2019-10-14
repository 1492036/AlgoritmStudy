package kakao.test2019.faillurerate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

         int[] answer = {};

        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        
        int player = stages.length;

        Map<Integer,Integer> stageMap = new HashMap<>();
        Map<Integer,Double> stagePer = new HashMap<>();
        
        // 초기 값 셋팅
        for(int i = 1; i <= N; i++) {
            stageMap.put(i,0);
        }
        
        // 각 스테이지에 머물고 있는 인원 수 체크
        
        for(int num : stages) {
            
            if (num <= N) {
                
                if(!stageMap.keySet().contains(num))
                    stageMap.put(num, 1);
                
                else stageMap.put(num, stageMap.get(num)+1);   
            
            }
        }
        
        Iterator<Integer> keys = stageMap.keySet().iterator();
        
        // 각 스테이지 확률 계산 
        while(keys.hasNext()) {
            int key = keys.next();
            int stagePlayer = stageMap.get(key);
            
        
            if(player != 0) {
            stagePer.put(key,(double)stagePlayer/(player));
            player -= stagePlayer;
            }
            
        // 도달 하지 못했을때 조건
            else stagePer.put(key, 0.0);
        }
        
        // 나온 확률에 따라 정렬 
        List<Integer> keySetList = new ArrayList<>(stagePer.keySet());
        
        Collections.sort(keySetList, new Comparator<Integer>() {
            
            @Override
            public int compare(Integer o1, Integer o2) {
                
                return stagePer.get(o2).compareTo(stagePer.get(o1));
       // 내림차순은 : stagePer.get(o1).compareTo(stegePer.get(o2));
                
            } 
        });
        
        // 나온 ArrayList를 변환 
        
        answer = new int[keySetList.size()];
        
        for(int j=0; j < answer.length; j++) {
            
            answer[j] = keySetList.get(j).intValue();
        }
       
       for (int answerEntity : answer) {
           System.out.println(answerEntity);
       }
    }
}