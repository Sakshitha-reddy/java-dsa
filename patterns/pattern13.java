import java.util.*;
public class pattern13 {
	public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int count=0;
		for(int i=1;i<=n;i++){
           for(int j=65;count<i;j++){
                System.out.print((char)j+" ");
                count++;
           }
		    System.out.println();
            count=0;
        }     
		}
    }
