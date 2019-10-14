package programmers.winter2018.skilltree;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int answer = 0;
       
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        for(String skilltree : skill_trees) {
             String compareSkill = "";
            for(int k=0; k < skilltree.length(); k++) {
                if(skill.contains(skilltree.substring(k,k+1))) {
                    compareSkill += skilltree.substring(k,k+1);
                }
            }
             if(compareSkill.equals(skill.substring(0,compareSkill.length())))
                answer++;
        }

        System.out.println(answer);
        
    }
    
}