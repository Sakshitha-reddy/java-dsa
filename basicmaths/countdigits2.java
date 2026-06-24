import java.util.*;
public class countdigits2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        int temp = n; 
        
        while (temp > 0) {
            int digit = temp % 10;      
            if (digit != 0 && n % digit == 0) { 
                count++;
            }
            temp = temp / 10;           
        }
        
        System.out.print(count);
    }

}
