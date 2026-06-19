import java.util.*;
public class pattern4 {
	public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=n;j>=i;j--){
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}


//or you can also use this logic
// import java.util.*;
// public class pattern4 {
// 	public static void main (String[] args) {
// 		// your code goes here
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		for(int i=1;i<=n;i++){
// 		    for(int j=1;j<=(n-i+1);j++){
// 		        System.out.print("*");
// 		    }
// 		    System.out.println();
// 		}

// 	}
// }
