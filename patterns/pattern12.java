import java.util.*;
public class pattern12 {
	public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int num=1;
		for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
              System.out.print(num);
              System.out.print(" ");
              num=num+1;
           }
        
		    System.out.println();
        }
        
		}
    }
