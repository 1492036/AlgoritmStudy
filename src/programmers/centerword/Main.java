package programmers.centerword;

public class Main {

    public static void main(String[] args) {
        String answer = "";
      
        String s = "qwer";
        
        int length = s.length();
        
        if(length % 2 == 1)
        {
            answer = s.substring(length/2,length/2+1);
        }
        
        else answer = s.substring(length/2-1,length/2+1); 
        
        
        System.out.print(answer);
    }
}