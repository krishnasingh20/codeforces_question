import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    System.out.println(solve(n));
		}
	}
	public static int solve(int n) {
	    if(n == 1) {
	        return 1;
	    }
	    if(n <= 4) {
	        return 2;
	    }
	    int ans = 2;
	    int curr = 4;
	    while((curr + 1) * 2 < n) {
	        ans++;
	        curr = (curr + 1) * 2;
	    }
	    return ans + 1;
	}
}
