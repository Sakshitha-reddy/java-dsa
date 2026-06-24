import java.util.*;
public class reversenum2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int revNum=0;
        while(x!=0){
            int ld=x%10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                System.out.print("0");;
            }
            
            revNum = (revNum * 10) + ld;
            x = x / 10;
    }
    System.out.print(revNum);
}
}
