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
	    Arrays.sort(arr);
	    if(arr[0] == 1) {
	        return "YES";
	    }
	    int a = arr[0];
	    int b = arr[1];
	    if(b % a == 0) {
	        for(int i = 2; i < n; i++) {
	            if(arr[i] % a != 0) {
	                b = arr[i];
	                break;
	            }
	        }
	    }
	    for(int i = 2; i < n; i++) {
	        if(arr[i] % a != 0 && arr[i] % b != 0) {
	            return "NO";
	        }
	    }
	    return "YES";
	}
}
