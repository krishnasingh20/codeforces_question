import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    solve(n);
		}
		sc.close();
	}
	public static void solve(int n) {
	    int even = n;
	    int odd = 1;
	    if(n % 2 != 0) {
	        even--;
	    }
	    boolean flag = true;
	    for(int i = 0; i < n; i++) {
	        if(i == n - 1 && n % 2 != 0) {
	            System.out.print(odd);
	        }
	        else if(flag) {
	            System.out.print(even+" ");
	            flag = false;
	            even -= 2;
	        }
	        else {
	            System.out.print(odd+" ");
	            flag = true;
	            odd += 2;
	        }
	    }
	    System.out.println();
	}
}
