import java.util.Scanner;
import java.util.Arrays;
public class Main {
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
	}
	public static String solve(int n, int[] arr) {
	    int i = 1;
	    while(i < n - 1) {
	        if(arr[i - 1] < 1 || arr[i] < 2 || arr[i + 1] < 1) {
	            i++;
	        }
	        else {
	            int a = arr[i] / 2;
	            a = Math.min(Math.min(a, arr[i - 1]), arr[i + 1]);
	            arr[i - 1] -= a;
	            arr[i] -= (a * 2);
	            arr[i+1] -= a;
	            i++;
	        }
	    }
	    for(i = 0; i < n; i++) {
	        if(arr[i] != 0) {
	            return "NO";
	        }
	    }
	    return "YES";
	}
}
