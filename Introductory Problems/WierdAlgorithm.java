import java.util.*;
class WierdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        StringBuilder ans = new StringBuilder();
        ans.append(x).append(' ');

        while(x!=1){
            if(x%2==0){
                x/=2;
            }
            else{
                x=(x*3)+1;
            }
            ans.append(x).append(' ');
        }

        System.out.print(ans);
    }
}
