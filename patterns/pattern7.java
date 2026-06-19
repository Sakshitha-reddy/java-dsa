import java.util.*;
public class pattern7 {
	public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
            for(int k=1;k<=(2*(n-i)+1);k++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
		    System.out.println();
		}

	}
}