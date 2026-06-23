import java.util.*;
public class pattern22 {
	public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
           for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==1||j==1||i==n||j==n){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            
            System.out.println();
           }
		}
    }