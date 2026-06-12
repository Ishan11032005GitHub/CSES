import java.util.*;
class Repititions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char curr=str.charAt(0);
        int freq=1;
        int maxFreq=1;
        for(int i=1;i<str.length();i++){
            if(curr==str.charAt(i)){
                freq++;
            }
            else{
                freq=1;
                curr=str.charAt(i);
            }
            maxFreq=Math.max(freq,maxFreq);
        }
        System.out.println(maxFreq);
    }
}