package kakao.test2019.openchat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String[] answer = {};
        
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        List<String> answerList = new ArrayList<String>();
        List<String> resultList = new ArrayList<String>();
        Map<String,String> nickName = new HashMap<>();

            for(String sentence : record) { 
                
                String[] words = sentence.split(" ");
               
               if(words[0].equals("Enter")) {
                    
                    nickName.put(words[1], words[2]);
                    
                    answerList.add("Enter " + words[1]);
                
               }

               else if(words[0].equals("Leave")) {
                    answerList.add("Leave " + words[1]);
                }

               else if(words[0].equals("Change")) {
                   nickName.put(words[1],words[2]);
                }
    
            }
             
            for(String result : answerList) {
               
                String[] words = result.split(" ");
                
                if(words[0].equals("Enter")) {
                    resultList.add(nickName.get(words[1]) + "님이 들어왔습니다.");
                }

                else if(words[0].equals("Leave")) {
                    resultList.add(nickName.get(words[1]) + "님이 나갔습니다.");
                }
            }
        
        answer = resultList.toArray(new String[resultList.size()]);
        
        for(String answerEntity : answer) {
            System.out.println(answerEntity);
        }
    }
}