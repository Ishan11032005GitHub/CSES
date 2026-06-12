import java.util.*;
class WierdAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(x + " ");
        while(x!=1){
            if(x%2==0){
                x/=2;
            }
            else{
                x*=3;
                x+=1;
            }
            System.out.print(x + " ");
        }
    }
}