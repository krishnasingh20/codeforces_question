import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(solve(n, arr));
		}
		sc.close();
	}
	public static int solve(int n, int[] arr) {
		    int si = -1;
		    int ei = -1;
		    int val = arr[0];
		    for(int i = 1; i < n; i++) {
		        if(arr[i] != val) {
		            if(si == -1) {
		                si = i;
		            }
		            ei = i;
		        }
		    }
		    if(si == -1) {
		        return 0;
		    }
		    int ans1 = ei - si + 1;
		    val = arr[n - 1];
		    si = -1;
		    ei = -1;
		    for(int i = 0; i < n; i++) {
		        if(arr[i] != val) {
		            if(si == -1) {
		                si = i;
		            }
		            ei = i;
		        }
		    }
		    int ans2 = ei - si + 1;
		    return Math.min(ans1, ans2);
	}
}
